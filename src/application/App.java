package application;

class Person {
	String name;
	int weight;
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Mary";
		person1.weight = 140;
		
		Person person2 = new Person();
		person2.name = "Joe";
		person2.weight = 165;
		
		System.out.println(person1.name);
		System.out.println(person1.weight);
		System.out.println(person2.name);
		System.out.println(person2.weight);

	}

}
