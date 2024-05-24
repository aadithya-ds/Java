import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MillisecondDifference {
    public static void main(String[] args) {
        // Parse the timestamps
        LocalDateTime timestamp1 = LocalDateTime.parse("2024-03-05T01:27:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        LocalDateTime timestamp2 = LocalDateTime.parse("2024-03-05T01:31:13.019", DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        // Calculate the difference
        Duration duration = Duration.between(timestamp1, timestamp2);

        // Convert the difference to milliseconds
        long millisecondsDifference = duration.toMillis();

        System.out.println("Milliseconds difference: " + millisecondsDifference);
    }
}
