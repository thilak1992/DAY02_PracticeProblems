import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args){
        System.out.print("Enter the Number : ");
        Scanner N = new Scanner(System.in);
        int Num = N.nextInt();
        int number = Num;
        int reverse = 0;
        int remainder = 0;

                for(;Num !=0; Num = Num/10){
                    remainder = Num%10;
                    reverse = reverse*10 + remainder;
                }
        System.out.println("Number = " +number + " ReverseNum = " +reverse);
                if(number == reverse) {
                    System.out.println("It is Palindrome Number");
                }else  {
                    System.out.println("It is not a Palindrome Number");
                }
    }
}
