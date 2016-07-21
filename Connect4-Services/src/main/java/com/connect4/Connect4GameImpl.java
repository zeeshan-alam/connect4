package com.connect4;

public class Connect4GameImpl implements Connect4Game {
	
	private int WIDTH= 6;
	private int HEIGHT = 7;
	//colomn, row
	private int[][] board = new int[WIDTH][HEIGHT];
	
	public boolean is4DiscConnected(int playerId){

	   try {
		// horizontalCheck 
	    for (int j = 0; j<HEIGHT ; j++ ){
	    	for (int i = 0; i<WIDTH-3; i++){		
	            if (this.board[i][j] == playerId && this.board[i+1][j] == playerId && this.board[i+2][j] == playerId && this.board[i+3][j] == playerId){
	            	return true;
	            }           
	        }
	    }
	    // verticalCheck
	    
	    

	    
	    for (int j = 0; j<HEIGHT ; j++ ){
	    	for (int i = 0; i<WIDTH-3; i++){
	            if (this.board[j][i] == playerId && this.board[j][i+1] == playerId && this.board[j][i+2] == playerId && this.board[j][i+3] == playerId){
	                return true;
	            }           
	        }
	    }
//	    // ascendingDiagonalCheck 
//	    for (int i=3; i<WIDTH; i++){
//	        for (int j=0; j<HEIGHT-3; j++){
//	            if (this.board[i][j] == playerId && this.board[i-1][j+1] == playerId && this.board[i-2][j+2] == playerId && this.board[i-3][j+3] == playerId)
//	                return true;
//	        }
//	    }
//	    // descendingDiagonalCheck
//	    for (int i=3; i<WIDTH; i++){
//	        for (int j=3; j<HEIGHT; j++){
//	            if (this.board[i][j] == playerId && this.board[i-1][j-1] == playerId && this.board[i-2][j-2] == playerId && this.board[i-3][j-3] == playerId)
//	                return true;
//	        }
//	    }
	   } catch(Exception e) {
		   return false;
	   }
	    return false;
	}

	public boolean dropDisk( int player, int column) {
		int currentRow=0;
		//col, row
		// column is full
		try {
			if (board[column][HEIGHT-1] != 0 ){
				return false;
			}
			
			for (int i=0 ; i<HEIGHT; i++){
				if(board[column][i] == 0 ){
					currentRow = i;
					break;
				}
			}
			board[column][currentRow]=player;
		} catch(Exception e) {
			return false;
		}
		return true;
		
	}

	public void reset() {
		board = new int[WIDTH][HEIGHT];
		
	}

}
