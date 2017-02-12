package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.utilities.Mode;

public class RopeCommand extends BaseCommand{
	
	public RopeCommand() {
		requires(ropePull);
	}
	
	@Override
	protected void execute() {
		//System.out.println("Send Drive?");
		if (oi.direction == Mode.ROPE){
			if (oi.getActionButton()) {
	    		ropePull.pull();
	    	} else {
	    		ropePull.stop();
	    	}
		}
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		//System.out.println("Can I even??");
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
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