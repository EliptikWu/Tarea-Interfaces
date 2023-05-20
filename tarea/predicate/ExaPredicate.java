package tarea.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExaPredicate {

    public static void main(String[] args) {

        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("O");

        //Elije las palabras que estan en el array que cumpla la condición de un largo de 3 letras y/o que empiecen por "O"
        List<String> list = Arrays.asList("Ola", "OMO", "Estas", "BB", "GOD", "MG", "Ok");

        List<String> collect = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect);

    }

}
