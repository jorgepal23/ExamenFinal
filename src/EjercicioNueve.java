import java.util.ArrayList;
import java.util.List;

public class EjercicioNueve {
    public static void main(String[] args) {
        String[] nombres = {"Antony", "Fredy", "Maria"};
        int[] edades = {32, 45, 23};
        List<String> nombre = new ArrayList<>();
        List<Integer> edad = new ArrayList<>();
        for (int i = 0; i < nombres.length; i++) {
            nombre.add(nombres[i]);
            edad.add(edades[i]);
        }
        for (int i = 0; i < nombre.size(); i++) {
            System.out.println("El nombre es: " + nombre.get(i) + " y la edad es: " + edad.get(i));
        }
    }
}