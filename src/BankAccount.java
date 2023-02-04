//        b)  Написать класс BankAccount с 1 полем
//        double amount - остаток на счете и методами getAmount() - возвращает текущий остаток на счете
//        , deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
//        c)  Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше
//        чем остаток денег на счете.

import java.util.Scanner;

public class BankAccount {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println("На кошелке: " + amount);
        }
    }
    public void withDraw(int sum) throws LimitExcepcion{
        if (amount < sum) {
            System.out.println("Вы можете снять только: "  + amount);
            System.out.println("Остаток на кошелке: " + amount);
            throw new LimitExcepcion("Недостаточно средств на балансе. Остаток средств на балансе  ", amount);
        } else {
            System.out.println("Снято со кошелка: " + sum);
            System.out.println("Остаток на кошелке: " + (amount = amount - sum));
        }

    }
}
