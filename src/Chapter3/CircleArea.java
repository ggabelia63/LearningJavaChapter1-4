package Chapter3;

import java.util.Scanner;

public class CircleArea extends MathEx {
    public static double main(double radius) {
        double res = Math.PI * Math.pow(radius,2);
        System.out.println(Math.round(res));
        return radius;
    }
}
