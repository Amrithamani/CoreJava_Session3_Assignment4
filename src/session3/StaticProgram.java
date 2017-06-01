package session3;

public class StaticProgram {

	int x;// initialize instance variable

	static int y = 5;// initialize static variable

	// declare parameterized constructor

	StaticProgram(int x) {

		this.x = x;// store value in instance variable x

	}

	// declare static method

	public static void yIncrement() {

		System.out.println(++y);// can use only static variable prints 6 value

	}

	// declare non static method

	public void xIncrement() {

		System.out.println(++x);// increment x value prints 11 value

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticProgram.yIncrement();// static method can call using class name

		StaticProgram obj = new StaticProgram(10);
		// non static method creating object

		obj.xIncrement();// object calling non static method

		y++;// static variable can be be shared in main method without creating
		// constructor

		System.out.println(y);// prints 7 value

	}

}
