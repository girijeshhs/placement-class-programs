public class inheritancee {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
