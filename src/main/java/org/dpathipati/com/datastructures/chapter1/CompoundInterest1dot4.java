package org.dpathipati.com.datastructures.chapter1;

import java.math.BigDecimal;

/**
 * This class is to answer question 1.4
 * Implement compount interest using association
 * @author Dharma
 *
 */
public class CompoundInterest1dot4 {
	
	private static final String ACCOUNT_NUMBER_10_YEARS = "account_ci_10years";
	private static final String ACCOUNT_NUMBER_20_YEARS = "account_ci_20years";
	private static final BigDecimal INITIAL_DEPOSIT = new BigDecimal("100");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Association[] associations = new Association[2];
		
		Association ci_10years = new Association(ACCOUNT_NUMBER_10_YEARS, INITIAL_DEPOSIT);
		
		Association ci_20years = new Association(ACCOUNT_NUMBER_20_YEARS, INITIAL_DEPOSIT);
		
		associations[0] = ci_10years;
		associations[1] = ci_20years;
		
		calculateCompoundInterest(associations);
		printBalance(associations);
		
	}
	
	private static void calculateCompoundInterest(Association[] associations) {
		for(int i = 0; i < associations.length; i++) {
			int no_of_years = 0;
			BigDecimal interest = null ;
			if(associations[i].getKey().equals(ACCOUNT_NUMBER_10_YEARS)) {
				no_of_years = 10;
				interest = BigDecimal.valueOf(0.05);
			} else if (associations[i].getKey().equals(ACCOUNT_NUMBER_20_YEARS)) {
				no_of_years = 20;
				interest = BigDecimal.valueOf(0.025);
			}
			for(int n = 1; n <= no_of_years; n++) {
				BigDecimal balance = ((BigDecimal)associations[i].getValue()).multiply(interest);
				associations[i].setValue(balance);
			}
		}
	}
	
	private static void printBalance(Association[] associations) {
		
		for(int i = 0; i < associations.length; i++) {
			System.out.println("Account " + associations[i].getKey() + " has a balance of " + associations[i].getValue());
		}
	}

}
