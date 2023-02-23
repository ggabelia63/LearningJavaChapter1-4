package Chapter2IntroducingInputOutPutAndFormatting;

public class Main {
    public static void main(String[] args) {

       int a = 5 ;
       int b = a;
       a = 3;
       int c = 0;

//        System.out.println(a);
//        System.out.println(b);

        double min = 59.0;
        double hour = 60.0;
        System.out.println(min/hour);

        double y = 1.0/3.0;
        System.out.println(y);

        System.out.println(1+2+3+4+"firstCom"+1+2+3+4);


        String day = "Thursday";
        int date = 18;
        String month = "July";
        int year = 2019;
        System.out.println("American Format: "+ day +", "+month+" "+date+", "+year);
        System.out.println("European Format: "+ day +" "+date+" "+month+" "+year);





    }
}