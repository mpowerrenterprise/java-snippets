 //This is fibonacci algorithm.

import java.io.*; //Input output java liberary.

public class fibonacci{

	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in)); //Stream Reader method.

	public static void main(String[]args) throws IOException{

		System.out.println("Please enter a number");

		String input=stdin.readLine();// Read the user input as string to the input variable.
        int i=0;  
        i=Integer.parseInt(input);//Convert the string type into integer.

		System.out.println(fib(i));

	}

	public static int fib(int n){

		if(n==0){

			return 0;

		}else if(n==1){

			return 1;

		}else{

			return fib(n-1) + fib(n-2);
		}

	} 

}