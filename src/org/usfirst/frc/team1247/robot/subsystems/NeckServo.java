package org.usfirst.frc.team1247.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class NeckServo extends Subsystem {
	protected static double kDefaultMaxServoPWM(){
		return 2.5;
	}
	protected static double kDefaultMinServoPWM(){
		return 0.5;
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setAngle(){
    	
    }
}

