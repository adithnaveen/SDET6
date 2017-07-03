package com.fannie;

// client 
public class EmpExample {
	public static void main(String[] args) {
		
		System.runFinalizersOnExit(true);
		
		System.gc();
		
		Emp e1 = new Emp(); // default constructor is given by compiler

		e1.setEmpId(101);
		e1.setEmpName("Harry");
		e1.setEmpSal(3000);
		
//		System.out.println("Emp Id " + e1.getEmpId());
//		System.out.println("Emp Name " + e1.getEmpName());
//		System.out.println("Emp Sal " + e1.getEmpSal());

		
		System.out.println(e1); // -> e1.toString()
		
		
		Emp e2 = new Emp();
		Emp e3 = new Emp();
	}

}
