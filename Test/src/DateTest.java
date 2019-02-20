import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期(格式:MM.dd)");
        String next = scanner.next();

        int i = next.indexOf(".");
        String str1 = next.substring(0, i);
        String str2 = next.substring(str1.length()+1,next.length());
        Integer i1 = Integer.parseInt(str1);
        Integer i2 = Integer.parseInt(str2);
        int a = 0;
        int b = 0;
        switch (i1-1){
            case 0:
                a = 0;
                break;
            case 1:
                a = 31;
                break;
            case 2:
                a = 31+28;
                break;
            case 3:
                a = 31+28+31;
                break;
            case 4:
                a = 31+28+31+30;
                break;
            case 5:
                a = 31+28+31+30+31;
                break;
            case 6:
                a = 31+28+31+30+31+30;
                break;
            case 7:
                a = 31+28+31+30+31+30+31;
                break;
            case 8:
                a = 31+28+31+30+31+30+31+31;
                break;
            case 9:
                a = 31+28+31+30+31+30+31+31+30;
                break;
            case 10:
                a = 31+28+31+30+31+30+31+31+30+31;
                break;
            case 11:
                a = 31+28+31+30+31+30+31+31+30+31+30;
                break;
        }

        System.out.println("当前日期在本月已经过去了"+i2+"天");
        System.out.println("距离今年年底,还有"+(365 - (a+i2))+"天");


    }
}
