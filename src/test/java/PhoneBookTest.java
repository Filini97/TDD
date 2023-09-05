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
}