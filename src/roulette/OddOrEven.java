package roulette;

import util.ConsoleReader;

public class OddOrEven extends Bet{

	public OddOrEven() {
		super("Odd or even", 1);
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		System.out.println();
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean betIsMade(Wheel wheel, String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
