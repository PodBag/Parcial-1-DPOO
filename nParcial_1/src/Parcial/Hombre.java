package Parcial;

public class Hombre extends Humano{
	
	public double TMB(int peso, int altura, int edad) {
		return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
	}
	
}


