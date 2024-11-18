package GFG;

import java.util.ArrayList;

public class sortArray {
    public static void main(String[] args) {
        sortArray obj = new sortArray();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(2);
        al.add(1);
        al.add(2);
        al.add(0);
        obj.sort012(al);
    }

    public void sort012(ArrayList<Integer> arr) {
        int low = 0, mid = 0, high = arr.size() - 1;

        while (mid <= high) {
            switch (arr.get(mid)) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp = arr.get(low);
                    arr.set(low, arr.get(mid));
                    arr.set(mid, temp);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high]
                    temp = arr.get(mid);
                    arr.set(mid, arr.get(high));
                    arr.set(high, temp);
                    high--;
                    break;
            }
        }
    }
}
