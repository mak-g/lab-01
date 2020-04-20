package question2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int k = 0; k < n; k++) {
            set.add(arr[k]);
        }
        LinkedList list = new LinkedList(set);
        for (int l = 0; l < list.size(); l++) {
            int val = ((Integer) list.get(l)).intValue();
            if (duplicate(arr, val) > 1)
                System.out.println("Occurence of " + val + " is " + duplicate(arr, val));
        }
    }

    public static int duplicate(int array[], int element) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                ++counter;
        }
        return counter;
    }
    }
