package model;

public class Persona {
    private String nombreCompleto;
    private Datos datosPersona;


    public Persona(){

    }

    public Persona(String nombreCompleto, Datos datosPersona){
        this.nombreCompleto = nombreCompleto;
        this.datosPersona = datosPersona;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Datos getDatosPersona() {
        return datosPersona;
    }

    public void setDatosPersona(Datos datosPersona) {
        this.datosPersona = datosPersona;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombreCompleto;
    }

    public void mostrarInformacionCompleta(){

    }
}
