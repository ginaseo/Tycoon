import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel {

    TycoonGame tg = new TycoonGame();
    Scanner sc = new Scanner(System.in);

    //TIMER
    static int count = 100;
    static int level = 10;

    //STARTGAME
    static int score = 0;
    static int keyCode = 0;
    static int cntKeys = 9;
    static int[] status = new int[cntKeys];
    //GOODS
    static int cntPress = 0;

    //PANEL
    static final int screen_width = 600;
    static final int screen_height = 600;
    static final int unit_size = 25;
    static final int game_units = (screen_width * screen_height) / unit_size;
    static final int delay = 75;
    final int x[] = new int[game_units];
    final int y[] = new int[game_units];

    //startGame();

    void gameOver() {
        System.out.println("GameOver");
        System.out.println("");
        System.out.println("Continue?");
        System.out.println("1.Yes  2.No");
        System.out.println("");
        System.out.print("your input > ");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                startGame();
                break;
            case 2:
                String[] args = null;
                TycoonGame.main(args);
                break;
            default:
                System.out.println("Please enter input again");
        }
    }

    void timer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (count != 0) {
                    //System.out.println("timer:" + count);
                    count -= level;
                } else {
                    timer.cancel();
                    gameOver();
                }
            }
        };
        timer.schedule(task, 1000, 1000);  //Initial 1000 1000
    }

    void goods() {
        // status 1:put dough 2:added red beans 3:flipped it over 4:cooked 5:well-cooked 6:displayed
        switch (cntPress){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                //status[];

        }
    }

    void startGame() {
//        7 = 55 8 = 56 9 = 57
//        4 = 52 5 = 53 6 = 54
//        1 = 49 2 = 50 3 = 51

        Arrays.fill(status, 0); //initializing
        for (int i = 0; i < cntKeys; i++) {
            System.out.println("status["+i+"]: "+status[i]);
        }
        timer();


        //if (keyCode!=50 &&  keyCode!=58) {
            System.out.println("status 1 2 3 4 5 6 ");
       // }


        }

    }

