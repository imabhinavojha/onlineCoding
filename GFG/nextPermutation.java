package GFG;

public class nextPermutation {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 7, 5, 0};
        nextPermutation obj = new nextPermutation();
        obj.nextPermutation(arr);
        
    }

    void nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;
            while (j > i && arr[j] <= arr[i]) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int start = i + 1, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
