package ncraft.capabilities.Staves;

public class Staves implements IStaves {

	StavesType staves;
	
	boolean isStaff;
	
	@Override
	public void setStaff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getStaff() {
		// TODO Auto-generated method stub
		return this.isStaff;
	}
	
	public void typeStaff(StavesType staves) {
		this.staves = staves;
		
	}

	
}



