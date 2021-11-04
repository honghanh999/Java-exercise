import java.util.Scanner;

public class baitest2 {
    public static int nhap() {
        int a = 0;
        Scanner Input = new Scanner(System.in);
        boolean check = false;
        while (check == false) {
            try {
                a = Integer.parseInt(Input.nextLine());
                check = true;
            } catch (Exception t1) {
                System.out.println("Nhập sai định dạng, hãy nhập một số: ");
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("nhập số nguyên n");
        int a = 0;
        int n = 0;
        n = nhap();
        int max = 0;
        int secondmax = 0;
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập số nguyên trong mang");
            m[i] = Input.nextInt();
        }
//        76543 n=5
//        max = m[0];
//        secondmax = m[n - 1];
        max= m[0];
        secondmax= m[0];
        for (int i=0; i<n; i++) {
            if (m[i] != max) secondmax = m[i];
            continue;
        }
        for (int i = 0; i < n; i++) {
                if (max < m[i]) {
                    secondmax = max;
                    max = m[i];
                }
                if (max > m[i]) {
                    if (secondmax < m[i]) {
                        secondmax = m[i];
                    }
                }
                if (max == m[i]) {
                    a += 1;
                    if (a == n) {
                        max = m[i];
                        System.out.println("khong co ket qua");
                    }
                } else continue;

            }
        if (a != n) System.out.println("KQ " + secondmax);
        }
    }







