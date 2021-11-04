import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
// Số tháng và năm -> in ra số ngày trong tháng/năm đó

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm dô nà");
        int year = sc.nextInt();
        System.out.println("nhập tháng dô nà");
        int month = sc.nextInt();
        int day=31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (year %400 ==0 || (year %4 ==0 && year % 100!=0))
                    day = 29;
                else day = 28;
                break;
            default:
                day = 31;
                break;

        }
        System.out.println(String.format("tháng %d/%d có %d ngày ", month, year, day));
    }
}
