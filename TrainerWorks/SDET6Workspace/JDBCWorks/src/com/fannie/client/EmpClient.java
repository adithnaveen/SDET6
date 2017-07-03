package com.fannie.client;

import java.util.List;

import com.fannie.beans.Emp;
import com.fannie.contracts.IEmpDAO;
import com.fannie.dao.EmpDAO;

public class EmpClient {
	public static void main(String[] args) {
		Emp emp = new Emp(102, "Sasankay", 20000, "sasankay@fanniemae.com");
		
		IEmpDAO dao = new EmpDAO();
		 // dao.insertEmp(emp);
		// dao.updateEmp(101, 21000);
		// Emp emp1 = dao.getEmp(101);
		// System.out.println(emp1);
		
		List<Emp> list = dao.getAllEmps();
		for(Emp temp : list){
			System.out.println(temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
