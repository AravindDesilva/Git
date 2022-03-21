package org.company;
//child class
public class CompanyInfo {

	public void companyname() {
		System.out.println("companyname is amazon");

	}
	
	public void companyid() {
		System.out.println("companyid is 9696");

	}
	
	
	
	
	public static void main(String[] args) {
		//class name object name = new class name();
		
		CompanyInfo c = new CompanyInfo();
		c.companyid();
		c.companyname();
		
		Employee d = new Employee();
		d.empid();
		d.empname();
		
	}
}
