package com.example.hr;

import com.example.employee.Employee;

public class HR {

	public static void manageEmployees() {

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "riya";

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "diya";

		Employee.teach();

		e1.listen();
		e2.listen();

	}

}
