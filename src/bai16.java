import java.util.Scanner;

public class bai16 {
    static int Bac_1 = 1678;
    static int Bac_2 = 1734;
    static int Bac_3 = 2014;
    static int Bac_4 = 2536;
    static int Bac_5 = 2834;
    static int Bac_6 = 2927;

    public static void main(String[] args) {
//        -- Ý 1:
//        Viết phương trình nhập vào số điện sử dụng của tháng
//     và tính tiền điện theo phương pháp lũy tiến
//        - Nếu số điện sử dụng từ 0 -> 50 thì giá mỗi số điện là 1000
//        - Nếu sô điện sử dụng trên 50 thì giá mỗi số điện vượt hạn  mức là 1200
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số điện nà: ");
//        a = sc.nextInt();
//        if (a <= 50) {
//            System.out.println("tiền điện tháng này là: " + (a*1000));
//    }
//        else System.out.println("tiền điện tháng này là: " + ((50*1000) + ((a-50)*1200)));
//        --Ý 2:
//        0-50 là 1.678
//        51-100 là 1.734
//        101-200 là 2014
//        201-300 là 2.536
//        301-400 là 2.834
//        >401 là 2.927
        int electric = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số điện nà: ");
        electric = sc.nextInt();
        int money = tinhTienDien(electric);
        System.out.println(money);
    }

    static int tinhTienDien(int electric) {
        int money;
        if (electric <= 50) {
            money = electric * Bac_1;
        }
        else if (electric <= 100) {
            money = tinhTienDien(50) + (electric-50)*Bac_2;
        }
        else if (electric <=200) {
            money = tinhTienDien(100) + (electric - 100)*Bac_3;
        }
        else if (electric <=300) {
            money = tinhTienDien(200) + (electric - 200)*Bac_4;
        }
        else if (electric <=400) {
            money = tinhTienDien(300) + (electric - 300)*Bac_5;
        }
        else
            money = tinhTienDien(400) + (electric - 400)*Bac_6;

        return money;

    }
}
