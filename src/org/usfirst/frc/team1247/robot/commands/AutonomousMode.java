package org.usfirst.frc.team1247.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousMode extends CommandGroup{
	public AutonomousMode() {
		addSequential(new AutonomousDrive(0.0, 1.0, 0.0, 5.0));
	}
}
