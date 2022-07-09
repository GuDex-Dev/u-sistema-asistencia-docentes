/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframeproyecto;

/**
 *
 * @author Gabriel
 */
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Datos {

    private static String nombreFichero = "src/registros/datos.dat";
    private static String nombreAsist = "src/registros/" + iniciarSesionFrame.fechaHoytxt + ".txt";

    public static void guardarDocentes() throws IOException {
        File f = new File(nombreFichero);
        if (!f.exists()) {
            f.createNewFile();
        }

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));

        docente obj = new docente();

        for (int i = 0; i < listaDocentes.arrListDocente.size(); i++) {
            obj = listaDocentes.arrListDocente.get(i);
            dos.writeUTF(obj.getDNI());
            dos.writeUTF(obj.getNombre());
            dos.writeUTF(obj.getApellidos());
            dos.writeUTF(obj.getSexo());
            dos.writeUTF(obj.getAula());
            dos.writeUTF(obj.getClave());

        }

        dos.close();
    }

    public static void cargarDocentes() throws FileNotFoundException, IOException {
        File f = new File(nombreFichero);

        if (!f.exists()) {
            throw new FileNotFoundException("Fichero no Encontrado");
        }

        DataInputStream dis = new DataInputStream(new FileInputStream(f));

        boolean salir = false;

        do {
            try {
                String dni = dis.readUTF();
                String nombre = dis.readUTF();
                String apellidos = dis.readUTF();
                String sexo = dis.readUTF();
                String aula = dis.readUTF();
                String clave = dis.readUTF();

                if (listaDocentes.BuscarXDni(dni) == -1 && listaDocentes.BuscarXClave(clave) == -1) {
                    docente d = new docente(dni, nombre, apellidos, sexo, aula, clave, "", "", "", "");
                    listaDocentes.arrListDocente.add(d);
                }

            } catch (EOFException e) {
                salir = true;
            }
        } while (!salir);
    }

    public static void guardarAsistencias(ArrayList<docente> lista) {

        PrintWriter salida = null;
        System.out.println(nombreAsist);
        try {
            salida = new PrintWriter(new BufferedWriter(new FileWriter(nombreAsist)));
            for (int i = 0; i < lista.size(); i++) {
                salida.println(lista.get(i).getDNI() + " - " + lista.get(i).getNombre() + " - " + lista.get(i).getApellidos() + " - " + lista.get(i).getSexo() + " - " + lista.get(i).getAula() + " - " + lista.get(i).getClave() + " - " + lista.get(i).getHoraEntrada() + " - " + lista.get(i).getEstadoEntrada() + " - " + lista.get(i).getHoraSalida() + " - " + lista.get(i).getEstadoSalida());
            }
            salida.close();

        } catch (Exception e) {
        }
    }
}
