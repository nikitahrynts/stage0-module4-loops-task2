package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int start = 0;
        while (start <= printToInclusive) {
            BigInteger bigInteger = BigInteger.valueOf(start);
            if (bigInteger.isProbablePrime(100)) System.out.println(start);
            start++;
        }
    }
}
