package ver1;

import java.util.Arrays;

public class GameStart {

    //StartGame
    static int score = 0;
    static int keyCode = 0;
    static int cntKeys = 9; //1~9
    static int[] status = new int[cntKeys];

    //Goods
    static int cntPress = 0;


    GameStart(){
//        7 = 55 8 = 56 9 = 57
//        4 = 52 5 = 53 6 = 54
//        1 = 49 2 = 50 3 = 51

        Arrays.fill(status, 0); //initializing
        for (int i = 0; i < cntKeys; i++) {
            System.out.println("status["+i+"]: "+status[i]);
        }

        //if (keyCode!=50 &&  keyCode!=58) {
        System.out.println("status 1 2 3 4 5 6 ");
        // }
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
}
