import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook;


    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }


    public ArrayList<String> get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            return this.phoneBook.get(lastName);
        }
        return new ArrayList<String>();
    }


    public void add(String lastName, String phone) {
        ArrayList<String> phones = new ArrayList<>();
        phones = this.get(lastName);
        phones.add(phone);
        this.phoneBook.put(lastName, phones);


    }

    public Object seach(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            System.out.println(lastName + phoneBook.get(lastName));
        } else System.out.println(" Абонент не найден");
        return null;
    }
}


