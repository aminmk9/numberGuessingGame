# numberGuessingGame

***** Welcome to Number Guessing Game *****

Player has to think number in his mind and computer will try to guess based on the input(higher, lower, yes) from user. This program will use the Binary Search Pattern, it will start by guessing middle number and then searches either side depends on the input.
At the start of the game player has to select upper limit number, and the lower limit is defaulted to 1. 
Please type 'yes' once computer guesses correct.
Player can terminate game any time by typing 'end'


Pre Requisites : JDK 1.7.0 and Maven 3.3.9

mvn install
java -cp target\NumberGuessingGame-0.0.1-SNAPSHOT.jar com.games.nbrguess.NumberGuessingGame
