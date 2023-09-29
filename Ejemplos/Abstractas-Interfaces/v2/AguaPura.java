public class AguaPura extends Bebida
{
    private String nombre;

    public AguaPura(float precio, float factorImpuesto)
    {
        super(precio, factorImpuesto);
        this.nombre = "Agua Pura";
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public float getPrecioFinal()
    {
        return (this.precio * this.factorImpuesto);
    }
}