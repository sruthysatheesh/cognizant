class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("logger initialized");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        if (log1 == log2) {
            System.out.println(log1);
            System.out.println(log1.hashCode());
            System.out.println(log2);
            System.out.println(log2.hashCode());
            System.out.println("Both are the same instance");
        }
    }
}
