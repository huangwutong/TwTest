package TWtest;

public class Cell {
	int positionI;//细胞位于矩阵中的位置的行下标CI
	int positionJ;//细胞位于矩阵中的位置的列下标
	boolean isAlive;//细胞是否存活
	int neighborAliveCount;
	
	public Cell() {
		// TODO Auto-generated constructor stub
	}
	public Cell(int positionI, int positionJ) {
		super();
		this.positionI = positionI;
		this.positionJ = positionJ;
	}
	

	public Cell(int positionI, int positionJ, boolean isAlive) {
		this.positionI = positionI;
		this.positionJ = positionJ;
		this.isAlive = isAlive;
	}
	
	public int computeNeighborAliveCount(int[][] cellMap) {
		neighborAliveCount = 0;
		for (int i = positionI-1; i <= positionI+1; i++) {
			for (int j = positionJ-1; j <= positionJ+1; j++) {
				if (i != positionI || j != positionJ) {
					neighborAliveCount += cellMap[i][j];
				}
			}
		}
		return neighborAliveCount;
	}
	public boolean computeNextGenerationAliveState(int neighborAliveCount) {
		if(neighborAliveCount < 2 || neighborAliveCount > 3){
			isAlive = false;
		}else if (neighborAliveCount == 3) {
			isAlive = true;
		}
		return isAlive;
	}
	
	public int getNeighborAliveCount() {
		return neighborAliveCount;
	}

	public void setNeighborAliveCount(int neighborAliveCount) {
		this.neighborAliveCount = neighborAliveCount;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public int getPositionI() {
		return positionI;
	}
	public void setPositionI(int positionI) {
		this.positionI = positionI;
	}
	public int getPositionJ() {
		return positionJ;
	}
	public void setPositionJ(int positionJ) {
		this.positionJ = positionJ;
	}
	
	
}
