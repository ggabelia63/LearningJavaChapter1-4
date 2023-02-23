package Chapter2IntroducingInputOutPutAndFormatting;

import java.util.Random;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm Thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is ?");

        int myNumb = sc.nextInt();
        System.out.println("the number i was thinking is "+myNumb);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("your guess is "+number);
        int maybe= myNumb-number;
        if(maybe<0){
            maybe = maybe*(-1);
        }
        System.out.println("you were off by: "+maybe);

    }
}
