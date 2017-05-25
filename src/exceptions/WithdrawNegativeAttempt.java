/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package exceptions;

public class WithdrawNegativeAttempt extends RuntimeException {
    public WithdrawNegativeAttempt(double amount) {
        super("Cannot withdraw a negative amount, " + amount + " found.");
    }
}
