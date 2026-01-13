import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double res = 0;
        for (int i = 1; i <= n; i++){
            if (i%2 == 0)
                res -= (double)(2*i)/(2*i-1);
            else
                res += (double)(2*i)/(2*i-1);
        }
        System.out.println("Sum = "+res);
        sc.close();
    }
}
