package com.fannie.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Hello implements Serializable{}
public class ObjectStoreGet {

	// write the object 
	public static void saveCustomer(Customer customer) 
			throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer.ser"));
		
		oos.writeObject(customer);
		
		System.out.println("Customer Saved... ");
	}
	// read the object 
	
	public static void readCustomer()
			throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.ser"));
		
		Customer cust = (Customer) ois.readObject();
		
		// Hello h = (Hello) ois.readObject();
		System.out.println(cust);
	}
	
	public static void main(String[] args) {
		Customer customer  = new Customer(101, "Kameshwari");
		try {
			// saveCustomer(customer);
			readCustomer();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
