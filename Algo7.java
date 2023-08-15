import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String sentence;
        do{
            System.out.print("Enter a sentence : ");
            sentence=scanner.nextLine().toLowerCase();
            char[] charArray =sentence.strip().toCharArray();
            System.out.println();

        }while(sentence.isEmpty());
    }
}
