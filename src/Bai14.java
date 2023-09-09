import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();

        inSoChanNhoHonN(n);

        System.out.println();

        inSoLeNhoHonN(n);
    }

    private static void inSoChanNhoHonN(int n) {
        System.out.printf("Các số chẵn nhỏ hơn %d\n", n);

        for (int i = 0; i < n; i++) {
            if (kiemTraLaSoChan(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static void inSoLeNhoHonN(int n) {
        System.out.printf("Các số lẻ nhỏ hơn %d\n", n);
        for (int i = 0; i < n; i++) {
            if (!kiemTraLaSoChan(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static boolean kiemTraLaSoChan(int n) {
        return n % 2 == 0;
    }
}
