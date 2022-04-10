package Box;

public abstract class Box {
	
	protected int symbol;
	protected boolean isMine;

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public abstract void Activate();
	public abstract void unveiling();
	
	
}
