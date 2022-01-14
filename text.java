import java.util.Scanner;

public class Balanedsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int count = 0;
            int size = sc.nextInt();
            // Try to use 0 as -1 and 1 as 1 so that the sum is 0 when they are equal.
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(findMaxLength(arr));
        }
    }
    public static int findMaxLength(int[] nums) {
        int maxlen = 0;
        for (int start = 0; start < nums.length; start++) {
            int zeroes = 0, ones = 0;
            for (int end = start; end < nums.length; end++) {
                if (nums[end] == 0) {
                    zeroes++;
                } else {
                    ones++;
                }
                if (zeroes == ones) {
                    maxlen = Math.max(maxlen, end - start + 1);
                }
            }
        }
        return maxlen;
    }
}