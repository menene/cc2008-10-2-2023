import java.util.Scanner;
import java.util.ArrayList;

public class Taller {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Servicio[][][] calendario = new Servicio[10][5][7];

        // definir macanicos
        // Mecanico juan = new Mecanico("Juan", "1230101");
        // Mecanico marcela = new Mecanico("Marcela", "8230201");
        ArrayList<Mecanico> mecanicos = new ArrayList<Mecanico>();
        mecanicos.add(new Mecanico("Juan", "1230101"));
        mecanicos.add(new Mecanico("Marcela", "8230201"));

        // definir los vehiculos
        Vehiculo audi = new Vehiculo("Audi", "A4", 2023, "Negro", "123ABC");
        Vehiculo jeep = new Vehiculo("Jeep", "Laredo", 2024, "Rosa", "833POL");
        Vehiculo mazda = new Vehiculo("Mazda", "CX30", 2000, "Blanco", "765CUA");
        Vehiculo bmw = new Vehiculo("BMW", "X5", 2025, "Naranja Neon", "654YTD");

        // producto
        Producto servicioMenor = new Producto("Servicio Menor");



        Servicio s1 = new Servicio(mecanicos.get(0), bmw, servicioMenor);
        System.out.println(s1);
    
        System.out.println("En qué horario desea asignar? ");
        System.out.println("0. 8:00 a 9:00");
        System.out.println("1. 9:00 a 10:00");
        System.out.println("2. 10:00 a 11:00");
        int hora = scanner.nextInt();
        scanner.nextLine();

        System.out.println("En qué día desea asignar? ");
        System.out.println("0. Lunes");
        System.out.println("1. Martes");
        System.out.println("2. Miércoles");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qué placa va a programar? ");
        String placa = scanner.nextLine();

        Servicio[] casilla = calendario[hora][dia];
        for (int i = 0; i < 7; i++) {
            System.out.println(casilla[i]);

        }

        // for(Mecanico m: mecanicos) {
            
        // }

        // calendario[0][0][0] = s1;

    }

    // public static verificarDisponibilidad(int hora, int dia)

}