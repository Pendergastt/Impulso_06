public class LanzarExcepcion {
    public static void main(String[] args) {

       try {
            validarEdad(12);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }



    }
    public static void validarEdad(int edad) throws Exception {
        if (edad < 18) {
            throw new Exception("Edad insuficiente para continuar");
        }
        System.out.println("Edad válida");
    }
}