import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử trong mảng: ");
        int[] arrNumber = nhapMangKhongTrungPhanTu(nhap1So());

        System.out.println(Arrays.toString(arrNumber));

    }

    private static boolean kiemTraSoDaCoMang(int[] arrNumber, int n, int index) {
        for (int i = 0; i < index; i++) {
            if (arrNumber[i] == n) {
                return true;
            }
        }
        return false;
    }

    private static int[] nhapMangKhongTrungPhanTu(int n) {
        int[] arrNumber = new int[n];

        for (int i = 0; i < arrNumber.length; i++) {
            boolean isDuplicate;

            do {
                System.out.printf("Nhập phần tử thứ %d: ", i + 1);
                arrNumber[i] = nhap1So();
                if (kiemTraSoDaCoMang(arrNumber, arrNumber[i], i)) {
                    isDuplicate = true;
                    System.out.printf("Số %d đã có trong mảng\n", arrNumber[i]);
                } else {
                    isDuplicate = false;
                }
            } while (isDuplicate);
        }

        return arrNumber;
    }

    private static int nhap1So() {
        return new Scanner(System.in).nextInt();
    }
}
