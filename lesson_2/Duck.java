public class Duck extends Animal implements Soundable, flyable, swimable{
    public Duck(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getName() + " is flying");
    }

    @Override
    public void swim() {
    }
}
