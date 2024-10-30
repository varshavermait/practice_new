package api;

import java.util.Scanner;

import board.BoardCell;
import game.Board;
import game.GameResult;
import game.Move;
import game.Player;

public class Main {
	public static void main(String[] args) {
		System.out.println("Program starting...");
		GameEngine gs = new GameEngine();
		RuleEngine rs = new RuleEngine();
		AIEngine ar = new AIEngine();
		Scanner sc = new Scanner(System.in);
		//decide player
		Player p = new Player(1);
		Player system = new Player(2);
		
		// start game
		Board board = gs.startGame("TicTacToe");
		
		while(!rs.isComplete(board).isCompleted()) {
			System.out.println("This is your turn");
			System.out.println("Please enter 2 values for row, column: ");
			// take input for i j
			int i = sc.nextInt();
			int j = sc.nextInt();
			gs.playMove(new Move(i, j, p), board);
			
			BoardCell cell = ar.getSuggestedMove(board);
			System.out.println("System is playing..."+cell.getRow()+" , "+cell.getCol());
			gs.playMove(new Move(cell.getRow(), cell.getCol(), system), board);
		}
		if(rs.isComplete(board).isCompleted())
		{
			if(sc != null) sc.close();
		}
		GameResult gr = rs.isComplete(board);
		System.out.println("Player won&&&&&&&&&&&&&: "+gr.getWinnerSymbol());
	}
}
