//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double creditRate = 9.99;
        int duration = 3;
        double creditPayment = service.calculate(credit, creditRate, duration);
        String creditPaymentInteger = String.format("%.0f", creditPayment);
        System.out.println("Сумма кредита: " + credit + " руб.");
        System.out.println("Годовая процентная ставка: " + creditRate + " %.");
        System.out.println("Срок кредита: " + duration + " лет.");
        System.out.println("Сумма ежемесячного платежа: " + creditPaymentInteger + " руб.");
    }
}
