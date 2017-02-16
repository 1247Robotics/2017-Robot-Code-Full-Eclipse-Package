package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.LightCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Light extends Subsystem{
	private Talon lightTalon;
	
	public Light(){
		lightTalon = new Talon(RobotMap.TALON_CHANNEL_LIGHT);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new LightCommand());
	}
	
	public void light(double brightness){
		lightTalon.setSpeed(brightness);
	}
	
}
