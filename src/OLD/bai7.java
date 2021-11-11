import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
// Viết chương trình để nhập một số nguyên, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
        Scanner Input= new Scanner(System.in);
        int n= 0;
        System.out.println("nhập n");
//        n= Input.nextInt();
        boolean check = false;
        while (check == false) {
            try {
                n= Input.nextInt();
                check=true;
            }
            catch (Exception t1) {
                System.out.println("nhâp sai rồi, nhập lại");
                Input.nextLine();
            }
        }

        for (int a=1; a<=20; a = a + 1) {
            System.out.println( a*n);
    }
} }
