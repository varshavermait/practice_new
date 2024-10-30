package game;

import board.BoardCell;

public class Move {
	private Player player;
	private BoardCell cell;
	
	public Move() {}
	
	public Move(int i, int j) {
		this.cell = new BoardCell(i, j);
	}
	
	public Move(int i, int j, Player p) {
		this.cell = new BoardCell(i, j);
		this.player = p;
	}

	public BoardCell getCell() {
		return cell;
	}

	public void setCell(BoardCell cell) {
		this.cell = cell;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
