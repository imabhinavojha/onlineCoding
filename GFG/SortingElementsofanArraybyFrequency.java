package GFG;

import java.util.*;

public class SortingElementsofanArraybyFrequency {
    public static void main(String[] args) {
        SortingElementsofanArraybyFrequency obj = new SortingElementsofanArraybyFrequency();
        int arr[] = {4, 6, 9, 19, 2, 16, 13, 11, 16, 17, 16, 8, 12, 16, 12, 18};
        ArrayList<Integer> result = obj.sortByFreq(arr);
        System.out.println(result);

    }
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // Step 1: Count the frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("freqMap"+freqMap);
        // Step 2: Create a list of elements with their frequencies
        List<int[]> freqList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            freqList.add(new int[]{entry.getKey(), entry.getValue()});
        }


        // Step 3: Sort the list by frequency and then by element value
        Collections.sort(freqList, (a, b) -> {
            if (b[1] == a[1]) {  // If frequencies are the same, sort by element value
                return a[0] - b[0];
            } else {  // Otherwise, sort by frequency in descending order
                return b[1] - a[1];
            }
        });
        // Step 4: Construct the result array
        ArrayList<Integer> sortedArr = new ArrayList<>();
        for (int[] entry : freqList) {
            int element = entry[0];
            int frequency = entry[1];
            for (int i = 0; i < frequency; i++) {
                sortedArr.add(element);
            }
        }

        return sortedArr;

    }
}
