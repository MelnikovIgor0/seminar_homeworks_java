public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void setSalary(int salary) {
        if (salary <= 0 || salary > 100000) {
            throw new IllegalArgumentException("Invalid salary value for manager");
        }
        super.setSalary(salary);
    }

    public final void manage() {
        System.out.println("DOING MANAGER'S DEALS");
    }

    public void SayHi() {
        System.out.println("Hi, I'm manager " + getName());
    }
}
