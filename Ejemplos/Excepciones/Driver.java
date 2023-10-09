
public class Driver {

    public static void main(String[] args) /*throws OutOfStockException*/ {

        // int num1=1000, num2=0;
        // try {
        //     System.out.println(num1/num2);
        // } catch(ArithmeticException e) {
        //     System.out.println("Lo sentimos se dio un error: " + e);
        // }

        // Calculo c = new Calculo(1000, 0);

        // try {
        //     System.out.println(c.calcularPromedio());
        // } catch(ArithmeticException e) {
        //     System.out.println("Lo sentimos se dio un error: " + e);
        // }

        // try {
        //     BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
        //     String line;
        //     while ((line = reader.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch(FileNotFoundException e) {
        //     System.out.println("Archivo no encontrado 😫");
        // } catch(IOException e2) {
        //     System.out.println("Error extraño 🤯");
        // }

        // Files f = new Files();
        // try {
        //     String content = f.getContent("archivo.txt");
        // } catch(Exception e) {
        // }


        // throw new OutOfStockException();

        // try {
        //     throw new OutOfStockException();
        // } catch(Exception e) {
        //     System.out.println(e);
        // }


        Cajero c = new Cajero();

        try {
            int existencia = c.getExistencia();
            System.out.println("GRACIAS POR TU COMPRA");
        } catch (OutOfStockException e) {
            System.out.println("LO SENTIMOS NO HAY INVENTARIO");
        } finally {
            System.out.println("GRACIAS POR VISITARNOS");
        }



    }
}