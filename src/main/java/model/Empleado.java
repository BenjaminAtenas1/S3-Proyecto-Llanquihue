package model;

public class Empleado extends Persona{
    private int idEmpleado;
    private String area;
    private String cargoEmpleado;

    public Empleado(){

    }

    public Empleado(String nombreCompleto, Datos datosPersona, int idEmpleado, String area, String cargoEmpleado){
        super(nombreCompleto, datosPersona);
        this.idEmpleado = idEmpleado;
        this.area = area;
        this.cargoEmpleado = cargoEmpleado;
    }

    public int getIdEmpleado(){
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }

    public String getArea(){
        return area;
    }

    public void setArea(String area){
        this.area = area;
    }

    public String getCargoEmpleado(){
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado){
        this.cargoEmpleado = cargoEmpleado;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombreCompleto() + "ID del trabajador: " + idEmpleado + " - Área: " + area + " - Cargo: " + cargoEmpleado;
    }

    @Override
    public void mostrarInformacionCompleta(){
        System.out.println("Nombre: " + getNombreCompleto() + " - Correo : " + getDatosPersona().getCorreo() + " - Teléfono: " + getDatosPersona().getTelefono() +
                " - Dirección: " + getDatosPersona().getDireccion() + " - ID Empleado: " + idEmpleado + " - Área: " + area + " - Cargo: " + cargoEmpleado);
    }
}
