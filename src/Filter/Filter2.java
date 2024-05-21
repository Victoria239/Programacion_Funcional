package Filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Filter2 {
    public static void main(String[] args) {
            List<String> nombres = Arrays.asList("Ana", "Juan", "Alberto", "Pedro", "Andrés");

            List<String> nombresConA = nombres.stream()
                    .filter(nombre -> nombre.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("Nombres que empiezan con 'A': " + nombresConA);
        }
    }


