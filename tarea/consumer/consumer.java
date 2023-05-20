package tarea.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {

        System.out.println("Información general de los empleados en esta empresa");
        System.out.println("");

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 4, 4000));
        empleados.add(new Empleado("Vam", 1, 1000));
        empleados.add(new Empleado("Li", 10, 10000));
        empleados.add(new Empleado("Andrés", 6,6000));
        empleados.add(new Empleado("John", 3,3000));

        Consumer<List<Empleado>> consumer = (listaEmpleados) -> {
            for(Empleado empleado : listaEmpleados) {
                System.out.println(empleado.getNombre() + " - " + empleado.getTiempoEmpresa() + " Siendo trabajador de la empresa y su ganancia mensual es de $" + empleado.getMensual());
            }
        };
        consumer.accept(empleados);


    }
}