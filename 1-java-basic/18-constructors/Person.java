public class Person{
	
	String name;
	int age;
	
	Person(String n,int a){
		
		name=n;
		age=a;
		
	}
	void PrintPerson(){
		
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		
	}
	
	
	public static void main(String[]args){
		
		Person p=new Person("Kuna",25);
		p.PrintPerson();
		System.out.println("-------------");
		
        Person p2=new Person("Joker",36);
		p2.PrintPerson();
		System.out.println("--------------");
	    
		
	}
}

//This is constructors
