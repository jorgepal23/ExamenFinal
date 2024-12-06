import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el total de su compra: ");
        double totalCompra = entrada.nextDouble();
        double descuento = 0.0;
        if (totalCompra >= 1000) {
            descuento = totalCompra * 0.2;
        } else if (totalCompra >= 500 && totalCompra < 1000) {
            descuento = totalCompra * 0.1;
        } else if (totalCompra > 500) {
            descuento = totalCompra*0.0;
        }
        double totalPagar = totalCompra - descuento;
        System.out.println("El total a pagar es: " + totalPagar);
    }
}