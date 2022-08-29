import java.util.Scanner;

public class SumOfNaturalN {
    public static void main(String[] args){
        System.out.print("Enter Number :");
        Scanner N = new Scanner(System.in);
        int Num = N.nextInt();
        int sum = 0;

        for(int i=1; i<=Num; i++){
            sum += i;
        }
        System.out.print("Sum of " +Num +" Natural Number is " + sum);
    }
}
