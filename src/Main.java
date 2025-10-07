import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aMove;
        String bMove;
        String yOrn;
        boolean doContinue = false;
        boolean aValid;
        boolean bValid;
        boolean bigValid = false;
        do {
            System.out.println("Welcome to Rock Paper Scissors");
            System.out.println("Player A, please enter r, p, or s");
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
                } else {
                    System.out.println("Enter a valid input");
                    aValid = false;
                }
            } while (!aValid);
            System.out.println("Player B, please enter r, p, or s");
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
                } else {
                    System.out.println("Enter a valid input");
                    bValid = false;
                }
            } while (!bValid);
            if (aMove.equalsIgnoreCase("r")) {
                if (bMove.equalsIgnoreCase("r")) {
                    System.out.println("Both players played rock: Tie");
                }
                else if (bMove.equalsIgnoreCase("p")) {
                    System.out.println("A played rock, B played paper: B Wins");
                }
                else if (bMove.equalsIgnoreCase("s")) {
                    System.out.println("A played rock, B played scissors: A wins");
                }
                else {
                    System.out.println("Enter a valid input");
                }
            } else if (aMove.equalsIgnoreCase("p")) {
                if (bMove.equalsIgnoreCase("r")) {
                    System.out.println("A played paper, B played rock: A wins");
                }
                else if (bMove.equalsIgnoreCase("p")) {
                    System.out.println("Both players played paper: Tie");
                }
                else if (bMove.equalsIgnoreCase("s")) {
                    System.out.println("A played paper, B played scissors: B wins");
                }
                else {
                    System.out.println("Enter a valid input");
                }
            } else if (aMove.equalsIgnoreCase("s")) {
                    if (bMove.equalsIgnoreCase("r")) {
                        System.out.println("A played scissors, B played rock: B wins");
                    }
                    else if (bMove.equalsIgnoreCase("p")) {
                        System.out.println("A played scissors, B played paper: A Wins");
                    }
                    else if (bMove.equalsIgnoreCase("s")) {
                        System.out.println("Both players played scissors: Tie");
                    }
                    else {
                        System.out.println("Enter a valid input");
                    }
            } else {
                System.out.println("Enter a valid input");
            }
            System.out.println("Continue? [Y/N]");
            do {
                yOrn = scan.nextLine();
                if (yOrn.equalsIgnoreCase("y")) {
                    System.out.println("Starting new game");
                    doContinue = true;
                } else if (yOrn.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for playing");
                    scan.nextLine();
                    doContinue = true;
                    bigValid = true;
                } else {
                    System.out.println("Enter a valid input");
                }
            } while (!doContinue);
        }while (!bigValid);
    }
}