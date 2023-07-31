public class Duck extends Animal implements Soundable, flyable{
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
}
