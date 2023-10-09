public class Cajero {

    public int getExistencia() throws OutOfStockException {
        int existencia = 0;


        if (existencia == 0) {
            throw new OutOfStockException();
        }

        return existencia;
    }

}