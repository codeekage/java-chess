/**
 * 
 */
package chess.player;

import java.util.ArrayList;


import chess.Move;
import chess.Board;

/**
 * @author Gunnar Atli
 *
 */
public class DeterministicPlayer extends Player {
	int count;
	
	
	/**
	 * @param color
	 */
	public DeterministicPlayer(boolean color) {
		super(color);
		count = 0;
	}


	/**
	 * Function to prompt the player to make a move after the first move has
	 * already been made
	 * 
	 * @param b
	 *            the board to parse
	 * @return the selected move
	 */
	public Move getNextMove(Board b) {
		ArrayList<Move> moves = b.getMoves(color);
		int n = moves.size();
		
		if(n == 0)
			return null;

		count++;
		return moves.get(count % n);
	}

}
