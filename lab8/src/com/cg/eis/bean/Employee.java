package com.cg.eis.bean;

import java.io.Serializable;

public class Employee implements Serializable
{
		String empId;
		String empName;
		float empSalary;
		String empDesignation;
		String empInsuranceScheme;
		public Employee()
		{
			
		}
		public Employee(String empId, String empName, float empSalary, String empDesignation) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.empDesignation = empDesignation;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
					+ ", empDesignation=" + empDesignation + ", empInsuranceScheme=" + empInsuranceScheme + "]";
		}	
		/*	@Override
		public boolean equals(Object obj)
		{
			Employee ee=(Employee)obj;
			if(this.empId == ee.empId)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		@Override
		public int compareTo(Employee ee)
		{
			if(this.empSalary<ee.empSalary)
			{
				return -1;
			}
			else if(this.empSalary==ee.empSalary)
			{
				return 0;
			}
			else
			{
				return +1;
			}
		}*/
}
		
