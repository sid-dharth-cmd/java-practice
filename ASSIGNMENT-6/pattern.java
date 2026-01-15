public class pattern {
    public static void main(String[]args){
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=k;j<k+n;j++){
                if(i==1||i==n){
                    System.out.print(j);
                }
                else{
                    if(j==k){
                        System.out.print(k);
                    }
                    else if(j==k+(n-1)){
                        System.out.print(k+(n-1));
                    }
                    else{
                        System.out.print('*');
                    }
                }

            }
            System.out.println();
            k+=1;

        }

    }
}

