import java.math.BigDecimal;
import java.util.Scanner;
public class main {
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Please enter the number of female=");
		float female=scan.nextInt();
		System.out.print("Please enter the number of male=");
		float male=scan.nextInt();
		float total=male+female;
		float perc_male=male/total;
		float perc_female=female/total;
		System.out.println("The percentage of male is="+perc_male);
		System.out.println("The percentage of female is="+perc_female);
	}
}
