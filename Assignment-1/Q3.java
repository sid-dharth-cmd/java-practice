import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0; 
		while (temp != 0) {
			int rem = temp%10;
			int res = 1;
			for (int i=1; i <= rem; i++) {
				res *= i;
			}
			sum +=res;
			temp /= 10;
		}
		if (sum == n)
			System.out.println(n+" is a Strong number.");
		else 
			System.out.println(n+" is not a Strong number.");
		sc.close();
	}

}
