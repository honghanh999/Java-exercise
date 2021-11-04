public class bai17 {
    public static void main(String[] args) {
        int fibo;
//        0 1 1 2 3 5 8 13 21
        System.out.println(fibo(8));
    }
    private static int fibo (int n) {
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
