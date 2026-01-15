public class Q8 {
    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] =(int)(Math.random()*(29))+2;
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean isPrime(int[] arr){
        boolean isPrime = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j <= Math.sqrt(j); j++){
                if (i%j == 0)
                    isPrime = true;
            }
        }
        return isPrime;
    }
    public static int countPrime (int[] arr){
        
    }
}
