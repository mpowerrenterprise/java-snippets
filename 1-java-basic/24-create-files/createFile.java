import java.io.File;

class createFile{
	
	public static void main(String[]args){

     File f=new File("D:/kuna.txt");
 
     if(f.mkdir()){
		 
		 System.out.println("Created a file");
		 
	 } else{
		 
		  System.out.println("Unable to create a file");
		 
	 }
		
	}
	
}

//This program is used to create folder.