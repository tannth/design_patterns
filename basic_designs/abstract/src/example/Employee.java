package example;

import java.util.Date;

public abstract class Employee {
	String name;
	String ID;

	// invariable parts
	public Employee(String empName, String empID) {
		this.name = empName;
		this.ID = empID;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}

	@Override
	public String toString() {
		String str = "Emp Name:: " + getName() + " EmpID:: " + getID()
				+ " Date:: " + new Date().getDate() + "/"
				+ new Date().getMonth();
		return str;
	}

	public void save() {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("emp.txt", this.toString(), true, true);
	}

	// variable part of the behavior
	public abstract String computeCompensation();
}
