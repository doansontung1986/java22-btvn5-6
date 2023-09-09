import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử trong mảng: ");
        int[] arrNumber = nhapMang(nhap1So());
        System.out.print("Nhập số b: ");
        int b = nhap1So();
        System.out.print("Nhập số c: ");
        int c = nhap1So();

        System.out.println(Arrays.toString(arrNumber));

        double trungBinhCong = tinhTrungBinh(arrNumber, b, c);
        System.out.printf("Trung bình cộng các phần tử của dãy nằm trong đoạn [%d %d] là: %.2f", b, c, trungBinhCong);
    }

    private static double tinhTrungBinh(int[] arrNumber, int b, int c) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if (b <= arrNumber[i] && arrNumber[i] <= c) {
                sum += arrNumber[i];
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
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
