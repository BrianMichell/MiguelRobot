// Chances are you will have to change the package name to fit your current package
package org.usfirst.frc.team6488.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	VictorSP motor;
	Joystick driver;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		motor = new VictorSP(0);
		driver = new Joystick(0);
	}
	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
	}
	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
	}
	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		motor.setSpeed(driver.getRawAxis(1);
	}
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}


/*
package org.usfirst.frc.team6488.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotDrive chassis;
	Joystick driver;
	Double driftPercentage;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chassis = new RobotDrive(0, 1);
		driver = new Joystick(0);
		driftPercentage = 0.25;
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {

	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Double vel = driver.getRawAxis(1);
		Double turn = driver.getRawAxis(2) * -1; // Inverted axis in software
		if (driver.getRawButton(1) && driftPercentage <= 0.9) {
			driftPercentage += 0.05;
			System.out.println("Percentage now at: " + driftPercentage);
		} else if (driver.getRawButton(2) && driftPercentage >= 0.1) {
			driftPercentage -= 0.05;
			System.out.println("Percentage now at: " + driftPercentage);
		}
		turn -= drift(vel); // Subtract power from the turn
		chassis.arcadeDrive(vel, turn);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}

	/**
	 * A quadratic correction for drift on the robot. Not great to compensate
	 * for in software but all I can do right now.
	 * 
	 * TODO Find the hardware problem!
	 * 
	 * @author Brian
	 * @param velValue
	 *            The value of the forward/backward velocity
	 * @return A percentage of the velocity dependent on driftPercentage.
	 */
	public Double drift(Double velValue) {
		Double tmp = velValue;
		tmp *= driftPercentage;
		tmp = Math.pow(tmp, 1.25);
		return tmp;
	}
}
*/
