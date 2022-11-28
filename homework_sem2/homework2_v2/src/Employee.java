import java.lang.String;

public abstract class Employee {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 20) {
            throw new IllegalArgumentException("Invalid format of name");
        }
        this.Name = name;
    }

    private int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        if (salary <= 0 || salary > 10000000) {
            throw new IllegalArgumentException("Invalid salary value");
        }
        Salary = salary;
    }

    private int Money;

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public Employee(String name, int salary) {
        setName(name);
        setSalary(salary);
        Money = 0;
    }

    public void DoTask(String workkind) {
        if (getSalary() == 0) {
            throw new IllegalArgumentException(getName() + " is fired!");
        }
        System.out.println("Doing task: " + workkind);
        for (int i = 0; i < 100; i++) {
            System.out.print(".");
        }
        System.out.println("\nTask done!!!");
    }

    public void EarnSalary() {
        if (getSalary() == 0) {
            throw new IllegalArgumentException(getName() + " is fired!");
        }
        System.out.println("Earned salary");
        setMoney(getMoney() + getSalary());
    }

    public final void fire() {
        System.out.println(getName() + " fired");
        Salary = 0;
    }

    public void SayHi() {
        System.out.println("Hi, I'm employee " + getName());
    }
}
