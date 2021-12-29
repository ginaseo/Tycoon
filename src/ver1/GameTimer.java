package ver1;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {

    static int count = 100;
    static int level = 10;

    GameTimer(){

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (count != 0) {
                    //System.out.println("timer:" + count);
                    count -= level;
                } else {
                    timer.cancel();
                    new GameOver();
                }
            }
        };
        timer.schedule(task, 1000, 1000);  //Initial 1000 1000
    }
}
