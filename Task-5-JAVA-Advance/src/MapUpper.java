import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aBc", "d", "ef");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}
