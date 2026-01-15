import java.util.Scanner;
public class Q6 {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int countOccurrence(int[] arr, int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value)
                count++;
        }
        return count;
    }
    public static int firstPositionOfMax(int[] arr, int max){
        int pos = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max)
                pos = i;
        }
        return pos;
    }
    public static int lastPositionOfMin(int[] arr, int min){
        int pos = -1;
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] == min)
                pos = i;
        }
        return pos;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" values: ");
        readArray(arr);
        System.out.println("\nMaximum value: ");
        findMax(arr);
        System.out.println("It occurs "+countOccurrence(arr, findMax(arr)));
        System.out.println("First position of maximum: "+firstPositionOfMax(arr, findMax(arr)));
        System.out.println("\nMinimun value: "+findMax(arr));
        sc.close();
    }
}