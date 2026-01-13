import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int rev = 0, temp = n;
		while(temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		boolean prime1 = true, prime2 = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0)
				prime1 = false;
		}
		for (int i = 2; i <= Math.sqrt(rev); i++) {
			if (rev%i == 0)
				prime2 = false;
		}
		if (prime1 && prime2)
			System.out.println(n+" is a twisted prime.");
		else
			System.out.println(n+" is not a twisted prime.");
		sc.close();
	}

}
