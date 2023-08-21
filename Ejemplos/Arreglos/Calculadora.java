public class Calculadora {

    // public float promedio(int a, int b, int c) {
    //     return (a + b + c) / 3;
    // }

    public float promedio(int ... notas) {
        float promedio = 0;

        if (notas.length != 0) {
            int suma = 0;

            for (int nota : notas) {
                suma += nota;
            }

            promedio = suma / notas.length;
        }

        return promedio;
    }

    public void printPromedio(String nombre, int ... notas) {
        float promedio = 0;

        if (notas.length != 0) {
            int suma = 0;

            for (int nota : notas) {
                suma += nota;
            }

            promedio = suma / notas.length;
        }

        System.out.println(nombre + ": " + promedio);
    }

    public void promedio2(int estudiante, int[] notas) {
        int suma = 0;
        int n = 0;
        float promedio = 0;
        String[] lista = {"Kevin", "Maria", "Oscar"};

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0) {
                suma += notas[i];
                n++;
            }
        }

        if (n != 0) {
            promedio = (suma / n);
        } 

        System.out.println("El promedio des estudiante " + lista[estudiante] + " es de: " + promedio);
    }

}