package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int start = 1;
            int beginIndex = 0;
            while (beginIndex <= power) {
                System.out.println(start);
                start *= 2;
                beginIndex++;
            }
        }
    }
}
