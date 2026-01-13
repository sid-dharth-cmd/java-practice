public class Q2 {
    public static int countDigits(int n){
        int count = 0;
        while(n!=0){
            n /= 10;
            count++;
        }
        return count;
    } 
    public static int power(int a, int b){
        return (int)Math.pow(a, b);
    }
    public static boolean isArmstrong(int n){
        int temp = n;
        int dig = countDigits(n);
        int res = 0;
        while(temp!=0){
            int rem = temp%10;
            res += power(rem, dig);
            temp /= 10;
        }
        if (n == res)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.println("Armstrong Numbers from 100 to 10000: ");
        int count = 0;
        for (int i = 100; i <= 10000; i++){
            if (isArmstrong(i) == true){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("\nTotal Armstrong Numbers Found: "+count);
    }
    
}
