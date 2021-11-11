import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
//        Viết chương trình cho phép giải phương trình bậc nhất, a và b nhập từ bàn phím
        int a; int b; int i;
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập họ và tên dô");
//        String name = sc.nextLine();
        System.out.println("nhâp a dô nè:");
        a = sc.nextInt();
//        cách 1:
//        scanner.nextline();
//        cách 2:
//        Number là một chuỗi số ví dụ "12"

//        String number = sc.nextLine();
//        a= Interger.parseInt(number)
//        System.out.println("nhập địa chỉ dô nà");
//        String add = sc.nextLine();
        System.out.println("nhập b dô nè:");
        b = sc.nextInt();
        giaiPhuongTrinhBacNhat(a,b);
    }
    public static void giaiPhuongTrinhBacNhat(int a, int b) {
        if (a==0) {
            if (b==0) {
                System.out.println("phương trình vô số nghiệm đóaaa");
            }
            else System.out.println("phương trình vô nghiệm dòiiiii");
        }
//        Đang ép kiểu tường minh, rút gọn còn 2 số thập phân
        else System.out.printf("phương trình %dx +  %d = 0 có nghiệm là: %.2f", a, b, (double)-b/a);
    }

}
//        Phép toán giữa 2 số khác kiểu dữ liệu thì kết quả sẽ ra số kiểu dl lớn hơn

