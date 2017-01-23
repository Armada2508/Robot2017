package org.usfirst.frc.team2508.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2508.robot.Robot;
import org.usfirst.frc.team2508.robot.subsystems.DriveSystem;
/**
 *
 */
public class DriveRobot extends Command {

    public DriveRobot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSystem.drive(Robot.oi.stick.getRawAxis(1), Robot.oi.stick.getRawAxis(5));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
