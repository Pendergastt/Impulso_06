
public class Main {

    public static void main(String[] args) {

        try {
            int resultado = dividir(10, 0); // Esto lanza una excepción
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } finally {
            System.out.println("Este bloque se ejecuta siempre");
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }




}