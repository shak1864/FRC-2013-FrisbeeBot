package org.usfirst.frc.team1156.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1156.robot.commands.CollectorIntakeCommand;
import org.usfirst.frc.team1156.robot.commands.CollectorOutputCommand;
import org.usfirst.frc.team1156.robot.commands.FireFlipperCommand;
import org.usfirst.frc.team1156.robot.commands.FrisbeeLauncherForwardCommand;
import org.usfirst.frc.team1156.robot.commands.FrisbeeLauncherReverseCommand;
import org.usfirst.frc.team1156.robot.commands.RetractFlipperCommand;
import org.usfirst.frc.team1156.robot.commands.SetHeightHigh;
import org.usfirst.frc.team1156.robot.commands.SetHeightHighest;
import org.usfirst.frc.team1156.robot.commands.SetHeightLow;
import org.usfirst.frc.team1156.robot.commands.SetHeightMid;
import org.usfirst.frc.team1156.robot.commands.SetShooterSpeed;
import org.usfirst.frc.team1156.robot.RobotMap;
import com.walpole.frc.team.robot.lib.RebelTrigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private Joystick opStick = new Joystick(RobotMap.OPERATOR_STICK);
    private Joystick driverStick = new Joystick(RobotMap.DRIVER_JOYSTICK);
    
    // Reserved for Climbing
    Button opTriggerL = new RebelTrigger(opStick, 2);
    Button opTriggerR = new RebelTrigger(opStick, 3);
    
    Button opA = new JoystickButton(opStick, 1);
    Button opB = new JoystickButton(opStick, 2);
    Button opX = new JoystickButton(opStick, 3);
    Button opY = new JoystickButton(opStick, 4);
    
    Button drA = new JoystickButton(driverStick, 1);
    Button drB = new JoystickButton(driverStick, 2);
    Button drX = new JoystickButton(driverStick, 3);
    Button drY = new JoystickButton(driverStick, 4);
    
    Button opBumperL = new JoystickButton(opStick, 5);
    Button opBumperR = new JoystickButton(opStick, 6);
    
    Button opStart = new JoystickButton(opStick, 8);
    Button opBack = new JoystickButton(opStick, 9);
    
	
	private Button drLT = new RebelTrigger(driverStick, 2);
	private Button drRT = new RebelTrigger(driverStick, 3);
	private Button drRB = new JoystickButton(driverStick, 6);     //the drLb and drRb are the left and right bumpers on the XBOX controller
	private Button drLB = new JoystickButton(driverStick, 5 );
	
	public OI() {
		
		
		//All names are backward due to a wiring problem. Fix later
		drA.whenPressed(new SetHeightLow());
		drB.whenPressed(new SetHeightMid());
		drX.whenPressed(new SetHeightHigh());
		drY.whenPressed(new SetHeightHighest());
		
		opA.whenPressed(new SetShooterSpeed(0));
		opB.whenPressed(new SetShooterSpeed(-0.65));
		opX.whenPressed(new SetShooterSpeed(-0.85));
		opY.whenPressed(new SetShooterSpeed(-1));
		
		opBumperL.whenPressed(new FrisbeeLauncherForwardCommand());
		opBumperL.whenReleased(new FrisbeeLauncherReverseCommand());
		
		opBumperR.whenPressed(new FireFlipperCommand());
		opBumperR.whenReleased(new RetractFlipperCommand());
		
		opStart.toggleWhenPressed(new CollectorIntakeCommand());
		opBack.toggleWhenPressed(new CollectorOutputCommand());
		
		
	}
	
	public Joystick getDriverJoystick() {
		return driverStick;
	}

	public Joystick getOperatorJoystick() {
		return opStick;
	}

}
