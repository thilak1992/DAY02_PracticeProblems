
public class SpringSeason {
    public static void main(String[] args){
        System.out.println(args[0] + " " + args[1]);
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int day = 0;


        switch (m) {
            case 1:
                day = 31 + 28 + d;
                if (day >= 79 && day <= 171) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
                break;
            case 2:
                day = 31 + 28 + 31 + d;
                if (day >= 79 && day <= 171) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
                break;
            case 3:
                day = 31 + 28 + 31 + 30 + d;
                if (day >= 79 && day <= 171) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
                break;
            case 4:
                day = 31 + 28 + 31 + 30 + 31 + d;
                if (day >= 79 && day <= 171) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
                break;
            default:
                System.out.print("False");



        }


    }

}
