/*
 // Course: CS123
// Author:Preston Porter

// Purpose: Tic Tac Toe
// Name:TicTacToe
*/
import java.util.*;
public class TicTacToe2619
{
 
       
    
   
 
     private char[][] board = new char[3][3];
    private char turn;
    private int turnRow;         // User input to
    private int turnCol;         // select move
    private int entryCount = 0; 
    
     public void play()
    {
       System.out.println("it is "+turn+"'s turn");
      System.out.println("Where do you want your " +turn+ " placed ?");
       System.out.println("type desired row # (1-3) then type enter ,type column # (1-3) then type enter");
    
      
    }
     private void writeBoard()
     {
       for(int i =0; i<3 ;i ++)
       {
           
         for(int j =0; j<3;j++)
         {
            
          System.out.print("| "+board[i][j]+"  |");
             
         }
          System.out.println();
         System.out.println("---------------");
       }
     } 
      private void getMove()
     {
        Scanner keyboard = new Scanner(System.in);
       turnRow=keyboard.nextInt()-1;
      turnCol=keyboard.nextInt()-1;
      board[turnRow] [turnCol] =turn;
     }
     public int getEntryCount()
     {
       return entryCount;
     }
     void newEntryCount()
     {
       entryCount = entryCount+1;
     }
     void setTurn(char c)
     {
       turn = c;
     }
     public char getTurn()
     {
       return turn;
     }
     private boolean winner(char turn)
     {
       
        return (board[0][0] == turn         // 3-in-the-row
                   && board[0][1] == turn
                   && board[0][2] == turn
              ||  board[1][0] == turn        // 3-in-the-row
                   && board[1][1] == turn
                   && board[1][2] == turn 
               ||    board[2][0] == turn       // 3-in-the-row
                   && board[2][1] == turn
                   && board[2][2] == turn
              || board[0][0] == turn      // 3-in-the-column
                   && board[1][0] == turn
                   && board[2][0] == turn
               || board[0][1] == turn      // 3-in-the-column
                   && board[1][1] == turn
                   && board[2][1] == turn
               || board[0][2] == turn      // 3-in-the-column
                   && board[1][2] == turn
                   && board[2][2] == turn
                  
              ||             // 3-in-the-diagonal
                    board[0][0] == turn
                   && board[1][1] == turn
                   && board[2][2] == turn
              ||   // 3-in-the-opposite-diagonal
                    board[0][2] == turn
                   && board[1][1] == turn
                   && board[2][0] == turn);
     }
  
  public static void main( String[]  args)
   {
    TicTacToe2619 game1 =new TicTacToe2619();
    
    do{
       if(game1.getEntryCount()%2==0)
       {
         game1.setTurn('X');
         game1.play();
         game1.getMove();
         game1.writeBoard();
         if(game1.winner(game1.turn))
         { 
           System.out.println("YOU WON!");
           System.out.println("CONGRATS!");
           break;
         }
         game1.newEntryCount();
         
         //System.out.println(game1.getEntryCount());
       }
       else
       {
         game1.setTurn('O');
          game1.play();
          game1.getMove();
         game1.writeBoard();
         if(game1.winner(game1.turn)){
           System.out.println("YOU WON!");
           System.out.println("CONGRATS!");
           break;
         }
         game1.newEntryCount();
         //System.out.println(game1.getEntryCount());
       }
       
     }while (game1.getEntryCount()<9);
    }
}