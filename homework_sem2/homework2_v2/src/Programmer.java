import java.lang.String;

public final class Programmer extends Employee {
    private String ProgrammingLanguage;

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    private void setProgrammingLanguage(String programmingLanguage) {
        ProgrammingLanguage = programmingLanguage;
    }

    public Programmer(String name, int salary, String language) {
        super(name, salary);
        setProgrammingLanguage(language);
    }

    public final void setSalary(int salary) {
        if (salary <= 0 || salary > 1000000) {
            throw new IllegalArgumentException("Invalid salary value for secretary");
        }
        super.setSalary(salary);
    }

    public final void doProgramming() {
        System.out.println("DOING CODING");
    }
}
