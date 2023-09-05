import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    public static PhoneBook testBook = new PhoneBook();

    @Test
    public void addTest() {
        String defaultName = "Alexey";
        String defaultNumber = "00000000";
        boolean result = testBook.add(defaultName, defaultNumber);
        Assertions.assertTrue(result);
    }

    @Test
    public void findByNumberTest() {
        testBook.add("Alexey", "00001001");
        Assertions.assertEquals("Alexey", testBook.findByNumber("00001001"));
    }
}