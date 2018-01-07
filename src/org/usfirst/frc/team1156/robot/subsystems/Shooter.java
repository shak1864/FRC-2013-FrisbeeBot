package org.usfirst.frc.team1156.robot.subsystems;

import org.usfirst.frc.team1156.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	private Victor shooterWheel;
	
	private DoubleSolenoid heightPistonOne;
	private DoubleSolenoid heightPistonTwo;
	
	private DoubleSolenoid shooterPiston;
	private DoubleSolenoid frisbeeFlipper;
	
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
		
		frisbeeFlipper = new DoubleSolenoid(RobotMap.PISTON_FOUR_A, RobotMap.PISTON_FOUR_B);
		
		shooterStartingPositions();
	}
	
	public void shooterStartingPositions() {
		retractFrisbeeLauncher();
		setLowHeight();
		retractFrisbeeFlipper();
	}
	//Commands to shoot frisbee and reset the launcher for another frisbee
	public void fireFrisbeeLauncher() {
		shooterPiston.set(Value.kReverse);
	}
	
	public void retractFrisbeeLauncher() {
		shooterPiston.set(Value.kForward);
	}
	
	public void retractFrisbeeFlipper() {
		frisbeeFlipper.set(Value.kReverse);
	}
	
	public void fireFrisbeeFlipper() {
		frisbeeFlipper.set(Value.kForward);
	}
	
	//General Frisbee Speed Setter
	public void setShooterSpeed(double speed) {
		shooterWheel.set(speed);
	}
	
	
	//Height Setters for the entire frisbee launcher
	public void setHighestHeight() {
		heightPistonOne.set(Value.kReverse);
		heightPistonTwo.set(Value.kForward);
	}
	
	
	public void setHighHeight() {
		heightPistonOne.set(Value.kReverse);
		heightPistonTwo.set(Value.kReverse);
	}
	
	public void setMidHeight() {
		heightPistonOne.set(Value.kForward);
		heightPistonTwo.set(Value.kForward);
	}
	
	public void setLowHeight() {
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
