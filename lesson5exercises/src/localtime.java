import java.time.LocalDateTime;


public class localtime {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        String HH = hour < 10 ? ("0" + hour): String.valueOf(hour);
        String MM = minute < 10 ? ("0" + minute): String.valueOf(minute);
        System.out.println("Current time is " + HH + ":" + MM +".");
    }
}
