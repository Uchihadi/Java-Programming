package javafundamentals;

public class Prime {
    public boolean isPrime(int n) {
        int count = 0;
        //if(n==1 || n==2)
        //    return true;
        for (int i = 3; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count != 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        p.isPrime(4);
    }
}
