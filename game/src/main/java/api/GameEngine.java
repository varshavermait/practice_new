package api;

import board.TicTacBoard;
import game.Board;
import game.Move;

public class GameEngine {
	public static final int BOARD_SIZE = 3;
	
	public Board startGame(String name) {
		if(name.equals("TicTacToe"))
		{
			return new TicTacBoard(BOARD_SIZE);
		}
		return null;
	}
	
	public void playMove(Move move, Board board) {
		board.move(board, move);
	}
	
}
