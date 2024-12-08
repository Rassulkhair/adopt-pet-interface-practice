public class Cat extends Animal implements Pet {
    private String furColor;

    public void meow() {
        System.out.println("Meow");
    }


    @Override
    public void play() {
        System.out.println("Cat play");
    }
}
