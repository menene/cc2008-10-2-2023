public class Localidad {
    
    private int disponibles;
    private int vendidos;
    private float precio;


    public Localidad(int disponibles, int vendidos, float precio) {
        this.disponibles = disponibles;
        this.vendidos = vendidos;
        this.precio = precio;
    }

    public void venderEntrada(int cantidad)
    {
        int delta = this.disponibles - this.vendidos;

        if (cantidad > delta) {
            cantidad = delta;
        }
        
        this.vendidos += cantidad;
    }

    public float getTotalVendido() {
        return this.vendidos * this.precio;
    }

    public String toString() {
        return "Disponibles: " + this.disponibles + " Vendidas: " + this.vendidos + " Precio: " + this.precio;
    }

}