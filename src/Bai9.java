public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10");
        System.out.println();

        for (int i = 100000; i < 999999; i++) {
            if (laSoThuanNghich(i) && tongChuSoChiaHetCho10(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean tongChuSoChiaHetCho10(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum % 10 == 0;
    }

    private static boolean laSoThuanNghich(int n) {
        return n == daoNguocSo(n);
    }

    private static int daoNguocSo(int n) {
        int soDaoNguoc = 0;

        while (n > 0) {
            soDaoNguoc = soDaoNguoc * 10 + n % 10;
            n /= 10;
        }

        return soDaoNguoc;
    }
}
