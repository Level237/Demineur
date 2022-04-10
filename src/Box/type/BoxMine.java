package Box.type;

import Box.Box;

public class BoxMine extends Box{
	
	

	public BoxMine() {
		this.symbol=1;
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unveiling() {
		System.out.println(this.symbol);
		
	}
	
	

}
