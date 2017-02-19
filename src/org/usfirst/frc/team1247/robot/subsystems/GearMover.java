package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.GearMoverCommand;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearMover extends Subsystem{
	private Solenoid mover;
	
	public GearMover(){
		mover = new Solenoid(RobotMap.GEAR_MOVER_SOLENOID_CHANNEL);
	}
	
	public void initDefaultCommand(){
		setDefaultCommand(new GearMoverCommand());
	}
	
	public void moveDown(){
		mover.set(true);
	}
	
	public void moveUp(){
		mover.set(false);
	}
}
