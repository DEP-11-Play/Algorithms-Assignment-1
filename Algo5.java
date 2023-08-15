import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop:
        do{
        System.out.print("Enter a text : ");
        char[] chars = scanner.nextLine().strip().toCharArray();
        //0-128 
        if (chars.length==0){
            System.out.println("Text can not be empty");
            continue;
        }
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>128){
                System.out.println("Only ASCII characters allowed. ");
                continue loop;
            }
        }
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }

       System.out.println();
        }while(true);
        
        
        
        /*
         
        String text;
        do {
            System.out.print("Enter a text : ");
            text = scanner.nextLine().strip();
            char[] charText = text.toUpperCase().toCharArray();
            char[] reverse = new char[charText.length];
            for (int i = 0; i < reverse.length; i++) {
                reverse[i] = charText[reverse.length - 1 - i];
            }
            for (int i = 0; i < reverse.length; i++) {
                System.out.print(reverse[i]);
            }
            System.out.println();
        } while (text.isBlank());
         */

    }
}
