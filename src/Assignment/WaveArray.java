package Assignment;

import java.util.Arrays;
import java.util.Scanner;
/* standard input/output: 2s/128000 kB

Given an N size array of unique integers, your task is to print the array in a wave form, i. e a1 >= a2 <= a3 >= a4 <= a5.. . print the lexicographically smallest array possible.
Input
First line of input contains a single integer N, next line contains N space separated integers depicting the values of the array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 1000000000
Output
Print the array in wave form as mentioned.*/
/*Sample Input :-
5
2 1 3 5 4

Sample Output:-
2 1 4 3 5

Sample Input:-
3
1 2 3

Sample Output:-
2 1 3*/
public class WaveArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        for (int i = 0; i < n - 1; i += 2) {
            // swap(a[i],a[i+1]) ;
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
