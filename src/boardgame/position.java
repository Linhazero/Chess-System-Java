package boardgame;

public class position {
	
	private int row;
	private int collumn;
	
	public position(int row, int collumn) {
		this.row = row;
		this.collumn = collumn;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollumn() {
		return collumn;
	}

	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}
	
	@Override
	public String toString() {
		return row +"," + collumn;
	}
	

}
