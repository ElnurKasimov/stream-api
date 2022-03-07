import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FourthTask {

    static Stream <Long> infiniteStream(long a, int c, long m, long seed) {
        Stream<Long> iterate = Stream.iterate(seed, it -> ( (a*it + c)%m ) ) ;
        return iterate;
    }

    public static void main(String[] args) {
      long a =  25214903917L;
      int c = 11;
      long m = 140737488355328L; // это 2 в степени 48, потому как я не знаю что имелось
                                                              // в виду  в условии задачи: такая запись или (long) 2.0e48;
        infiniteStream(a, c, m, 1).limit(30).forEach(System.out :: println);
    }
}
