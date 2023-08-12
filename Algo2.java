public class Algo2 {
    public static void main(String[] args) {
        int[] num ={-5,2,7,10,-7,8,23};
        int max=num[0];
        int min=num[0];
            for (int j = 0; j < num.length; j++) if(max<num[j]) max=num[j];
            for (int i = 0; i < num.length; i++) if(min>num[i]) min=num[i];
            System.out.println("Largest number : "+max);
            System.out.println("Largest number : "+min);
    }
}
