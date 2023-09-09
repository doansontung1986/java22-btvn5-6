import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài của mảng: ");
        int[] arrNumber = nhapMang(nhap1So());

        System.out.println(Arrays.toString(arrNumber));
        System.out.printf("Có %d cặp phần tử liên tiếp bằng nhau", demCacCap2PhanTuLienTiep(arrNumber));
    }

    private static int demCacCap2PhanTuLienTiep(int[] arrNumber) {
        int count = 0;
        for (int i = 0; i < arrNumber.length - 1; i++) {
            if (arrNumber[i] == arrNumber[i + 1]) {
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

    private static int nhap1So() {
        return new Scanner(System.in).nextInt();
    }
}
