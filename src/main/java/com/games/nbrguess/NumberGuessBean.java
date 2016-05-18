package com.games.nbrguess;

public class NumberGuessBean {

	private int lowerLimit;
    private int upperLimit;
    private String inputStr;
    private int randomNumber;

    
    public NumberGuessBean( int lowerLimit, int upperLimit){
    	this.lowerLimit = lowerLimit;
    	this.upperLimit = upperLimit;
    }
    
    
	public int getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}


	public int getRandomNumber() {
		return randomNumber;
	}


	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

    
    
    
}
