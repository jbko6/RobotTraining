package frc.team2412.robot;

import frc.team2412.robot.Subsystems.ExampleSubsystem;
import frc.team2412.robot.Subsystems.ShooterSubsystem;
import static frc.team2412.robot.RobotMap.*;

// this is the class for containing all the subsystems and OI of the robot
public class RobotContainer {
	// OI
	public OI m_OI;

	// Subsystems
	public ExampleSubsystem m_ExampleSubsystem;
	
	public ShooterSubsystem shooterSubsystem;

	public RobotContainer() {
		// create and instance of example subsystem with the id from robot map
		m_ExampleSubsystem = new ExampleSubsystem(RobotMap.exampleID);
		
		shooterSubsystem = new ShooterSubsystem(shooterRightMotor, shooterLeftMotor);

		// create an OI object
		m_OI = new OI();
	}
}
