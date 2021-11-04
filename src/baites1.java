import java.util.Scanner;
//đảo thứ tự số
public class baites1 {
    public static int nhap() {
        int a=0;
        Scanner Input= new Scanner(System.in);
        boolean check=false;
        while (check==false) {
            try {
                a= Input.nextInt();
                check=true;
            }
            catch (Exception t1) {
                System.out.println("Nhập sai định dạng! Hãy nhập một số");
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n;
        n= nhap();

    }
}
