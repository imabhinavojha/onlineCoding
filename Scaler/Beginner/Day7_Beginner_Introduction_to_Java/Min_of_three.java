package Scaler.Beginner.Day7_Beginner_Introduction_to_Java;

import java.util.Scanner;

/* Problem Description
Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C.

Problem Constraints
1 <= A <= 1000000

1 <= B <= 1000000

1 <= C <= 1000000



Input Format
First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.



Output Format
One line containing an integer as per the question.



Example Input
Input 1:

5 
6 
7
Input 2:

1000 
10000 
100000


Example Output
Output 1:-
5
Output 2:-
1000


Example Explanation
Explanation 1:

Clearly, among 5, 6 and 7, 5 is minimum.
Explanation 2:

Clearly, among 1000, 10000 and 100000, 1000 is minimum.

 */
public class Min_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int num =  (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
        System.out.println(num);
    }
    
}
