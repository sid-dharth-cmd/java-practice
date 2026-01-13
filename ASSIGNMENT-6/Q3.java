public class Q3 {
    public static int getPentagonalNumber(int n){
        return (n*(3*n-1))/2;
    }
    public static void main(String[] args){
        int k = 1;
        while(k <= 100){
            for (int i = 1; i <= 10; i++){
                for (int j = 1; j <= 10; j++){
                    System.out.print(getPentagonalNumber(k)+" ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}
