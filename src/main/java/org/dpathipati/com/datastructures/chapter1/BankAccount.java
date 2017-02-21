package org.dpathipati.com.datastructures.chapter1;

/**
 * BankAccount Interface to capture Account balance and account Number
 * 
 * @author Dharma
 *
 */
public class BankAccount {
	
	// String unique accountNumber, once set should not be allowed to change
	private String accountNumber;
	//double balance to keep track of amount in bank account
	private double balance;
	
	//constructor
	public BankAccount() {
		
	}
	
	/**
	 * Constructor 
	 * @param accountNumber
	 */
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber ;
	}
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance ;
	}
	
	/**
	 * Method returns current accountNumber
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * Method returns cuurent balance
	 * @return balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Method deposit the amount in the BankAccount
	 * @param amount > 0
	 * @return current balance
	 */
	public double deposit(double amount) {
		return this.balance+=amount;
	}
	
	/**
	 * Method to withdraw amount from the BankAccount 
	 * @param amount > 0
	 * @return current balance
	 */
	public double withdraw(double amount) {
		return this.balance-= amount;
	}
	
	/**
	 * Equals method to compare two bank accounts
	 */
	public boolean equals(Object other) {
		BankAccount that = (BankAccount) other;
		return this.accountNumber.equals(that.getAccountNumber());
	}
	
	 
}
