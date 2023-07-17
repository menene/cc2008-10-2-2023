public class Otroperro {
    private String nombre;
    private String raza;
    private int edad;
    private String color;

    public Otroperro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        // this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + this.nombre + ", Raza:" + this.raza + ", Color: " + this.color + ", Edad: " + this.edad;
    }
}