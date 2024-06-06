public class pro{

	public static void main(String[]args){

		System.out.println(fun(3));

	}


	public static long fun(int n){

		if(n<0){

			return -1;

		}else if(n==0){

			return 1;

		}else {

			return n * fun(n-1);//call it agign
		}

	}

}