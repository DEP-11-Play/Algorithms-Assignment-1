import java.util.Arrays;
import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop: do {
            System.out.print("Enter a text : ");
            String input = scanner.nextLine().strip();
            char[] chars=input.toCharArray();
            // 0-128
            if (chars.length == 0) {
                System.out.println("Text can not be empty");
                continue;
            }
            int wordCount=1;

            for (int i = 0; i < chars.length; i++) {
                // Validation only char characters allowed. therefore upto 128
                if (chars[i] > 128) {
                    System.out.println("Only ASCII characters allowed. ");
                    continue loop;
                }
                if(chars[i]==' '){
                    wordCount++;
                }
            }

            String[] words =new String[wordCount];
            int k =0;
            int j=0;
            for (int i = 0; i < chars.length; i++) {
                if(Character.isSpaceChar(chars[i])){
                    String word=input.substring(k, i);
                    k=i+1;
                    words[--wordCount] = word;
                }
            }
            String word =input.substring(k);
            words[j]=word;
            System.out.println(Arrays.toString(words));
            System.out.println(String.join(" ", words));
        } while (true);
    }
}
