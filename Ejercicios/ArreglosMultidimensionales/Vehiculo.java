public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String placa;

    public Vehiculo(String marca, String modelo, int anio, String color, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.placa = placa;
    }

    public String getNombre() {
        return this.marca + " (" + this.modelo + ", " + this.anio + " | " + this.placa + ")";
    }

    public String getPlaca() {
        return this.placa;
    }

}