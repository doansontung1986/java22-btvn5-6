import java.util.Arrays;
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = nhapSoLonHon0();
        int[] a = nhapMang(n);

        System.out.println("Mảng gốc");
        System.out.println(Arrays.toString(a));

        System.out.println("Sau khi sắp xếp");
        sapXepMangGiamDan(a);
        System.out.println(Arrays.toString(a));

    }

    private static void sapXepMangGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean isSwap = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    swap(a, i, j);
                    isSwap = true;
                }
            }

            // Chỉ cần 1 lần lặp không có sự hón đổi nghĩa là  toàn mảng đã được sắp xếp
            if (!isSwap) {
                break;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
