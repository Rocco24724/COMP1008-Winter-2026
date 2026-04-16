class UrgentMessageSender extends MessageSender {
    @Override
    void send(String text) {
        System.out.println("URGENT: " + text);
    }
}