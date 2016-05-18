package com.games.nbrguess;

public class NumberGuessBinarySearch {

	private static final String LOWER_NUM = "lower";
	private static final String HIGHER_NUM = "higher";

	/**
	 * This method will perform binary search using upper and lower bound
	 * @param numberGuessBean
	 * @return
	 */
	public NumberGuessBean getNextGuess(NumberGuessBean numberGuessBean){
		 
		int randomNum = ((numberGuessBean.getUpperLimit() - numberGuessBean.getLowerLimit()) / 2) + numberGuessBean.getLowerLimit();
		numberGuessBean.setRandomNumber(randomNum);
	
		return numberGuessBean;
	}

	/**
	 * This method will set the upper and lower bound for binary search based on user input
	 * @param numberGuessBean
	 * @return
	 */
	public NumberGuessBean setLimit(NumberGuessBean numberGuessBean){
		if(numberGuessBean.getInputStr().equalsIgnoreCase(LOWER_NUM)) {  
			numberGuessBean.setUpperLimit(numberGuessBean.getRandomNumber()); // set the upper limit while lowering guess
	    } else if(numberGuessBean.getInputStr().equalsIgnoreCase(HIGHER_NUM)) { 
	    	numberGuessBean.setLowerLimit(numberGuessBean.getRandomNumber());  // set the lower limit while increasing guess
	    } 
		return numberGuessBean;
	}
}
