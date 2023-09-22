public class Servicio {

    private Mecanico mecanico;
    private Vehiculo vehiculo;
    private Producto producto;

    public Servicio(Mecanico mecanico, Vehiculo vehiculo, Producto producto) {
        this.mecanico = mecanico;
        this.vehiculo = vehiculo;
        this.producto = producto;
    }

    public String getMecanico() {
        return this.mecanico.getNombre();
    }

    public String getPlaca() {
        return this.vehiculo.getPlaca();
    }

    public String toString() {
        return this.mecanico.getNombre() + " - " + this.vehiculo.getNombre() + ": " + this.producto.getNombre();
    }
}