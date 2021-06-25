package example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Owner {
	private String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {
	private int year;
	private String color;

	public Car(int year, String color) {
		super();
		this.year = year;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", color=" + color + "]";
	}

}

public class HashMapCollnEx1 {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag");

		System.out.println(owner1.hashCode());

		Owner owner2 = new Owner("Riya");

		Car car1 = new Car(2015, "white");
		Car car2 = new Car(2018, "red-toy-car");

//		Map<Owner, Car> map = new HashMap<Owner, Car>();
		Map<Owner, Car> map = new LinkedHashMap<Owner, Car>();
		map.put(owner1, car1);
		map.put(owner2, car2);

//		System.out.println(map.size());
		
		for(Owner key:map.keySet()) {
			System.out.println(map.get(key));
		}
		

		// ---------------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter owner name to get car details ");
		String name = scanner.nextLine();

		Owner key = new Owner(name);

		System.out.println(key.hashCode());

		Car car = map.get(key);
		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("oops , u dont have any car");
		}

		scanner.close();

//		---------------------------------------------

	}

}
