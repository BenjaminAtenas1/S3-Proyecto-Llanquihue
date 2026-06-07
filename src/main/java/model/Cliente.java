package model;

public class Cliente extends Persona{
    private int idCliente;
    private String servicioAdquirido;

    public Cliente(){

    }

    public Cliente(String nombreCompleto, Datos datosPersona, int idCliente, String servicioAdquirido){
        super(nombreCompleto, datosPersona);
        this.idCliente = idCliente;
        this.servicioAdquirido = servicioAdquirido;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getServicioAdquirido(){
        return servicioAdquirido;
    }

    public void setServicioAdquirido(String servicioAdquirido){
        this.servicioAdquirido = servicioAdquirido;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombreCompleto() + "ID cliente: " + idCliente + " - Servicio adquirido por cliente: " + servicioAdquirido;
    }

    @Override
    public void mostrarInformacionCompleta(){
        System.out.println("Nombre: " + getNombreCompleto() + " - Correo : " + getDatosPersona().getCorreo() + " - Teléfono: " + getDatosPersona().getTelefono() +
                " - Dirección: " + getDatosPersona().getDireccion() + " - ID Cliente: " + idCliente + " - Servicio adquirido: " + servicioAdquirido);
    }

}
