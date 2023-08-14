import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        do{
            System.out.print("Enter a Sentence");
            text=scanner.nextLine().strip();
            char[] textArray=text.toCharArray();
            int spaceCount=1;
            for (int i = 0; i < textArray.length; i++) {
                if(textArray[i]==' '){
                    spaceCount++;
                }
            }
            String[] wordArray=new String[spaceCount];
            int j=0;
            
            for (int i = 0; i < wordArray.length; i++) {
                
                for ( ; j < textArray.length; j++) {
                    String temp=""+textArray[i];
                    if(textArray[j]==' '){
                        continue ;
                    }
                }
            }
            System.out.println(wordArray[1]+wordArray[2]);
        }while(text.isBlank());
    }
}
