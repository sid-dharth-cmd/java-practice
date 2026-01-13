import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int maxdiv = 0, result = n1;
        for (int i = n1; i <= n2; i++){
            int count = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i%j==0)
                    count++;
            }
            if (count > maxdiv || count == maxdiv && result < i){
                maxdiv = count;
                result = i;
            }    
        }
        System.out.println("The number with the most divisors is "+result);
        System.out.println("NUmber of divisors: "+maxdiv);
        sc.close();
    }
}