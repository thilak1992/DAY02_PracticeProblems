import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){
        System.out.print("Enter any Alphabet(A to Z): ");
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);

        switch (alp) {
            case 'a' :
                System.out.println("It is a vowel");
                break;
            case 'e' :
                System.out.println("It is a vowel");
                break;
            case 'i' :
                System.out.println("It is a vowel");
                break;
            case 'o' :
                System.out.println("It is a vowel");
                break;
            default :
                System.out.println("It is a consonent");

        }

    }
}
