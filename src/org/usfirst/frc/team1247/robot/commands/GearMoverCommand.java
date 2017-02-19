package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.utilities.Mode;

public class GearMoverCommand extends BaseCommand{
	public GearMoverCommand(){
		requires(mover);
	}
	
	protected void initialize(){
		super.initialize();
	}
	
	protected void execute(){
		if(oi.direction == Mode.GEAR){
			if(oi.getActionButton()){
				mover.moveDown();
			} else {
				mover.moveUp();
			}
		}
	}
	
	protected boolean isFinished(){
		return false;
	}
	
	protected void end() {
		// TODO Auto-generated method stub
		super.end();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		super.interrupted();
	}
}
