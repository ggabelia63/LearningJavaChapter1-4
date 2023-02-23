package Chapter2IntroducingInputOutPutAndFormatting;

import java.util.Scanner;

public class ScannerCh2 {
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("type Something");
        line = sc.nextLine();
        System.out.println("You said: "+line);

        System.out.println("Type Something else: ");
        line=sc.nextLine();
        System.out.println("you also said : "+line);
    }
}
