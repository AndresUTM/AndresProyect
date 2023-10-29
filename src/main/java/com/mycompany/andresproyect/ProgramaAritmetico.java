import java.util.Scanner;

public class ProgramaAritmetico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorInteraccion gestorInteraccion = new GestorInteraccion();

        gestorInteraccion.mostrarMensaje("Elige el nivel de dificultad (1, 2, ...): ");
        int nivelDificultad = entrada.nextInt();

        gestorInteraccion.mostrarMensaje("Elige el tipo de problema aritmético (1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Aleatorio): ");
        int tipoProblema = entrada.nextInt();

        OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas(nivelDificultad, tipoProblema);

        int aciertos = 0;
        int intentos = 0;

        while (aciertos < 10) {
            int[] operandos = operacionesMatematicas.generarOperandos();
            String pregunta = operacionesMatematicas.generarPregunta(operandos[0], operandos[1]);

            gestorInteraccion.mostrarMensaje(pregunta);

            int respuestaUsuario = entrada.nextInt();
            int respuestaCorrecta = operacionesMatematicas.calcularRespuesta(operandos[0], operandos[1]);

            if (respuestaUsuario == respuestaCorrecta) {
                aciertos++;
                gestorInteraccion.mostrarMensajePositivo();
            } else {
                gestorInteraccion.mostrarMensaje("Incorrecto. Intenta una vez más.");
            }

            intentos++;
        }

        entrada.close();
    }
}

