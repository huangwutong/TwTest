package Test;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import TWtest.Cell;

public class CellTest {
	@Test
	public void shouldReturnFalseIfNeighborAliveCountLessThan2() {
		Cell cell = new Cell();
		Assert.assertFalse(cell.computeNextGenerationAliveState(1));
		
	}
	@Test
	public void shouldStayTheSameIfNeighborAliveCountEquals2() {
		Cell cell = new Cell();
		Assert.assertThat(cell.computeNextGenerationAliveState(2), Is.is(cell.isAlive()));
		
	}
	@Test
	public void shouldReturnFalseIfNeighborAliveCountGreaterThan3() {
		Cell cell = new Cell();
		Assert.assertFalse(cell.computeNextGenerationAliveState(4));
	}
	@Test
	public void shouldReturnTrueIfNeighborAliveCountEquals3() {
		Cell cell = new Cell();
		Assert.assertTrue(cell.computeNextGenerationAliveState(3));
	}
	
	@Test
	public void TestComputeNeighborAliveCount() {
		
		int[][] cellMap ={
				{0,0,0,0,0},
				{0,1,1,1,0},
				{0,1,1,1,0},
				{0,1,1,1,0},
				{0,0,0,0,0}
			};
		
		Assert.assertThat(new Cell(2,2) .computeNeighborAliveCount(cellMap), Is.is(8));
		
		Assert.assertThat(new Cell(1,3) .computeNeighborAliveCount(cellMap), Is.is(3));
		
		Assert.assertThat(new Cell(2,3) .computeNeighborAliveCount(cellMap), Is.is(5));
		
		Assert.assertThat(new Cell(3,1) .computeNeighborAliveCount(cellMap),Is.is(3));
		
	}
	
	

}
