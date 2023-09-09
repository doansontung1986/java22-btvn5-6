import java.util.Arrays;
import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = nhapSoLonHon0();
        System.out.println("Nhập mảng A");
        int[] a = nhapMang(n);
        System.out.println("Mảng A");
        System.out.println(Arrays.toString(a));

        System.out.println("Nhập mảng B");
        int[] b = nhapMang(n);

        System.out.println("Mảng B");
        System.out.println(Arrays.toString(b));

        int[] c = cong2Mang(a, b);
        System.out.println("Mảng C");
        System.out.println(Arrays.toString(c));

    }

    private static int[] cong2Mang(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[a.length - 1 - i];
        }

        return c;
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
