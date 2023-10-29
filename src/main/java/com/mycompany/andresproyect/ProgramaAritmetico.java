import java.util.Scanner;

public class ProgramaAritmetico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige el nivel de dificultad: (1 para un dígito, 2 para dos dígitos, etc.)");
        int nivel = entrada.nextInt();

        System.out.println("Elige el tipo de problema: (1 para suma, 2 para resta, 3 para multiplicación, 4 para división, 5 para mezcla aleatoria)");
        int tipo = entrada.nextInt();

        GestorInteraccion gestorInteraccion = new GestorInteraccion();
        OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas(nivel, tipo);

       

        entrada.close();
    }
}

