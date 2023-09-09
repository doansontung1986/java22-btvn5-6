public class Bai16 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên có 7 đến 9 chữ số thoả mãn tất cả các điều kiện sau cùng lúc");
        System.out.println("a) Là số nguyên tố");
        System.out.println("b) Là số thuận nghịch");
        System.out.println("c) Thông chứa chữ số 4");
        System.out.println();

        for (int i = 10000; i < 9999999; i++) {
            if (laSoNguyenTo(i) && laSoThuanNghich(i) && khongChuaChuSo4(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean khongChuaChuSo4(int n) {
        while (n > 0) {
            int number = n % 10;
            if (number == 4) {
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
