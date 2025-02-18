
public class Circulo extends Forma
{

    private double raio;

    
    public Circulo(double raios)
    {
        raio = raios;
    }

    public double getRaio()
    { 
        return raio;
    }
    
    public double getArea()
    {
        return Math.PI * Math.pow(raio,2);
    }
    
    public double getPerimetro()
    {
        return 2 * Math.PI * raio;
    }
    
}
