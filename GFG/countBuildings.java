package GFG;

public class countBuildings {
    public static void main(String[] args) {
        int arr[] = {7, 7, 8, 3, 2, 8, 9, 7};
        countBuildings.countBuildings(arr);

    }
    static int countBuildings(int[] height) {
        int count = 1, temp = height[0];
        for (int i = 0; i < height.length; i++) {
            if (height[i] > temp ){
                count++;
                temp = height[i];
            }
        }
        System.out.println(count);
        return  count;
    }
}
