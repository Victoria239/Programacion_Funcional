package Supplier;
import java.util.function.Supplier;
import java.util.Random;
public class Ejemplo1 {
        public static void main(String[] args) {
            Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);

            // Obtener un número aleatorio
            Integer resultado = numeroAleatorio.get();
            System.out.println("Número aleatorio: " + resultado);
        }
    }


