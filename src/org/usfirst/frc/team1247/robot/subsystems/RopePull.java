package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
//import org.usfirst.frc.team1247.robot.commands.RopeCommand;

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
		//setDefaultCommand(new RopeCommand());
	}
	
	public boolean pull () {
		talonPullOne.setRaw(1);
		talonPullTwo.setRaw(1);
		return false;
	}
	
	public boolean stop () {
		talonPullOne.setRaw(0);
		talonPullTwo.setRaw(0);
		return false;
	}
}