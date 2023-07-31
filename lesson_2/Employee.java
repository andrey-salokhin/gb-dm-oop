public class Employee extends Human {

    protected String passportId;
    protected int lengthOfWork;

    public Employee(String name, String age, String passportId, Integer lengthOfWork) {
        super(name, age);
        this.passportId = passportId;
        this. lengthOfWork = lengthOfWork;
    }

    public Employee(String name, String age) {
        this(name, age, null, null);
    }
    
}
