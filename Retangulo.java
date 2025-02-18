

public class Retangulo extends Forma
{
    
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    private double diagonal;

   
    public Retangulo(double lado1, double lado2)
    {
        base = lado1;
        altura = lado2;
    }

    public double getBase()
    {
        return base;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    public double getArea()
    {
        area = base * altura;
        return area;
    }
    
    public double getPerimetro()
    {
        perimetro = base * 2 + altura * 2;
        return perimetro;
    }
    
    public double getDiagonal()
    {
        diagonal = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return diagonal;
    }
}
