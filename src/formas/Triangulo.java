package formas;

public class Triangulo extends Forma 
{
	public Triangulo(float base, float altura)
	{
		super(base, altura);
	}
	
	@Override
	public float calcularArea() 
	{
		return (getAltura() * getBase()) / 2;
	}

}
