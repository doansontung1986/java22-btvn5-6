import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        double s = tinhS(n);
        System.out.printf("S = %.2f", s);
    }

    private static double tinhS(int n) {
        double i = 1;
        double s = 0;

        while (i <= n) {
            s += 1 / i;
            i++;
        }

        return s;
    }
}
