import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        try {
            cars.add(7, "Toyota");
        } catch(Exception e) {
            System.out.println("No se pudo ☠️ " + e);
        } finally {
            System.out.println("Termino el peligro");
        }

        System.out.println(cars);

        String primerCarro = cars.get(0);
        System.out.println(primerCarro);

        cars.set(0, "Opel");
        primerCarro = cars.get(0);
        System.out.println(primerCarro);
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);
        System.out.println(cars.size());

        cars.clear();
        System.out.println(cars);
    }

}