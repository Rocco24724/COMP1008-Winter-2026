import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

//Unit tests for BankCard class
class BankCardTest {

    @Test
    void validCard_createsSuccessfully() {
        BankCard card = new BankCard(1234567890123456L, "John Doe", new int[]{2024});
        assertEquals(1234567890123456L, card.getCardNumber());
        assertEquals("John Doe", card.getHolderName());
        assertArrayEquals(new int[]{2024}, card.getTransactionYears());
    }

    @ParameterizedTest
    @CsvSource({"123456789", "12345678901234567"})
    void invalidCardNumber_throwsException(long cardNumber) {
        assertThrows(IllegalArgumentException.class, () -> new BankCard(cardNumber, "John Doe"));
    }

    @ParameterizedTest
    @CsvSource({"John123", "Jane@Doe"})
    void invalidHolderName_throwsException(String name) {
        assertThrows(IllegalArgumentException.class, () -> new BankCard(1234567890123456L, name));
    }
}
