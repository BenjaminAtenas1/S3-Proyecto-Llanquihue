package model;

public class Proveedor extends Persona{
    private String servicioEntregado;
    private String paginaWeb;

    public Proveedor(){

    }

    public Proveedor(String nombreCompleto, Datos datosPersona, String servicioEntregado, String paginaWeb){
        super(nombreCompleto, datosPersona);
        this.servicioEntregado = servicioEntregado;
        this.paginaWeb = paginaWeb;
    }

    public String getServicioEntregado() {
        return servicioEntregado;
    }

    public void setServicioEntregado(String servicioEntregado) {
        this.servicioEntregado = servicioEntregado;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombreCompleto() + " - Servicio entregado: " + servicioEntregado + " - Pagina web: " + paginaWeb;
    }

    @Override
    public void mostrarInformacionCompleta(){
        System.out.println("Nombre: " + getNombreCompleto() + " - Correo : " + getDatosPersona().getCorreo() + " - Teléfono: " + getDatosPersona().getTelefono() +
                " - Dirección: " + getDatosPersona().getDireccion() + " - ID Empleado: " + " - Servicio entregado: " + servicioEntregado + " - Pagina web: " + paginaWeb);
    }

}
