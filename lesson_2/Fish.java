public class Fish extends Animal implements swimable{
    public Fish(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void swim() {
    }
}
