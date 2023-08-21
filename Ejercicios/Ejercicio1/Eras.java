public class Eras {

    public static void main(String[] args) {
        Localidad localidad1 = new Loca lidad(20, 0, 1000);

        localidad1.venderEntrada(2);
        localidad2.venderEntrada(10);
        localidad3.venderEntrada(20);

        System.out.println(localidad1);
        System.out.println(localidad2);
        System.out.println(localidad3);

        float total1 = localidad1.getTotalVendido();
        float total2 = localidad2.getTotalVendido();
        float total3 = localidad3.getTotalVendido();

        float totalGeneral = total1 + total2 + total3;

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println("---------------");
        System.out.println(totalGeneral);
    }
    
}