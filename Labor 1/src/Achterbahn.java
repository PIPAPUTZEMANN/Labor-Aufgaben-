
public class Achterbahn {
	
	int alter;
	double groese;
	boolean eltern;
	boolean nuechtern;

	public static void main(String[] args) {
		
		Achterbahn achterbahn= new Achterbahn();
		
		achterbahn.alter=16;
		achterbahn.groese=1.45;
		achterbahn.eltern=false;
		achterbahn.nuechtern=true;
		
		if(achterbahn.einlasskontrolle()== true) {
		System.out.println("Die Person ist BERECHTIGT zum fahren der Achternbahn");
		
		}
		else {
			
			System.err.println("Die Person ist NICHT berechtigt die Achterbahn zu fahren");
		}
		
		

	}



boolean einlasskontrolle() {
	
	if(alter>=16 || (alter>=12 && eltern)) {
		if(groese>=1.45 && groese<=2.05) {
			if(nuechtern) {
				
				return true;
		
			}
		}
	
	}
return false;

}
}