import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class FifthTask {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T > iteratorA = first.iterator();
        Iterator<T > iteratorB = second.iterator();
        ArrayList<T> list = new ArrayList<>();
        while( iteratorA.hasNext() && iteratorB.hasNext()) {
            list.add(iteratorA.next());
            list.add(iteratorB.next());
        }
        return list.stream();
    }


    public static void main(String[] args) {

        Stream<String > streamA = Stream.of("a", "b", "c", "d", "e", "f", "g");
        Stream<String > streamB = Stream.of("1", "2", "3", "4");

        zip(streamA, streamB).forEach(System.out :: println);

    }
}
