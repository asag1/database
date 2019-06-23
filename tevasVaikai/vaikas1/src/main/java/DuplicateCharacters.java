import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class DuplicateCharacters {

    String text;
    List<String> newText = new ArrayList<>();
    Map<String, Long> result = new HashMap<>();

    public DuplicateCharacters() {
    }

    public DuplicateCharacters(List<String> newText) {
        this.newText = newText;
    }

    public DuplicateCharacters(Map<String, Long> result) {
        this.result = result;
    }

    public Map<String, Long> modifyText(String text) {
        int a = 0;
        Pattern patt = Pattern.compile("[\\s]");
        Matcher mat = patt.matcher(text);
        text = text.toLowerCase();
        text = mat.replaceAll("");
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            newText.add(String.valueOf(charArray[i]));
        }
        Map<String, Long> result = newText.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return result;
    }

    public String getDuplicateCharacters(Map<String, Long> result) {

        result = result.entrySet().stream().filter(a -> a.getValue() > 1L)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        String dublicats = result.keySet().stream()
                .collect(Collectors.joining(", "));

        return dublicats;
    }

    public String howManyDuplicates(Map<String, Long> result) {

        String resultString = result.entrySet().stream()
                .filter(a -> a.getValue() > 1L)
                .map(b -> b.getKey() + ":" + b.getValue())
                .collect(Collectors.joining(", "));
        return resultString;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getNewText() {
        return newText;
    }

    public void setNewText(List<String> newText) {
        this.newText = newText;
    }

    public Map<String, Long> getResult() {
        return result;
    }

    public void setResult(Map<String, Long> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "DuplicateCharacters{" +
                "text='" + text + '\'' +
                '}';
    }
}
