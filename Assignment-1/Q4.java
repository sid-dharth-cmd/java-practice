import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int max = 0, div = 0;
        for (int i = n1; i <= n2; i++){
            for (int j = 1; j <= i/2; j++) {
                if (i%j==0)
                    div++;
            }
            if (max < div)
                max = div;
        }
        System.out.println(max);
        sc.close();
    }
}