//This is program reads data from a text file and display them to the console.
//We take the text file and put into an array then we print them.

import java.io.*; 

public class textReader{


	public static void main(String[]args){
		int[] arr=new int[10];
		int i=0;

		try{

			FileInputStream fstream = new FileInputStream("data.txt");
			DataInputStream in=new DataInputStream(fstream);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String strLine;

			while((strLine=br.readLine()) !=null){

				arr[i]=Integer.parseInt(strLine);
				i++;
			}

			in.close();
		}catch(Exception e){

			System.err.println("ERROR: "+ e.getMessage());
		}

		printArry(arr);
	}

	public static void printArry(int x[]){

		for(int a=0;a < 10;a++){

			System.out.println(x[a]);

		}

	}

}