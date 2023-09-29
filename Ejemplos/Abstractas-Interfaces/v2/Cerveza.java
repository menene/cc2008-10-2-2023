public class Cerveza extends Bebida
{
    private String nombre;

    public Cerveza(float precio, float factorImpuesto)
    {
        super(precio, factorImpuesto);
        this.nombre = "Cerveza";
    }

    // qué pasa si lo comentamos? 🤔
    public String getNombre()
    {
        return this.nombre;
    }

    // public float getPrecioFinal()
    // {
    //     return (precio * factorImpuesto);
    // }
}