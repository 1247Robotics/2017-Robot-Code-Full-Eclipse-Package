package org.usfirst.frc.team1247.robot.commands;

public class LightCommand extends BaseCommand{
	public LightCommand(){
		requires(light);
	}
	
	protected void execute() {
		//throttle = Math.abs(oi.getZThrottle());
		//System.out.println("Send Drive?");
		switch(oi.direction){
		case GEAR:
			light.light(.25);//set these variables later!!!!
			break;
		case ROPE:
			light.light(.1);
			break;
		case SHOOTER:
			light.light(1);
			break;
		case RIGHT:
			light.light(.25);
			break;
		default:
			light.light(.25);
			break;
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
