import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] trial = new int[n];
        System.out.print("enter values for array; ");
        for (int i = 0; i < n; i++){
            trial[i] = sc.nextInt();
        }
        System.out.println("Here are the value: ");
        for (int i = 0; i < trial.length; i++){
            System.out.print(trial[i]);
        }
    }
}
