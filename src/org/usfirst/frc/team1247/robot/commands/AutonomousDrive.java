package org.usfirst.frc.team1247.robot.commands;

import edu.wpi.first.wpilibj.Timer;

public class AutonomousDrive extends BaseCommand{
		private double speedX, speedY, rotation, duration;
	
	private boolean isDriving, isFinished;
	
	private Timer timer;
	
	public AutonomousDrive(double speedX, double speedY, double rotation, double duration) {
		//System.out.println("AutonomouseDrive initialization");
		this.speedX = speedX;
		this.speedY = speedY;
		this.rotation = rotation;
		
		this.duration = duration;
		
		isDriving = isFinished = false;
		
		timer = new Timer();
		
		requires(driveTrain);
	}
	
		public AutonomousDrive(double speed, double duration) {
			this.speedX = speed;
			this.speedY = speed;
			this.rotation = speed;
			this.duration = duration;
		
		isDriving = isFinished = false;
		
		timer = new Timer();
		
		requires(driveTrain);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
	}

	@Override
	protected void execute() {
		if (!isDriving) {
			timer.start();
			isDriving = true;
		}
		
		if (timer.get() < duration) driveTrain.mecanumDrive(0, 0, 1, 0);
		else isFinished = true;
	}

	@Override
	protected boolean isFinished() {
		return isFinished;
	}

	@Override
	protected void end() {
		super.end();
	}

	@Override
	protected void interrupted() {
		super.interrupted();
	}
}
