import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
        Scanner Input= new Scanner(System.in);
        float a, b, c;
        System.out.println("nhap a");
        a= Input.nextFloat();
        System.out.println("nhap b");
        b= Input.nextFloat();
        System.out.println("nhap c");
        c= Input.nextFloat();
        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("đây là 3 cạnh của tam giác");
        }
        else {
            System.out.println("đây không là 3 cạnh tam giác");
        }

    }
}
