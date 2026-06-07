package app;

import model.Persona;
import model.Datos;
import model.Cliente;
import model.Empleado;
import model.Proveedor;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Ejemplo 1\n");
            Persona cliente1 = new Cliente("Randy Orton", new Datos("randyorton@gmail.com", 941526374,
                    "Las Flores 3333"), 142536, "Paquete de viajes 1" );
            Persona empleado1 = new Empleado("John Cena", new Datos("johncena@gmail.com", 998653232,
                    "El Cerro 7485"), 885522, "Marketing", "Ventas y servicio al cliente");
            Persona proveedor1 = new Proveedor("Carnes Doña Jacinta", new Datos("pedidoscarnes@donajacinta.com",974125896,
                    "Las manzanas 25"), "Venta de carnes", "www.doñajacinta.cl");

            cliente1.mostrarInformacionCompleta();
            empleado1.mostrarInformacionCompleta();
            proveedor1.mostrarInformacionCompleta();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(" ");
        System.out.println(" ");

        //A continuación se mostrará un ejemplo con un correo erroneo para que salte el error

        try {
            System.out.println("Ejemplo 2\n");
            Persona cliente2 = new Cliente("Triple H", new Datos("hhh.gmail.com", 944114411,
                    "Las estrellas 5555"), 88888, "Guia turistica paquete 3" );

            cliente2.mostrarInformacionCompleta();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}