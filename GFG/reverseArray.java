package GFG;

public class reverseArray {
    public static void main(String[] args) {
        reverseArray obj = new reverseArray();
        int ar[] = {1, 4, 3, 2, 6, 5};
        obj.reverseArray(ar);
    }

    public void reverseArray(int arr[]) {
        int i, temp;
        for(i=0;i<arr.length/2;i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }
}
