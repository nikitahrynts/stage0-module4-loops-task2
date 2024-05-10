package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int start = 1;
        System.out.println(factorial);
        while (start <= printToInclusive) {
            factorial *= start++;
            System.out.println(factorial);
        }
    }
}
