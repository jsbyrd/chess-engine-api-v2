package jsbyrd02.example.chessengineapiv2;

import jsbyrd02.example.chessengineapiv2.engine.Chessboard;

public class Test {
  public static void main(String[] args) {
    String startingPositionFen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";
    Chessboard chessboard = new Chessboard(startingPositionFen);
    chessboard.printAllBitboards();
  }
}
