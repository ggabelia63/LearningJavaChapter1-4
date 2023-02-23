package Chapter3;

public class Distance {
    public static void main(String[] args) {
        double x = 12;
        System.out.println(distanceFormula(1,2,3,4));

    }

    public static double distanceFormula(double x1,double x2, double y1,double y2 ) {

        double xDistance = Math.pow(x2-x1,2);
        double yDistance = Math.pow(y2-y1,2);
        double distance = Math.sqrt(xDistance+yDistance);

        return distance;
    }
}
