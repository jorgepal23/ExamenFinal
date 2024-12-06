import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla de multiplicar: ");
        int numero = entrada.nextInt();
        int contador = 1;
        while (contador <= 20) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador=contador+1;
        }
    }
}