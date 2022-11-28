import java.lang.String;

public class Main
{
    public static void main(String[] args)
    {
        Manager bob = new Manager("Bob", 5000);
        System.out.println(bob.getMoney());
        bob.DoTask("do manager's deals");
        System.out.println(bob.getMoney());
        bob.earnSalary();
        System.out.println(bob.getMoney());

        if (bob instanceof Gradable) {
            System.out.println("manager is gradable");
        } else {
            System.out.println("manager is not gradable");
        }

        Executive john = new Executive("John", 10000);
        if (john instanceof Gradable) {
            System.out.println("executive is gradable");
        } else {
            System.out.println("executive is not gradable");
        }

        Programmer david = new Programmer("David", 20000, "java;c#");
        if (david instanceof Gradable) {
            System.out.println("programmer is gradable");
        } else {
            System.out.println("programmer is not gradable");
        }
        System.out.println(Integer.toString(david.getGrade()) + " " + Integer.toString(david.getSalary()));
        david.addGrade(5);
        System.out.println(Integer.toString(david.getGrade()) + " " + Integer.toString(david.getSalary()));

        /*Secretary william = new Secretary("William", 3000);
        if (william instanceof Gradable) {
            System.out.println("secretary is gradable");
        } else {
            System.out.println("secretary is not gradable");
        }*/ // there's CE because Secretary does not realize interface 'Gradable'
    }
}