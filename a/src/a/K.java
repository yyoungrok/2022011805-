package a;
import java.util.Scanner;
public class K {
	public static void main(String[]arg) {
		Scanner input = new Scanner(System.in);
        
        System.out.println("Guess the front (H) or back (T) of the coin: ");
        String userGuess = input.nextLine().toUpperCase();
        
        int randomNum = (int)(Math.random() * 2);
        
        String coinFace = randomNum == 0 ? "H" : "T";
        
        System.out.println("H or T : " + coinFace);
        
        if (userGuess.equals(coinFace)) 
            System.out.println("correct!");
        else 
            System.out.println("incorrect");
        
    }
}