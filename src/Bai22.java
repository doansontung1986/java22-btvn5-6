import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập số n: ");
            n = nhap1So();
            if (kiemTraNLonHon0(n)) {
                break;
            }

            System.out.println("n phải lớn hơn 0");
        } while (true);

        System.out.println("Nhập mảng");
        int[][] arrNumber = nhapMang2Chieu(n);
        System.out.println("Mảng sau khi nhập");
        xuatMang2Chieu(arrNumber);

        int sum = tongDuongCheoPhu(arrNumber);
        System.out.println("Tổng các phần tử thuộc đường chéo phụ " + sum);

    }

    private static int tongDuongCheoPhu(int[][] arrNumber) {
        int sum = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            for (int j = 0; j < arrNumber[i].length; j++) {
                if (i + j == arrNumber.length - 1) {
                    sum += arrNumber[i][j];
                }
            }
        }
        return sum;
    }

    private static boolean kiemTraNLonHon0(int n) {
        return n > 0;
    }


    private static int[][] nhapMang2Chieu(int n) {
        int[][] arrNumber = new int[n][n];

        for (int i = 0; i < n; i++) {
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
