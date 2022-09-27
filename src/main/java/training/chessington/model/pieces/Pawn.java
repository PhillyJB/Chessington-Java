package training.chessington.model.pieces;

import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        ArrayList<Move> pawnMoves = new ArrayList<>();
        if(getColour().equals(PlayerColour.WHITE)){

        }
//        if(getColour().equals(PlayerColour.WHITE)){
//            int movementDirection = -1;
//
//        } else if(getColour().equals(PlayerColour.BLACK)) {
//            int movementDirection = 1;
//        }
//
//        // checks if piece is at the end of the board
//        if (getColour().equals(PlayerColour.WHITE) && from.getRow() == 7){
//
//            return pawnMoves;
//        } else if (getColour().equals(PlayerColour.BLACK) && from.getRow() == 0){
//            return pawnMoves;
//        }
        return pawnMoves;
    }
}
