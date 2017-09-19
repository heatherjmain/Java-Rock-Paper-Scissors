package com.example.heather.javarockpaperscissors;

import java.util.ArrayList;

/**
 * Created by heather on 19/09/2017.
 */

public class ComputerPlayer {
    ArrayList<String> options;
    NumberGenerating numberGenerator;

    public ComputerPlayer() {
        this.options = new ArrayList<>();
        numberGenerator = new RandomNumberGenerator();
    }


    public String computerPlay(){
        options.add("Rock");
        options.add("Paper");
        options.add("Scissors");
        return options.get(numberGenerator.generateNumber(options.size()));
    }

}
