package roulette;

import util.ConsoleReader;

public class ThreeInARow extends Bet{

	public ThreeInARow() {
		super("Three in a row", 11);
	}

	@Override
	public String placeBet() {
		System.out.println();
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMade(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
