//This is program reads data from a text file and display them to the console.
//We take the text file and put into an array then we print them.

import java.io.*; 
import java.util.*;


public class textReader{


	public static void main(String[]args){
		int[] arr=new int[10];
		
		readFile(arr);
		Arrays.sort(arr);//we sort the array.
		writeArray(arr);
	}

	public static void writeArray(int x[]){

		try{

			FileOutputStream fo=new FileOutputStream("sort.txt");
			PrintStream myObj=new PrintStream(fo);

			for(int a=0;a<10;a++){

				myObj.println(x[a]);
			}

		}catch(IOException e){

			System.out.println(e);
			System.exit(1);

		}

	}

	public static void readFile(int x[]){

		int i=0;

		try{

			FileInputStream fstream = new FileInputStream("data.txt");
			DataInputStream in=new DataInputStream(fstream);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String strLine;

			while((strLine=br.readLine()) !=null){

				x[i]=Integer.parseInt(strLine);
				i++;
			}

			in.close();
		}catch(Exception e){

			System.err.println("ERROR: "+ e.getMessage());
		}

	}

}