public class Dog extends Animal implements Soundable, runnable, swimable{
    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void swim() {
    }

    @Override
    public void run() {
    }
}
