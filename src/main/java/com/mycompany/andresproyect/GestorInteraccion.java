import java.util.Scanner;

public class GestorInteraccion {
    Scanner entrada;

    public GestorInteraccion() {
        entrada = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

