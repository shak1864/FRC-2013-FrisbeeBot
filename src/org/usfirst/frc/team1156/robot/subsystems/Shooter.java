package org.usfirst.frc.team1156.robot.subsystems;

import org.usfirst.frc.team1156.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	private Victor shooterWheel;
	private Victor insertExtraVactorHeer;
	
	private DoubleSolenoid pistonOne;
	private DoubleSolenoid pistonTwo;
	
	public enum Height {
		LOWLEVEL, MIDLEVEL, HIGHLEVEL, HIGHESTLEVEL
	}
	
	Height height;
	
	public enum shooterSpeed {
		STOP, SLOW, MEDIUM, FAST
	}
	
	shooterSpeed speed;
	
	public Shooter() {
		
		shooterWheel = new Victor(RobotMap.SHOOTER_WHEEL);
		
		pistonOne = new DoubleSolenoid(RobotMap.PISTON_ONE_A, RobotMap.PISTON_ONE_B);
		pistonTwo = new DoubleSolenoid(RobotMap.PISTON_TWO_A, RobotMap.PISTON_TWO_B);
		
		
		
	}
	
	public void setShooterSpeed(double speed) {
		shooterWheel.set(speed);
	}
	
	public void setLowHeight() {
		pistonOne.set(Value.kReverse);
		pistonTwo.set(Value.kForward);
	}
	
	
	public void setMidHeight() {
		pistonOne.set(Value.kReverse);
		pistonTwo.set(Value.kReverse);
	}
	
	public void setHighHeight() {
		pistonOne.set(Value.kForward);
		pistonTwo.set(Value.kForward);
	}
	
	public void setHighestHeight() {
		pistonOne.set(Value.kForward);
		pistonTwo.set(Value.kReverse);
	}
	
	public void setHeight() {
		switch(height) {
		case LOWLEVEL: 
			setLowHeight();
		
		case MIDLEVEL:
			setMidHeight();
			
		case HIGHLEVEL:
			setHighHeight();
		
		case HIGHESTLEVEL:
			setHighestHeight();
		}
	}
	
	public void setSpeed() {
		switch(speed) {
		case STOP:
			setShooterSpeed(0);
			
		case SLOW:
			setShooterSpeed(0.7);
			
		case MEDIUM:
			setShooterSpeed(0.85);
			
		case FAST:
			setShooterSpeed(1);
		}
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
