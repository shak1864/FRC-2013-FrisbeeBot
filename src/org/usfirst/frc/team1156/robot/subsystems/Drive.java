package org.usfirst.frc.team1156.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
	private SpeedController frontLeft;
	private SpeedController frontRight;
	private SpeedController backLeft;
	private SpeedController backRight;
	
	
	
	public Drive() {
		
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
