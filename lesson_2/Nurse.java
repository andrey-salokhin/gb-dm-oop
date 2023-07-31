public class Nurse extends Employee implements ableToGiveInjections{

    public Nurse(String name, String age) {
        super(name, age);
    }

    @Override
    public void giveInjections() {
        System.out.println("I am able to give an Injection");
    }
    
}
