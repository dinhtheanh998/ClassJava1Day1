package day1a;

import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm");
        nam = sc.nextInt();

        if(nam < 1582){
            System.out.print("Không hợp lệ");
            System.exit(0);
        }
        if(nam >=  1582){
//            }
            if(nam % 400 == 0 || (nam %4 ==0 && nam % 100 != 0)){
                System.out.println("năm nhuận");
            }
            System.out.println("Không nhuận");

        }
    }
}
