package formas;

public class Rectangulo extends Forma 
{

	public Rectangulo(float base, float altura)
	{
		super(base, altura);
	}
	
	@Override
	public float calcularArea() 
	{
		return getBase() * getAltura();
	}

}
