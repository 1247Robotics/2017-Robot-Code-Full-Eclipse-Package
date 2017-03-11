package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.utilities.Mode;

public class MecanumDrive extends BaseCommand{
	double throttle;
	private double gyroAngle;
	private double totalAngle;
	
	public MecanumDrive() {
		System.out.println("Mecanum initialization");
		//DUNNO IF WE NEED THROTTLE
		throttle = 1;
		gyroAngle = 0;
		totalAngle = 0;
		
		requires(driveTrain);
	}
	
	@Override
	protected void execute() {
		//throttle = Math.abs(oi.getZThrottle());
		//System.out.println("Send Drive?");
		oi.setDirection();
		gyroAngle = imu.getAngleZ();
		totalAngle = gyroAngle + oi.getAngle();
		System.out.println(gyroAngle);
		driveTrain.mecanumDrive(Math.pow(oi.getLeftXAxis(), 13/7)*throttle,
								Math.pow(oi.getLeftYAxis(), 13/7)*throttle,
								Math.pow(oi.getRightXAxis(), 13/7)*throttle,
								totalAngle);
		if (oi.getAgitateButton()){
			driveTrain.agitateDrive();
		}
		
		if (oi.direction == Mode.GEAR){
			if (oi.getReverseActionButton()){
				imu.calibrate();
			}
		}
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		//System.out.println("Can I even??");
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		super.end();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		super.interrupted();
	}
	
}
