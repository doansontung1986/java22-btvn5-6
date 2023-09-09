import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        do {
            System.out.print("Nhập số m: ");
            m = sc.nextInt();

            System.out.print("Nhập số n: ");
            n = sc.nextInt();

            if (kiemTraSoMNhoHonsoN(m, n)) {
                break;
            }

            System.out.println("Số m phải nhỏ hơn số n");
        } while (true);

        int count = demSoChinhPhuong(m, n);

        if (count > 0) {
            System.out.printf("\nCó %d số chính phương", count);
        } else {
            System.out.println("Không có số chính phương nào");
        }
    }

    private static int demSoChinhPhuong(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (laSoChinhPhuong(i)) {
                System.out.printf("%d ", i);
                count++;
            }
        }
        return count;
    }

    private static boolean kiemTraSoMNhoHonsoN(int m, int n) {
        return m < n;
    }

    private static boolean laSoChinhPhuong(int n) {
        return Math.pow((int) Math.sqrt(n), 2) == n;
    }
}
