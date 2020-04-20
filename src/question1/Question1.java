package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        Question1 obj = new Question1();
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int number = sc.nextInt();
        obj.printOccurence(arr,number);
    }

    public void printOccurence(int[] arr,int number){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("Element "+number+" occur at "+ (i+1)+" position");
            }
        }
    }
}
