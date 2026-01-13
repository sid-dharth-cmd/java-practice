import java.util.Scanner;
public class Q1 {
    public static int additionSimple(int x, int y){
        return x + y;
    }
    public static int subtractionSimple(int x, int y){
        return y - x;
    }
    public static int multiplicationSimple(int x, int y){
        return x * y;
    }
    public static int divisionSimple(int x, int y){
        return y / x;
    }
    public static int remainderSimple(int n, int m){
        return n % m;
    }
    public static double squareRoot(int n){
        return Math.sqrt(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op, x, y, n, m;
        do{
        System.out.println("----- SIMPLE CALCULATOR -----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Square Root");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
        op = sc.nextInt();
        switch(op){
            case 1:
                System.out.print("Enter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                System.out.println("Result (x + y) = "+additionSimple(x, y));
                break;
            case 2: 
                System.out.print("Enter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                System.out.println("Result (y - x) = "+subtractionSimple(x, y));
                break;
            case 3:
                System.out.print("Enter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                System.out.println("Result (x * y) = "+multiplicationSimple(x, y));
                break;
            case 4: 
                System.out.print("Enter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();
                if (x == 0)
                    System.out.println("Zero division error! Try again.");
                else 
                    System.out.println("Result (y / x) = "+divisionSimple(x, y));
            case 5: 
                System.out.print("Enter first number: ");
                n = sc.nextInt();
                System.out.print("Enter second number: ");
                m = sc.nextInt();
                System.out.println("Result (n % m) = "+remainderSimple(n, m));
                break;
            case 6:
                System.out.print("Enter number for square root: ");
                n = sc.nextInt();
                if (n < 0)
                    System.out.println("Error! Square root of a negative number is not allowed.");
                else 
                    System.out.println("Result = "+squareRoot(n));
                break;
            default: 
                System.out.println("Invalid option! Try again.");
        }
        }while(op != 7);
        System.out.println("Exiting... Thank you!");
        sc.close();
    }
}
