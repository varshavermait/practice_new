package game;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import api.AIEngine;
import api.GameEngine;
import api.RuleEngine;

public class GamePlayTest {

	AIEngine aiEngine;
	GameEngine gameEngine;
	RuleEngine ruleEngine;
	
	@Before
	public void setup() {
		aiEngine = new AIEngine();
		ruleEngine = new RuleEngine();
		gameEngine = new GameEngine();
	}
	
	
	@Test
	public void play() {
		Board board = gameEngine.startGame("TicTacToe");
	
		Assert.assertTrue(!ruleEngine.isComplete(board).isCompleted());
		Assert.assertEquals(ruleEngine.isComplete(board).getWinnerSymbol(), 1);
	}
	
	@Test
	public void playGame() {
		Board board = gameEngine.startGame("TicTacToe");
	
		Assert.assertTrue(!ruleEngine.isComplete(board).isCompleted());
	}
}
