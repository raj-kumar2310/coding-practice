class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;
        int sum = 0;

        while (i < n) {
            if ((j-i + 1) % 2 == 1) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

            }

            j++;
                System.out.println(sum+" "+j);
            if (j == n) {
                i++;
                j = i;
            }
        }

        return sum;
    }
}