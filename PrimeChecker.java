public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Kullanım: java PrimeChecker <sayı>");
            return;
        }
        try {
            int number = Integer.parseInt(args[0]);
            if (isPrime(number)) {
                System.out.println(number + " asal sayıdır.");
            } else {
                System.out.println(number + " asal sayı değildir.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Lütfen geçerli bir tamsayı giriniz.");
        }
    }
}
