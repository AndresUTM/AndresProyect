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
        int totalPreguntas = 10;

        while (intentos < totalPreguntas) {
            int[] operandos = operacionesMatematicas.generarOperandos();
            String pregunta = operacionesMatematicas.generarPregunta(operandos[0], operandos[1]);

            boolean esRespuestaCorrecta = false;

            while (!esRespuestaCorrecta) {
                gestorInteraccion.mostrarMensaje(pregunta);
                int respuestaUsuario = entrada.nextInt();
                int respuestaVerdadera = operacionesMatematicas.calcularRespuesta(operandos[0], operandos[1]);

                if (respuestaUsuario == respuestaVerdadera) {
                    aciertos++;
                    gestorInteraccion.mostrarMensajePositivo();
                    esRespuestaCorrecta = true;
                } else {
                    gestorInteraccion.mostrarMensajeNegativo();
                }
            }

            intentos++;
        }

        // Calculando el porcentaje de respuestas correctas
        double porcentajeCorrecto = ((double) aciertos / totalPreguntas) * 100;
        
        if (porcentajeCorrecto < 75) {
            gestorInteraccion.mostrarMensaje("Por favor pide ayuda adicional a tu instructor.");
        } else {
            gestorInteraccion.mostrarMensaje("Felicidades, estás listo para pasar al siguiente nivel!");
        }

        entrada.close();
    }
}


