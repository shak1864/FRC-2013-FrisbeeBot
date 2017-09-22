package org.usfirst.frc.team1156.robot.subsystems;

import org.usfirst.frc.team1156.robot.RobotMap;

import com.walpole.frc.team.robot.lib.RebelDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

	private RebelDrive robotDrive;
	
	private SpeedController frontLeft;
	private SpeedController frontRight;
	private SpeedController backLeft;
	private SpeedController backRight;

	public enum Shifter {
		High, Low
	}

	public enum Speed {
		Normal, Slow
	}

	private Shifter currGear = Shifter.Low;
	private Speed currSpeed = Speed.Normal;

	public Drive() {

		frontLeft = new Victor(RobotMap.LEFT_FRONT_MOTOR);
		backLeft = new Victor(RobotMap.LEFT_BACK_MOTOR);
		frontRight = new Victor(RobotMap.RIGHT_FRONT_MOTOR);
		backRight = new Victor(RobotMap.RIGHT_BACK_MOTOR);
		
		robotDrive = new RebelDrive(frontLeft, backLeft, frontRight, backRight);

	}

	public Shifter getCurrGear() {
		return currGear;
	}

	public Speed getCurrSpeed() {
		return currSpeed;
	}
	
	public void drive(Joystick joystick) {
		double moveValue = 1 * joystick.getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
		double rotateValue = 0.7 * joystick.getRawAxis(RobotMap.JOYSTICK_RIGHT_X);
		robotDrive.arcadeDrive(moveValue, rotateValue, true);
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
