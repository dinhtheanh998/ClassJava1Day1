package day1a;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Hello world");
//
//        System.out.print("Welcome to");
//        System.out.print("Java");
//
//        String name = "BKACAD";
//        System.out.printf("Xin chào các bạn đến với khóa học tại %s",name);
//        System.out.printf("\nXin chào các bạn đến với khóa học tại" + name);

//        /*
//        * Tạo 2 bién lưu thông tin tên và năm sinh -> In ra tên và tuổi trên 1 dòng
//        * */
//        Scanner sc =  new Scanner(System.in);
//
//        String FullName = "";
//        int birthDay = 0;
//
//        System.out.println("Nhập tên của bạn");
//        FullName = sc.nextLine();
//        System.out.println("Vui lòn nhập năm sinh của bạn");
//        birthDay = Integer.parseInt(sc.nextLine());
//        System.out.print("\nHọ tên: " + FullName + "\nNăm nay\t" + (2023 - birthDay) + "tuổi");
        /*
        * Nhập 2 số nguyên và in ra tổng của chúng từ bàn phím
        * */
//        int a;
//        int b;
//        Scanner input = new Scanner(System.in);
//        System.out.print("a =");
//        a = input.nextInt();
//        System.out.print("b = ");
//        b= input.nextInt();
//
//        // Đóng phần nhập dữ liệu từ bàn phím
//        input.close();
//        // tính tổng
//        int t = a+ b;
//        System.out.printf("%d + %d = %d", a,b,t);

//        long a,b;
//        System.out.print("a = ");
//        a = input.nextLong();
//        System.out.print("b = ");
//        b= input.nextLong();
//        input.close();
//        double t = (a+b)/2;
//        System.out.printf("Trung binh cong la: %.2f", t);

//        float a,b,c;
//        System.out.print("a = ");
//        a = input.nextFloat();
//        System.out.print("b= ");
//        b= input.nextFloat();
//        System.out.print("c= ");
//        c = input.nextFloat();
//        double tich =  a * b * c;
//        float tbc = (a + b +c ) / 3;
//        double tbn = Math.pow(tich, (1.0/3));
//        System.out.printf("Trung binh cong la %.3f \ntrung binh nhan la %.3f", tbc,tbn)
//        3. Nhập vào số nguyên a và b từ bàn phím in ra thương và số dư
//        int a,b;
//        System.out.print("a = ");
//        a = input.nextInt();
//        System.out.print("b= ");
//        b= input.nextInt();
//        int sodu =  Math.abs(a % b);
//        System.out.println(sodu);
//        4.
//        int  x,y,z,t;
//        System.out.print("x = ");
//        x= input.nextInt();
//        System.out.print("y = ");
//        y = input.nextInt();
//        System.out.print("z = ");
//        z= input.nextInt();
//        System.out.print("t = ");
//        t=input.nextInt();
//
//        boolean A = (2 * x > 5) && (3*y < 10) || (5*z +6 > t);
//        System.out.println(A);

        /*
        * Nhập số kiểm tra  xem âm hay dương
        * */
        int a;
        System.out.print( "x= ");
        a =  input.nextInt();
        if(a > 0) {
            System.out.println("là số dương");
        }
        if(a < 0) {
            System.out.println("Là số âm");
        }
        if(a == 0){
            System.out.println("Không âm k dương");
        }
    }
}
