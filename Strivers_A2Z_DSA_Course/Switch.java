package Strivers_A2Z_DSA_Course;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        int choice = 1;
        List<Double> list = new ArrayList<>();
        list.add(5.0);
        Switch.switchCase(choice,list);

    }
    static double switchCase(int choice, List<Double> arr){
        Double value = 0.0;
        switch (choice){
            case 1:{
                value = Math.PI*Math.pow(arr.get(0),2);
                break;
            }
            case 2:{
                value = arr.get(0)*arr.get(1);
                System.out.println(value);
                break;
            }
        }
        return value;
    }
}
