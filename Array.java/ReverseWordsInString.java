import java.util.*;;
public class ReverseWordsInString{
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ",words);
    }
}