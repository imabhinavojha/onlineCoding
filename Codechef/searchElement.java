package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        searchElement obj = new searchElement();
        obj.searchElement();

    }

    public String searchElement() {
        Scanner sc = new Scanner(System.in);
        int lenOfArray = sc.nextInt();
        int searchElementInArray = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        String value;

        for (int i = 0; i < lenOfArray; i++) {
            al.add(sc.nextInt());
        }

        if (al.contains(searchElementInArray)) {
            value = "Yes";
        } else {
            value = "No";
        }
        

        return value;

    }

}
