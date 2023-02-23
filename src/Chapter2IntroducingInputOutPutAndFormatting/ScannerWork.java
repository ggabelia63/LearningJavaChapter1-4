package Chapter2IntroducingInputOutPutAndFormatting;

import java.util.Scanner;

public class ScannerWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);
*/

        //Try With First Int Second String
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        System.out.print("What is your name? ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

    }
}
