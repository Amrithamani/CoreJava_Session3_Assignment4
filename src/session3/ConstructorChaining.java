package session3;

public class ConstructorChaining {

	// declare default constructor 1

	public ConstructorChaining() {

		System.out.println("Default Constructor");// prints Default Constructor

	}

	// parameterized constructor 2

	public ConstructorChaining(int x) {

		this();// Invokes default Constructor 1

		System.out.println(x);// prints 5 value

	}

	// parameterized constructor 3

	public ConstructorChaining(int x, int y) {

		this(5);// invokes parameterized constructor 2

		System.out.println(x * y);// prints 40 value

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConstructorChaining(8, 5);// invokes parameterized constructor 3
	}

}
