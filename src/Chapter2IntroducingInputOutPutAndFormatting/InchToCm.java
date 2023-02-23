package Chapter2IntroducingInputOutPutAndFormatting;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        int inch ;
        double cm;
        final double CM_PER_INCH =2.54;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many inches? : ");
        inch = sc.nextInt();
        cm = inch*CM_PER_INCH;
        System.out.printf("%d in = %.1f cm\n"+inch,inch,cm);
        System.out.printf("%x into 16", inch);


    }


}
