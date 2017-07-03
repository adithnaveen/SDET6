package com.fannie.exception;

public class ExceptionEx2 {

	public static void checkName(String name){
		if(name.length() < 5){
			throw new RuntimeException("Sorry Name too small for processing");
		}
	}
	
	public static void checkCreditScore(int creditScore, String name)
				throws Exception, RuntimeException, FannieException{
		try{
			checkName(name);
		}catch(RuntimeException re){
			throw new Exception("Sorry Loan processing not done because", re);
		}
		
		
		if(creditScore < 400){
			// throw an exception and say loan cannot be processed 
			throw new FannieException();
		}else if(creditScore >=400 && creditScore < 600){
			// throw an exception, and say lets wait for 3 months 
			throw new FannieException("Lets check back in 3 months Mr/Ms/Mrs: " + name);
		}else {
			System.out.println("Loan Approve for Mr/Ms/Mrs: " + name);
		}
	}
	public static void main(String[] args) {
	
			try {
				checkCreditScore(700, "Edmund");
			} catch (RuntimeException e) {
				e.printStackTrace();  // -> some bl 
			} catch (FannieException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}




