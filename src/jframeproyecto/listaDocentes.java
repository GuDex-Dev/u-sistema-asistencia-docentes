package jframeproyecto;

import java.util.ArrayList;

public class listaDocentes {

    public static ArrayList<docente> arrListDocente = new ArrayList<>();

    public static int contador = 0;

    public listaDocentes() {
        
    }

    public static int BuscarXDni(String DNI) {
        int pos = -1;
        docente oDocente = new docente();
        for (int i = 0; i < arrListDocente.size(); i++) {
            oDocente = arrListDocente.get(i);
            if (oDocente.getDNI().equals(DNI)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static int BuscarXClave(String Clave) {
        int pos = -1;
        docente oDocente = new docente();
        for (int i = 0; i < arrListDocente.size(); i++) {
            oDocente = arrListDocente.get(i);
            if (oDocente.getClave().equals(Clave)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

}
