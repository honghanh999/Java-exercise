import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
// Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
        Scanner Input= new Scanner(System.in);
        boolean check=false;
        int a;
        System.out.println("nhập dô nè");
        a= Input.nextInt();

        switch (a) {
            case 0:
                System.out.println("không"); break;
            case 1:
                System.out.println("một"); break;
            case 2:
                System.out.println("hai"); break;
        }

    }
}
