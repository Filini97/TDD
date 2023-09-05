import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    static Map<String, String> phoneBook = new TreeMap<>();

    public static boolean add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Пользователь уже зарегестрирован.");
            return false;
        }
        if (!phoneBook.containsValue(name) && phoneBook.containsValue(number)) {
            System.out.println("Данный номер уже зарегистрирован у другого пользователя.");
            return false;
        }
        if (name.equals("name")) {
            System.out.println("Неправильное имя пользователя");
            return false;
        } else {
            phoneBook.put(name, number);
            return true;
        }
    }

    public static String findByNumber(String number) {
        return "name";
    }
}