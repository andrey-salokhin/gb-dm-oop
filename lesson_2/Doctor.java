public class Doctor extends Employee implements ableToGiveInjections, ableToOperate {

    public Doctor(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeOperation() {
        System.out.println("I am able to make an Operation");
    }

    @Override
    public void giveInjections() {
        System.out.println("I am able to give an Injection");
    }

}
