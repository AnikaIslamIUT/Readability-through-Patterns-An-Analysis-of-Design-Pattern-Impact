public class LegacyLoggerAdapter implements Logger {
    private LegacyLogger legacyLogger;

    public LegacyLoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void logMessage(String message) {
        // Adapt the interface and call the legacy log method
        legacyLogger.log(message);
    }
}
