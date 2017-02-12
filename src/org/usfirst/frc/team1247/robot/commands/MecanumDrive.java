package org.usfirst.frc.team1247.robot.commands;

public class MecanumDrive extends BaseCommand{
	double throttle;
	
	public MecanumDrive() {
		System.out.println("Mecanum initialization");
		//DUNNO IF WE NEED THROTTLE
		throttle = 1;
		
		requires(driveTrain);
	}
	
	@Override
	protected void execute() {
		//throttle = Math.abs(oi.getZThrottle());
		//System.out.println("Send Drive?");
		oi.setDirection();
		driveTrain.mecanumDrive(Math.pow(oi.getLeftXAxis(), 3)*throttle,
								Math.pow(oi.getLeftYAxis(), 3)*throttle,
								Math.pow(oi.getRightXAxis(), 3)*throttle,
								oi.getAngle());
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
