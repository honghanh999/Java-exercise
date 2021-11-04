import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
// Giải phương trình bậc 2
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a=");
        a = sc.nextInt();
        System.out.println("nhập b=");
        b = sc.nextInt();
        System.out.println("nhập c=");
        c = sc.nextInt();
        int delta = b * b - 4 * a * c;
        if (a == 0) {
//            phương trình bậc nhất ở đây ạ
            bai14.giaiPhuongTrinhBacNhat(b, c);
        } else {
            if (delta == 0) {
                System.out.println("phương trình có một nghiệm là: " + (-b) / (2 * a));
            } else {
                if (delta < 0) {
                    System.out.println("phương trình vô nghiệm ròiiii");
                } else
                    System.out.println("phương trình có 2 nghiệm là: " + (((-b) - Math.sqrt(delta)) / 2 * a) + " và " + (((-b) + Math.sqrt(delta)) / 2 * a));
            }
        }
    }
}
