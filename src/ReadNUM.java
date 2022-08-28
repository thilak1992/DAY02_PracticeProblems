import java.util.Scanner;  //importing Scanner class

public class ReadNUM {
    public static void main(String[] args) {

        System.out.print("Enter Single digit number :");
        Scanner x = new Scanner(System.in);
        int Num = x.nextInt();

        if(Num == 1) {
            System.out.print("one");
        }else if(Num == 2) {
            System.out.print("Two");
        }else if(Num == 3) {
            System.out.print("Three");
        }else if(Num == 4) {
            System.out.print("Four");
        }else if(Num == 5) {
            System.out.print("Five");
        }else if(Num == 6) {
            System.out.print("Six");
        }else if(Num == 7) {
            System.out.print("Seven");
        }else if(Num == 8) {
            System.out.print("Eight");
        }else if(Num == 9) {
            System.out.print("Nine");
        }else {
            System.out.println("Enter only Single Digit Number ...");

        }


    }
}
