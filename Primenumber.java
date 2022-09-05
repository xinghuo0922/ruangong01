public class Primenumber {
    public static void main(String[] args) {
        int j=0;
        for(int i=1;i<=20000;i++){
            if(isPrime(i)){
                j++;
                if(j==5){
                    System.out.println(i);
                    j=0;
                }else {
                    System.out.print(i+" ");
                }
            };
        }
    }
    public static boolean isPrime(int n)
    {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2==0) return false;
        for(int i = 3; i < n; i += 2)
            if(n%i == 0) return false;
        return true;
    }
}
