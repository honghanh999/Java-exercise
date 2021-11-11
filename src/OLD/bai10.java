import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
//        Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
//Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
//Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
        Scanner Input = new Scanner(System.in);
        String MSSV;
        System.out.println("nhap 5 mssv");
        for (int i = 1; i <= 5; i++) {
            MSSV = Input.nextLine();
            if (MSSV.matches("B1170\\d{4}")) {
                System.out.println("mssv " + i + "la: " + MSSV);
            } else {
                System.out.println("khong phu hop");
            }
        }
    }
}
