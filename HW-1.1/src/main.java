import java.util.Scanner;
public class main {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int toplam=0;
	System.out.print("Enter  1. item:");
	int first=scan.nextInt();
	toplam+=first;
	System.out.print("Enter 2. item:");
	int second=scan.nextInt();
	toplam+=second;
	System.out.print("Enter 3.item:");
	int third=scan.nextInt();
	toplam+=third;
	System.out.print("Enter 4.item:");
	int fourth=scan.nextInt();
	toplam+=fourth;
	System.out.print("Enter 5.item:");
	int fifth=scan.nextInt();
	toplam+=fifth;
	System.out.println("The subtotal amount="+toplam);
	double tax=toplam*0.07;
	System.out.println("the tax amount="+tax);
	double total=toplam+tax;
	System.out.println("the total amount="+total);
	
	
	}
}
