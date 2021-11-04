import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
        Scanner Input=new Scanner(System.in);
        int n;
        System.out.println("nhap n");
        n= Input.nextInt();
        int [] songuyen = new int[n];
        int gttb = 0;
        for (int i=0; i<n ; i++) {
            System.out.println("nhap so nguyen  " + i );
            songuyen [i]= Input.nextInt();
            gttb += songuyen[i];

        }
        System.out.println("gttb la " + gttb/n);
    }
}
