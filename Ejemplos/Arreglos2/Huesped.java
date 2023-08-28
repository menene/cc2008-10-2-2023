public class Huesped {

    private String nombre;
    private int frecuencia;
    private int amigos;
    
    public Huesped(String nombre, int frecuencia, int amigos) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.amigos = amigos;
    }

    public String getNombre() {
        return this.nombre;
    }
}   