package Functions;

public class class_5 {

    // function to calculate sum of two numbers

    public static int sum (int a, int b) {
        return a + b;
    }

    // function to calculate three number

    public static int sum (int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 6, 4));
    }
}
