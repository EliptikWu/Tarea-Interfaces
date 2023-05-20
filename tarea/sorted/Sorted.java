package tarea.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("L", "I", "K", "U", "N", "9", "5", "2", "@");

        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }
}
