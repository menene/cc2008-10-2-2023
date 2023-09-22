public class Estudiante extends Persona {

    protected String carrera;
    private int carnet;

    public Estudiante(String nombre, int edad, String dpi, String carrera, int carnet) {
        super(nombre, edad, dpi);
        
        // System.out.println("CONSTRUCTOR HIJO");

        this.carrera = carrera;
        this.carnet = carnet;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String toString() {
        // return getNombre() + ' - ' + this.carnet + " de " + this.carrera;
        return nombre + " - " + this.carnet + " de " + this.carrera;
    }
}