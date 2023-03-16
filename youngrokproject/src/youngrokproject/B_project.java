package youngrokproject;
import java.util.Scanner;

public class B_project {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        
        String sentence = scanner.nextLine();
        
        System.out.println(sentence);
        
        scanner.close();
   }
}
