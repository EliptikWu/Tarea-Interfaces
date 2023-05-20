package tarea.map;

import java.util.HashMap;
import java.util.Map;

public class ExaMap {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();

        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total De Vehiculos: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for (String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        String searchKey = "Mercedes";
        if (vehicles.containsKey(searchKey))
            System.out.println("Total de " + vehicles.get(searchKey) + " " + searchKey + "!\n");

        // Clear all values.
        vehicles.clear();

        // Equals to zero.
        System.out.println("Después de una operación clara, el tamaño: " + vehicles.size());
    }
}