package GFG;

public class powerFunction {
    public static void main(String[] args) {
        System.out.println(powerFunction.equals(2, 0 ,3));


    }

    public static int equals(int val, int index , int power) {
//        if (power == 0){
//            return 1;
//        }

        if (index == power){
            return  1;
        }
        
        // 2 , 3 -> 2 * 4 = 8
        // 2 , 2 -> 2 * 2 = 4
        // 2 , 1 -> 2 * 1 =  2
        // 2 , 0 -> 1

//       val = val * equals(val,power-1);

        // 2 , 0 , 3 -> 2 * 4 = 8
        // 2 , 1 , 3 -> 2 * 2 = 4
        // 2 , 2 , 3 -> 2 * 1 = 2
        // 2 , 3 , 3  -> 1

        val = val * equals(val,index+1, power);
        return val;
    }
}
