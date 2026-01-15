import java.util.Scanner;
public class Q2 {
    public static void readInput(int[] counts){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(n != 0){
            n = sc.nextInt();
            if (n >= 1 && n <= 100)
                counts[n]++;
        }
        sc.close();
    }   
    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if (counts[i] == 1)
                System.out.println(i+" occurs "+counts[i]+" time");
            else
                System.out.println(i+" occurs "+counts[i]+" times");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter integer  between 1 and 100: ");
        int counts[] = new int[101];
        readInput(counts);
        displayCounts(counts);
    } 
}
 