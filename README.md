 # example_roulette
-Program to refactor that plays a game of roulette

Steven Katsohirakis: sck13
Matt Battles: mjb81

1. We removed the two methods, placeBet and betIsMade, from the Game class and made them abstract methods in the Bet class. That way, each subclass of Bet uniquely implemented this method instead of using a conditional and having all of the logic within the Game class.

2. This refactoring is more complex because we have more classes.

3. We had more classes and methods total, but we don't believe we lost any efficiency from this.

4. Our new code is far superior because it has less if statements and more specific classes, making it more readable. 