package org.usfirst.frc.team2508.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2508.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	public Joystick stick = new Joystick(1);
	public Button a = new JoystickButton(stick, 1);
	public Button b = new JoystickButton(stick, 2);
	public Button c = new JoystickButton(stick, 3);
	public Button d = new JoystickButton(stick, 4);
	public Button lb = new JoystickButton(stick, 5);
	public Button rb = new JoystickButton(stick, 6);
	public Button lt = new JoystickButton(stick, 7);
	public Button rt = new JoystickButton(stick, 8);
	public Button back = new JoystickButton(stick, 9);
	public Button start = new JoystickButton(stick, 10);
	public Button pad_left = new JoystickButton(stick, 11);
	public Button pad_right = new JoystickButton(stick, 12);
	public Button pad_up = new JoystickButton(stick, 13);
	public Button pad_down = new JoystickButton(stick, 14);
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());
	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
