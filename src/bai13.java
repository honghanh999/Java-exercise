import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
        Scanner input=new Scanner(System.in);
        int n=0;
        int min;
        System.out.println("nhap n");
        n=input.nextInt();
        int [] songuyen= new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("nhap so nguyen vao");
            songuyen [i] = input.nextInt();
        }
        min = songuyen[0];
        for (int i=0; i<n; i++) {
            if (songuyen [i] < min)
                min= songuyen[i];
        }
        System.out.println("min la " + min);
    }
}
