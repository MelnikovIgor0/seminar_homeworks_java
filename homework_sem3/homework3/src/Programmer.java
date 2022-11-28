import java.lang.String;

public final class Programmer extends Employee implements Gradable {
    private String ProgrammingLanguage;

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    private int currentGrade = 0;

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

    public int getGrade() {
        return currentGrade;
    }

    public void addGrade(int addGrade) {
        if (addGrade < 0) {
            setSalary(0);
            System.out.println("woeker fired!!!");
            return;
        }
        if (addGrade > 5) {
            throw new IllegalArgumentException("wrong adding value");
        }
        setSalary(getSalary() + 10 * addGrade);
        currentGrade += addGrade;
        System.out.println("Grade updated, new grade: " + Integer.toString(currentGrade));
    }
}
