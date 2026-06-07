package model;

import model.CorreoInvalidoException;

public class Datos {
    private String correo;
    private int telefono;
    private String direccion;

    public Datos(){

    }

    public Datos(String correo, int telefono, String direccion) throws CorreoInvalidoException {

        if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")){
            throw new CorreoInvalidoException("Correo inválido");
        }

        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return " Correo : " + correo + " - Teléfono: " + telefono + " - Dirección: " + direccion;
    }
}
