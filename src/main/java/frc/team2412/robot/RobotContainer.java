package frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import frc.team2412.robot.Subsystems.ExampleSubsystem;
import frc.team2412.robot.Subsystems.LiftSubsystem;

// this is the class for containing all the subsystems and OI of the robot
public class RobotContainer {

	// Subsystems
	public ExampleSubsystem m_ExampleSubsystem;
	
	public LiftSubsystem liftSubsystem;

	public RobotContainer() {
		// create and instance of example subsystem with the id from robot map
		m_ExampleSubsystem = new ExampleSubsystem(RobotMap.exampleID);
		
		WPI_TalonFX pi = new WPI_TalonFX(0);
		
		
	}
}
