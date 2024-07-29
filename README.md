# Guess the Number Game

## Description

This is a simple Java console-based game where the user has to guess a randomly generated number between 0 and 99. The game gives feedback on whether the guessed number is too high or too low, and continues until the correct number is guessed. The game also provides a rating based on the number of attempts it took to guess the correct number.

## Features

1. *Random Number Generation:* A random number between 0 and 99 is generated when a new game instance is created.
2. *User Input:* The game takes user input for the guessed number.
3. *Feedback Mechanism:* The game provides feedback indicating whether the guessed number is higher or lower than the random number.
4. *Attempt Counter:* The game keeps track of the number of attempts made by the user.
5. *Performance Rating:* After guessing the correct number, the game provides a rating based on the number of attempts.

## How to Run

1. Compile the Code: Use a Java compiler to compile the CWH_43_Exercise_3.java file.
    sh
    javac CWH_43_Exercise_3.java
    
2. *Run the Program:* Run the compiled Java program.
    sh
    java com.company.CWH_43_Exercise_3
    

## Code Explanation

### Class: Game

- *Attributes:*
  - private int guessedNo; - Stores the user's guessed number.
  - private int noOfGuesses; - Stores the number of attempts made by the user.
  - private int randomGuess; - Stores the randomly generated number.

- *Constructor:*
  - public Game() - Generates a random number between 0 and 99 when a new instance of the game is created.

- *Methods:*
  - public void takeUserInput() - Takes user input for the guessed number.
  - public boolean isCorrectNumber() - Checks if the guessed number is correct and provides feedback. It also increments the number of attempts.
  - public int getNoOfGuesses() - Returns the number of attempts made by the user.
  - public void setNoOfGuesses() - Provides a performance rating based on the number of attempts.

### Main Class: CWH_43_Exercise_3

- The main method creates an instance of the Game class and runs a loop that continues to take user input and check if the guessed number is correct until the correct number is guessed. It then prints the number of attempts and the performance rating.

## Example


Guess the Number
50
Think of a lesser Number
Guess the Number
25
Think of a bigger Number
Guess the Number
30
Think of a bigger Number
Guess the Number
35
Your Guess is Correct
You Guessed the number in 4 attempts
Good player


In this example, the user took 4 attempts to guess the correct number and was rated as a "Good player".

## Author

Anand Krishna

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.

---

This README provides a basic overview of the "Guess the Number" game, instructions on how to compile and run the program, and a brief explanation of the code. Feel free to modify it according to your needs.
