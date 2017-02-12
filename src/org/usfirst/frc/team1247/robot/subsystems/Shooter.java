package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem{
	private Talon talonShoot;
	
	public Shooter() {
		talonShoot = new Talon(RobotMap.TALON_CHANNEL_SHOOTER);
	}
	@Override
	public void initDefaultCommand() {
		//setDefaultCommand(new RopeCommand());
	}
	
	public boolean shoot() {
		talonShoot.setRaw(1);
		return false;
	}
	
	public boolean shootStop() {
		talonShoot.setRaw(0);
		return false;
	}

}
