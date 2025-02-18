
public class Quadrado extends Retangulo
{
    private double lado;
    private double area;
    private double perimetro;
    private double diagonal;

    public Quadrado(double lado)
    {
        super(lado, lado);
    }

    public double getLado()
    {
        return lado;
    }
    
    public double getArea()
    {
        return super.getArea();
    }
    
    public double getPerimetro()
    {
        return super.getPerimetro();
    }
    
    public double getDiagonal()
    {
        return super.getDiagonal();
    }
}