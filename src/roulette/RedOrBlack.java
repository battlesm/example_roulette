package roulette;

import util.ConsoleReader;

public class RedOrBlack extends Bet{
	public RedOrBlack(){
		super("Red or Black", 1);
	}

	@Override
	public String placeBet() {
		System.out.println();
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean betIsMade(Wheel wheel, String betChoice) {
		// TODO Auto-generated method stub
		return wheel.getColor().equals(betChoice);
	}

}
