/**
 * Represents a board.
 *
 * @author Jason Wong
 * @author Emmy Truong
 */
public class Board {
    /** */
    private Card[][] cards;

    /** player */
    private Player player;

    public Board(Card[][] cards) {

    }


}

/* Rules for Codenames:
 - 5 x 5 grid
 - 9 green cards
 - 3 black cards
 - 13 white cards
 - 15 green cards between both players, 3 overlap
 - Max 9 turns
 - A player's black cards corresponds to the other's green, black, and white cards
 */
