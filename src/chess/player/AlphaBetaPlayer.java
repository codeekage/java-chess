/**
 * 
 */
package chess.player;


import chess.Move;
import chess.Board;
import chess.player.Player;
import chess.minimax.*;

/**
 * @author Gunnar Atli
 *
 */
public class AlphaBetaPlayer extends Player {
	MinimaxAlphaBeta minimax;
	
	/**
	 * @param color
	 */
	public AlphaBetaPlayer(boolean color, int maxDepth) {
		super(color);
		minimax = new MinimaxAlphaBeta(color, maxDepth);
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
		Move move = minimax.decision(b);
		return move;
	}

}
