import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class LibraryMember {
    //Variables for code
    private int memberId;
    private String name;
    private int[] borrowedBookIds;

    //Checks the name to make sure it is in the correct format using regex
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z ]+$");

    //Basic Constructor for class
    public LibraryMember(int memberId, String name, int[] borrowedBookIds) {
        validateMemberId(memberId);
        validateName(name);
        validateBorrowedBookIds(borrowedBookIds);
        this.memberId = memberId;
        this.name = name;
        this.borrowedBookIds = Arrays.copyOf(borrowedBookIds, borrowedBookIds.length);
    }

    // defaults constructor with no borrowed books
    public LibraryMember(int memberId, String name) {
        this(memberId, name, new int[]{});
    }

    // factory method for guest member
    public static LibraryMember guestMember() {
        return new LibraryMember(1000, "Guest", new int[]{});
    }

    // factory method for regular member
    public static LibraryMember regularMember() {
        return new LibraryMember(2000, "Regular Member", new int[]{101, 102});
    }

    // validation for member id
    private static void validateMemberId(int memberId) {
        if (memberId <= 0) {
            throw new IllegalArgumentException("Member ID must be positive");
        }
    }

    // validation for name
    private static void validateName(String name) {
        Objects.requireNonNull(name, "Name cannot be blank");
        if (!NAME_PATTERN.matcher(name).matches()) {
            throw new IllegalArgumentException("Name must match format using ^[A-Za-z ]+$");
        }
    }

    // validation for borrowed book ids
    private static void validateBorrowedBookIds(int[] ids) {
        Objects.requireNonNull(ids, "borrowedBookIds cannot be blank");
        for (int id : ids) {
            if (id < 0) throw new IllegalArgumentException("Book ids must not be negative");
        }
    }

    // getters for variables
    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int[] getBorrowedBookIds() {
        return Arrays.copyOf(borrowedBookIds, borrowedBookIds.length);
    }

    //StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryMember{");
        sb.append("memberId=").append(memberId).append(", ");
        sb.append("name='").append(name).append("', ");
        sb.append("borrowedBookIds=").append(Arrays.toString(borrowedBookIds));
        sb.append('}');
        return sb.toString();
    }
}
