import java.util.Scanner;

public class baivongtron {
    public static int nhap () {
        int a=0;
        Scanner Input= new Scanner(System.in);
        boolean check=false;
        System.out.println("nhap mot so chan");
        while (check==false) {
            try {
                a= Integer.parseInt(Input.nextLine());
                check=true;
            }
            catch (Exception t1) {
                System.out.println("nhap sai, nhap lai di ");
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 0;
        n = nhap();
        if (n % 2 == 0) {
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = i;
            }
            Scanner input2 = new Scanner(System.in);
            int a = 0;
            int b = 0;
            System.out.println("nhap mot so trong khoang tu 0 den " + m[n - 1]);
            a = input2.nextInt();
            if (a<(n/2)) {
                b = a + n / 2;
                System.out.println("so doi cua a la " + b);
            }
            if (a>(n/2)) {
                b = a - n/2;
                System.out.println("so doi cua a la " + b);
            }
        }
        if (n % 2 != 0) {
            System.out.println(" sai roi, nhap so chan ma");
    }
    } }

