import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
        Scanner input = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        System.out.println("nhập n");
        n = input.nextInt();
        for (int i = 0; n >= i; i++)
            if (i % 2 == 0)
                sum += i;
        System.out.println("tổng là " + sum);
    }
}
