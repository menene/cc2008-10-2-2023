public class Hotel {

    public static void main(String[] args) {
        // Habitacion h1 = new Habitacion(1, 5, 300, 'Estandar');
        // Habitacion h2 = new Habitacion(2, 7, 500, 'Deluxe');
        // Habitacion h3 = new Habitacion(3, 10, 1000, 'VIP');
        Habitacion[] habitaciones = new Habitacion[3];
        habitaciones[0] = new Habitacion(101, 5, 300, "Estandar");
        habitaciones[1] = new Habitacion(201, 7, 500, "Deluxe");
        habitaciones[2] = new Habitacion(301, 10, 1000, "VIP");

        Huesped h1 = new Huesped("Erick Marroquin", 10, 5);
        Huesped h2 = new Huesped("Juan Perez", 0, 2);
        Huesped h3 = new Huesped("Maria Jimenez", 100, 3);

        habitaciones[0].setHuesped(h1);
        habitaciones[1].setHuesped(h2);
        habitaciones[2].setHuesped(h3);

        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println("Numero: " + habitaciones[i].getNumero() + " / " + habitaciones[i].getNombreHuesped());
        }

        // int[] numeros = new int[3];
        // numeros[0] = 10;
        // numeros[1] = 20;
        // numeros[2] = 30;

        // System.out.println(numeros[1]);
    }

}