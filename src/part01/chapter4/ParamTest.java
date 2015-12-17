package part01.chapter4;

public class ParamTest {

	public static void main(String[] args) {

		// Тест 1: методы не могут изменять числовые параметры

		System.out.println("Тестирование tripleValue");
		double percent = 10;
		System.out.println("До: percent = " + percent);
		tripleValue(percent);
		System.out.println("После: percent = " + percent);

		// Тест 2: методы могут изменять состояния обьектов,
		// передаваемых в качестве параметров.

		System.out.println("\nТестирование tripleSalary:");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("До: salary = " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("После: salary = " + harry.getSalary());

		// Тест 3: методы не могут приписывать новые обьекты
		// параметрам, являющимся ссылками на обьекты.

		System.out.println("\nТестирование swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("До: a = " + a.getName());
		System.out.println("До: b = " + b.getName());
		swap(a, b);
		System.out.println("После: a = " + a.getName());
		System.out.println("После: b = " + b.getName());

	}

	// не работает
	public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("В конце метода : x = " + x);
	}
	
	// работает
	public static void tripleSalary(Employee x) {
		x.raiseSalary(200);
		System.out.println("В конце метода : salary = " + x.getSalary());
	}
	
	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("В конце метода: a = " + x.getName());
		System.out.println("В конце метода: b = " + y.getName());
	}
	
}
