package board;

import game.Board;
import game.Move;

public class TicTacBoard implements Board{
	int[][] board;
	
	public TicTacBoard(int n){
		board = new int[3][3];
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public void move(Board board, Move move) {
		int row = move.getCell().getRow();
		int col = move.getCell().getCol();
		((TicTacBoard)board).getBoard()[row][col] = move.getPlayer().getSymbol();
	}
	
	
}
