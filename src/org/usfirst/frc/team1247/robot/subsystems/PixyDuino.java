package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.PixyDuinoCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PixyDuino extends Subsystem {
	
	private static DigitalInput turnLeft;
	private static DigitalInput turnRight;
	
	private static DigitalOutput modeHighBit;
	private static DigitalOutput modeLowBit;
	
	public PixyDuino() {
		turnLeft = new DigitalInput(RobotMap.DIGITAL_INPUT_TURN_LEFT_ID);
		turnRight = new DigitalInput(RobotMap.DIGITAL_INPUT_TURN_RIGHT_ID);
		
		modeHighBit = new DigitalOutput(RobotMap.DIGITAL_OUTPUT_MODE_HIGH_BIT_ID);
		modeLowBit = new DigitalOutput(RobotMap.DIGITAL_OUTPUT_MODE_LOW_BIT_ID);
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
    
    public void setMode(boolean highBit, boolean lowBit){
    	modeHighBit.set(highBit);
    	modeLowBit.set(lowBit);
    }
}

