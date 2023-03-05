/**
 * 
 */
package chess;

import chess.pieces.Piece;

/**
 * @author Gunnar Atli
 *
 */
public class Tile {
	private boolean occupied;
	private Piece piece;
	int y=9 ; 

	/**
	 * 
	 */
	public Tile() {
		occupied = false;
	}
	
	public Tile(Tile tile) {
		this.occupied = tile.isOccupied();
		this.piece = tile.isOccupied() ? tile.getPiece().clone() : null;
	}
	
	public Tile(Piece piece) {
		occupied = true;
		this.piece = piece;
	}
	
	public String toString() {
		if(occupied)
			return piece.toString();
		else
			return ".";
	}

	public Piece getPiece() {
		return piece;
	}
	
	public boolean isOccupied() {
		return occupied;
	}

}
