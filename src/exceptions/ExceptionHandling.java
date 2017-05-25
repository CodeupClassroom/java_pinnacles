/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        Account myAccount;
        try {
            System.out.println(56 / 60);
            //throw new Exception("Something went wrong"); // stop the execution of the code
            myAccount = new Account(12);
            myAccount.withdrawal(-100);

            System.out.println(myAccount.getBalance());
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            // log this message
        } catch (InitialNegativeBalance exception) {
            System.out.println(exception.getMessage());
            // send an email to a supervisor
        } catch (WithdrawNegativeAttempt e) {
            System.out.println(e.getMessage());
            // suspend temporarily this account
        } catch (Exception e) {   // Pokemon exception handling
            System.out.println(e.getMessage());
        }
    }
}
