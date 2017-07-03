package com.fannie.interfaces;

public class LoanImpl {
	public static void main(String[] args) {
		MortgageLoan mlHarry = 
			new MortgageLoan
			(60000, 456, 7000);
		
		mlHarry.checkCreditScore();
		mlHarry.verifyIncome();
		
		mlHarry.loanAmount();

		mlHarry.repay(2000);
		mlHarry.loanAmount();
		mlHarry.repay(2000);
		mlHarry.loanAmount();
		mlHarry.repay(2000);
		mlHarry.loanAmount();
		
		mlHarry.foreClosure();
	}
}
