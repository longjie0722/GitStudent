import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入放假日期:");
        String next = scanner.next();

        int a = next.indexOf(".");
        String str1 = next.substring(0, a);
        String str2 = next.substring(str1.length()+1,next.length());
        Integer a1 = Integer.parseInt(str1);
        Integer a2 = Integer.parseInt(str2);

        int [] arr = {1,3,6,10,15,21,28,36,45,55,a2};

        if(a1 == 7){
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            
        }

    }
}
