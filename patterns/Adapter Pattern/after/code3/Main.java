public class Main {
    public static void main(String[] args) {
        // Creating an instance of LegacyLogger
        LegacyLogger legacyLogger = new LegacyLogger();

        // Creating an instance of LegacyLoggerAdapter, adapting LegacyLogger to the modern logging framework
        Logger loggerAdapter = new LegacyLoggerAdapter(legacyLogger);

        // Using the adapted object in the modern logging framework
        loggerAdapter.logMessage("This message will be logged using the modern logging framework");
    }
}
