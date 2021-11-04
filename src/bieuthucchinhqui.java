import java.util.Scanner;

public class bieuthucchinhqui {
//Viết chương trình đảo ngược số tự nhiên 12345--->54321
        public static int nhap(){
            int a =0;
            boolean check = false;
            Scanner input = new Scanner(System.in);
            while (check ==false){
                try{
                    a = Integer.parseInt(input.nextLine());
                    check = true;
                }catch (Exception t1) {
                    System.out.println("Nhập sai định dạng! Hãy nhập một số!");
                }
            }
            return  a;
        }
        public static void main(String[] args) {
            int n;
            int swap=0, rev=0;
            System.out.println("Nhập vào một số n : ");
            n = nhap();
            while (n!= 0){
                swap = n%10;
                rev = rev*10 + swap;
                n = n/10;
            }
            System.out.println("số nghịch đảo là: ");
            System.out.println(rev);
        }
    }

