import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class PhoneBookTest {
    @Test
    public void addTest() {
        PhoneBook testBook = new PhoneBook();
        boolean result = testBook.add("Alexey", "001101110");
        Assertions.assertTrue(result);
    }

    @Test
    public void findByNumberTest() {
        PhoneBook testBook = new PhoneBook();
        testBook.add("Alexey", "000010010");
        Assertions.assertEquals("Alexey", testBook.findByNumber("000010010"));
    }

    @Test
    public void findByName() {
        PhoneBook testBook = new PhoneBook();
        testBook.add("Alexey", "001101110");
        Assertions.assertEquals("001101110", testBook.findByName("Alexey"));
    }

    @Test
    public void printAllNames() {
        PhoneBook testBook = new PhoneBook();
        testBook.add("Anastasia", "000011110");
        testBook.add("Alexey", "001101110");
        Assertions.assertEquals("Alexey Anastasia", testBook.printAllNames());
    }
}