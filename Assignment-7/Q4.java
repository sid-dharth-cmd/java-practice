import java.util.Scanner;
public class Q4 {
    public static double min(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double array[] = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("the minimum number is "+min(array));
        sc.close();
    }
}
