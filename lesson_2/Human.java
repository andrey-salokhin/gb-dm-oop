public class Human implements runnable, swimable {

    protected String name;
    protected String age;
    
    public Human(String name, String age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void swim() {
    }

    @Override
    public void run() {
    }

}
