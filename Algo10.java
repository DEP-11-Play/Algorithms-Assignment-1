import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Enter the contact number : ");
            String contact = scanner.nextLine().strip();
            if (contact.isEmpty()) {
                System.out.println("Contact can't be empty");
                continue;
            }
            char[] chars = contact.toCharArray();
            boolean valid = false;
            // 1. +94 XX XXXXXXX
            validation1: {
                if (!contact.startsWith("+94")) {
                    
                    break validation1;
                }

                for (int i = 3; i < chars.length; i++) {
                    if (i == 3 || i == 6 || i == 10) {
                        if (!Character.isSpaceChar(i)) {
                            break validation1;
                        }
                    } else {
                        if (!Character.isDigit(chars[i]))
                            break validation1;
                    }
                }
                System.out.println("Number is validated");
                continue;
            }

            // 2. 0XX-XXXXXXX
            validation2:{
                if(chars[0]=='0'&& chars[3]=='-') break validation2;
                for (int i = 0; i < chars.length; i++) {
                    if(i==3) continue;
                    if(!Character.isDigit(chars[i])) break validation2;
                }
                System.out.println("Number is validated");
                continue;
            }
            System.out.println("Invalid");
        } while (true);
    }
}
