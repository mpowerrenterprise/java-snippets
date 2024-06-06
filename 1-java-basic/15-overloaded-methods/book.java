class book{
	
	void displayInfo(String bittle,String author){
		
		System.out.println("The book "+bittle+" is written by "+author);
		
	}
	
	void displayInfo(String bittle){
		
		System.out.println("The book is "+bittle);
		
	}
	
	void displayInfo(String bittle,int nprice){
		
		System.out.println("The book is "+bittle+" is Rs "+nprice);
		
		
	}
	
	
	public static void main(String[]args){
		
		book b=new book();
		b.displayInfo("C++ Easy Guide","Kuna");
		b.displayInfo("C++ Easy Guide");
		b.displayInfo("C++ Easy Guide",1000);
		
		
	}
	
}

//This is called overloaded methods.
//The variable name in the parameter do not matter.Only the number and the type of the parameters matter.