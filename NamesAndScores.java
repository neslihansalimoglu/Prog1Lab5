import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class NamesAndScores{
	public static void main(String[] args) throws FileNotFoundException {

		int max = 0;
		int min = 999999;
		int counter = 0;
		int total = 0;
		int grade = 0;
		String minimum;
		String maximum;
		
		File nameScoresfile = new File("NamesAndScores.txt");
		Scanner sc = new Scanner(nameScoresfile);

		while(sc.hasNext()){

			String names = sc.next();
			grade = sc.nextInt();

			if(min > grade){

				min = grade;
				minimum = names;
			}

			if(max < grade){

				max = grade;
				maximum = names;

			}

			total += grade;
			counter++;
		}

		double avg = total/counter;

		System.out.println( maximum + " has the best grade which is "  + max);
		System.out.println(minimum + " has the lowest grade which is "  + min);
		System.out.println(counter + " is the total of scores.");
		System.out.println(avg + "is the avarage.");
	}

}