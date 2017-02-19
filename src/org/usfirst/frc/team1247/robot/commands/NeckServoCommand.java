package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.RobotMap;

/**
 *
 */
public class NeckServoCommand extends BaseCommand {

    public NeckServoCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(neckServo);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch(oi.direction){
    	case GEAR:
    		neckServo.setAngle(RobotMap.SERVO_ANGLE_GEAR_ID);
    		break;
    	case ROPE:
    		neckServo.setAngle(RobotMap.SERVO_ANGLE_ROPE_ID);
    		break;
    	case SHOOTER:
    		//neckServo.setAngle();
    		break;
    	case RIGHT:
    		//neckServo.setAngle();
    		break;
    	default:
    		neckServo.setAngle(RobotMap.SERVO_ANGLE_GEAR_ID);
    		break;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
