
public class ControlStructures {

	public static void main(String[] args) {
		
		/*int x=4;
		int y=1;
		int result= sum(x,y);
		System.out.println(result); */
		
			
	System.out.println(sum(4,1));
	System.out.println(calcCubicNumber(4));
	System.out.println("Mehrwertssteuer: "+calcMwSt(100)+"€");
	
	}
	
	
	
	public static int sum(int a, int b) //Der Typ des Rückgabewertes der Methode ist int.
	{
	
		return a+b; // Übergabeparamter der Methode sind a und b, sie sind vom Typ int.
		
		
		/*int r=a+b; 

return r;*/

	}
	
	
	public static int calcCubicNumber(int c) {

return c*c*c;
		
		
}
	
	public static double calcMwSt(double d) {
		
		double m= (d *19)/119;
		
		return Math.round(m*100.00)/100.00;
		
	}
	
}