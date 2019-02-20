import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一次输入:");
        String str = scanner.next();
        System.out.println("第二次输入:");
        String next = scanner.next();
        int count = 0;
        int j = 0;
        if(str.length() > next.length() ){
            int i = (str.length() - next.length())+1;
            int len = next.length();
            for (;i>0;i--){
                String substring = str.substring(count,len);
                if(substring.length() != next.length()){
                    break;
                }
                if(next.equals(substring)){
                    j = 1;
                    System.out.println("有重复元素:"+next);
                }
                count++;
                len++;
            }
            if(j == 0){
                System.out.println("没有重复元素");
            }
        }else if(str.length() < next.length()){
            int i = (next.length() - str.length())+1;
            int len = str.length();
            for (;i>0;i--){
                String substring = next.substring(count,len);
                if(substring.length() != str.length()){
                    break;
                }
                if(str.equals(substring)){
                    j = 1;
                    System.out.println("有重复元素:"+str);
                }
                count++;
                len++;
            }
            if(j == 0){
                System.out.println("没有重复元素");
            }
        }else {
            if(str.equals(next)){
                System.out.println("有重复元素:"+str);
            }else{
                System.out.println("没有重复元素");
            }

        }

    }

}
