package java_pta.report5;

import java.math.BigInteger;

public class Test4 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.MAX_VALUE + "");
        int c = 0;
        int max = 5;
        while (c < max) {
            num = num.add(new BigInteger("1"));
            if (isPrime(num)) {
                System.out.println(num);
                c++;
            }
        }
    }

    public static boolean isPrime(BigInteger bi) {
        int n = bi.intValue();
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}


