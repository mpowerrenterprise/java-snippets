public class switchSte{
	
	
	String converNum(int val){
		
		switch(val){
			
			case 0:
			return "Zero";
			
			case 1:
			return "one";
			
			case 2:
			return "two";
			
			case 3:
			return "Three";
			
			case 4:
			return "Four";
			
			case 5:
			return "Five";
			
			case 6:
			return "Six";
			
			case 7:
			return "Seven";
			
			case 8:
			return "Eight";
			
			case 9:
			return "Nine";
			
			case 10:
			return "Ten";
			
			default:
			return "invalid Number";
			
			
		}
		
	}
	
	public static void main(String[]args){
		
		
	switchSte n=new switchSte();
	String num=n.converNum(55);
	System.out.println(num);
		
		
	}
	
}