import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> phoneBook = new TreeMap<>();

    public boolean add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Пользователь уже зарегестрирован.");
            return false;
        }
        if (!phoneBook.containsValue(name) && phoneBook.containsValue(number)) {
            System.out.println("Данный номер уже зарегистрирован у другого пользователя.");
            return false;
        }
        if (name.equals("name")) {
            System.out.println("Неправильное имя пользователя.");
            return false;
        } else {
            phoneBook.put(name, number);
            return true;
        }
    }

    public String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (phoneBook.get(entry.getKey()).equals(number)) {
                    System.out.println("Имя пользователя по этому номеру: " + entry.getKey() + ".");
                    return entry.getKey();
                }
            }
        }
        return "Пользователя с таким номером не существует.";
    }

    public String findByName(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Номер пользователя, зарегистрированный под этим именем: " + phoneBook.get(name) + ".");
            return phoneBook.get(name);
        }
        return "Номера зарегестрированного под таким именем пользователем не существует.";
    }

    public String printAllNames() {
        StringBuilder print = new StringBuilder();
        if (phoneBook.isEmpty()) {
            return "Книга пуста.";
        }
        for (Map.Entry<String, String> records : phoneBook.entrySet()) {
            print.append(records.getKey()).append(" ");
        }
        return print.toString();
    }
}