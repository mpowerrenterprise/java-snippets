public class Area {
	
	void call(int x){
		
		int square=x*x;
		System.out.println("The Square "+square);
		
	}
	
	public static void main(String[]args){
		
		Area ar=new Area();
		ar.call(12);
		
	}
	
}