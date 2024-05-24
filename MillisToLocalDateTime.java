import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MillisToLocalDateTime {
    public static void main(String[] args) {
        long millis = 1709582279000L; // The timestamp in milliseconds

        // Convert milliseconds to Instant
        Instant instant = Instant.ofEpochMilli(millis);

        // Convert Instant to LocalDateTime in the system default time zone
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println("LocalDateTime: " + localDateTime);
    }
}
