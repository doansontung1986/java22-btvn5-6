import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        System.out.print("Nhập số dòng: ");
        int n = nhapSoLonHon0();

        System.out.print("Nhập số cột: ");
        int m = nhapSoLonHon0();

        System.out.println("Nhập ma trận A");
        int[][] arrNumberA = nhapMang2Chieu(n, m);
        System.out.println("Ma trận số nguyên A");
        xuatMang2Chieu(arrNumberA);

        System.out.println("Nhập ma trận B");
        int[][] arrNumberB = nhapMang2Chieu(n, m);
        System.out.println("Ma trận số nguyên B");
        xuatMang2Chieu(arrNumberB);

        System.out.println("Ma trận số nguyên C");
        int[][] arrNumberC = tong2MaTran(arrNumberA, arrNumberB, m, n);
        xuatMang2Chieu(arrNumberC);

    }

    private static int[][] tong2MaTran(int[][] arrNumberA, int[][] arrNumberB, int m, int n) {
        int[][] arrNumberC = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrNumberC[i][j] += arrNumberA[i][j] + arrNumberB[i][j];
            }
        }

        return arrNumberC;
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
