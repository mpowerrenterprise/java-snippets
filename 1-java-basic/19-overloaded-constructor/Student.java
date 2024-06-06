public class Student{
	
	String name;
	int age;
	int id;
	
	Student(String n, int a){
		
		name=n;
		age=a;
		
	}
	
	Student(String n,int a,int i){
		
		name=n;
		age=a;
		id=i;
		
	}

    void Printer(){
	
		System.out.println("The Student name is "+name);
		System.out.println("The Stdeunt age is "+age);
		System.out.println("The Student id "+id);
	
		
	}	
	
	
	public static void main(String[]args){
		 

		 Student s1=new Student("Kuna",21);
		 Student s2=new Student("Joker",23,3698);
		 s1.Printer();
		 
		 System.out.println("------------------------");
		 
		 s2.Printer();
      		
	}
	
	
}

