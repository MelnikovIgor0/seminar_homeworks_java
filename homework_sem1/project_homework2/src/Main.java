import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner inputStream = new Scanner( System.in );
        n = inputStream.nextInt();
        int[] fibs = new int[n + 1];
        if (n >= 0) {
            fibs[0] = 0;
        }
        if (n >= 1) {
            fibs[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        System.out.println(fibs[n]);
    }
}