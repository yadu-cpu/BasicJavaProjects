package abstractClass;

abstract class Animal {
	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animal {

	@Override
	public void animalSound() {
		System.out.println("The pig says We We");
	}

}

public class MyMainClass {
	public static void main(String args[]) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}
