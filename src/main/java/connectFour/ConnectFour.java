package connectFour;
 
import java.util.Scanner;


public class ConnectFour {
	
	private static final int ROWS=6;
	private static final int COLUMNS=7;


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean winner=false;
		int inputCol;
		char player1 ='X';
		char player2 = 'Y';
		char[][] grid = new char[ROWS][COLUMNS];
		
		//initialize array
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[0].length; col++){
				grid[row][col] = 'O';
			}
		}
		printBoard(grid);
		while (!winner) {
			do {
				System.out.println("Insert a column between 0 and "+(COLUMNS-1));
				inputCol = in.nextInt();
				
			}while(!validateColumn(grid, inputCol));
			
			insertToken(grid,inputCol,player1);
			printBoard(grid);
			
			winner=isWinner(grid, player1);
			
			if(player1=='X') {
				player1='Y';
			}else {player1='X';}
		}
		
	}
	
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static boolean validateColumn(char [][] board, int col) {
		return (col>=0&&col<COLUMNS&&board[0][col]=='O');
	}
	
	public static char[][] insertToken(char[][] board, int col, char token) {
		
		for (int i = ROWS-1; i >= 0; i--) {
			if (board[i][col]=='O') {
				board[i][col]=token;
				break;
				}
		}
		
		return board;
	}
	
	public static boolean isWinner(char[][] board, char token ){
		//check for 4 across
		for(int row = 0; row<ROWS; row++){
			for (int col = 0;col < COLUMNS - 3;col++){
				if (board[row][col] == token   && 
					board[row][col+1] == token &&
					board[row][col+2] == token &&
					board[row][col+3] == token){
					System.out.println("Congratulations, the game is over and player "+token+" won! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
					System.out.println("The other player is losing it, is furious: \n(ノಠ益ಠ)ノ彡┻━┻");
					return true;
				}
			}			
		}
		//check for 4 up and down
		for(int row = 0; row < ROWS - 3; row++){
			for(int col = 0; col < COLUMNS; col++){
				if (board[row][col] == token   && 
					board[row+1][col] == token &&
					board[row+2][col] == token &&
					board[row+3][col] == token){
					System.out.println("Congratulations, the game is over and player "+token+" won! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
					System.out.println("The other player is losing it, is furious: \n(ノಠ益ಠ)ノ彡┻━┻");
					return true;
				}
			}
		}
		//check upward diagonal
		for(int row = 3; row <ROWS; row++){
			for(int col = 0; col < COLUMNS - 3; col++){
				if (board[row][col] == token   && 
					board[row-1][col+1] == token &&
					board[row-2][col+2] == token &&
					board[row-3][col+3] == token){
					System.out.println("Congratulations, the game is over and player "+token+" won! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
					System.out.println("The other player is losing it, is furious: \n(ノಠ益ಠ)ノ彡┻━┻");
					return true;
				}
			}
		}
		//check downward diagonal
		for(int row = 0; row < ROWS - 3; row++){
			for(int col = 0; col < COLUMNS - 3; col++){
				if (board[row][col] == token   && 
					board[row+1][col+1] == token &&
					board[row+2][col+2] == token &&
					board[row+3][col+3] == token){
					System.out.println("Congratulations, the game is over and player "+token+" won! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
					System.out.println("The other player is losing it, is furious: \n(ノಠ益ಠ)ノ彡┻━┻");
					return true;
				}
			}
		}
		
		return false;
	}
}