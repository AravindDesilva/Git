package org.infosys;

import org.company.CompanyInfo;
import org.company.Employee;

public class Client {

	private void clientName() {
            
		System.out.println("Client name : sam");
	}
	
	public static void main(String[] args) {
		
		Client b = new Client();
		b.clientName();
		
		CompanyInfo e = new CompanyInfo();
		e.companyid();
		e.companyname();
		
		Employee a = new Employee();
		a.empid();
		a.empname();
		
		
}
}