package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1247.robot.subsystems.PixyDuino;
import org.usfirst.frc.team1247.robot.subsystems.RopePull;
import org.usfirst.frc.team1247.robot.subsystems.Shooter;
import org.usfirst.frc.team1247.robot.subsystems.NeckServo;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class BaseCommand extends Command {
	public static OI oi;
	
	//create subsystems.
	
	public static DriveTrain driveTrain;
	public static PixyDuino pixyDuino;
	public static RopePull ropePull;
	public static Shooter shooter;
	public static NeckServo neckServo;
	
	
	public BaseCommand() {
		super();
		//System.out.println("BaseCommand initialization");
		
		
	}
	
	public BaseCommand(double timeout) {
		super(timeout);
	}

	public BaseCommand(String name, double timeout) {
		super(name, timeout);
	}

	public BaseCommand(String name) {
		super(name);
	}
	
	/**
	 * Initializes the subsystems and <code>OI</code>.
	 */
	public static void init() {
		oi = new OI();
		
		//Initialize subsystems.
		driveTrain = new DriveTrain();
		
		pixyDuino = new PixyDuino();
		
		ropePull = new RopePull();
		
		shooter = new Shooter();
		
		neckServo = new NeckServo();
		
		//displays stuff on smartdashboard
		SmartDashboard.putData(driveTrain);
	}
}
