public class Board {

  private Cell[][] board;

  public Board(int rows, int cols) {
    board = new Cell[rows][cols];
    clearBoard();
    placeFirstGen();
    displayBoard();
  }

  //loops through 2D array and sets every char to the default emoji
  public void clearBoard() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = new Cell(false);
      }
    }
  }

  //prints the board
  public void displayBoard() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
  }

  //places first generation of bacteria on board
  public void placeFirstGen() {
    board[0][3] = new Cell(true);
    board[4][4] = new Cell(true);
  }

  //counts the number of neighbors who are alive, returns the result as an integer
	//counts all eighth neighboring spaces
  public int countLiveNeighbors(int i, int j) {
    int counter=0;
    for(int r= i-1; r<=i+1; r++){
      for(int c= j-1; c<=j+1; c++){
        if((r!=i || c!=j) && r>=0 && c>=0 && r< board.length && c< board[0].length && board[r][c].getIsAlive()){
          counter++;
        }
      }
    }
    return counter;
  }

  public void createNewGeneration() {
    //creates a blank board of same size called newGenBoard
    Cell[][] nextGenBoard = new Cell[board.length][board[0].length];
    for(int r= 0; r < board.length; r++){
      for(int c= 0; c<board[0].length; c++){
        if(countLiveNeighbors(r,c)==2 || countLiveNeighbors(r,c)==3){

        }

      }
    }
    //all changes should be reflected only on nextGenBoard, and we copy them over on the last line of the method

	//for each space in the nextGenBoard:
		
      //a live cell with 2-3 neighbors survives
      

      //a dead cell with 3 live neighbors becomes live

      //a live cell with 0, 1, or >=4 neighbors dies
  


    //copies all changes simultaneously. this line must be last
    board = nextGenBoard;
  }

}
