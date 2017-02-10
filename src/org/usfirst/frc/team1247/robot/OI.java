package org.usfirst.frc.team1247.robot;

import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team1247.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1247.robot.utilities.ForwardDirection;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//public static ForwardDirection direction;
	
	Joystick xboxDriveJoystick;
	int angle = 0;
	
	
//------------------------------Controller Type--------------------------------------
	public OI () {
		System.out.println("I can has OI!");
		xboxDriveJoystick = new Joystick(RobotMap.XBOX_DRIVE_ID);
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
	
	public int getGearDirectionButton() {
		boolean gearPressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_GEAR_BUTTON_ID);
		boolean ropePressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_ROPE_BUTTON_ID);
		boolean leftPressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_LEFT_BUTTON_ID);
		boolean rightPressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_RIGHT_BUTTON_ID);
		
		if(gearPressed){
			angle = 0;
		}else if (ropePressed){
			angle = 180;
		}else if (leftPressed){
			angle = 270;
		}else if (rightPressed){
			angle = 90;
		}else{
			//keep angle the same
		}
		return angle;
	}
	
//----------------------------Rope Pull-----------------------------------------------
	public boolean getClimbButton() {
		boolean climbPressed = false;
		climbPressed = xboxDriveJoystick.getRawButton(RobotMap.XBOX_CLIMB_BUTTON_ID);
		return climbPressed;
	}
}
