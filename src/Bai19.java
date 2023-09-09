import java.util.Arrays;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = nhapSoLonHon0();
        int[] a = nhapMang(n);

        System.out.println("Mảng gốc");
        System.out.println(Arrays.toString(a));
        demSoChanLeTrongMang(a);

    }

    private static void demSoChanLeTrongMang(int[] a) {
        int countChan = 0;
        int countLe = 0;
        for (int i = 0; i < a.length; i++) {
            if (laSoChan(a[i])) {
                countChan++;
            } else {
                countLe++;
            }
        }

        System.out.printf("Có %d phần tử là số chẵn trong mảng\n", countChan);
        System.out.printf("Có %d phần tử là số lẻ trong mảng\n", countLe);
    }

    private static boolean laSoChan(int n) {
        return n % 2 == 0;
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
