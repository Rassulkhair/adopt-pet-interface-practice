public class Cat extends Animal implements Pet {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println(name + " says: Meow");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }
}
