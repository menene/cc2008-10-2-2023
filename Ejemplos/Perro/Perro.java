public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String color;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Nombre: " + this.nombre + ", Raza:" + this.raza + ", Color: " + this.color + ", Edad: " + this.edad;
    }

    public String ladrar() {
        return "Wuff, Wuff";
    }
}