package Codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int j = 0; j < testCase; j++) {
            
     
        int lenOfArray = sc.nextInt();
                

        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < lenOfArray; i++) {
            al.add(sc.nextInt());
        }

        int maxElement = Collections.max(al);
        System.out.println(maxElement);

    }
    }
    
}
