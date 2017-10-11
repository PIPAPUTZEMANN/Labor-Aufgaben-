
public class Loops {

	public static void main(String[] args) {

		calcCubicNumbers();
		
		System.out.println("Kontostand nach 100 Jahren ist gerundet: "+calcAccountBalance(1000)+ "€!");
		
		calcFibonacciNumbers(20);
		
		int zw = 20;
		int erg = calcFibonacciRecursive(zw);
		
	System.out.println("Die Zahl der Fibonacci-Reihe (Rekrusiv) "+zw+" lautet: "+erg);
	}

	public static void calcCubicNumbers() {
		for (int i = 0; i <= 100; i++) {

			int r = i * i * i;

			System.out.println("Kubic von " + i + " ist : " + r);
		}

	}

	public static double calcAccountBalance(double z) {
		
		for (int i = 1; i <= 100; i++) {
			z = z * 1.015;

		}

		return Math.round(z*100.00)/100.00;
	}
	
	public static int calcFibonacciNumbers(int n) {
		int f=0;
		int fvor=0;
		int fvorvor=0;
		for(int r=0;r<=n;r++) {
			if(r>=2) {
				
				f= fvor+fvorvor;
				
				System.out.printf("Die Zahl der Fibonacci-Reihe von %d lautet: %d\n",r,f);
			}
			
			else {
				
				f=r;
			}
			
			fvorvor=fvor;
			fvor=f;
			
			 
			
			 
		}
		return f;
		
		
	}
	
 	public static int calcFibonacciRecursive(int k){
  
 		if (k==1||k==2) {
	  
 			return 1;
 			
 		}
  
 		else { 
 			
 			return calcFibonacciRecursive(k-1)+calcFibonacciRecursive(k-2);
 			
 		
 		}
 		
 		
}	
	
	
	

}
