package day1a;

import java.util.Scanner;

public class sochinhphuong {
    public static void main(String[] args) {
        int a;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhap so ");
        a =  sc.nextInt();
        int canA = (int)Math.sqrt(a);
        if(a > 0){
            if(canA * canA == a){
                System.out.println("Là số chính phương");
                System.exit(0);
            }
            System.out.println("Không là số chính phương");
            System.exit(0);
        }
        System.out.println("Mày đùa tao đấy à");

    }
}
