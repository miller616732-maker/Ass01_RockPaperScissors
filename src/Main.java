import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aMove;
        String bMove;
        boolean bigValid = false;
        boolean aValid = false;
        boolean bValid = false;
        do {
            do {
                aMove = scan.nextLine();
                if (aMove.equalsIgnoreCase("r")) {
                    System.out.println("Player A has chosen");
                    aValid = true;
                } else if (aMove.equalsIgnoreCase("p")) {
                    System.out.println("Player A has chosen");
                    aValid = true;
                } else if (aMove.equalsIgnoreCase("s")) {
                    System.out.println("Player A has chosen");
                    aValid = true;
                }
            } while (!aValid);
            do {
                bMove = scan.nextLine();
                if (bMove.equalsIgnoreCase("r")) {
                    System.out.println("Player B has chosen");
                    bValid = true;
                } else if (bMove.equalsIgnoreCase("p")) {
                    System.out.println("Player B has chosen");
                    bValid = true;
                } else if (bMove.equalsIgnoreCase("s")) {
                    System.out.println("Player B has chosen");
                    bValid = true;
                }
            } while (!bValid);
            do {
            } while ();
        }
    }
}