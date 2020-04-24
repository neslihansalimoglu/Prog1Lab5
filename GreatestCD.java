import java.util.*;

public class GreatestCD{
	public static void main(String[] args) {

		int first;
		int second;
		int gcd = 1;

		Scanner firstinput = new Scanner(System.in);
		Scanner secondinput = new Scanner(System.in);

		System.out.println("\nLets find the greatest common divisor of two numbers");
		System.out.println("\nType a number: ");
		
		while (!firstinput.hasNextInt()){

			firstinput.nextLine();
			System.out.println("\nPlease try again to type a valid number");

		}

		first = firstinput.nextInt();

		System.out.println("\nType the second number: ");

		while(!secondinput.hasNextInt()){

			secondinput.nextLine();
			System.out.println("\nThis is not a valid number. Please try again");

		}

		second = secondinput.nextInt();

		for(int i =1; i <= first && i <= second; i++){
			
			if(first % i == 0 && second % i == 0)
			gcd = i;
		}

		System.out.println("\nGreatest common divisor of " + first + " and " + second + " is " + gcd);
	}
}