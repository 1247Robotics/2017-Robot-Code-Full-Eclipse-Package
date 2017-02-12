package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
//import org.usfirst.frc.team1247.robot.commands.RopeCommand;
import org.usfirst.frc.team1247.robot.commands.RopeCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RopePull extends Subsystem{
	private Talon talonPullOne, talonPullTwo;
	
	public RopePull() {
		talonPullOne = new Talon(RobotMap.TALON_CHANNEL_ROPE_ONE);
		talonPullTwo = new Talon(RobotMap.TALON_CHANNEL_ROPE_TWO);
	}
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new RopeCommand());
	}
	
	public boolean pull (double speed) {
		talonPullOne.setSpeed(-speed);
		talonPullTwo.setSpeed(speed);
		return false;
	}
	
	public boolean reverse(double speed){
		talonPullOne.setSpeed(speed);
		talonPullTwo.setSpeed(-speed);
		return false;
	}
	
	public boolean stop () {
		talonPullOne.setSpeed(0);
		talonPullTwo.setSpeed(0);
		return false;
	}
}