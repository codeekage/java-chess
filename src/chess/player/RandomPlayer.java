/**
 * 
 */
package chess.player;

import java.util.ArrayList;
import java.util.Random;


import chess.Move;
import chess.Board;

/**
 * @author Gunnar Atli
 *
 */
public class RandomPlayer extends Player {
	Random rand;
	
	/**
	 * @param color
	 */
	public RandomPlayer(boolean color) {
		super(color);
		rand = new Random();
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
		int k = rand.nextInt(n);
		//k = 1; // TODO remove
		return moves.get(k);
	}

}
