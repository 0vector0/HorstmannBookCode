package part01.chapter5;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private String name;
	private double salary;
	private Date hireDay;

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public boolean equals(Object otherObject) {

		// Быстрая проверка идентичности обьектов
		if (this == otherObject)
			return true;

		// если явный параметр - null, возвращается значение false.
		if (otherObject == null)
			return false;

		// если классы не совпадают, они не эквиваленты.
		if (getClass() != otherObject.getClass())
			return false;

		// теперь мы знаем, что otherObject - ненулевой обьект Employee
		Employee other = (Employee) otherObject;

		// проверка идентичности значений, записанных в полях.
		return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);
	}

	public int hashCode() {
		return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}
	

}
