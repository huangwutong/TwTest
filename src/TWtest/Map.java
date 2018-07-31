package TWtest;

import java.util.Random;

public class Map {
	private int[][] cellMap;

	public int[][] getCellMap() {
		return cellMap;
	}
	public void setCellMap(int[][] cellMap) {
		this.cellMap = cellMap;
	}

	public int[][] initMap(int n, int m) {
		cellMap = new int[n + 2][m + 2];
		for (int i = 0; i < cellMap.length; i++) {
			for (int j = 0; j < cellMap[0].length; j++) {
				if (i == 0 || i == cellMap.length - 1 || j == 0 || j == cellMap.length - 1) {
					cellMap[i][j] = 0;
				} else {
					Random random = new Random(5);
					cellMap[i][j] = random.nextInt(2);
				}
			}
		}
		return cellMap;
	}

	public void update() {
		Cell cell = null;
		int[][]nextGenrationCellMap=new int[cellMap.length][cellMap[0].length];
		for (int i = 1; i < cellMap.length - 1; i++) {
			for (int j = 1; j < cellMap[0].length - 1; j++) {
				cell = getCellAccordingToCellMap(i, j);
				updateCellAliveStatus(cell, nextGenrationCellMap, i, j);
			}
		}
		cellMap=nextGenrationCellMap;
	}

	private void updateCellAliveStatus(Cell cell, int[][] nextGenrationCellMap, int row, int col) {
		int neighborAliveCount;
		boolean aliveState;
		neighborAliveCount = cell.computeNeighborAliveCount(cellMap);
		
		aliveState = cell.computeNextGenerationAliveState(neighborAliveCount);
		if (aliveState == true) {
			nextGenrationCellMap[row][col] = 1;
		} else {
			nextGenrationCellMap[row][col] = 0;
		}
	}

	private Cell getCellAccordingToCellMap(int row, int col) {
		Cell cell;
		if (cellMap[row][col] == 1) {
			cell = new Cell(row, col, true);
		} else {
			cell = new Cell(row, col, false);
		}
		return cell;
	}
}