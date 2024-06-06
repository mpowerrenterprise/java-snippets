public class weatherCondition{
	
	public static void main(String[]args){
		
		int month=10;
		
		String det;
		
		if(month==12||month==1||month==2){
			
			det="Winter";
			
		}else if(month==3||month==4||month==5){
			
			det="Spring";
			
		}else if(month==6||month==7||month==8){
			
			det="Summer";
			
		}else if(month==9||month==10||month==11){
			
			det="Autumn";
			
		}else{
			
			det="Invalid Number";
			
		}
		
		System.out.println(det);
		
	}
	
	
}

//This programme is written to calculate the weather condition.
//or || is used to check if any of them or if all of them true it will return true.
//if all of them is false it will return false.