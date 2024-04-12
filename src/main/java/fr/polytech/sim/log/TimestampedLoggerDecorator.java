package fr.polytech.sim.log;

import java.util.Date;

public class TimestampedLoggerDecorator implements Logger {
    private Logger logger;

    public TimestampedLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String format, Object... args) {
        format = addTimestamp() + format;
        logger.log(format, args);
    }

    private String addTimestamp() {
        long currentTimeInMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeInMillis);
        return " " + currentDate.toString() + " ";
    }
}
