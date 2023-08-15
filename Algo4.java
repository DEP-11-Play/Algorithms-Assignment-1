public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        for (int i = 0; i < nums.length/2; i++) {
          int t= nums[i];
          nums[i]=nums[nums.length-1-i];
          nums[nums.length-1-i]=t;
          //if(nums[i]==nums[nums.length-i-1]) break;
        }


        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.println("\b\b]");
    
    }
}
