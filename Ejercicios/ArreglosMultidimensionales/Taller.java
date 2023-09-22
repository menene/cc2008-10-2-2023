import java.util.Scanner;
import java.util.ArrayList;

public class Taller {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horas = 3;
        int dias = 2;

        // definir macanicos
        ArrayList<Mecanico> mecanicos = new ArrayList<Mecanico>();
        mecanicos.add(new Mecanico("Juan", "1230101"));
        mecanicos.add(new Mecanico("Marcela", "8230201"));

        // definir los vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(new Vehiculo("Audi", "A4", 2023, "Negro", "123ABC"));
        vehiculos.add(new Vehiculo("Jeep", "Laredo", 2024, "Rosa", "833POL"));
        vehiculos.add(new Vehiculo("Mazda", "CX30", 2000, "Blanco", "765CUA"));
        vehiculos.add(new Vehiculo("BMW", "X5", 2025, "Naranja Neon", "654YTD"));

        // definir el calendario
        Servicio[][][] calendario = new Servicio[horas][dias][mecanicos.size()];

        // producto
        Producto servicio = new Producto("Servicio Menor");

        // prueba de servicio
        // Servicio s1 = new Servicio(mecanicos.get(0), vehiculos.get(0), servicio);
        // System.out.println(s1);
        while(true) {
            System.out.println("En qué horario desea asignar? ");
            System.out.println("0. 8:00 a 9:00");
            System.out.println("1. 9:00 a 10:00");
            System.out.println("2. 10:00 a 11:00");
            int hora = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            System.out.println("En qué día desea asignar? ");
            System.out.println("0. Lunes");
            System.out.println("1. Martes");
            System.out.println("2. Miércoles");
            System.out.println("3. Jueves");
            System.out.println("4. Viernes");
            int dia = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            System.out.println("Qué placa va a programar? ");
            String placa = scanner.nextLine();
            System.out.println();
            
            boolean ocupado = false;
            Servicio[] casillas = calendario[hora][dia];

            // validar que la placa este disponible en horario y dia
            int indiceCasilla = -1;
            for (int i = 0; i < casillas.length; i++) {
                if (casillas[i] == null) {
                    ocupado = false;
                    indiceCasilla = i;
                } else {
                    if (casillas[i].getPlaca().equals(placa)) {
                        ocupado = true;
                    }
                }
            }

            // TAREA VALIDAR QUE EXISTAN CASILLAS
            if (ocupado) {
                System.out.println("\u001B[31mNo es posible asignar la placa en este horario");
            } else {
                ArrayList<Mecanico> mecanicosDisp = new ArrayList<Mecanico>();
                for(Mecanico m: mecanicos) {
                    for (int i = 0; i < casillas.length; i++) {
                        if (casillas[i] == null) { 
                            ocupado = false;
                        } else {
                            if (casillas[i].getMecanico().equals(m.getNombre())) {
                                ocupado = true;
                            }
                        }
                    }

                    if (!ocupado) {
                        mecanicosDisp.add(m);
                    }
                }

                if (mecanicosDisp.size() == 0) {
                    System.out.println("\u001B[31mNo hay mecánicos disponibles");
                } else {
                    System.out.println("--- LISTA DE MECANICOS DISPONIBLES ---");
                    int indice = 0;
                    for(Mecanico m: mecanicosDisp) {
                        System.out.println(indice + ". " + m.getNombre() + " - " +  m.getDpi());
                        indice++;
                    }

                    System.out.println("Qué mecánico quiere asignar? ");
                    int seleccionado = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();

                    int indiceVehiculo = -1;
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(i).getPlaca().equals(placa)) {
                            indiceVehiculo = i;
                        }
                    }

                    calendario[hora][dia][indiceCasilla] = new Servicio(mecanicosDisp.get(seleccionado), vehiculos.get(indiceVehiculo), servicio);
                }
            }

            // IMPRIMIR CALENDARIO
            System.out.println();
            System.out.println("=== CALENDARIO ===");
            for (int i = 0; i < horas; i++) {
                for (int j = 0; j < dias; j++) {
                    for (int k = 0; k < mecanicos.size(); k++) {
                        System.out.println("Dia: " + j + " Hora:" + i);
                        System.out.println(calendario[i][j][k]);
                        System.out.println();
                    }
                }
            }
        }
    }
}