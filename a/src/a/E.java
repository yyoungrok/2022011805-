package a;

import java.util.Scanner;

public class E {
	public static void main(String[]arg) 
	{
		int num;
		int j=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		num = scan.nextInt();
		while(j<=num) {
			if((j%2)!=0)
			{
				System.out.println(j);
			}
			j++;
		}
		
		/*for (int j=1; j<=num; j++) {
			if((j%2)!=0) {
				System.out.println(j);
			}
		}*/
		
	}
}
