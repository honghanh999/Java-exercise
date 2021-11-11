import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
        Scanner Input = new Scanner(System.in);
        System.out.println("nhap n");
        int n = 0;
        int max = 0;
        n = Input.nextInt();
        int[] songuyen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so nguyen vao");
            songuyen[i] = Input.nextInt();
            while (songuyen[i] < 0) {
                System.out.println("nhap lai so nguyen duong nha ");
                songuyen[i] = Input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (songuyen[i] > max) {
                max = songuyen[i];
            }
        }
        System.out.println("max la " + max);
    }
}
