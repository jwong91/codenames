package card;

public abstract class Card {
	private String word;
	private CardType type;
	private boolean clicked;

	public abstract GuessResult onClicked();

	public Card()
}
