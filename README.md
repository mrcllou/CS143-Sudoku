# CS143-Sudoku

Java program that reads a Sudoku puzzle from a .sdk file and prints it to the console. Built for CS143.

## Files
- `SudokuBoard.java` - reads the puzzle file and stores the board
- `Main.java` - creates a SudokuBoard object and prints it
- `data1.sdk` - sample puzzle input file

## How to Run
Make sure all files are in the same folder, then:
```
javac SudokuBoard.java Main.java
java Main
```

## Notes
- Empty cells in the .sdk file are periods (.), which get stored as spaces in the array
- The board is a 9x9 2D char array
