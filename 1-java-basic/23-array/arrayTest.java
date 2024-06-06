class arrayTest{
	
	String[] firstName={"Guna","Joker","hacker","doer"};
	String[] lastName=new String[firstName.length];
	
	void printNames(){
		
		int i=0;
		
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		
		System.out.println(firstName[i]+" "+lastName[i]);
		i++;
		
		
	}
	
	public static void main(String[]args){
		
		arrayTest as=new arrayTest();
		as.printNames();
		System.out.println("-----------");
		as.lastName[0]="rakulan";
		as.lastName[1]="rakulan";
		as.lastName[2]="rakulan";
		as.lastName[3]="rakulan";
		
		as.printNames();
		
	}
	
}