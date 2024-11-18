package GFG;

public class missingAndRepeating {
    public static void main(String[] args) {
        int aarr[] = {1, 3, 3};
        int arr[] = missingAndRepeating.findTwoElement(aarr);
        System.out.println(arr[0]+" "+arr[1]);
    }

    static int[] findTwoElement(int arr[]) {

        int n = arr.length;

        // Initialize variables to store sum and sum of squares
        long sum = 0, sumSq = 0;
        long expectedSum = (n * (n + 1)) / 2;
        long expectedSumSq = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate actual sum and sum of squares
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumSq += (long) arr[i] * arr[i];
        }

        // Calculate the difference between expected and actual
        long diffSum = expectedSum - sum;  // A - B
        long diffSumSq = expectedSumSq - sumSq;  // A^2 - B^2

        // Now, diffSumSq = (A - B)(A + B)
        long sumAplusB = diffSumSq / diffSum;

        // A and B
        int missing = (int) (diffSum + sumAplusB) / 2;
        int repeating = (int) (sumAplusB - missing);

        return new int[] {repeating, missing};

    }
}
