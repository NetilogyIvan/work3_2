public class Main {
    public static void main(String[] args) {
        int score = 2_000;
        int payment = 500;

        int bonus;
        if (payment > 1_000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int balance = score + payment + bonus;

        System.out.println("Ваш счет пополнен на " + payment + " руб., Баланс " + balance + " руб., Ваш бонус " + bonus + " руб.,");
    }
}