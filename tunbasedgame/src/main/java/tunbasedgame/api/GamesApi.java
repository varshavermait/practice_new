package tunbasedgame.api;

import tunbasedgame.game.Board;
import tunbasedgame.game.GameResult;
import tunbasedgame.game.Move;
import tunbasedgame.game.Player;

public class GamesApi {
	public Board start() {
		return new Board(3);
	}
	
	public void move(Board board, Move move, Player player)
	{
		board.playMove(move, player.getSymbol());
	}
	
	public GameResult isCompleted(Board board) {
		GameResult gr = new GameResult();
		gr.setCompleted(false);
		
		boolean rowMatched = true;
		// check for rows
		for(int i=0; i< board.getBoard().length; i++)
		{
			Character firstChar = board.getBoard()[i][0];
			if(!rowMatched && firstChar != null)
			{
				for(int j=1; j< board.getBoard().length; j++)
				{
					if(firstChar != board.getBoard()[i][j])
					{
						rowMatched = false;
						break;
					}
				}	
			}
		}
		
		boolean colMatched = true;
		// check for cols
		for(int i=0; i< board.getBoard().length; i++)
		{
			Character firstChar = board.getBoard()[i][0];
			if(firstChar != null)
			{
				for(int j=1; j< board.getBoard().length; j++)
				{
					if(firstChar != board.getBoard()[i][j])
					{
						colMatched = false;
						break;
					}
				}	
			}
		}
		return gr;
	}
}
