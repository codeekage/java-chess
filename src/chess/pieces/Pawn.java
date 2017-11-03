/**
 * 
 */
package chess.pieces;

import chess.Board;
import chess.Move;
import java.util.ArrayList;

/**
 * @author Gunnar Atli 
 *
 */
public class Pawn extends Piece {

	/**
	 * 
	 */
	public Pawn(boolean color) {
		super(color);
		value = 1;
	}
	
	public Pawn clone() {
		return new Pawn(color);
	}

	public String toString() {
		if(color == Piece.WHITE)
			return "P";
		else
			return "p";
	}
	
	/**
	 * @param b Board
	 * @param x x location of piece
	 * @param y y location of piece
	 * @return
	 */
	public ArrayList<Move> getMoves(Board b, int x, int y) {
		ArrayList<Move> moves = new ArrayList<Move>();
		
		if(color == Piece.WHITE) {
			// forward
			if(valid(x,y+1) && !b.getTile(x, y+1).isOccupied())
				moves.add(new Move(x,y,x,y+1));
			
			// kill diagonally
			if(valid(x+1,y+1) && b.getTile(x+1, y+1).isOccupied() && b.getTile(x+1, y+1).getPiece().getColor() != color)
				moves.add(new Move(x,y,x+1,y+1));
			
			// kill diagonally
			if(valid(x-1,y+1) && b.getTile(x-1, y+1).isOccupied() && b.getTile(x-1, y+1).getPiece().getColor() != color)
				moves.add(new Move(x,y,x-1,y+1));
		}
		else {
			// forward
			if(valid(x,y-1) && !b.getTile(x, y-1).isOccupied())
				moves.add(new Move(x,y,x,y-1));
			
			// kill diagonally
			if(valid(x+1,y-1) && b.getTile(x+1, y-1).isOccupied() && b.getTile(x+1, y-1).getPiece().getColor() != color)
				moves.add(new Move(x,y,x+1,y-1));
			
			// kill diagonally
			if(valid(x-1,y-1) && b.getTile(x-1, y-1).isOccupied() && b.getTile(x-1, y-1).getPiece().getColor() != color)
				moves.add(new Move(x,y,x-1,y-1));
		}
		
		return moves;
	}
}
