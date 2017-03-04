package org.usfirst.frc.team1247.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Magic numbers go here!
	
//--------------------ROBO RIO DIO----------------------------------------	
	// ------------------------TALONS------------------------------------------
	public static final int TALON_CHANNEL_FRONT_LEFT = 0; 
	public static final int TALON_CHANNEL_REAR_LEFT = 1;
	public static final int TALON_CHANNEL_FRONT_RIGHT = 2; 
	public static final int TALON_CHANNEL_REAR_RIGHT = 3; 
	public static final int TALON_CHANNEL_ROPE_ONE = 4;
	public static final int TALON_CHANNEL_ROPE_TWO = 5;
	
	//----------------------SERVO----------------------------------------------
	public static final int SERVO_CHANNEL_NECK = 6;
	public static final int TILTY_SERVO_CHANNEL = 7;
	
	//----------------------PIXYDUINO------------------------------------------
	public static final int DIGITAL_INPUT_TURN_LEFT_ID = 15;
	public static final int DIGITAL_INPUT_TURN_RIGHT_ID = 14;
	
	public static final int DIGITAL_OUTPUT_MODE_HIGH_BIT_ID = 13;
	public static final int DIGITAL_OUTPUT_MODE_LOW_BIT_ID = 12;
	
//--------------------PCM----------------------------------------	
	// ---------------------SOLENOID-------------------------------------------
	public static final int GEAR_MOVER_SOLENOID_CHANNEL = 3;
	public static final int SHOOTER_SOLENOID_CHANNEL = 2;
	
//--------------------CAN----------------------------------------	
	//---------------------CAN BUS---------------------------------------------
	public static final int CAN_TALON_CHANNEL_SHOOTER = 1;
	public static final int CAN_TALON_CHANNEL_LIGHT = 0;
	
//--------------------XBOX----------------------------------------
	public static final int XBOX_DRIVE_ID = 5;
	
	//-----------------------DRIVE---------------------------------------------
	public static final int XBOX_LEFT_XAXIS_ID = 0;
	public static final int XBOX_LEFT_YAXIS_ID = 1;
	public static final int XBOX_RIGHT_XAXIS_ID = 4;
	
	//----------------------FORWARD DIRECTION----------------------------------
	public static final int XBOX_GEAR_BUTTON_ID = 1;
	public static final int XBOX_ROPE_BUTTON_ID = 4;
	public static final int XBOX_LEFT_BUTTON_ID = 3;
	public static final int XBOX_RIGHT_BUTTON_ID = 2;
	public static final int XBOX_AGITATE_BUTTON_ID = 10;
	
	//----------------------ROPE/SHOOT BUTTON----------------------------------------
	public static final int XBOX_ACTION_BUTTON_ID = 6;
	public static final int XBOX_REVERSE_ACTION_BUTTON_ID = 5;
}
