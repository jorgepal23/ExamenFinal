public class EjercicioOcho {
    //Separa este String "antony|fredy|julian|marcos", guardalo en una lista y luego imprimir la lista
    public static void main(String[] args) {
        String nombres = "antony|fredy|julian|marcos";
        String[] arrayNombres = nombres.split("\\|");
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }
    }
}