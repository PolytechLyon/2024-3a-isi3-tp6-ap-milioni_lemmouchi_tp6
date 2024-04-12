package fr.polytech.sim.log;

public class LogFactory {
    public static TimestampedLoggerDecorator createLogger(String name) {
        return new TimestampedLoggerDecorator(new ConsoleLogger(name));
    }
}
