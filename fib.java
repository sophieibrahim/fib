public class fib {

    // Fib using recursion
    static int fib(int n) {
        // Function calls on itself until n is less than 2 and adds up answers
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Fib using iterative function
    static int fibi(int n) {
        if (n < 2)
            return n;

        // In this case will go through for-loop to add itself instead of call instead of calling function
        int first = 1;
        int prev = 1;

        for(int i = 2; i < n; i++) {
            int temp = first;
            first+= prev;
            prev = temp;
        }
        return first;
    }
    public static void main(String args[]) {
        //int n = 9;

        System.out.println("Recursive");
        System.out.println(fibi(1));
        System.out.println(fibi(2));
        System.out.println(fibi(3));
        System.out.println(fibi(4));
        System.out.println(fibi(5));

        System.out.println("Iterative");
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
    }
}
