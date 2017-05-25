/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package exceptions;

public class InitialNegativeBalance extends Exception {
    public InitialNegativeBalance(double initialBalance) {
        super("Initial balance cannot be negative, " + initialBalance + " found");
    }
}
