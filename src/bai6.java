import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
//Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
        Scanner Input= new Scanner(System.in);
        String MSSV;
        System.out.println("nhap mssv");
        MSSV = Input.nextLine();
        if (!MSSV.matches("B\\d{7}"))
            System.out.println("khong phu hop");
        else System.out.println("phu hop");
    }
}
