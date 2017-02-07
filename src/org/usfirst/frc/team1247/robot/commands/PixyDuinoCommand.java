package org.usfirst.frc.team1247.robot.commands;


import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.tables.ITable;

import org.usfirst.frc.team1247.robot.subsystems.PixyDuino;

/**
 *
 */
public class PixyDuinoCommand extends BaseCommand implements LiveWindowSendable {
	
	private String direction;

    public PixyDuinoCommand() {
    	System.out.println("Pixy initialization");
        // Use requires() here to declare subsystem dependencies
        requires(pixyDuino);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	super.initialize();
    	
    	direction = "none";
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.print("Left: ");
    	System.out.print(pixyDuino.getTurnLeft());
    	System.out.print(", Right: ");
    	System.out.println(pixyDuino.getTurnRight());
    	if (pixyDuino.getTurnLeft() && pixyDuino.getTurnRight()){
    		direction = "straight";
    	} else if (pixyDuino.getTurnLeft()){
    		direction = "left";
    	} else if (pixyDuino.getTurnRight()){
    		direction = "right";
    	} else {
    		direction = "none";
    		
    	}
    }

    public synchronized String getDirection() {
        return direction;
      }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	@Override
	public void updateTable() {
		ITable table = getTable();
	    if (table != null) {
	      table.putString("direction", getDirection());
	    }
	}
		

	@Override
	public void startLiveWindowMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopLiveWindowMode() {
		// TODO Auto-generated method stub
		
	}
}
