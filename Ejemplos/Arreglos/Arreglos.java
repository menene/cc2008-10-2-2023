public class Arreglos {

    public static void main(String[] args)
    {
        // int[] labs = new int[5];
        int[] labs = {-1,-1,-1,-1,-1};

        System.out.println(labs.length);
        System.out.println("===================");

        labs[0] = 90;
        labs[1] = 100;
        labs[2] = 80;
        // labs[3] = 0;
        // labs[4] = 80;

        // System.out.println(labs[1]);
        // System.out.println("===================");

        // labs[1] = 97;

        // System.out.println(labs[0]);
        // System.out.println(labs[1]);
        // System.out.println(labs[2]);
        // System.out.println(labs[3]);
        // System.out.println(labs[4]);
        // System.out.println("===================");

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(labs[i]);
        // }

        // System.out.println("===================");

        // for (int lab : labs) {
        //     System.out.println(lab);
        // }

        // System.out.println("===================");

        // int suma = 0;
        // int n = 0;
        // for (int i = 0; i < labs.length; i++) {
        //     System.out.println(labs[i]);

        //     if (labs[i] >= 0) {
        //         suma += labs[i];
        //         n++;
        //     }
        // }

        // System.out.println("===================");

        // float promedio = 0;
        // if (n != 0) {
        //     promedio = (suma / n);
        // } 

        // System.out.println("Suma: " + suma);
        // System.out.println("N: " + n);
        // System.out.println("Promedio: " + promedio);
        Calculadora c = new Calculadora();
        // float promedio1 = c.promedio(100, 90, 95, 100, 0);
        // System.out.println("Promedio1: " + promedio1);

        // c.printPromedio("Labs", 100, 90, 95, 100, 0);

        // c.promedio2(labs);

        int[][] estudiantes = new int[3][5];
        for (int i = 0; i < estudiantes.length; i++) {
            c.promedio2(i, estudiantes[i]);
        }
    }
}