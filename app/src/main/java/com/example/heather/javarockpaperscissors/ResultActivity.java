package com.example.heather.javarockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultTextBox;
    TextView computerHandText;
    TextView playerHandText;
    ComputerPlayer computerPlayer;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);

            resultTextBox = (TextView) findViewById(R.id.result_text_box);
            computerHandText = (TextView) findViewById(R.id.computer_hand_text);
            playerHandText = (TextView) findViewById(R.id.your_hand_text);

            Intent intent = getIntent();
            Bundle extras = intent.getExtras();

            computerPlayer = new ComputerPlayer();


            String playerChoice = extras.getString("playerChoice");
            String computerChoice = computerPlayer.computerPlay();
            String gameResult = RockPaperScissors.playGame(playerChoice, computerChoice);


            computerHandText.setText(computerChoice);
            playerHandText.setText(playerChoice);
            resultTextBox.setText(gameResult);


        }


}


