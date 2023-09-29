public class Bebida
{
    private String tipo;
    private float precio;

    public Bebida(String tipo, float precio)
    {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public float getPrecio()
    {
        return this.precio;
    }
}