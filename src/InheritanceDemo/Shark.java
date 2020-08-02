package InheritanceDemo;

public class Shark extends Fish {
	int length = 25;

	Shark() {
		System.out.println("This is subclass constructor");
	}

	public void greeting() {
		System.out.println("I can bite you.");
	}

	public void bite() {
		System.out.println("BITE !!!");
	}

	public static void main(String args[]) {
		Shark sh = new Shark();

		System.out.println("Shark length is " + sh.length);

		sh.greeting();

		sh.bite();
	}
}
