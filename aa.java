import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {5, 9, 9, 7, 3};

        Arrays.sort(arr); // sorted = [3, 5, 7, 9, 9]

        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println(secondLargest);
    }
}
