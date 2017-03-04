package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.utilities.Mode;

public class ShooterCommand extends BaseCommand{
	
	public ShooterCommand() {
		requires(shooter);
	}
	
	@Override
	protected void execute() {
		//System.out.println("Send Drive?");
		if (oi.direction == Mode.SHOOTER){
			shooter.shoot();
			if (oi.getActionButton()) {
	    		shooter.moveUp();
	    	} else {
	    		shooter.moveDown();
	    	}
		} else {
			shooter.shootStop();
			System.out.println("No moore shooty shooot");
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