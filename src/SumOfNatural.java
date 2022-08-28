import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args){
        System.out.print("Enter the Num:");
        Scanner n = new Scanner(System.in);
        int Num = n.nextInt();
        int sum = 0;
        int i = 1;


                while(i <= Num) {
                    sum += i;
                    i++;
                }
        System.out.print("Sum of " +Num + " Numbers is " +sum);
    }

}
