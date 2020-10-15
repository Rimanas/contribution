public class BankService {

    int calculateIncome(int deposit, int percentIncome) {
        int income = deposit * percentIncome / 100;
        return income;
    }

    int calculateCashback(int expenses, int percent) {
        int limit = 3_000_00;
        int hundreds = 100_00;
        int cashback = expenses * percent / hundreds * hundreds / 100;
        if (cashback > limit)
            cashback = limit;
        return cashback;
    }

}
