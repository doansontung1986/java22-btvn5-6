public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên có 7 chữ số thoả mãn tất cả các điều kiện sau cùng lúc:");
        System.out.println("a) Là số nguyên tố.");
        System.out.println("b) Tất cả các chữ số là nguyên tố");
        System.out.println("c) Đảo của nó cũng là một số nguyên tố");
        System.out.println();

        for (int i = 1000000; i < 9999999; i++) {
            if (laSoNguyenTo(i) && cacChuSoLaSNT(i) && laSoNguyenTo(daoNguocSo(i))) {
                System.out.println(i);
            }
        }
    }

    private static int daoNguocSo(int n) {
        int soDaoNguoc = 0;

        while (n > 0) {
            soDaoNguoc = soDaoNguoc * 10 + n % 10;
            n /= 10;
        }

        return soDaoNguoc;
    }

    private static boolean cacChuSoLaSNT(int n) {
        while (n > 0) {
            int number = n % 10;
            if (!laSoNguyenTo(number)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    private static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
