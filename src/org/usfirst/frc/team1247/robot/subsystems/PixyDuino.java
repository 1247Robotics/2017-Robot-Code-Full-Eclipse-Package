package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.PixyDuinoCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PixyDuino extends Subsystem {
	
	private static DigitalInput turnLeft;
	private static DigitalInput turnRight;
	
	public PixyDuino() {
		turnLeft = new DigitalInput(RobotMap.DIGITAL_INPUT_TURN_LEFT_ID);
		turnRight = new DigitalInput(RobotMap.DIGITAL_INPUT_TURN_RIGHT_ID);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new PixyDuinoCommand());
    }
    
    public boolean getTurnLeft() {
    	return turnLeft.get();
    }
    public boolean getTurnRight() {
    	return turnRight.get();
    }
}

