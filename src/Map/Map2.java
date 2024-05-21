package Map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Map2 {
    public static void main(String[] args) {
            List<String> nombres = Arrays.asList("ana", "juan", "alberto", "pedro", "andrés");

            List<String> nombresEnMayusculas = nombres.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            System.out.println("Nombres en mayúsculas: " + nombresEnMayusculas);
        }
    }


