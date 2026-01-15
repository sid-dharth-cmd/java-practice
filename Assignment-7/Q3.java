import java.util.Scanner;
public class Q3{
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public static int countOccurrences(int[] arr, int key){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int arr[] = new int[10];
        readArray(arr);
        System.out.print("Enter the numbher to search: ");
        int key = sc.nextInt();
        System.out.print("The number "+key+" appears "+countOccurrences(arr, key)+" time(s) in the array.");
        sc.close();
    }
}