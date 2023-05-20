package tarea.bifunction;

import java.util.function.*;
public class Bifunction{

    static boolean isSumEven(int a, int b)
    {
        int sum = a + b;
        if(sum%2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        BiFunction<Integer, Integer, Boolean> biFunction = Bifunction::isSumEven;

        System.out.println("La suma de 3 y 8 es par? " + biFunction.apply(3, 8));
        System.out.print("La suma de 8 y 10 es par? " + biFunction.apply(8, 10));
    }
}
