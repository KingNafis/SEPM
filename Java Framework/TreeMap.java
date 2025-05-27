import java.util.TreeMap;
import java.util.StringTokenizer;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "hello world hello code hello world";
        TreeMap<String, Integer> wordFreq = new TreeMap<>();
        
        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }
        
        for (var entry : wordFreq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}