public class Jugador {

    private int totalPuntos;
    private int puntosRonda;
    private int rondas;

    public Jugador() {
        this.totalPuntos = 0;
        this.puntosRonda = 0;
        this.rondas = 0;
    }

    public int getTotalPuntos() {
        return this.totalPuntos;
    }

    public int getPuntosRonda() {
        return this.puntosRonda;
    }

    public int getRondas() {
        return this.rondas;
    }

    public void incTotalPuntos(int puntos) {
        this.totalPuntos += puntos;
    }

    public void incPuntosRonda(int puntos) {
        this.puntosRonda += puntos;
    }

    public void incRondas() {
        this.rondas++;
    }

    public void resetTotalPuntos() {
        this.totalPuntos = 0;
    }

    public void resetPuntosRonda() {
        this.puntosRonda = 0;
    }
}