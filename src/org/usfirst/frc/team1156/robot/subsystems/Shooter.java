package org.usfirst.frc.team1156.robot.subsystems;

import org.usfirst.frc.team1156.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	private Victor shooterWheel;
	private Victor insertExtraVactorHeer;
	
	private DoubleSolenoid levelOne;
	private DoubleSolenoid levelTwo;
	
	public enum height {
		LOWLEVEL, MEDLEVEL, HIGHLEVEL
	}

	public Shooter() {
		
		shooterWheel = new Victor(RobotMap.SHOOTER_WHEEL);
		
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
