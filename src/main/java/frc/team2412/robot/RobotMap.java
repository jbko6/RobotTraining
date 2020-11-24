package frc.team2412.robot;

import com.revrobotics.CANSparkMax;

//This is the class in charge of all the motors, motor ids, and any other sensors the robot uses. 
//remember to declare robot container at the bottom of this class 
public class RobotMap {

	// IDs
	public static int exampleID = 1;
	
	int motorID = 0;
	public static CANSparkMax rightLiftMotor = new CANSparkMax(motorID);
	
	// Robot container
	public static RobotContainer robotContainer = new RobotContainer();
	
	public static OI OI = new OI(robotContainer);
	
}
