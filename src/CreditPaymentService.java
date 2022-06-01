public class CreditPaymentService {
    public double calculate(int amount, int term) {

        double percent = 9.99;
        double monthlyPercent = percent / 100 / 12;
        double payment = amount * (monthlyPercent + monthlyPercent / (Math.pow((1 + monthlyPercent), term) - 1));
        payment = (int) payment;
        return payment;

    }
}