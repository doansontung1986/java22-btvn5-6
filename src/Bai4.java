import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài của mảng: ");
        int[] arrNumber = nhapMang(nhap1So());

        System.out.println(Arrays.toString(arrNumber));

        if (!kiemTraTatCaPhanTuBangNhau(arrNumber)) {
            System.out.printf("Số lớn thứ 2 ở vị trí thứ %d trong dãy", viTriPhanTuThu2(arrNumber) + 1);
        }
    }

    private static int viTriPhanTuThu2(int[] arrNumber) {
        int max = findMax(arrNumber);
        int soLonThu2 = arrNumber[0];
        int index = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] != max && arrNumber[i] >= soLonThu2) {
                soLonThu2 = arrNumber[i];
                index = i;
            }
        }

        return index;
    }

    private static boolean kiemTraTatCaPhanTuBangNhau(int[] arrNumber) {
        int count = 0;
        int max = findMax(arrNumber);
        for (int i = 0; i < arrNumber.length; i++) {
            if (max == arrNumber[i]) {
                count++;
            }
        }

        return count == arrNumber.length;
    }

    private static int findMax(int[] arrNumber) {
        int max = arrNumber[0];
        for (int i = 0; i < arrNumber.length; i++) {
            if (max <= arrNumber[i]) {
                max = arrNumber[i];
            }
        }
        return max;
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
