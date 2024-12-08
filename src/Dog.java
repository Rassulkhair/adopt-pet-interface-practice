public class Dog extends Animal implements Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " says bark");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }
}
