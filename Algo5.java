import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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

    }
}
