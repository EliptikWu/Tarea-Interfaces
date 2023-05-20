package tarea.biconsumer;

import java.util.function.BiConsumer;

public class Biconsumer {
    public static void main(String[] args) {
        Empleado2 empleado2 = new Empleado2("Esteban", "Ernesto", "98765431OK", "Narnia", "Gerente");

        CiudadResidencia ciudad = new CiudadResidencia("Wakanda");

        BiConsumer<Empleado2, CiudadResidencia> biConsumer = (emp, ciu) -> emp.setCiudadResidencia(ciu.getNombre());
        biConsumer.accept(empleado2, ciudad);

        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Apellidos: " + empleado2.getApellidos());
        System.out.println("Cedula: " + empleado2.getCedula());
        System.out.println("Ciudad de residencia: " + empleado2.getCiudadResidencia());
        System.out.println("Cargo: " + empleado2.getCargo());
    }
}
