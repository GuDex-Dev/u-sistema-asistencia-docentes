package jframeproyecto;

import java.util.ArrayList;

public class listaDocentes {

    public static ArrayList<docente> arrListDocente = new ArrayList<>();

    public static int contador = 0;

    public listaDocentes() {
        
    }

    public static int BuscarXDni(String DNI) {
        int pos = -1;
        for (int i = 0; i < arrListDocente.size(); i++) {
            docente obj = new docente();
            obj = arrListDocente.get(i);
            if (obj.getDNI().equals(DNI)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static int BuscarXClave(String Clave) {
        int pos = -1;
        for (int i = 0; i < arrListDocente.size(); i++) {
            docente oDocente = new docente();
            oDocente = arrListDocente.get(i);
            if (oDocente.getClave().equals(Clave)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

}
