public class OutOfStockException extends Exception {

    public OutOfStockException() {
        super("No hay existencia disponible");
    }

}