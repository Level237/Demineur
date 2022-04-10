package Box.type;

import Box.Box;

public class BoxEmpty extends Box{

	private int NeighboringMine;
	
	public BoxEmpty() {
		this.symbol=0;
	}

	@Override
	public void Activate() {
		
		
	}

	@Override
	public void unveiling() {
		System.out.println(this.NeighboringMine);
		
	}
	
	public int getNbMines() {
		return this.NeighboringMine;
	}
	
	public void setNeighboringMine(int NeighboringMine) {
		this.NeighboringMine=NeighboringMine;
	}
}
