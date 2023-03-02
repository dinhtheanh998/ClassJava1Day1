package day1a;

import java.util.Scanner;

public class Kiemtra2socungdau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so ");
        int a =  sc.nextInt();
        int b = sc.nextInt();
        if((a > 0 && b >0) || (a < 0 && b <0) || (a==0 && b==0)) {
            System.out.print("Cung dau");
        }else {
            System.out.print("Khac dau");
        }
    }
}
