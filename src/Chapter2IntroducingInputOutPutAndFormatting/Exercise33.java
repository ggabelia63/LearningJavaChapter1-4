package Chapter2IntroducingInputOutPutAndFormatting;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {

        double hours,minutes,seconds;
        double secondsPerMinute = 60.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds and i will tell you hours minutes and seconds");
        double entSec = sc.nextDouble();
        hours = (entSec/(secondsPerMinute*secondsPerMinute));
        minutes = ((entSec/secondsPerMinute)%secondsPerMinute);
        seconds = (entSec%60);
        System.out.printf("%.0f hours, %.0f minutes and %.0f seconds",hours,minutes,seconds);

    }
}
