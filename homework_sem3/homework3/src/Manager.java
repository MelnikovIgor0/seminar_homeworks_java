public class Manager extends Employee implements Gradable {
    private int Grade;

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

    public int getGrade() {
        return Grade;
    }

    public void addGrade(int addGrade) {
        if (addGrade < 0) {
            setSalary(0);
            System.out.println("worker fired!!!");
            return;
        }
        if (addGrade > 3) {
            throw new IllegalArgumentException("wrong adding value");
        }
        Grade += addGrade;
        System.out.println("Grade updated, new grade: " + Integer.toString(Grade));
    }
}
