public class Main {
    public static void main(String[] args) {
        MessageSender sender = new UrgentMessageSender();

        sender.send("System down");

        System.out.println("");

        sender.send("System down", 10);
    }
}
