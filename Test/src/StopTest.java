import java.util.Scanner;

public class StopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入放假日期:");
        String next = scanner.next();

        int a = next.indexOf(".");
        String str1 = next.substring(0, a);
        String str2 = next.substring(str1.length()+1,next.length());
        Integer a1 = Integer.parseInt(str1);
        Integer a2 = Integer.parseInt(str2);

        int [] arr = new int[11];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 15;
        arr[5] = 21;
        arr[6] = 28;
        arr[7] = 36;
        arr[8] = 45;
        arr[9] = 55;
        arr[10] = a2;

        System.out.println(arr.length);
        // 1 3 6 10 15 21 28  36 45  55  66
        if(a1 == 7){
            for(int i = 0;i<arr.length-1;i++){
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            for(int i = 0;i<arr.length;i++){
                //System.out.println(arr[i]);
                arr[i] = a2;
                System.out.println(arr.length - i);
            }

        }


    }

}
