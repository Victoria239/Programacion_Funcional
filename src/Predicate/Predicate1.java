package Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Predicate1 {
    public static void main(String[] args) {
            List<String> nombres = Arrays.asList("Ana", "Juan", "Alberto", "Pedro", "Andrés");

            Predicate<String> contieneAn = s -> s.contains("an");

            List<String> nombresConAn = nombres.stream()
                    .filter(contieneAn)
                    .collect(Collectors.toList());

            System.out.println("Nombres que contienen 'an': " + nombresConAn);
        }
    }


