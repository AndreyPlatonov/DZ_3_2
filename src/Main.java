public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int sumPay = 3100;
        int bonus = 0;
        int totalAccount = initialAccount + sumPay;

        if (sumPay > 1000) {
            bonus = sumPay / 100;
        } else {
            bonus = 0;
        }

        totalAccount = totalAccount + bonus;

        System.out.println("Итоговый счет: " + totalAccount + " рублей/я");
        System.out.println("Бонус: " + bonus + " рублей/я");

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}