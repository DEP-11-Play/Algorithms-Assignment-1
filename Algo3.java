import java.util.Arrays;

public interface Algo3 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int[] nums2=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i]=nums[nums.length-1-i];
        }
        nums=nums2;
        System.out.print("[");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.println("\b\b]");
        System.out.println(Arrays.toString(nums)); //This is an API
    }
}
