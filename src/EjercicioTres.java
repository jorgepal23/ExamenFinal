import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        try {
            double num1;
            double num2;
            double num3;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese 3 números: ");
            System.out.println("Ingrese el primer número: ");
            num1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            num2 = entrada.nextDouble();
            System.out.println("Ingrese el tercer número: ");
            num3 = entrada.nextDouble();

            double suma = num1 + num2 + num3;
            double resta = num1 - num2 - num3;
            double multiplicacion = num1 * num2 * num3;
            double division = (num1 + num2) / num3;

            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicacion es: " + multiplicacion);
            System.out.println("La division es: " + division);
        } catch (NumberFormatException e) {
            System.out.println("Error: Los argumentos no son números válidos.");
        }
    }
}