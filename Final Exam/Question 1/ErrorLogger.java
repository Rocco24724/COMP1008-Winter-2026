class ErrorLogger extends Logger {
    @Override
    void log(String message) {
        System.out.println("[ERROR} " + message);
    }
}