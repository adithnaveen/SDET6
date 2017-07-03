package com.fannie.interfaces;

public class MortgageLoan extends BankLoan implements Income {
	private int loanAmount;
	private int creditScore;
	private int income;

	public MortgageLoan(int loanAmount, int creditScore, int income) {
		this.loanAmount = loanAmount;
		this.creditScore = creditScore;
		this.income = income;
	}

	@Override
	public void checkCreditScore() {
		if (this.creditScore < 400) {
			System.out.println("Sorry No loans possible");
		} else {
			System.out.println("We are glad to give loan...");
		}
	}

	@Override
	public void verifyIncome() {
		System.out.println("User Income is " + income);
		// ternary operator
		System.out.println(income < 5000 ? "Sorry Less Income" : "You have good Income");

	}

	@Override
	public void loanAmount() {
		System.out.println("user applied for loan amount " + loanAmount);
	}

	@Override
	public void repay(int repayAmount) {
		loanAmount = loanAmount - repayAmount;
		System.out.println("Loan amount repaid is " + repayAmount);
	}

	@Override
	public void foreClosure() {
		System.out.println("Customer wants to do fore closure for amt " + this.loanAmount);
	}

}
