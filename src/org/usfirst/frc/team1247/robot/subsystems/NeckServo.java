package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.NeckServoCommand;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class NeckServo extends Subsystem {
	private Servo theNeckServo;
	private Servo theTiltyServo;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public NeckServo(){
		theNeckServo = new Servo(RobotMap.SERVO_CHANNEL_NECK);
		try {
			theTiltyServo = new Servo(RobotMap.TILTY_SERVO_CHANNEL);
		} catch(Exception e) {
			System.out.println("SOOOO BROKEN");
		}
		//theNeckServo.setBounds(2550, 0, 1500, 0, 450);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new NeckServoCommand());
    }
    
    public void setAngle(double theAngle, double tiltAngle){
    	theNeckServo.setAngle(theAngle);
    	theTiltyServo.setAngle(tiltAngle);
    }
}

