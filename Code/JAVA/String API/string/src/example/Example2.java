package example;

// imp-note : in java , all strings are immutable

public class Example2 {

	public static void main(String[] args) {

		String company = "revature";
		String companyWithCity = company.concat("-chennai");
		System.out.println(company);
		System.out.println(companyWithCity);

	}

}
