import java.lang.String;
import java.util.Random;

public final class Executive extends Manager {
    private int Cool;

    public int getCool() {
        return Cool;
    }

    private void setCool(int cool) {
        Cool = cool;
    }

    public Executive(String name, int salary) {
        super(name, salary);
        setCool(0);
    }

    public void SayHi() {
        System.out.println("Hi, I'm executive " + getName());
    }

    public final void setSalary(int salary) {
        if (salary <= 0 || salary > 500000) {
            throw new IllegalArgumentException("Invalid salary value for executive");
        }
        super.setSalary(salary);
    }

    public final void Execute() {
        System.out.println("DOING MANAGER'S DEALS");
    }

    public final void DoTask(String workkind) {
        super.DoTask(workkind);
        Random rnd = new Random(666);
        setCool(getCool() + rnd.nextInt() % 5 + 1);
    }
}
