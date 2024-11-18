package GFG;

public class pushZerosToEnd {
    public static void main(String[] args) {
        pushZerosToEnd obj = new pushZerosToEnd();
        int arr [] = {1, 2, 0, 4, 3, 0, 5, 0};
        obj.pushZerosToEnd(arr);
    }

    void pushZerosToEnd(int[] arr) {
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] != 0) {
                if (i != count) {
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count++;
            }
        }
    }
}
