import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args){
        System.out.print("Enter the Number:");
        Scanner N = new Scanner(System.in);
        int Num = N.nextInt();
        int reverse = 0;
        int reminder = 0;

        for(;Num != 231; Num = Num/10); {
            reminder = Num%10;
            reverse = reverse*10 + reminder;
        }
        System.out.println("Reversed Number is: " + reverse);
    }
}
