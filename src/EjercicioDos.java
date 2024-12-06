import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        int tipoCuenta = entrada.nextInt();
        switch (tipoCuenta) {
            case 1:
                System.out.println("Cuenta corriente");
                break;
            case 2:
                System.out.println("Cuenta de ahorro");
                break;
            case 3:
                System.out.println("Cuenta Nomina");
                break;
            default:
                System.out.println("Cuenta no valida");
                break;}
    }
}