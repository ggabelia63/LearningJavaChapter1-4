package Chapter3;

public class PrintTwice {
    public static void printTwice(String s,int d){


        for (int i = 0; i < 2; i++) {
            System.out.println(s + d);
        }
    }

    public static void main(String[] args) {
        printTwice("sad",12);
    }
}
