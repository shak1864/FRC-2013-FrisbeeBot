package org.usfirst.frc.team1156.robot.commands;

import org.usfirst.frc.team1156.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CollectorIntakeCommand extends Command {

    public CollectorIntakeCommand() {
        requires(Robot.collector);
    }

    protected void initialize() {
    	
    	Robot.collector.frisbeeIntake();
    	
    }

    protected void execute() {
    	
    }

    protected boolean isFinished() {
    	
        return false;
        
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	
    }
}
