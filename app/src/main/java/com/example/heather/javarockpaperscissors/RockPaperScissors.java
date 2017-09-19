package com.example.heather.javarockpaperscissors;

import android.widget.ImageView;

/**
 * Created by heather on 19/09/2017.
 */

public class RockPaperScissors {
    ComputerPlayer computerPlayer;



    public static String playGame(String playerChoice, String computerChoice){

        String playerWins = "Player Wins";

        if(playerChoice.equals(computerChoice)){
            return "Draw";
        }
        else if(playerChoice.equals("Paper") && computerChoice.equals("Rock") ){
            return playerWins;

        }
        else if(playerChoice.equals("Scissors") && computerChoice.equals("Paper")){
            return playerWins;

        }
        else if(playerChoice.equals("Rock") && computerChoice.equals("Scissors")){
            return playerWins;

        }
        else return "Computer Wins";
    }

}
