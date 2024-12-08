public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Big T", 3, "Golden Retriever");
        Cat cat = new Cat("Barsik", 2, "Gray");

        Address address = new Address("Gabdulin 17/1", "Astana", "Akmola", "0303030");
        Phone phone = new Phone("+7(778)-344-59-42", PhoneType.MOBILE);

        Person person = new Person("Rassulkhair", 24, address, phone);

        person.adoptPet(dog);
        person.adoptPet(cat);

        dog.play();
        dog.bark();
        dog.eat();
        dog.sleep();


        cat.play();
        cat.meow();
        cat.eat();
        cat.sleep();

        address.getFullAddress();
    }
}