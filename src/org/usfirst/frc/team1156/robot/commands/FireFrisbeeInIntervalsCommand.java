package org.usfirst.frc.team1156.robot.commands;

import org.usfirst.frc.team1156.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FireFrisbeeInIntervalsCommand extends Command {
	
	private long startTimeMillis;
	private double speed = 0.6;
	private double shootInterval;
	
    public FireFrisbeeInIntervalsCommand(double shootInterval) {
        requires(Robot.shooter);
        
		this.shootInterval = shootInterval;
		
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shooter.fireFrisbeeLauncher();
		startTimeMillis = System.currentTimeMillis();

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		return System.currentTimeMillis() - startTimeMillis >= shootInterval * 1000;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.retractFrisbeeLauncher();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
