import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử trong mảng: ");
        int[] arrNumber = nhapMang(nhap1So());

        System.out.println(Arrays.toString(arrNumber));

        if (kiemTraMangDoiXung(arrNumber)) {
            System.out.println("Mảng đối xứng");
        } else {
            System.out.println("Mảng không đối xứng");
        }
    }

    private static boolean kiemTraMangDoiXung(int[] arrNumber) {
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] != arrNumber[arrNumber.length - 1 - i]) {
                return false;
            }
        }
        return true;
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
