import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        int m = nhapSoNguyenTo();
        int n = nhapSoNguyenTo();
        String result;

        // Hai số nguyên tố cùng nhau là 2 số có UCLN là 1
        if (kiemTra2SoCungNhau(m, n)) {
            result = "cùng nhau";
        } else {
            result = "không cùng nhau";
        }

        System.out.printf("Hai số nguyên tố %s", result);
    }

    private static int nhapSoNguyenTo() {
        int n;
        do {
            System.out.print("Nhập 1 số nguyên: ");
            n = new Scanner(System.in).nextInt();

            if (laSoNguyenTo(n)) {
                break;
            }

            System.out.println("Phải nhập 1 số nguyên tố");
        } while (true);

        return n;
    }

    private static boolean kiemTra2SoCungNhau(int m, int n) {
        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }

        // Hai số nguyên tố cùng nhau là 2 số có UCLN là 1
        return m == 1;
    }

    private static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
