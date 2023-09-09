import java.util.Arrays;
import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = nhapSoLonHon0();
        int[] a = nhapMang(n);
        System.out.print("Nhập x: ");
        int x = nhap1So();

        System.out.println("Mảng gốc");
        System.out.println(Arrays.toString(a));
        int count = demSoLanXTrongMang(a, x);

        if (count > 0) {
            System.out.printf("Số %d xuất hiện %d lần trong mảng", x, count);
        } else {
            System.out.printf("Số %d không xuất hiện trong mảng", x);
        }

    }

    private static int demSoLanXTrongMang(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                count++;
            }
        }

        return count;
    }

    private static int[] nhapMang(int n) {
        int[] arrNumber = new int[n];

        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arrNumber[i] = nhap1So();
        }

        return arrNumber;
    }

    private static int nhapSoLonHon0() {
        int n;
        do {
            n = nhap1So();

            if (kiemTraLonHon0(n)) {
                break;
            }

            System.out.println("Phải nhập 1 số lớn hơn 0");
        } while (true);

        return n;
    }

    private static boolean kiemTraLonHon0(int n) {
        return n > 0;
    }

    private static int nhap1So() {
        return new Scanner(System.in).nextInt();
    }
}
