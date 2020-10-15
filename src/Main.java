public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        int result = bankService.calculateIncome(1000_00, 7);
        System.out.println("Ваш доход составит:");
        System.out.println(result);

        int cashback = bankService.calculateCashback(1_000_000_00, 5);
        System.out.println("Ваш кэшбэк составит:");
        System.out.println(cashback);
    }
}
