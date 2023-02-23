package Chapter2IntroducingInputOutPutAndFormatting;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        int hour = 23;
        int minute = 59;
        int second = 0;
        int midNight = 24;
        System.out.println(midNight*60*60-((hour*60*60)+(minute*60)+second));
        System.out.println(midNight*60*60);

    }
}
