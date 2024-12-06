public class EjercicioDiez {
        //Se crea la clase persona
    public static class Persona {
        private String nombre;
        private int edad;
        private double altura;
        //Se crea el Constructor
        public Persona(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }
        //Se incluye el Metodo Imprimir
        public void imprimirDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
        }
    }
    public static void main(String[] args) {
        //Se asignan las Instancias
        Persona persona1 = new Persona("Antony", 32, 1.60);
        persona1.imprimirDatos();
        Persona persona2 = new Persona("Fredy", 45, 1.65);
        persona2.imprimirDatos();
    }
}