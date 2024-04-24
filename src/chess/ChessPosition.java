package chess;

import bordgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
<<<<<<< HEAD
			throw new ChessException("Error ChessPosition. Valid values are from a1 to h8.");
=======
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
>>>>>>> 3eaa0ec4dc83da34703fef11df13941039ebd44e
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
