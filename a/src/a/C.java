package a;
import java.util.Scanner;

public class C {
	public static void main(String[]arg) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();		
		if ((num % 2)==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
}
