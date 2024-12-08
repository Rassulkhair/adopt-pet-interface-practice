public class Person {
    private String name;
    private int age;
    private Address address;
    private Phone phone;

    public Person(String name, int age, Address address, Phone phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void adoptPet(Pet pet) {
        System.out.println(pet.getClass() + " adopted by " + name);
    }
}
