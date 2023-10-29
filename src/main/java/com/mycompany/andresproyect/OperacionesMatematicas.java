import java.security.SecureRandom;

public class OperacionesMatematicas {
    private SecureRandom generador;
    private int nivelDificultad;
    private int tipoProblema;

    public OperacionesMatematicas(int nivelDificultad, int tipoProblema) {
        this.generador = new SecureRandom();
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
    }


}

