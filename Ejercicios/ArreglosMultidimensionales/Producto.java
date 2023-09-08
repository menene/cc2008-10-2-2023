public class Producto {

    private String nombre;
    private String[] servicios = {"Cambio aceite", "Cambio de filtro", "Revisión frenos"};

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}