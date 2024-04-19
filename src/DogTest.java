
public class DogTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog pupy = new Dog();
		Cat cat = new Cat();
//		pupy.eat();
//		cat.eat();
		Animal obj;
		obj = animal;
		obj.eat();
		
		obj = pupy;
		obj.eat();
		
		obj = cat;
		obj.eat();
	}

}
