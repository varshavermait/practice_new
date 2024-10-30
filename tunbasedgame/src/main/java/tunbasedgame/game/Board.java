package tunbasedgame.game;

public class Board {
	private char[][] board;
	
	public Board(int size){
		this.board = new char[size][size];
	}
	
	public void playMove(Move move, char c) {
		board[move.getX()][move.getY()] = c;
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	
}
