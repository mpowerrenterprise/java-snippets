public class cel{

	public static void main(String[]args){

		int far,cel;
		int lower,upper,step;
		lower=0;
		upper=200;
		step=15;
		far=lower;

		while(far<=upper){

			cel = 5 * (far-32) / 9;
			System.out.print(far);
			System.out.print(" ");
			System.out.println(cel);
			far=far+step;

		}

	}

}