
public class DateHelper {

	public static void main(String[] args) {
		DateHelper test= new DateHelper();
		
		for(int i=1900; i<=2017;i++) {
			
			if(test.checkLeapYear(i) == true) {
				System.out.println(i+" ist ein Schaltjahr");
			}else {
				System.out.println(i+" ist kein Schaltjahr");
				
			}
			
			
//			System.out.printf("%d ist %sein Schaltjahr\n",i,test.checkLeapYear(i)"" : "k");
		}

	}
	
	boolean checkLeapYear(int iYear) {
		
		if((iYear%4 ==0 && iYear%100 !=0) || (iYear%400 == 0) ) {
			
			return true;
		}
		
	
	
	else {
		
		return false;
	}
		
	}

}
