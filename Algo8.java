public class Algo8 {
    public static void main(String[] args) {
        int[] numA = { 5, 7, -2, 3, 4, 6, -8 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };
        System.out.println("[");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    System.out.print(numA[i] + ", ");
                }
            }

        }
        System.out.println("\b\b]");
    }
}
