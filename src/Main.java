import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    private static Random random=new Random();
    private static Integer quantity=20;
    private static Set<Integer> numbers = new HashSet<>(quantity);


    public static void main(String[] args) {//____________________________________Д/З 2 часть 2____________________________________
//        Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
//        Пройдитесь по всем элементам множества и удалите из него все нечетные значения.
//        Выведите оставшиеся элементы в консоль.
        numbersFormation();
        System.out.println(numbers);
        processingNumbers();
        System.out.println(numbers);
    } //_____________________________________________конец_________________________

    public static void numbersFormation() {
        for (int i = 0; i < quantity; i++) {
            numbers.add(random.nextInt(1000));
        }
    }

    public static void processingNumbers() {
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext())
        {
            Integer n = it.next();
            if (n % 2 > 0) {
                it.remove();
            }

        }

    }



}