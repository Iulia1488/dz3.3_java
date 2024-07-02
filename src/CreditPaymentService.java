public class CreditPaymentService {
    public double calculate(int credit, double creditRate, int duration) {
        double crm = creditRate / 100 / 12;
        int dm = duration * 12;
        double elevate = Math.pow(1 + crm, dm);
        double creditPayment = credit * (crm + (crm / (elevate - 1)));
        return creditPayment;
    }
}
