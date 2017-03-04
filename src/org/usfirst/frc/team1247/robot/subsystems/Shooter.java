package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.ShooterCommand;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem{
	private CANTalon talonShoot;
	private Solenoid shooter;
	
	public Shooter() {
		talonShoot = new CANTalon(RobotMap.CAN_TALON_CHANNEL_SHOOTER);
		//talonShoot.changeControlMode(CANTalon.TalonControlMode.Speed);
		//talonShoot.set(0);
		shooter = new Solenoid(RobotMap.SHOOTER_SOLENOID_CHANNEL);
	}
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new ShooterCommand());
	}
	
	public boolean shoot() {
		talonShoot.set(1);
		return false;
	}
	
	public boolean shootStop() {
		talonShoot.set(0);
		return false;
	}
	
	public void moveUp() {
		shooter.set(true);
		
	}
	public void moveDown() {
		shooter.set(false);
		
	}
}
