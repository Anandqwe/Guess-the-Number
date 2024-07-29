package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    private int guessedNo;
    private int noOfGuesses;
    private int randomGuess;

    public Game(){
        Random ra = new Random();
        this.randomGuess = ra.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number");
        guessedNo =  sc.nextInt();
    }

    public boolean isCorrectNumber(){
        noOfGuesses++;
        if (guessedNo>randomGuess){
            System.out.println("Think of a lesser Number");
            return false;
        }
        else if (guessedNo<randomGuess) {
            System.out.println("Think of a bigger Number");
            return false;
        }
        else {
            System.out.println("Your Guess is Correct");
            return true;
        }
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(){
        if (noOfGuesses==1){
            System.out.println("God Player");
        }
        else if (noOfGuesses<=3) {
            System.out.println("Pro player");
        }
        else if (noOfGuesses>3 && noOfGuesses<7) {
            System.out.println("Good player");
        }
        else {
            System.out.println("Nice try but can do better");
        }
    }
}
public class CWH_43_Exercise_3 {
    public static void main(String[] args) {
      /*
      Question:
      Create a class Game, which allows a user to play "Guess the Number" game once
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
        */

        Game player = new Game();
        boolean correct = false;
        while (!correct){
            player.takeUserInput();
            correct = player.isCorrectNumber();
        }
        System.out.println("You Guessed the number in "+player.getNoOfGuesses()+" attempts");
        player.setNoOfGuesses();
    }
}
