import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notas = 0;
        int contador = 0;
        int promedio = 0;
        do {
            System.out.println("Ingrese la nota: ");
            notas = entrada.nextInt();
            promedio = promedio + notas;
            contador = contador + 1;
        } while (notas != -1);
        promedio = promedio / contador;
        System.out.println("El promedio es: " + promedio);
    }
}