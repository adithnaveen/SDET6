package com.fannie.factorywork;

interface LoanName{
	String MORTGATELOAN="MORTGATELOAN";
	String VEHICLELOAN="VEHICLELOAN";
	String COMMERCIALLOAN="COMMERCIALOAN";
}


class Loan{
	 // private Loan(){}
	public static Loan getMyLoan(String loanType){
		if(loanType.equals(LoanName.MORTGATELOAN)){
			return new MortagaeLoan();
		}else if(loanType.equals(LoanName.VEHICLELOAN)){
			return new VehicleLoan();
		}else if(loanType.equals(LoanName.COMMERCIALLOAN)){
			return new CommercialLoan();
		}
		return null;
	}
	
}


class MortagaeLoan extends Loan{
	public MortagaeLoan() {
		System.out.println("Mortagage loan invoke");
	}
}
class VehicleLoan extends Loan{
	public VehicleLoan() {
			System.out.println("Vehilce loan invoked");
		}
}
class CommercialLoan extends Loan{
	public CommercialLoan() {
		System.out.println("commercial loan invoked");
	}
}

public class FactoryExample {
	public static void main(String[] args) {
		Loan vehLoan = Loan.getMyLoan(LoanName.VEHICLELOAN);


	}
}

















