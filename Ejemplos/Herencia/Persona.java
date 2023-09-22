public class Persona
{
    protected String nombre;
    protected int edad;
    protected String dpi;

    public Persona(String nombre, int edad, String dpi) {
        this.nombre = nombre;
        this.edad = edad;
        this.dpi = dpi;
    }

    // public Persona() {
    //     System.out.println("HOLA");
    // }

    // public Persona() {
    //     System.out.println("CONSTRUCTOR PADRE");
    //     this.nombre = "Erick";
    //     this.edad = 10;
    //     this.dpi = "12312312320101";
    // }

    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }

    // public void setEdad(int edad) {
    //     this.edad = edad;
    // }

    // public void setDpi(String dpi) {
    //     this.dpi = dpi;
    // }

    protected String getNombre() {
        return this.nombre;
    }

    public String toString() {
        return this.nombre + " de " + this.edad + " años y DPI número " + this.dpi;
    }

}