public abstract class Bebida
{
    protected float precio;
    protected float factorImpuesto;

    public Bebida(float precio, float factorImpuesto)
    {
        this.precio = precio;
        this.factorImpuesto = factorImpuesto;
    }

    public abstract String getNombre();
    public abstract float getPrecioFinal();
}