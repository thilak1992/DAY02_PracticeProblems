import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        double root1;
        double root2;

        System.out.print("Enter the value of a : ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();

        System.out.print("Enter the value of b : ");
        Scanner B = new Scanner(System.in);
        b = B.nextInt();

        System.out.print("Enter the value of c : ");
        Scanner C = new Scanner(System.in);
        c = C.nextInt();

        // Calculating delta
        delta = b * b - 4 * a *c;
        System.out.println("Value of delta is : " + delta);

        //Check if delta is greater then 0
        if (delta > 0) {
            //two real and distinct roots
            root1 = (-b + Math.sqrt(delta)) / (2*a);
            root2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.format("Root1 = %.2f and Root2 = %.2f", root1, root2);
        }
        // check if delta is equal to 0
        else if (delta == 0) {
            //two real and equal roots
            //delta is equal to 0
            //so -b + 0 == -b
            root1 = root2 = -b / (2*a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        //if delta is less than zero
        else {
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
