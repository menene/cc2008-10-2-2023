public class Curso {
    String nombre_curso;
    float promedio;

    public Curso(String nombre, float promedio) {
        this.nombre_curso = nombre;
        this.promedio = promedio;
    }

    // getters
    public String getNombreCurso() {
        return this.nombre_curso;
    }

    public float getPromedio() {
        return this.promedio;
    }

    // setters
    public void setNombreCurso(String nombre) {
        this.nombre_curso = nombre;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String toString() {
        return "Nombre: " + this.nombre_curso + " Promedio: " + this.promedio;
    }
}