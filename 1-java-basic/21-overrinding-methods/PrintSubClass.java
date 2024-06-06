class PrintSubClass extends PrintClass{

int z=3;

void printMe(){

System.out.println("I am an instance of the "+getClass().getName());

}

public static void main(String[]args){

	PrintSubClass obj=new PrintSubClass();
	obj.printMe();

}

}

//The drived calss has higher presistence.
