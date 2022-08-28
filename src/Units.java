import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        System.out.print("Enter a numer from (1,10,100,1000) : ");
        Scanner x = new Scanner(System.in);
        int Num = x.nextInt();

        if (Num == 1) {
            System.out.print("unit");
        }else if (Num == 10) {
            System.out.print("TEN");
        }else if (Num == 100) {
            System.out.print("HUNDRED");
        }else if (Num == 1000) {
            System.out.print("THOUSAND");
        }else {
            System.out.print("Enter a Number from (1,10,100,1000)");
        }
    }
}
