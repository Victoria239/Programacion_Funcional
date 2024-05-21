package Sorted;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Ejemplo2 {

        public static void main(String[] args) {
            List<String> nombres = Arrays.asList("Ana", "Juan", "Alberto", "Pedro", "Andrés");

            List<String> nombresOrdenadosPorLongitud = nombres.stream()
                    .sorted(Comparator.comparingInt(String::length))
                    .collect(Collectors.toList());

            System.out.println("Nombres ordenados por longitud: " + nombresOrdenadosPorLongitud);
        }
    }

