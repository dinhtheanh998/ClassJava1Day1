package day1a;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng và năm: ");
        int month = sc.nextInt();
        int year = sc.nextInt();
        switch(month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                if(isNamNhuan(year)){
                        System.out.println("Có 29 ngày");
                }else {
                    System.out.println("Có 28 ngày");
                }
                break;
            default:
                System.out.println("Có 31 ngày");
                break;
        }
    }

    static boolean isNamNhuan(int nam){
        if(nam >=  1582){
//            }
            if(nam % 400 == 0 || (nam %4 ==0 && nam % 100 != 0)){
                return true;
            }
            return false;
        }
        return false;
    }
}
