package com.encapsulation.examples;

public class Display {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		
	
		
		a.setName("Avesh Shaikh");
		a.setEmail("aveshshaikh2000@gmail.com");
		a.setAcc_no(75864844644L);
		a.setSal(20000);
		
		System.out.println("Account Holder Name :" + a.getName());
		System.out.println("Account Holder Email :" + a.getEmail());
		System.out.println("Account Number :" + a.getAcc_no());
		System.out.println("Account Holder Salary :" + a.getSal());
		
	

	}

}
