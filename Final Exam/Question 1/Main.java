public class Main {
    public static void main(String[] args) {
        Logger logger;
        logger = new ErrorLogger();

        logger.log("File not found");
        logger.log("File not found, 404");
    }
}
