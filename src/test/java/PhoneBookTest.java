import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class PhoneBookTest {

    public PhoneBook testBook = new PhoneBook();
    @Test
    public void addTest() {
        boolean result = testBook.add("Alexey", "001101110");
        Assertions.assertTrue(result);
    }

    @Test
    public void findByNumberTest() {
        testBook.add("Alexey", "000010010");
        Assertions.assertEquals("Alexey", testBook.findByNumber("000010010"));
    }

    @Test
    public void findByName(String name) {
        testBook.add("Alexey", "001101110");
        Assertions.assertEquals("001101110", testBook.findByName("Alexey"));
    }
}