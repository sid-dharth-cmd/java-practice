import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Prime nunmbers between "+n1+" and "+n2+" are: ");
        for (int i = n1; i <= n2; i++){
            boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i%j == 0)
                    isprime = false;
            }
            if (isprime)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
