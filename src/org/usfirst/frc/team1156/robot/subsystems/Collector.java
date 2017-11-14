package org.usfirst.frc.team1156.robot.subsystems;

import org.usfirst.frc.team1156.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Collector extends Subsystem {
	
	private SpeedController collector;
	
	public Collector() {
		
		collector = new Victor(RobotMap.COLLECTOR_MECHANISM);
	}

	public void frisbeeIntake() {
		
		collector.set(1);
		
	}
	
	public void frisbeeOutput() {
		
		collector.set(-1);
		
	}
	
	public void frisbeeStop() {
		
		collector.set(0);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

