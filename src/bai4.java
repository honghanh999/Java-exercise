import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
        Scanner Input=new Scanner(System.in);
        float a,b,c;
        System.out.println("nhập a");
        a= Input.nextFloat();
        System.out.println("nhập b");
        b= Input.nextFloat();
        System.out.println("nhập c");
        c= Input.nextFloat();
        if (a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a ) {
            System.out.println("day la 3 canh tam giac vuong");
        }
        else {
            System.out.println("khong phai roi");
        }
    }
}
