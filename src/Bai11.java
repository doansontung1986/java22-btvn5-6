import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        System.out.print("Nhập số dòng: ");
        int m = nhap1So();

        System.out.print("Nhập số cột: ");
        int n = nhap1So();

        System.out.println("Nhập mảng");
        int[][] arrNumber = nhapMang2Chieu(m, n);
        System.out.println("Mảng sau khi nhập");
        xuatMang2Chieu(arrNumber);

        timMaxVaMinTrongMang(arrNumber);
    }

    private static void timMaxVaMinTrongMang(int[][] arrNumber) {
        int min = arrNumber[0][0];
        int max = arrNumber[0][0];

        for (int i = 0; i < arrNumber.length; i++) {
            for (int j = 0; j < arrNumber[i].length; j++) {
                if (arrNumber[i][j] >= max) {
                    max = arrNumber[i][j];
                }

                if (arrNumber[i][j] <= min) {
                    min = arrNumber[i][j];
                }
            }
        }

        System.out.println("Gía trị max trong mảng: " + max);
        System.out.println("Gía trị min trong mảng: " + min);
    }

    private static int[][] nhapMang2Chieu(int m, int n) {
        int[][] arrNumber = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập phần tử arrNumber[%d][%d]: ", i, j);
                arrNumber[i][j] = nhap1So();
            }
        }

        return arrNumber;
    }

    private static void xuatMang2Chieu(int[][] arrNumber) {
        for (int i = 0; i < arrNumber.length; i++) {
            for (int j = 0; j < arrNumber[i].length; j++) {
                System.out.printf("   %d   ", arrNumber[i][j]);
            }
            System.out.println();
        }
    }

    private static int nhap1So() {
        return new Scanner(System.in).nextInt();
    }
}
