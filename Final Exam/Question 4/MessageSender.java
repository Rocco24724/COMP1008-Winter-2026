class MessageSender {
    void send(String text) {
        System.out.println("Sending: " + text);
    }

    void send(String text, int priority) {
        System.out.println("Sending with priority " + priority + ": " + text);
    }
}