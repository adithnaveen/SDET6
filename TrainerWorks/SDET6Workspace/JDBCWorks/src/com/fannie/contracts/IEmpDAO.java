package com.fannie.contracts;

import java.util.List;

import com.fannie.beans.Emp;

public interface IEmpDAO {
	// insert 
		public void insertEmp(Emp emp);
	// update 
		public void updateEmp(int empId, double empSal);
	// delete 
		public void deleteEmp(int empId);
	// select - one 
		public Emp getEmp(int empId);
	// select all 
		public List<Emp> getAllEmps();
}
