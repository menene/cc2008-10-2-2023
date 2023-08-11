import java.util.Random;

public class Dado {
    private int valorCara;
    private Random rand;
    
    public Dado() {
        this.valorCara = 0;
        rand = new Random();
    }

    public int getValorCara() {
        return this.valorCara;
    }

    public void lanzarDado() {
        this.valorCara = this.rand.nextInt(5) + 1;
    }
}