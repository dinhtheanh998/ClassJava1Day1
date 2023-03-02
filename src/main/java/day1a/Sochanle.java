package day1a;

import java.util.Scanner;

public class Sochanle {
    public static void main(String[] args) {
        int a;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap so");
        a = sc.nextInt();
        if(a%2 == 0){
            System.out.print("Số chẵn");
        }
        if(a%2 != 0){
            System.out.print("Số lẻ");
        }
    }

}
