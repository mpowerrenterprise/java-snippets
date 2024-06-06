class data{
	
    String name="Kuna";
	int age=15;
	
	void SystemPrint(){
		
		System.out.println("My name is "+name);
		System.out.println("My name is age "+age);
		
	}
	
}

//Data is base class

public class Get extends data {
	
	
	public static void main(String[]Args){
		
     Get p=new Get();
     p.SystemPrint();	
		
    }
	
	
}

//Get is the deveried class.

//in the pervious example we saw that the base class in a sperate file and the dervied in the sperate file.
//but in this example all are in one file.