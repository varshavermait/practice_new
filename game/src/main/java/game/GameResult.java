package game;

public class GameResult {
	private boolean isCompleted;
	private int winnerSymbol;
	
	public GameResult() {
		super();
	}
	public GameResult(boolean isCompleted, int winnerSymbol) {
		super();
		this.isCompleted = isCompleted;
		this.winnerSymbol = winnerSymbol;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public int getWinnerSymbol() {
		return winnerSymbol;
	}
	public void setWinnerSymbol(int winnerSymbol) {
		this.winnerSymbol = winnerSymbol;
	}
	
	
}
