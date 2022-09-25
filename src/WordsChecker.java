import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String someText;

    public WordsChecker (String someText) {
        this.someText = someText;
    }

    public boolean hasWord (String word) {
        Set<String> set = new HashSet<>();
        for (String txt : someText.split("\\P{IsAlphabetic}+")) { // метод создания массива отдельных слов из текста
            set.add(txt);
        }
        if (set.contains(word)) return true;
        else return false;
    }
}