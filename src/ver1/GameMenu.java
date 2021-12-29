package ver1;

import java.util.Scanner;

public class GameMenu {

        Scanner sc = new Scanner(System.in);

    GameMenu(){
        while (true) {
            System.out.println("");
            System.out.println("=== Bungeoppang Tycoon Game ===");
            System.out.println("1.StartGame");
            System.out.println("2.Manual");
            System.out.println("3.Options");
            System.out.println("4.Credits");
            System.out.println("5.ExitGame");
            System.out.println("===============================");
            System.out.println("");
            System.out.print("your input > ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("");
                    System.out.println("The game starts!");
                    new GameStart();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Manual");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Options");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Credits:ginaseo");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("The game will now exit.");
                    System.exit(0);
                default: //WRONG INPUT
                    System.out.println("");
                    System.out.println("Please enter a number less than 6");
                    System.out.println("");
            }

        }
    }
}