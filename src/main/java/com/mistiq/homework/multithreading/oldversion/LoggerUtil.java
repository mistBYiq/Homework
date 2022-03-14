package main.java.com.mistiq.homework.multithreading.oldversion;

import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    public static Logger getFormattedLogger(String name) {
        return getFormattedLogger(name, Level.FINER);
    }

    public static Logger getFormattedLogger(String name, Level level) {
        Logger logger = Logger.getLogger(name);
        logger.setLevel(level);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter() {
            private static final String FORMAT = "[%1$tF %1$tT] [%2$s] %3$s";

            @Override
            public synchronized String format(LogRecord lr) {
                StringBuilder logMessage = new StringBuilder();
                logMessage.append(Thread.currentThread().getName()).append(": ");
                logMessage.append(lr.getMessage());
                Throwable throwable = lr.getThrown();
                if (throwable != null) {
                    logMessage.append("\n");
                    logMessage.append("Class: ").append(lr.getSourceClassName());
                    logMessage.append(", method: ").append(lr.getSourceMethodName());
                    logMessage.append(", ").append(throwable.getClass());
                    logMessage.append(", msg: ").append(throwable.getMessage());
                    logMessage.append("\n");
                    StackTraceElement[] trace = throwable.getStackTrace();
                    for (StackTraceElement traceElement : trace) {
                        logMessage.append("\tat ");
                        logMessage.append(traceElement);
                        logMessage.append("\n");
                    }
                } else {
                    logMessage.append("\n");
                }
                return String.format(FORMAT,
                        new Date(lr.getMillis()),
                        lr.getLevel().getLocalizedName(),
                        logMessage
                );
            }
        });
        handler.setLevel(level);

        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        return logger;
    }
}
