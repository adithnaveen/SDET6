package com.fannie.interfaces;

// this should not be class 
public abstract class BankLoan {
	public abstract void loanAmount();
	public abstract void repay(int repayAmount);
	public abstract void foreClosure();
}
