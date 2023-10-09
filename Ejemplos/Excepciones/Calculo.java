public class Calculo {

    private int suma, n;

    public Calculo(int suma, int n) {
        this.suma = suma;
        this.n = n;
    }

    public float calcularPromedio() {
        float resultado;

        try {
            resultado =  (this.suma / this.n);
        } catch(ArithmeticException e) {
            resultado = 0;
        }

        return resultado;
    }

}