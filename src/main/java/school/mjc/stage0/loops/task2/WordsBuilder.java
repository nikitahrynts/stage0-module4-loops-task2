package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int index = 0;
        String result = "";
        while (index < chars.length) {
            result += chars[index++];
        }
        System.out.print(result);
    }
}
