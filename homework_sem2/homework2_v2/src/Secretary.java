import java.lang.String;

public final class Secretary extends Employee {
    public Secretary(String name, int salary) {
        super(name, salary);
    }

    public void SayHi() {
        System.out.println("Hi, I'm secretary " + getName());
    }

    public final void setSalary(int salary) {
        if (salary <= 0 || salary > 30000) {
            throw new IllegalArgumentException("Invalid salary value for secretary");
        }
        super.setSalary(salary);
    }

    public final void secretaty() {
        System.out.println("DOING SECRETARY'S DEALS");
    }
}
