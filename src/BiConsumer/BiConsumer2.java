package BiConsumer;
import java.util.function.BiConsumer;
public class BiConsumer2 {

        public static void main(String[] args) {
            BiConsumer<String, String> printDetails = (name, occupation) -> System.out.println(name + " es " + occupation);
            printDetails.accept("John", "Ingeniero");
            printDetails.accept("Ana", "Doctora");
        }
    }

