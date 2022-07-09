package jframeproyecto;

import javax.swing.JTextField;

public class docente {

    private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Sexo;
    private String aula;
    private String clave;
    private String horaEntrada;
    private String estadoEntrada; // PUNTUAL, TARDANZA, FALTA
    private String horaSalida;
    private String estadoSalida; // REGISTRADA, NO REGISTRADA, PREMATURA (Salió antes)

    public docente() {

    }

    public docente(String DNI, String Nombre, String Apellidos, String Sexo, String aula, String clave, String horaEntrada, String estadoEntrada, String horaSalida, String estadoSalida) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.aula = aula;
        this.clave = clave;
        this.horaEntrada = horaEntrada;
        if (this.horaEntrada.equals("")){
            this.estadoEntrada = "FALTÓ";
        }
        this.horaSalida = horaSalida;
        if (this.horaSalida.equals("")){
            this.estadoSalida = "NO REGISTRADA";
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getEstadoEntrada() {
        return estadoEntrada;
    }

    public void setEstadoEntrada(String estadoEntrada) {
        this.estadoEntrada = estadoEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getEstadoSalida() {
        return estadoSalida;
    }

    public void setEstadoSalida(String estadoSalida) {
        this.estadoSalida = estadoSalida;
    }

    @Override
    public String toString() {
        return "docente{ \n" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Sexo=" + Sexo + ", aula=" + aula + ", clave=" + clave + ", horaEntrada=" + horaEntrada + ", estadoEntrada=" + estadoEntrada + ", horaSalida=" + horaSalida + ", estadoSalida=" + estadoSalida + '}';
    }
    
}
