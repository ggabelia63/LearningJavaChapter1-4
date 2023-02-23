package Chapter4;

public class Ex41 {
    public static void main(String[] args) {
        printAmerican("Friday",12,"July",2013);
        printEuropean("Friday",12,"July",2013);
    }

    public static void printAmerican(String day,int date,String month,int year){
        System.out.println("American Format: "+ day +", "+month+" "+date+", "+year);
    }
    public static void printEuropean(String day,int date,String month,int year){
        System.out.println("European Format: "+ day +" "+date+" "+month+" "+year);
    }
}
