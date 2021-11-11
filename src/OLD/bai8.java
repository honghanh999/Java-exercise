import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//In ra tất cả số nguyên tố trong khoảng từ 0 - n.
        Scanner Input = new Scanner(System.in);
        int n=0;
        boolean check= false;
        System.out.println("nhập n");
        while (check==false) {
            try {
                n= Input.nextInt();
                check = true;
            }
            catch (Exception t1) {
                System.out.println("nhập lại đi");
                Input.nextLine();
            }
        }
        for (int i=0; i<=n; i++ ) {
            System.out.println(i);
        }
    }
}
