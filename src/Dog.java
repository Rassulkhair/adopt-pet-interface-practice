public class Dog extends Animal implements Pet {
    private String breed;

    public void bark() {
        System.out.println("bark");
    }

    @Override
    public void play() {
        System.out.println("Dog play");
    }
}
