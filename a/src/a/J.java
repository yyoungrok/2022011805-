package a;

import java.util.Scanner;

public class J {
	public static void main(String[]arg) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. Vidw Students");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("Student Id:");
				int studentId = input.nextInt();
				System.out.print("Student Name:");
				String studentName = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("Student Id:");
				int studentId2 = input.nextInt();
			}
		}
	}

}
