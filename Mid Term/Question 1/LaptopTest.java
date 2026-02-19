import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

//Unit tests for Laptop class
class LaptopTest {

    @Test
    void validLaptop_createsSuccessfully() {
        Laptop laptop = new Laptop(499.99, "ABC123", new int[]{1});
        assertEquals(499.99, laptop.getPrice(), 1e-9);
        assertEquals("ABC123", laptop.getModelNumber());
        assertArrayEquals(new int[]{1}, laptop.getWarrantyYears());
    }

    @ParameterizedTest
    @CsvSource({"0.0", "-50.0"})
    void invalidPrice_throwsException(double price) {
        assertThrows(IllegalArgumentException.class, () -> new Laptop(price, "ABC123"));
    }

    @ParameterizedTest
    @CsvSource({"abc123", "AB1234"})
    void invalidModel_throwsException(String model) {
        assertThrows(IllegalArgumentException.class, () -> new Laptop(499.99, model));
    }
}
