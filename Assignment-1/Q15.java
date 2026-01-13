import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (n > 3): ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 1, sum = 0;
        System.out.print(a+" "+b+" "+c+" ");
        for (int i = 1; i <= n-3; i++){
            sum = a + b + c;
            System.out.print(sum+" ");
            a = b; b = c; c = sum;
        }
        sc.close();
    }
}
