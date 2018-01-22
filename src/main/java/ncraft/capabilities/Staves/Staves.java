package ncraft.capabilities.Staves;

public class Staves implements IStaves {

	StavesType staves;
	
	int staff = 0;
	
	int stafflevel = 1;
	
	boolean isStaff;
	
	@Override
	public void setStaff(int stafftype) {
		// TODO Auto-generated method stub
		stafftype = this.staff;
		if (this.staves == StavesType.BASIC) {
			stafftype = 0;
		}
		
		if (this.staves == StavesType.SUMMONING) {
			stafftype = 1;
		}
		
		if (this.staves == StavesType.HEALING) {
			stafftype = 2;
		}
		
		if (this.staves == StavesType.DEATH) {
			stafftype = 3;
		}
		
		if (this.staves == StavesType.DECAY) {
			stafftype = 4;
		}
		
	}

	@Override
	public int getStaff() {
		return this.staff;
	}

	public int levelStaff() {
		if (this.staff == 3) {
			this.stafflevel = 10; // Death Scythe
		}
		if (this.staff == 0) {
			this.stafflevel = 0;
		}
		
		return stafflevel;
		
	}
	

}



