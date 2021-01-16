package entidade;

public class ClasseEstatica {
	
	public static final double PI = 3.14;
	
	public static double calculoCircun(double r) 
	{
		double circunferencia = PI * (r*2);
		return circunferencia;	
	}
	
	public static double calculoVolume(double r) 
	{
		double volume = PI * Math.pow(r, 2);
		return volume;	
	}
	
}
