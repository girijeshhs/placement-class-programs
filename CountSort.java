public class CountSort {
    public static void countSort(int[] nums) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int[] count = new int[max + 1];
        for (int x : nums) {
            count[x]++;
        }
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                nums[idx++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,2,1,1,2,0,0};
        countSort(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
