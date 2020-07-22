import java.time.Duration;
import java.time.Instant;

public class Time {
    public static double timeStarted = System.nanoTime();
    public static Instant instantStarted = Instant.now();

    public static double getTime() { return Duration.between(instantStarted, Instant.now()).toNanos() * 10E-9; }
}
