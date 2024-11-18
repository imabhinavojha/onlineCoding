package GFG;

public class rotateArr {
    public static void main(String[] args) {
        rotateArr obj = new rotateArr();
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        obj.rotateArr(arr, d);
        obj.printArray(arr); // Print the rotated array

    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
          d = d%n;
          if(d==0 || n<=1)
          {
              return;
          }
          reverse(arr, 0, d-1); //Reverse first d element
          reverse(arr, d, n-1); //Reverse remaining n-d element
          reverse(arr, 0, n-1); //Reverse the entire array
      }
      
       private static void reverse(int[] arr, int start, int end)
      {
          while(start < end)
          {
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
          }
      }
      
      // Method to print the array
    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // For a new line after printing the array
    }
    
}
