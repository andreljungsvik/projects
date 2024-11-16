
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise7 {
    public static void main(String[] args) {
        while (true) {
            LocalTime now = LocalTime.now();
            int minute = now.getMinute();

            if (minute % 5 == 0) {
                System.out.println("The time is now: " + now.format(DateTimeFormatter.ofPattern("HH:mm")));
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
