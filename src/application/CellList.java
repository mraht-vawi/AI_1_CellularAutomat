package application;

public class CellList {
	private Cell[][] cells = new Cell[Main.getEnvironment().getWidth()][Main.getEnvironment().getHeight()];
	
	public Cell[][] getCells()
	{
		return cells;
	}
	
	public void setCells(Cell[][] cells)
	{
		this.cells = cells;
	}
	
	private static CellList instance;
	
	public static CellList getInstance()
	{
		if (instance == null) {
			instance = new CellList();
		}
		
		return instance;
	}
	
	protected CellList() {}
	
	public Cell getCell(int x, int y)
	{
		return cells[x][y];
	}

	public void determineNeighbours()
	{
		for(int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				cells[i][j].getNeighbours();
			}
		}
	}
}
