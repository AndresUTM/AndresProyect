import java.security.SecureRandom;

public class OperacionesMatematicas {
    int nivelDificultad;
    int tipoProblema;
    SecureRandom generador;

    public OperacionesMatematicas(int nivelDificultad, int tipoProblema) {
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
        this.generador = new SecureRandom();
    }

    public int[] generarOperandos() {
        int limite = (int) Math.pow(10, nivelDificultad) - 1;
        int numero1 = generador.nextInt(limite) + 1;
        int numero2 = generador.nextInt(limite) + 1;
        return new int[]{numero1, numero2};
    }

    public String generarPregunta(int numero1, int numero2) {
        String signo = "";
        if (tipoProblema == 1) signo = " + ";
        else if (tipoProblema == 2) signo = " - ";
        else if (tipoProblema == 3) signo = " x ";
        else if (tipoProblema == 4) signo = " / ";
        return "¿Cuánto es " + numero1 + signo + numero2 + "?";
    }

    public int calcularRespuesta(int numero1, int numero2) {
        if (tipoProblema == 1) return numero1 + numero2;
        else if (tipoProblema == 2) return numero1 - numero2;
        else if (tipoProblema == 3) return numero1 * numero2;
        else if (tipoProblema == 4) return numero1 / numero2;
        else return 0;
    }
}


