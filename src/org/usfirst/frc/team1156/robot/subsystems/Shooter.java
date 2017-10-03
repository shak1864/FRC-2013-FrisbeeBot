package org.usfirst.frc.team1156.robot.subsystems;

import org.usfirst.frc.team1156.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	private Victor shooterWheel;
	private Victor insertExtraVactorHeer;
	
	private DoubleSolenoid heightPistonOne;
	private DoubleSolenoid heightPistonTwo;
	
	private DoubleSolenoid shooterPiston;
	
//	public enum Height {
//		LOWLEVEL, MIDLEVEL, HIGHLEVEL, HIGHESTLEVEL
//	}
//	
//	Height height;
//	
//	public enum shooterSpeed {
//		STOP, SLOW, MEDIUM, FAST
//	}
//	
//	shooterSpeed speed;
	
	public Shooter() {
		
		shooterWheel = new Victor(RobotMap.SHOOTER_WHEEL);
		
		heightPistonOne = new DoubleSolenoid(RobotMap.PISTON_ONE_A, RobotMap.PISTON_ONE_B);
		heightPistonTwo = new DoubleSolenoid(RobotMap.PISTON_TWO_A, RobotMap.PISTON_TWO_B);
		
		shooterPiston = new DoubleSolenoid(RobotMap.PISTON_THREE_A, RobotMap.PISTON_THREE_B);
		
		shooterStartingPositions();
	}
	
	public void shooterStartingPositions() {
		retractFrisbeeLauncher();
		setLowHeight();
	}
	//Commands to shoot frisbee and reset the launcher for another frisbee
	public void fireFrisbeeLauncher() {
		shooterPiston.set(Value.kForward);
	}
	
	public void retractFrisbeeLauncher() {
		shooterPiston.set(Value.kReverse);
	}
	
	//General Frisbee Speed Setter
	public void setShooterSpeed(double speed) {
		shooterWheel.set(speed);
	}
	
	
	//Height Setters for the entire frisbee launcher
	public void setLowHeight() {
		heightPistonOne.set(Value.kReverse);
		heightPistonTwo.set(Value.kForward);
	}
	
	
	public void setMidHeight() {
		heightPistonOne.set(Value.kReverse);
		heightPistonTwo.set(Value.kReverse);
	}
	
	public void setHighHeight() {
		heightPistonOne.set(Value.kForward);
		heightPistonTwo.set(Value.kForward);
	}
	
	public void setHighestHeight() {
		heightPistonOne.set(Value.kForward);
		heightPistonTwo.set(Value.kReverse);
	}
	
//	public void setHeight() {
//		switch(height) {
//		case LOWLEVEL: 
//			setLowHeight();
//		
//		case MIDLEVEL:
//			setMidHeight();
//			
//		case HIGHLEVEL:
//			setHighHeight();
//		
//		case HIGHESTLEVEL:
//			setHighestHeight();
//		}
//	}
//	
//	public void setSpeed() {
//		switch(speed) {
//		case STOP:
//			setShooterSpeed(0);
//			
//		case SLOW:
//			setShooterSpeed(0.7);
//			
//		case MEDIUM:
//			setShooterSpeed(0.85);
//			
//		case FAST:
//			setShooterSpeed(1);
//		}
//	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


}
