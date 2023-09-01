import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private int carnet;
    private ArrayList<Curso> cursos;

    public Estudiante(String nombre, int carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.cursos = new ArrayList<Curso>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCarnet() {
        return this.carnet;
    }

    public void setCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public int getCantidadCursos() {
        return this.cursos.size();
    }

    public float getPromedio() {
        int n = this.cursos.size();
        
        int suma = 0;
        // for (int i = 0; i < this.cursos.size(); i++) {
        //     suma += this.cursos.get(i).getNota();
        // }
        for (Curso c : this.cursos) {
            suma += c.getNota();
        }

        if (n == 0) { 
            n = 1;
        }

        return (suma / n);

    }

    public void imprimirPromedio() {
        System.out.println("\u001B[34m" + this.getNombre() + " - " + this.getCarnet() + " : " + this.getPromedio());
    }

    public void imprimirCursos() {
        for (Curso c : this.cursos) {
            System.out.println("\t\u001B[35m" + c.getNombre() + ": " + c.getNota());
        }
    }
    
}   