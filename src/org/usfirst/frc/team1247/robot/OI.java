package org.usfirst.frc.team1247.robot;

import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team1247.robot.utilities.Mode;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Mode direction;
	public RumbleType kLeftRumble;
	public RumbleType kRightRumble;
	
	Joystick xboxDriveJoystick;
	int angle = 0;
	
	
	
//------------------------------Controller Type--------------------------------------
	public OI () {
		System.out.println("I can has OI!");
		xboxDriveJoystick = new Joystick(RobotMap.XBOX_DRIVE_ID);
		direction = Mode.GEAR;
	}

	
//------------------------------Axis-------------------------------------------------
	public double getLeftXAxis() {
		double axisValue = 0;
		//System.out.println("Left Axis!");
		axisValue = xboxDriveJoystick.getRawAxis(RobotMap.XBOX_LEFT_XAXIS_ID);
		return axisValue;
	}
	
	public double getLeftYAxis() {
		double axisValue = 0;
		
		axisValue = xboxDriveJoystick.getRawAxis(RobotMap.XBOX_LEFT_YAXIS_ID);
		return axisValue;
	}
	public double getRightXAxis() {
		double axisValue = 0;
		
		axisValue = xboxDriveJoystick.getRawAxis(RobotMap.XBOX_RIGHT_XAXIS_ID);
		return axisValue;
	}
	
//-----------------------------Direction----------------------------------------------
		
	public void setDirection(){
		if (xboxDriveJoystick.getRawButton(RobotMap.XBOX_GEAR_BUTTON_ID)){
			direction = Mode.GEAR;
		} else if (xboxDriveJoystick.getRawButton(RobotMap.XBOX_ROPE_BUTTON_ID)){
			direction = Mode.ROPE;
		} else if (xboxDriveJoystick.getRawButton(RobotMap.XBOX_LEFT_BUTTON_ID)){
			direction = Mode.SHOOTER;
		} else if (xboxDriveJoystick.getRawButton(RobotMap.XBOX_RIGHT_BUTTON_ID)){
			direction = Mode.RIGHT;
		}
		System.out.println(direction);
	} //called in MecanumDrive.java!!!!
	
	public int getAngle() {
		switch(direction){
		case GEAR:
			angle = 0;
			break;
		case ROPE:
			angle = 180;
			break;
		case SHOOTER:
			angle = 270;
			break;
		case RIGHT:
			angle = 90;
			break;
		default:
			angle = 0;
			break;
		}
		return angle;
	}
	
	public boolean getHighBit(){
		boolean value = false;
		switch(direction){
		case GEAR:
			value = false;
			break;
		case ROPE:
			value = false;
			break;
		case SHOOTER:
			value = true;
			break;
		case RIGHT:
			value = true;
			break;
		default:
			value = false;
			break;
		}
		return value;
	}
	
	public boolean getLowBit(){
		boolean value = false;
		switch(direction){
		case GEAR:
			value = false;
			break;
		case ROPE:
			value = true;
			break;
		case SHOOTER:
			value = false;
			break;
		case RIGHT:
			value = true;
			break;
		default:
			value = false;
			break;
		}
		return value;
	}
	
	
//----------------------------Action-----------------------------------------------

	public boolean getActionButton() {
		boolean pressed = false;
		pressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_ACTION_BUTTON_ID);
		return pressed;
	}
	
	public boolean getReverseActionButton(){
		boolean pressed = false;
		pressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_REVERSE_ACTION_BUTTON_ID);
		return pressed;
	}
	
	public boolean getAgitateButton(){
		boolean pressed = false;
		pressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_AGITATE_BUTTON_ID);
		if (pressed) {
			xboxDriveJoystick.setRumble(kLeftRumble, 1);
			xboxDriveJoystick.setRumble(kRightRumble, 1);
		}
		return pressed;
	}

}
