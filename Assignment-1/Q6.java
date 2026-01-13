import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double res = 0;
        for (int i = 1; i <= n; i++){
            res += 1/Math.pow(i,2);
        }
        System.out.println("Sum = "+res);
        sc.close();
    }
}
