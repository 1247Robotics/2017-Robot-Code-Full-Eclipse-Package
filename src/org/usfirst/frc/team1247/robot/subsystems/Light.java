package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.LightCommand;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Light extends Subsystem{
	private CANTalon lightTalon;
	
	public Light(){
		lightTalon = new CANTalon(RobotMap.CAN_TALON_CHANNEL_LIGHT);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new LightCommand());
	}
	
	public void light(double brightness){
		lightTalon.set(brightness);
	}
	
}
