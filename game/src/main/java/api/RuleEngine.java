package api;

import board.TicTacBoard;
import game.Board;
import game.GameResult;

public class RuleEngine {
	
	public GameResult isComplete(Board board) {
		if(((TicTacBoard)board).getBoard()[1][1] != 0) 
			return new GameResult(true, 2);
		else
			return new GameResult(false, 2);
	}
}
