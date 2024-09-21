import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");
        int nullCount = 0;
        int stringCount = 0;
        for (String value : strings) {
            if (value == null || value.isEmpty()) {
                nullCount++;
            } else {
                stringCount++;
            }
        }
        System.out.println("Given string is having: \nEmpty Strings in the list:"
        + nullCount + "\n" + "Non-Empty Strings in the list:" + stringCount);
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        nonEmptyStrings.forEach(System.out::println);
    }
}
