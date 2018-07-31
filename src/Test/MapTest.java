package Test;

import org.junit.Test;

import TWtest.Map;

public class MapTest {

	@Test
	public void testInitMap() {
		Map map = new Map();
		int[][] cellMap = map.initMap(3, 5);
		for (int i = 0; i < cellMap.length; i++) {
			for (int j = 0; j < cellMap[0].length; j++) {
				assert(cellMap[i][j]==0 || cellMap[i][j]==1);
				
			}
			
		}
	}
	
	@Test
	public void testUpdate() {
		Map map = new Map();
		//int[][] cellMap = {{1,0,1},{1,1,1},{0,0,1}};
		int[][] cellMap = {
				{0,0,0,0,0},
				{0,0,0,1,0},
				{0,0,1,1,0},
				{0,1,0,1,0},
				{0,0,0,0,0}
			};
		map.setCellMap(cellMap);
		map.update();
		cellMap = map.getCellMap();
		for (int i = 0; i < cellMap.length; i++) {
			for (int j = 0; j < cellMap[0].length; j++) {
				System.out.print(cellMap[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
