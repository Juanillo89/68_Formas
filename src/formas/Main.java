package formas;

public class Main 
{

	public static void main(String[] args) 
	{
		Triangulo triangulo = new Triangulo(10,15);
		System.out.println(triangulo.calcularArea());
		Rectangulo rectangulo = new Rectangulo(5,10);
		System.out.println(rectangulo.calcularArea());
	}

}
