package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.RopeCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RopePull extends Subsystem{
	private Talon talonPullOne, talonPullTwo, talonPullThree, talonPullFour;
	
	public RopePull() {
		talonPullOne = new Talon(RobotMap.TALON_CHANNEL_FRONT_LEFT);
		talonPullTwo = new Talon(RobotMap.TALON_CHANNEL_REAR_LEFT);
		talonPullThree = new Talon(RobotMap.TALON_CHANNEL_FRONT_RIGHT);
		talonPullFour = new Talon(RobotMap.TALON_CHANNEL_REAR_RIGHT);
	}
	@Override
	public void initDefaultCommand() {
		//setDefaultCommand(new RopeCommand());
	}
	
	public boolean pull () {
		talonPullOne.setRaw(1);
		talonPullTwo.setRaw(1);
		talonPullThree.setRaw(1);
		talonPullFour.setRaw(1);
		return false;
	}
	
	public boolean stop () {
		talonPullOne.setRaw(0);
		talonPullTwo.setRaw(0);
		talonPullThree.setRaw(0);
		talonPullFour.setRaw(0);
		return false;
	}
}