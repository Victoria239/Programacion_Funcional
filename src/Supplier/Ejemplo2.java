package Supplier;
import java.util.function.Supplier;
public class Ejemplo2 {
    public static void main(String[] args) {
            Supplier<String> saludo = () -> "¡Hola, mundo!";

            // Obtener el saludo
            String mensaje = saludo.get();
            System.out.println("Mensaje: " + mensaje);
        }
    }


