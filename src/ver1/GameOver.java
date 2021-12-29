package ver1;

import java.util.Scanner;

public class GameOver {

    Scanner sc = new Scanner(System.in);

    GameOver() {
        System.out.println("");
        System.out.println("GameOver");
        System.out.println("");
        System.out.println("Continue?");
        System.out.println("1.Yes  2.No");
        System.out.println("");
        System.out.print("your input > ");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                new GameStart();
                break;
            case 2:
                new GameMenu();
                break;
            default:
                System.out.println("Please enter input again");
        }
    }
}
