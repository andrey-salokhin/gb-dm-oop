public class Cat extends Animal implements Soundable, Illable{
    public Cat(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
