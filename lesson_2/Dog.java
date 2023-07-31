public class Dog extends Animal implements Soundable{
    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }
}
