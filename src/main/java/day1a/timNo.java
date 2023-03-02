package day1a;

import java.util.Scanner;

public class timNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a,b");
        a= sc.nextInt();
        b= sc.nextInt();
        if(a == 0 || b == 0){
            if(b==0 && a != 0){
                System.out.println("x= " + 0);
            }
            if(a == 0 && b == 0){
                System.out.println("Vo so nghiem");
            }
            if(a == 0 && b!= 0){
                System.out.println("vo nghiem");
            }
            System.exit(0);
        }
        System.out.println((double)-b/a);
    }
}
