public class pro{

	public static void main(String[]agrs){

		//Method usages
		int o=0;
		long re=0;

		for(o=0;o<=10;o++){

		 re=fact(o);

		System.out.println(re);

		}

		
	}

	//Method exmaple
	static long fact(long n){

		int i=0;
		long result=1;

		for(int a=0;a<=n;a++){

			result+=a;
		}

		return result; 
	}
}