package com.example.heather.javarockpaperscissors;

/**
 * Created by heather on 19/09/2017.
 */

public class Runner {
    public static void main(String[] args){

        NumberGenerating random = new RandomNumberGenerator();

        ComputerPlayer computer = new ComputerPlayer();

        System.out.println(computer.computerPlay());

//        String result = RockPaperScissors.playGame("rock", computer.computerPlay());
//        System.out.println(random.generateNumber(3));

    }
}
