package org.usfirst.frc.team2508.robot.subsystems;

import org.usfirst.frc.team2508.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void leftSideControll(double power){
		Robot.oi.lu.set(power);
		Robot.oi.ll.set(power);
	}
	public void rightSideControll(double power){
		Robot.oi.ru.set(power);
		Robot.oi.rl.set(power);
	}
	public void drive(double powerL, double powerR){
			leftSideControll(powerL);
			rightSideControll(powerR);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
}
