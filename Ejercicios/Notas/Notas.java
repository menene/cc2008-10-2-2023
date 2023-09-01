import java.util.Scanner;
import java.util.ArrayList;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante estudiante = new Estudiante("Erick Marroquin", 23123);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        
        boolean go = true;
        String opcion = "";
        String nombreCurso = "";
        int notaCurso = 0;
        int currenIndex;
        String nombreEstudiante = "";
        int carnetEstudiante = 0;
        while (go) {
            printMenu();

            System.out.println("\u001B[36mIngrese la opción deseada: ");
            opcion = sc.nextLine();
            System.out.println("");

            switch(opcion) {
                case "0":
                    System.out.println("\u001B[33m- Agregar Estudiante -");

                    System.out.print("\u001B[36mIngrese el nombre: ");
                    nombreEstudiante = sc.nextLine();

                    System.out.print("\u001B[36mIngrese el carnet: ");
                    carnetEstudiante = sc.nextInt();
                    sc.nextLine();

                    estudiantes.add(new Estudiante(nombreEstudiante, carnetEstudiante));
                    break;
                case "1":
                    printEstudiantes(estudiantes);

                    System.out.println("\u001B[33m- Agregar una curso -");

                    System.out.print("\u001B[36mIngrese indice: ");
                    currenIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.print("\u001B[36mIngrese el nombre del curso: ");
                    nombreCurso = sc.nextLine();

                    System.out.print("\u001B[36mIngrese la nota del curso: ");
                    notaCurso = sc.nextInt();
                    sc.nextLine();

                    if (notaCurso < 0 || notaCurso > 100) {
                        System.out.println("\u001B[31mLa nota debe estar entre 0 y 100");
                    } else {
                        try {
                            estudiantes.get(currenIndex).setCurso(new Curso(nombreCurso, notaCurso));
                        } catch(Exception e) {
                            System.out.println("\u001B[31mSe dio el siguiente error:" + e);
                        }
                    }
                    break;
                case "2":
                    System.out.println("\u001B[33m- Listado de cursos -");
                    for (Estudiante e : estudiantes) {
                        System.out.println("\u001B[34m" + e.getNombre() + " - " + e.getCarnet());
                        e.imprimirCursos();
                        System.out.println("");
                    }
                    break;
                case "3":
                    System.out.println("\u001B[33m- Promedio Estudiante -");
                    for (Estudiante e : estudiantes) {
                        e.imprimirPromedio();
                    }
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("\u001B[35mGracias por utilizar mi programa 🫣");
                    go = false;
                    break;
                default:
                    System.out.println("\u001B[31mOpción incorrecta");
                    break;
            }   
        }
    }

    public static void printMenu() {
        System.out.println("");
        // System.out.println("\u001B[32m=== Mi control de notas ===");
        System.out.println("\u001B[32m _   _       _               ");
        System.out.println("\u001B[32m| \\ | |     | |           ");
        System.out.println("\u001B[32m|  \\| | ___ | |_ __ _ ___ ");
        System.out.println("\u001B[32m| . ` |/ _ \\| __/ _` / __|");
        System.out.println("\u001B[32m| |\\  | (_) | || (_| \\__ \\");
        System.out.println("\u001B[32m|_| \\_|\\___/ \\__\\__,_|___/");

        System.out.println("");
        System.out.println("\u001B[32m0. Agregar estudiante");
        System.out.println("\u001B[32m1. Agregar curso");
        System.out.println("\u001B[32m2. Listar cursos");
        System.out.println("\u001B[32m3. Promedio estudiante");
        System.out.println("\u001B[32m4. Salir");
        System.out.println("");
    }

    public static void printEstudiantes(ArrayList<Estudiante> estudiantes) {
        System.out.println("");
        System.out.println("\u001B[33m- Lista de estudiantes - ");
        
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("\u001B[34m" + i + " - " + estudiantes.get(i).getNombre());
        }

        System.out.println("");
    }
}