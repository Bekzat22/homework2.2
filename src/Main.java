import java.util.Scanner;

//        d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
//        e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
//        при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму
//        , которая осталась на счете и завершать бесконечный цикл
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Insert a deposit:");
        Scanner scanner=new Scanner(System.in);
        bankAccount.deposit(scanner.nextDouble());
    while (true){
          try {
              System.out.println("how much do you want to withdraw");
              bankAccount.withDraw(scanner.nextInt());
          } catch (LimitExcepcion e) {
              e.printStackTrace();
              System.out.println("remained"+bankAccount.getAmount());
          }


      }


      }
    }
}
