package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1247.robot.subsystems.Light;
import org.usfirst.frc.team1247.robot.subsystems.PixyDuino;
import org.usfirst.frc.team1247.robot.subsystems.RopePull;
import org.usfirst.frc.team1247.robot.utilities.ADIS16448_IMU;
import org.usfirst.frc.team1247.robot.subsystems.NeckServo;

import edu.wpi.first.wpilibj.command.Command;

public abstract class BaseCommand extends Command {
	public static OI oi;
	
	//create subsystems.
	
	public static DriveTrain driveTrain;
	public static PixyDuino pixyDuino;
	public static RopePull ropePull;
	public static NeckServo neckServo;
	public static Light light;
	
	public static ADIS16448_IMU imu;
	
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
		
		neckServo = new NeckServo();
		
		light = new Light();
		
		imu = new ADIS16448_IMU();
		imu.calibrate();
		
				
		//displays stuff on smartdashboard
	}
}
