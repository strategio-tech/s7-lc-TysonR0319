package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * Calculates the amount of money still owed after 3 months if you pay 10% each month
     * @param
     * amount: int - quantity lent
     * @return
     * amount - 10%
     */
    static int getRemainingAmountIn3Months(int amount) {

        int own_money =(int) amount;
        for (int i = 0; i < 3; i++) {
            own_money -= own_money * 0.10;
        }
        return own_money;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter");
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
