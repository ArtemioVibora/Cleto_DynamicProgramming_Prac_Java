import java.util.Arrays;

public class memoizationFibDP {

    //memoization is a caching technique used in computer programming
    //to optimize by storing the results of expensive function calls and
    //resulting them when the same inputs occur again

    //TO DO: caching
    //TO DO: Top Down

    static int[] memo; //Memoization top down

    static int fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }

        if (memo[n] != -1)
        {
            return memo[n];
        }

        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 3;

        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        System.out.println("fib(" + n + ") = " + fib(n));
    }
}
