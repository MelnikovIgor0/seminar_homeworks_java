import java.lang.String;

public class Main
{
    public static void main(String[] args)
    {
        Manager bob = new Manager("Bob", 5000);
        System.out.println(bob.getMoney());
        bob.DoTask("do manager's deals");
        System.out.println(bob.getMoney());
        bob.getSalary();
        System.out.println(bob.getMoney());
    }
}