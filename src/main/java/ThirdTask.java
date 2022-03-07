import java.util.Arrays;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        String[]  inputData  = {"1, 2, 0", "4, 5"};
      String result = Arrays.stream(inputData)
              .flatMap(str -> Arrays.stream(str.split(",")))
              .map(String::strip)
              .sorted(String::compareTo)
              .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
