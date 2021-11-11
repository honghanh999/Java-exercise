import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
        Scanner Input = new Scanner(System.in);
        boolean check=false;
        int a=0;
        System.out.println("nhập vào a");
        while (check==false) {
            try {
                a= Input.nextInt();
                check=true;
            }
            catch (Exception t1) {
                System.out.println("nhập sai r ");
                Input.nextLine();
            }
        }
        if (a < 0) {
            System.out.println("Đây là số nguyên âm");
        } else {
            System.out.println("đây là số nguyên dương");
        }


    } }




