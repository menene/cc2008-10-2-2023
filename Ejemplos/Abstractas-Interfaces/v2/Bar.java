import java.util.ArrayList;

public class Bar {

    public static void main(String[] args)
    {
        ArrayList<Bebida> cuenta = new ArrayList<Bebida>();

        // sigamos imaginando un ingreso del teclado 🤔

        // sabían que esto se podía hacer? 🤯
        cuenta.add(new AguaPura(10.25f, 1f));
        cuenta.add(new Cerveza(32.50f, 1.32f));

        float subTotal;
        float totalCuenta = 0;

        System.out.println();
        System.out.println("Detalle de consumo:");
        System.out.println();
        
        for (Bebida b: cuenta)
        {
            subTotal = b.getPrecioFinal();

            System.out.println(b.getNombre() + " - " + subTotal);

            totalCuenta += subTotal;
        }
    
        System.out.println();
        System.out.println("Total cuenta: " + totalCuenta);
    }

    // Agreguemos todas las bebidas que querramos 😎 💰
}