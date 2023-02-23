package Chapter3;

public class MathEx {
    public static void main(String[] args) {
        double root = Math.sqrt(17.0);
        double angle = 1.5 ;
        double height = Math.sin(angle);
        System.out.printf("root of 17 is %f and sin of angle 1.5 is %f",root,height);
        System.out.println();
        toRadiansAndFromIt(3);
        int d = Math.max(5,12);
        System.out.println(d);
        System.out.println(Math.abs(-12));
        System.out.println(Math.IEEEremainder(15,31.5));
        double x = Math.exp(Math.log(11));
        System.out.println(x);
        CircleArea.main(15);

    }

    public static void pi(double s) {
        double degrees = 90;
        double angle = degrees / 180.0 * Math.PI;
    }
    public static void toRadiansAndFromIt(double d){
        double radians = Math.toRadians(180.0);
        double degrees = Math.toDegrees(Math.PI);
        d = radians+degrees;
        double x = Math.round(d);
        System.out.println(x);
    }


}
