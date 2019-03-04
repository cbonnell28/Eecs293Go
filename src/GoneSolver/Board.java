package GoneSolver;

public class Board {
	private final int[][] board;
	
	private Board(int boardWidth, int boardHeight) {
		this.board = new int [boardWidth][boardHeight];
	}
	
	public static final Board build(int boardWidth, int boardHeight) {
		return new Board(boardWidth, boardHeight);
	}
}
