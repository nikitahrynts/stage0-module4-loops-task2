package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int startNumber = 0;
        if (multiplyByAndToInclusive == 0) System.out.print("");
        else if (multiplyByAndToInclusive < 0) {
            while (startNumber <= (multiplyByAndToInclusive * -1)) {
                System.out.println(startNumber * multiplyByAndToInclusive);
                startNumber++;
            }
        } else {
            while (startNumber <= multiplyByAndToInclusive) {
                System.out.println(startNumber * multiplyByAndToInclusive);
                startNumber++;
            }
        }
    }
}
