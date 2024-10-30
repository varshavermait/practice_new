package api;

import board.BoardCell;
import board.TicTacBoard;
import game.Board;

public class AIEngine {

	public BoardCell getSuggestedMove(Board board) {
		for (int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			for (int j = 0; j < GameEngine.BOARD_SIZE; j++) {
				if(((TicTacBoard)board).getBoard()[i][j] == 0) return new BoardCell(i, j);
			}
		}
		return new BoardCell();
	}
}
