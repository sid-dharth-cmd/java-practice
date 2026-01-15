import java.util.Scanner;
public class Q1{
    public static int findSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }   
    public static double findAverage(int[] arr){
        return findSum(arr)/arr.length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Random values stored in the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = (int)(Math.random()*100+1);
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sum of the elements = "+findSum(arr));
        System.out.println("Average of elements = "+findAverage(arr));
        sc.close();
    }
}