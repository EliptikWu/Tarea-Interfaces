package tarea.supplier;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ExaSupplier {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //devuelve un número entero aleatorio en el rango [0,40) en una operación asíncrona
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return new Random().nextInt(40);
        });

        System.out.println(future.get());
    }
}