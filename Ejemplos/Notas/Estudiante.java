public class Estudiante {
    public static void main (String[] args) {

        Curso curso1, curso2, curso3, curso4, curso5;
        
        curso1 = new Curso("POO", 100);
        curso2 = new Curso("Cálculo", 80);
        curso3 = new Curso("Circuitos 1", 99);
        curso4 = new Curso("Física", 95);
        curso5 = new Curso("Ciudadanía", 90);

        System.out.println("Primer curso: " + curso1);
        System.out.println("Segundo curso: " + curso2);
        System.out.println("Tercer curso: " + curso3);
        System.out.println("Cuarto curso: " + curso4);
        System.out.println("Quinto curso: " + curso5);

        float suma = curso1.getPromedio() + curso2.getPromedio();
        suma += curso3.getPromedio();
        suma += curso4.getPromedio();
        suma += curso5.getPromedio();

        float promedio = (suma) / 5;

        System.out.println("");
        System.out.println("EL promedio general es: " + promedio);

        if (promedio >= 90) {
            System.out.println("Feliceidades, tu promedio es alto");
        }
    }
}