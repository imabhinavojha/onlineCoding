package GFG;

public class peakElement {
    public static void main(String[] args) {
        peakElement obj = new peakElement();
        int arr [] = {1, 2, 4, 5, 7, 8, 3};
        obj.peakElement1(arr);
        
    }
    public int peakElement1(int[] arr) {
        if (arr.length == 1)
        return 0;

        int temp =0;
        for (int i=0 ; i<arr.length-1 ; i++){
            if (arr[i]>temp) {
                temp = arr[i];
            }
        }
        return -1;
    }
    
}
