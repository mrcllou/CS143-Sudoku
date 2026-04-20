import java.io.*;
 
public class Main {
   public static void main(String[] args) throws FileNotFoundException {
      SudokuBoard board = new SudokuBoard("data1.sdk");
      System.out.println(board);
   }
}