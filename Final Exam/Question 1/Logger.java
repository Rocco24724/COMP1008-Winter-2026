class Logger {
    void log(String message) {
        System.out.println("[INFO] " + message);
    }
    void log(String message, int code) {
        System.out.println("[INFO-" + code + "] " + message);
    }
}