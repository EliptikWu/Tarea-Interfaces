package tarea.filter;

import java.util.stream.Stream;

// Class
class Filter {

    // Main driver method
    public static void main(String[] args)
    {

        Stream<String> stream = Stream.of(
                "Tensión", "Ahora", "Despues", "pantalón", "likun");

        //Se filtrarán solamente las palabras que terminen en "N"
        stream.filter(str -> str.endsWith("n"))
                .forEach(System.out::println);
    }
}
