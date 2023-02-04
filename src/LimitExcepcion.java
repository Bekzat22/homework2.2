//a)  Написать класс проверяемого исключения LimitException,
//        с конструктором LimitException(String message, double remainingAmount) и методом getRemainingAmount().
public class LimitExcepcion extends Exception {
    private double remainingAmount;

    public LimitExcepcion(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {

        return remainingAmount;
    }
}
