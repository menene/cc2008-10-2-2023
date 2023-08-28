public class Habitacion {

    private int numero;
    private int capacidad;
    private float precio;
    private String tipo;
    private boolean disponible;
    private Huesped huesped;

    public Habitacion(int numero, int capacidad, float precio, String tipo) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getNumero() {
        return this.numero;
    }

    public float getPrecio() {
        return this.precio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNombreHuesped() {
        return huesped.getNombre();
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

}