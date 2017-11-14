package org.usfirst.frc.team1156.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	//Joystick variables
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_STICK = 1;

	public static final int JOYSTICK_LEFT_Y = 1;
	public static final int JOYSTICK_RIGHT_X = 4;

	//Drive Motors
	public static int LEFT_FRONT_MOTOR = 0;
	public static int LEFT_BACK_MOTOR = 1;
	public static int RIGHT_FRONT_MOTOR = 2;
	public static int RIGHT_BACK_MOTOR = 3;
	
	//Shooter Motor
	public static int SHOOTER_WHEEL = 4;
	
	//Frisbee Collector
	public static int COLLECTOR_MECHANISM = 5;
	
	//Shooter Height Pistons
	public static int PISTON_ONE_A = 0;
	public static int PISTON_ONE_B = 1;
	
	public static int PISTON_TWO_A = 2;
	public static int PISTON_TWO_B = 3;
	
	//Shooter Firing Piston
	public static int PISTON_THREE_A = 4;
	public static int PISTON_THREE_B = 5;
	
}
