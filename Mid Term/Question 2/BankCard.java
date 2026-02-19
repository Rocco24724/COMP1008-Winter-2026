import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class BankCard {
    //Variables for code
    private long cardNumber;
    private String holderName;
    private int[] transactionYears;

    //Checks the holderName to make sure it is in the correct format using regex
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z ]+$");

    //Basic Constructor for class
    public BankCard(long cardNumber, String holderName, int[] transactionYears) {
        validateCardNumber(cardNumber);
        validateHolderName(holderName);
        validateTransactionYears(transactionYears);
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.transactionYears = Arrays.copyOf(transactionYears, transactionYears.length);
    }

    // defaults constructor with 1 transaction year
    public BankCard(long cardNumber, String holderName) {
        this(cardNumber, holderName, new int[]{2024});
    }

    // factory method for debit card
    public static BankCard debitCard() {
        return new BankCard(1234567890123456L, "Default Person", new int[]{2024});
    }

    // factory method for credit card
    public static BankCard creditCard() {
        return new BankCard(9876543210987654L, "Default Person", new int[]{2024, 2025});
    }

    // validation for card number
    private static void validateCardNumber(long cardNumber) {
        String num = Long.toString(cardNumber);
        if (num.length() != 16) {
            throw new IllegalArgumentException("Card number must be exactly 16 digits");
        }
    }

    // validation for holder name
    private static void validateHolderName(String holderName) {
        Objects.requireNonNull(holderName, "You must input your name");
        if (!NAME_PATTERN.matcher(holderName).matches()) {
            throw new IllegalArgumentException("Your name must be valid matching this ^[A-Za-z ]+$");
        }
    }

    // validation for transaction years
    private static void validateTransactionYears(int[] years) {
        Objects.requireNonNull(years, "Can't be blank");
        if (years.length == 0) throw new IllegalArgumentException("Must have at least one entry");
        for (int y : years) {
            if (y < 0) throw new IllegalArgumentException("Transaction years must not be negative");
        }
    }

    // getters for variables
    public long getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public int[] getTransactionYears() {
        return Arrays.copyOf(transactionYears, transactionYears.length);
    }

    //StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankCard{");
        sb.append("cardNumber=").append(cardNumber).append(", ");
        sb.append("holderName='").append(holderName).append("', ");
        sb.append("transactionYears=").append(Arrays.toString(transactionYears));
        sb.append('}');
        return sb.toString();
    }
}