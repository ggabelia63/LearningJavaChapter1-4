package Chapter2IntroducingInputOutPutAndFormatting;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {

        double celsTofahr ;
        System.out.println("Enter Celsius");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        celsTofahr = (c*9/5)+32;
        System.out.printf("%.2f is fahrenheit",celsTofahr);

    }
}
