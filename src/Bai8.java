import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.print("Nhập số dòng của ma trận A: ");
        int m = nhap1So();

        System.out.print("Nhập số cột của ma trận B: ");
        int n = nhap1So();

        System.out.print("Nhập số cột của ma trận C: ");
        int k = nhap1So();

        System.out.println("Nhập ma trận A");
        int[][] arrNumberA = nhapMang2Chieu(m, n);
        System.out.println("Ma trận số nguyên A");
        xuatMang2Chieu(arrNumberA);

        System.out.println("Nhập ma trận B");
        int[][] arrNumberB = nhapMang2Chieu(n, k);
        System.out.println("Ma trận số nguyên B");
        xuatMang2Chieu(arrNumberB);

        System.out.println("Ma trận số nguyên C");
        int[][] arrNumberC = tich2MaTran(arrNumberA, arrNumberB, m, k);
        xuatMang2Chieu(arrNumberC);

    }

    private static int[][] tich2MaTran(int[][] arrNumberA, int[][] arrNumberB, int m, int k) {
        int[][] arrNumberC = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < arrNumberA[i].length; l++) {
                    arrNumberC[i][j] += arrNumberA[i][l] * arrNumberB[l][j];
                }
            }
        }

        return arrNumberC;
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
