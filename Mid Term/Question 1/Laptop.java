import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class Laptop {
    //Variables for code
	private double price;
	private String modelNumber;
	private int[] warrantyYears;

    //Checks the modelNumber to make sure it is in the correct format using regex
	private static final Pattern MODEL_PATTERN = Pattern.compile("^[A-Z]{3}\\d{3}$");

    //Basic Contructor for class
	public Laptop(double price, String modelNumber, int[] warrantyYears) {
		validatePrice(price);
		validateModel(modelNumber);
		validateWarranty(warrantyYears);
		this.price = price;
		this.modelNumber = modelNumber;
		this.warrantyYears = Arrays.copyOf(warrantyYears, warrantyYears.length);
	}

    // defaults constructor with 1 year warranty
	public Laptop(double price, String modelNumber) {
		this(price, modelNumber, new int[]{1});
	}

    // factory method for standard laptop
	public static Laptop standard() {
		return new Laptop(799.99, "STD001", new int[]{1});
	}

    // factory method for premium laptop
	public static Laptop premium() {
		return new Laptop(1999.99, "PRE999", new int[]{2, 3});
	}

    // validation methods
	private static void validatePrice(double price) {
		if (price <= 0) throw new IllegalArgumentException("price must be positive");
	}

    // validation for model number
	private static void validateModel(String model) {
		Objects.requireNonNull(model, "modelNumber cannot be null");
		if (!MODEL_PATTERN.matcher(model).matches()) {
			throw new IllegalArgumentException("modelNumber must match ^[A-Z]{3}\\d{3}$");
		}
	}

    // validation for warranty years
	private static void validateWarranty(int[] years) {
		Objects.requireNonNull(years, "warrantyYears cannot be null");
		if (years.length == 0) throw new IllegalArgumentException("warrantyYears must have at least one entry");
		for (int y : years) {
			if (y < 0) throw new IllegalArgumentException("warranty years must be non-negative");
		}
	}

    // getters for variables
	public double getPrice() {
		return price;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public int[] getWarrantyYears() {
		return Arrays.copyOf(warrantyYears, warrantyYears.length);
	}

    // StringBuilder
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Laptop{");
		sb.append("price=").append(price).append(", ");
		sb.append("modelNumber='").append(modelNumber).append("', ");
		sb.append("warrantyYears=").append(Arrays.toString(warrantyYears));
		sb.append('}');
		return sb.toString();
	}
}

