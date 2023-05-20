package tarea.function;

import java.util.function.Function;

public class ExaFunction {

    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        //Se ingresa cualquier palabra y por la cantidad de letras en x.length se multiplicará por 2(Los espacios tambien cuentan)
        Integer result = func.andThen(func2).apply("Likun estuvo acá");

        System.out.println(result);

    }

}