import java.io.*;
import java.util.*;

public class SudokuBoard {
   
   // 2D array to create the Sudoku board
   private char[][] board;
   
   // to check file
   public SudokuBoard(String filename) {
      board = new char[9][9];
      
      try {
      Scanner input = new Scanner(new File(filename));
      
      for(int row = 0; row < 9; row++) {
         String line = input.next();
         
         for(int col = 0; col < 9; col++) {
            board[row][col] = line.charAt(col);
         }
      }
      
      input.close();
   } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
   }
 }
   
   // display output
   public String toString() {
      String result = "";
      
      for(int row = 0; row < 9; row++) {
         for(int col = 0; col < 9; col++) {
            result += board[row][col] + " ";
            
            if (col == 2 || col == 5) {
               result += "| ";
            }
         }
         
         result += "\n";
         
         if (row == 2 || row == 5) {
            result += "------+-------+------\n";
         }
      }
      
      return result;
   }
}