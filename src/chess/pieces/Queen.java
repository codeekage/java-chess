/**
 * 
 */
package chess.pieces;

import java.util.ArrayList;

import chess.Board;
import chess.Move;

/**
 * @author Gunnar Atli
 *
 */
public class Queen extends Piece {

	/**
	 * 
	 */
	public Queen(boolean color) {
		super(color);
		value = 8;
	}

	public String toString() {
		if(color == Piece.WHITE)
			return "Q";
		else
			return "q";
	}
	
	public Queen clone() {
		return new Queen(color);
	}
	
	public ArrayList<Move> getMoves(Board b, int x, int y) {
		ArrayList<Move> moves = new ArrayList<Move>();
		
		// up
		for(int i = 1; i < 8; i++) {
			if(valid(x, y+i)) {
				if(b.getTile(x, y+i).isOccupied()) {
					if(b.getTile(x, y+i).getPiece().color != color)
						moves.add(new Move(x,y,x,y+i));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x,y+i));	
			}
		}
		
		// down
		for(int i = 1; i < 8; i++) {
			if(valid(x, y-i)) {
				if(b.getTile(x, y-i).isOccupied()) {
					if(b.getTile(x, y-i).getPiece().color != color)
						moves.add(new Move(x,y,x,y-i));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x,y-i));	
			}
		}
		
		// left
		for(int i = 1; i < 8; i++) {
			if(valid(x-i, y)) {
				if(b.getTile(x-i, y).isOccupied()) {
					if(b.getTile(x-i, y).getPiece().color != color)
						moves.add(new Move(x,y,x-i,y));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x-i,y));	
			}
		}
		
		// right
		for(int i = 1; i < 8; i++) {
			if(valid(x+i, y)) {
				if(b.getTile(x+i, y).isOccupied()) {
					if(b.getTile(x+i, y).getPiece().color != color)
						moves.add(new Move(x,y,x+i,y));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x+i,y));	
			}
		}
		
		// NE
		for(int i = 1; i < 8; i++) {
			if(valid(x+i, y+i)) {
				if(b.getTile(x+i, y+i).isOccupied()) {
					if(b.getTile(x+i, y+i).getPiece().color != color)
						moves.add(new Move(x,y,x+i,y+i));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x+i,y+i));	
			}
		}
		
		// NW
		for(int i = 1; i < 8; i++) {
			if(valid(x-i, y+i)) {
				if(b.getTile(x-i, y+i).isOccupied()) {
					if(b.getTile(x-i, y+i).getPiece().color != color)
						moves.add(new Move(x,y,x-i,y+i));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x-i,y+i));	
			}
		}
		
		// SE
		for(int i = 1; i < 8; i++) {
			if(valid(x+i, y-i)) {
				if(b.getTile(x+i, y-i).isOccupied()) {
					if(b.getTile(x+i, y-i).getPiece().color != color)
						moves.add(new Move(x,y,x+i,y-i));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x+i,y-i));	
			}
		}
		
		// SW
		for(int i = 1; i < 8; i++) {
			if(valid(x-i, y-i)) {
				if(b.getTile(x-i, y-i).isOccupied()) {
					if(b.getTile(x-i, y-i).getPiece().color != color)
						moves.add(new Move(x,y,x-i,y-i));	
					
					break;
				}
				else
					moves.add(new Move(x,y,x-i,y-i));	
			}
		}
		
		return moves;
	}
}
