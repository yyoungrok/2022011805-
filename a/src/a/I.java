package a;
import java.util.Scanner;
public class I {
	public static void main(String[]arg) {
		
		  int n1, n2;
	      String s1;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("숫자 입력: ");
	      n1 = scan.nextInt();
	      n2 = scan.nextInt();
	      
	      
	      System.out.printf("기호 입력: ");
	      s1 = scan.next();
	      
	      switch(s1) {
	      case"+":
	         System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
	         break;
	      case"-":
	         System.out.println(n1 + "-" + n2 + " = "+(n1-n2));
	         break;
	      case"/":
	         System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
	         break;
	      case"*":
	         System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
	         break;         
	      }
	}
}
