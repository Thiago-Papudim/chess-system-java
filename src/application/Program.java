package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();

                ChessPosition source = null;
                while (source == null) {
                    System.out.print("Source: ");
                    if (!sc.hasNextLine()) {
                        System.out.println("No input found. Exiting...");
                        sc.close();
                        return;
                    }
                    try {
                        source = UI.readChessPosition(sc);
                    } catch (ChessException | InputMismatchException e) {
                        System.out.println("Error: " + e.getMessage());
                        source = null;
                    }
                }

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();

                ChessPosition target = null;
                while (target == null) {
                    System.out.print("Target: ");
                    if (!sc.hasNextLine()) {
                        System.out.println("No input found. Exiting...");
                        sc.close();
                        return;
                    }
                    try {
                        target = UI.readChessPosition(sc);
                    } catch (ChessException | InputMismatchException e) {
                        System.out.println("Error: " + e.getMessage());
                        target = null;
                    }
                }

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }

            } catch (ChessException e) {
                System.out.println("Chess error: " + e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input error: " + e.getMessage());
                sc.nextLine();
            }
        }

        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
        sc.close();
    }
}
