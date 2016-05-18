package com.games.nbrguess;


import java.util.Scanner;

/**
 * Number Guessing Game
 * Player has to think number in his mind and computer will try to guess based on the input(higher, lower, yes) from user. 
 * Player can terminate game any time by typing 'end'.
 * @author Miral Amin
 *
 */
public class NumberGuessingGame {

	private static final String CORRECT_GUESS = "yes";
	private static final String END_PROG = "end";
	
	
	/**
	 * This method will guess the number using Binary Search pattern based on the user input higher/lower.
	 * 
	 */
	public void beginGame() {
		
		Scanner input = new Scanner(System.in);
	    int lowerLimit = 1;
	    int fixedLowerLimit = 1;
	    int upperLimit,selectedUpperLimit;
	    
	    String inputStr = "";
	    int cnt = 0;
	    boolean isEnded = false;
	    
	    try{
		    System.out.println("********* WELCOME TO NUMBER GUESSING GAME ********* \n ");
		    System.out.println("***** Input if number should be 'higher'/'lower' or 'yes' if guess is correct or 'end' to exit out of the game *****\n ");
		    System.out.println("Please select the upper limit (positive numbers only e.g. 100, 500, 1000..) before starting game (lower limit is 1):");
		    
		    selectedUpperLimit = upperLimit = input.nextInt();
		    System.out.println("Your guess must be between 1 and "+upperLimit+".\n");
		    upperLimit++;
		    
	        NumberGuessBean numberGuessBean = new NumberGuessBean(lowerLimit, upperLimit);
		    NumberGuessBinarySearch binarySearch = new NumberGuessBinarySearch();
		    
		    while(!inputStr.equalsIgnoreCase(CORRECT_GUESS)) {

		        numberGuessBean = binarySearch.getNextGuess(numberGuessBean);
		    	System.out.println("I think it's " + numberGuessBean.getRandomNumber() +", (Input if number should be higher, lower, yes or end)");
		        inputStr = input.next();   
		        numberGuessBean.setInputStr(inputStr);
		        numberGuessBean = binarySearch.setLimit(numberGuessBean);

		        if(inputStr.equalsIgnoreCase(END_PROG)){
		        	isEnded = true;
		        	break;  
		        } 
		        // below conditions condition will check the highest/lowest limit in case user continues to ask higher/lower once they reach to limit. 
		        if(selectedUpperLimit == numberGuessBean.getRandomNumber() && !inputStr.equalsIgnoreCase(CORRECT_GUESS)){
		        	System.out.println("You have reached to Upper Limit "+selectedUpperLimit+", your guess must be between 1 and "+selectedUpperLimit+".\n");
		        	break;
		        } else if(fixedLowerLimit == numberGuessBean.getRandomNumber() && !inputStr.equalsIgnoreCase(CORRECT_GUESS)){
		        	System.out.println("You have reached to Lower Limit 1, your guess must be between 1 and "+selectedUpperLimit+".\n");
		        	break;
		        }
		        cnt++;
		    }
		    
		    if(!isEnded) {
		    	System.out.println("Answer is "+numberGuessBean.getRandomNumber() + ", computer took only "+cnt+" tries!!!!!");
		    } else {
		    	System.out.println("Game has been eneded, thank you for playing Number Guessing Game!!");
		    }
		    
		 //We need to put specific or custom exception class instead of generic exception 
	    }catch(Exception e){
	    	System.out.println("Error Occured, please make sure you enter valid data!!");
    		restartGame();
	    } finally{
	    	if(input!=null)
	    		input.close();
	    }
    	
	}
	
	/**
	 * This method will give option to player to play the game again if use enters Y it will call beginGame() method to start game.
	 */
	public void restartGame(){
		System.out.println("Would you like to play again? Plese enter Y or N:");
        Scanner scanner = new Scanner(System.in);
        String restartInd = scanner.next();
        if (restartInd.equalsIgnoreCase("Y")) {
        	beginGame();
        } else {
            System.out.println("Thank you for playing Number Guessing Game!!");
        }
        if(scanner!=null)
        	scanner.close();
	}
	
	
	public static void main(String[] args) {
		NumberGuessingGame nbrGuess = new NumberGuessingGame();
		nbrGuess.beginGame();
	}
}