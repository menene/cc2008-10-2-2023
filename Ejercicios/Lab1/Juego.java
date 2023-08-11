public class Juego {

    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int jugadorActual = 1;

        boolean jugar = true;

        int  valor1, valor2;

        while (jugar) {
            System.out.println("=== TURNO DEL JUGADOR " + jugadorActual + " ===");

            // definir los puntos de la ronda en 0
            switch(jugadorActual) {
                case 1:
                    j1.resetPuntosRonda();
                    j1.incRondas();
                    break;

                case 2:
                    j2.resetPuntosRonda();
                    j2.incRondas();
                    break;
            }

            // lanzamos los dados
            d1.lanzarDado();
            d2.lanzarDado();

            // obtenemos el valor de las caras
            valor1 = d1.getValorCara();
            valor2 = d2.getValorCara();

            System.out.println("Valor dado 1: " + valor1);
            System.out.println("Valor dado 2: " + valor2);

            if (valor1 == 1 || valor2 == 1) {
                switch(jugadorActual) {
                    case 1:
                        j1.resetTotalPuntos();
                        jugadorActual = 2;
                        break;

                    case 2:
                        j2.resetTotalPuntos();
                        jugadorActual = 1;
                        break;
                }

                // jugadorActual++;
            }

            // jugar = false;
        }

        // int valor = d1.getValorCara();
        // System.out.println(valor);

        // d1.lanzarDado();
        // valor = d1.getValorCara();
        // System.out.println(valor);

        // Jugador j1 = new Jugador();
        // System.out.println(j1.getTotalPuntos());
        // System.out.println(j1.getPuntosRonda());
        // System.out.println(j1.getRondas());


    }

}