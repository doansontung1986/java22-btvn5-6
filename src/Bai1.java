public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên có 7 đến 9 chữ số thoả mãn tất cả các điều kiện sau cùng lúc");
        System.out.println("a) Là số thuận nghịch.");
        System.out.println("b) Chỉ có chữ số 0, 6, 8");
        System.out.println("c) Tổng chữ số chia hết cho 10");
        System.out.println();

        for (int i = 1000000; i < 999999999; i++) {
            if (laSoThuanNghich(i) && chiCoChuSo068(i) && tongChuSoChiaHetCho10(i)) {
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

    private static boolean chiCoChuSo068(int n) {
        while (n > 0) {
            int number = n % 10;
            if (number != 0 && number != 6 && number != 8) {
                return false;
            }

            n /= 10;
        }

        return true;
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
