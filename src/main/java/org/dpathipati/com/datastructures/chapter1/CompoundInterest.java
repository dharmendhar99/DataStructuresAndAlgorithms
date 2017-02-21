/**
 * 
 */
package org.dpathipati.com.datastructures.chapter1;

/**
 * @author Dharma
 *
 */
public class CompoundInterest {

	private static final String ACCOUNT_NUMBER_10_YEARS = "account_ci_10years";
	private static final String ACCOUNT_NUMBER_20_YEARS = "account_ci_20years";
	private static final Double INITIAL_DEPOSIT = Double.valueOf("100");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 *  Using BankAccount find if depositing $100 for 10 years at 5% better
		 *  than depositing $100 for 20 years at 2.5 %
		 */

		BankAccount ci_10years = new BankAccount(ACCOUNT_NUMBER_10_YEARS, INITIAL_DEPOSIT);
		depositCompoundInterest(ci_10years, 10, 0.05);

		BankAccount ci_20years = new BankAccount(ACCOUNT_NUMBER_20_YEARS, INITIAL_DEPOSIT);
		depositCompoundInterest(ci_20years, 20, 0.025);

		if (ci_10years.getBalance() > ci_20years.getBalance()) {
			System.out.println("Depositing $100 for 10 years at 5 % interest is better");
		} else {
			System.out.println("Depositing $100 for 20 years at 2.5 % interest is better");
		}
		
		//Depreciate in value of money/dollar is not considered
		
	}

	private static void depositCompoundInterest(BankAccount account, int years, double interest) {

		for (int i = 1; i <= years; i++) {
			account.deposit(account.getBalance() * interest);
		}

		System.out.println("Depositing for " + years + "year at compount interest " + interest + " resulted in balance of"
				+ account.getBalance() + " in account :" + account.getAccountNumber());

	}

}
