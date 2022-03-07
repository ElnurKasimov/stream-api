import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FirstAndSecondTasks {

    static String oddNames (ArrayList<String> names){
        AtomicInteger order = new AtomicInteger();
        order.getAndIncrement();
        return names.stream()
                .map(name -> order.getAndIncrement() + ". " + name )
                .filter(name -> order.get()%2 == 0)
                .collect(Collectors.joining(", "));
    }

    static ArrayList<String> sortedNamesInUpperCase (ArrayList<String> names){
       return (ArrayList<String>) names.
               stream()
               .map(name -> name.toUpperCase() )
               .sorted((n1, n2) -> n2.compareTo(n1))
               .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Иван");
        names.add("Никита");
        names.add("Ольга");
        names.add("Петр");
        names.add("Анна");
        names.add("Сергей");
        names.add("Николай");
        names.add("Татьяна");
        names.add("Елена");
        names.add("Алексей");
        names.add("Елизавета");
        names.add("Григорий");

// проверка Задание №1
        System.out.println(oddNames(names));
// проверка Задание №2
        System.out.println(sortedNamesInUpperCase(names));



    }
}
