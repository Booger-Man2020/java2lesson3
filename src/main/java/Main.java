import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
       firstTask();

        PhoneBook phoneBook =new PhoneBook();
        phoneBook.add("Петров", String.valueOf(375291565));
        phoneBook.add("Петров", String.valueOf(545341355)) ;
        phoneBook.add("Иванов", String.valueOf(722752725));
        phoneBook.add("Сидоров", String.valueOf(452452455));
        phoneBook.add("Кузнецов", String.valueOf(452727277));
        phoneBook.add("Емельянов", String.valueOf(375291565));
        phoneBook.seach("Петров");
        phoneBook.seach("Иванов");
    }

    public static void firstTask(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Рыба");
        list.add("Мясо");
        list.add("Курица");
        list.add("Яйцо");
        list.add("Масло");
        list.add("Мясо");
        list.add("Мука");
        list.add("Вода");
        list.add("Рыба");
        list.add("Рыба");
        list.add("Курица");
        list.add("Баранина");
        list.add("Макароны");
        list.add("Салат");
        list.add("Яйцо");
        list.add("Макароны");
        ArrayList<String> list1;
        list1 = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        int count = Collections.frequency(list, "Рыба");
        System.out.println("Рыба " + count + " раз(а)");
        count = Collections.frequency(list, "Мясо");
        System.out.println("Мясо " + count + " раз(а)");
        count = Collections.frequency(list, "Курица");
        System.out.println("Курица " + count + " раз(а)");
    }

}





