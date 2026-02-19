import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class LibraryMemberTest {

    @Test
    void validMember_createsSuccessfully() {
        LibraryMember member = new LibraryMember(1, "Rocco Minetola", new int[]{101});
        assertEquals(1, member.getMemberId());
        assertEquals("Rocco Minetola", member.getName());
        assertArrayEquals(new int[]{101}, member.getBorrowedBookIds());
    }

    @ParameterizedTest
    @CsvSource({"0", "-5"})
    void invalidMemberId_throwsException(int memberId) {
        assertThrows(IllegalArgumentException.class, () -> new LibraryMember(memberId, "John Doe"));
    }

    @ParameterizedTest
    @CsvSource({"John123", "Jane@Doe"})
    void invalidName_throwsException(String name) {
        assertThrows(IllegalArgumentException.class, () -> new LibraryMember(1, name));
    }
}
