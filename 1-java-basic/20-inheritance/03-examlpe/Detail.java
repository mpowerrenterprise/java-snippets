class Detail extends Personal{
	
	void show(){
		
		System.out.println("Lastname:"+lname);
		System.out.println("Address: "+address);
		System.out.println("Age:"+age);
		
	}
	
	public static void main(String[]args){
		
		Detail det=new Detail();
		det.showDat();
		det.show();
		
	}
	
}

//This class is derving from the personal class.

