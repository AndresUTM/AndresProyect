import java.util.Scanner;

public class ProgramaAritmetico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorInteraccion gestorInteraccion = new GestorInteraccion();

        gestorInteraccion.mostrarMensaje("Elige el nivel de dificultad: ");
        gestorInteraccion.mostrarMensaje("1: Números de un dígito");
        gestorInteraccion.mostrarMensaje("2: Números de dos dígitos");
        int nivelDificultad = entrada.nextInt();

        gestorInteraccion.mostrarMensaje("Elige el tipo de problema aritmético: ");
        gestorInteraccion.mostrarMensaje("1: Suma");
        gestorInteraccion.mostrarMensaje("2: Resta");
        gestorInteraccion.mostrarMensaje("3: Multiplicación");
        gestorInteraccion.mostrarMensaje("4: División");
        gestorInteraccion.mostrarMensaje("5: Aleatorio");
        int tipoProblema = entrada.nextInt();

        OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas(nivelDificultad, tipoProblema);

        int aciertos = 0;
        int intentos = 0;

        while (intentos < 10) {
            int[] operandos = operacionesMatematicas.generarOperandos();
            String pregunta = operacionesMatematicas.generarPregunta(operandos[0], operandos[1]);

            gestorInteraccion.mostrarMensaje(pregunta);

            int respuestaUsuario = entrada.nextInt();
            int respuestaCorrecta = operacionesMatematicas.calcularRespuesta(operandos[0], operandos[1]);

            if (respuestaUsuario == respuestaCorrecta) {
                aciertos++;
                gestorInteraccion.mostrarMensaje("¡Muy bien!");
            } else {
                gestorInteraccion.mostrarMensaje("Incorrecto. Intenta una vez más.");
            }

            intentos++;
        }

        entrada.close();
    }
}
