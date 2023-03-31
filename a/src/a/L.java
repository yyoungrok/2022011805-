package a;
import java.util.HashSet;

public class L {
    public static void main(String[] args) {
        String sentence = "밤하늘에 \n별이 하나 떠 \n그 속에 내가 있어 \n나의 꿈을 \n담아서";
        String[] words = sentence.split(" ");

        HashSet<String> set = new HashSet<String>();

        for (String word : words) {
            set.add(word.toLowerCase());
        }

        int count = set.size();

        System.out.println("Number of words: " + count);
    }
}