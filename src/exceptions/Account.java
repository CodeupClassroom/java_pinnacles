/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package exceptions;

public class Account {
    private double balance;

    // We cannot create account with a negative balance
    // Invariant
    // 2 types of exceptions (this rules are enforced at compile time)
    // - Checked exceptions -> they must be caught
    // - Unchecked exceptions -> they might not be caught
    public Account(double initialBalance) throws InitialNegativeBalance {
        // Guard clauses
        if (initialBalance < 0) {
            throw new InitialNegativeBalance(initialBalance);
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // This is an unchecked exception
    public void withdrawal(double amount) {
        if (amount < 0) {
            throw new WithdrawNegativeAttempt(amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
