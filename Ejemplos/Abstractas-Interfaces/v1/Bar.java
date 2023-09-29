import java.util.ArrayList;

public class Bar {

    public static void main(String[] args)
    {
        ArrayList<Bebida> cuenta = new ArrayList<Bebida>();

        // imaginemos un ingreso del teclado 🤔

        cuenta.add(new Bebida("Agua Pura", 10.25f));
        cuenta.add(new Bebida("Cerveza", 32.50f));

        float factorImpuesto;
        float subTotal;
        float totalCuenta = 0;

        System.out.println();
        System.out.println("Detalle de consumo:");
        System.out.println();
        
        for (Bebida b: cuenta)
        {
            switch(b.getTipo()) {
                case "Agua Pura":
                    factorImpuesto = 1f;
                    break;

                case "Cerveza":
                    factorImpuesto = 1.32f;
                    break;

                default:
                    factorImpuesto = 1.01f;
                    break;
            }

            subTotal = (b.getPrecio() * factorImpuesto);

            System.out.println(b.getTipo() + " - " + subTotal);

            totalCuenta += subTotal;
        }

        System.out.println();
        System.out.println("Total cuenta: " + totalCuenta);
    }

    // que pasa si quiero empezar a vender Micheladas??? 😫
}