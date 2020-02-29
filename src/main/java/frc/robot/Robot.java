/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;

/**
 * This is a demo program showing the use of the DifferentialDrive class.
 * Runs the motors with arcade steering.
 */
public class Robot extends TimedRobot {
SpeedController m_right = new Spark(1);
SpeedController m_right2 = new Spark(2);
SpeedController m_left = new Spark(3);
SpeedController m_left2 = new Spark(4);
SpeedController m_belt = new VictorSP(5);
SpeedControllerGroup m_beltDrive = new SpeedControllerGroup(m_belt);
SpeedControllerGroup m_l = new SpeedControllerGroup(m_left, m_left2);
SpeedControllerGroup m_r = new SpeedControllerGroup(m_right, m_right2);
DifferentialDrive m_robotDrive = new DifferentialDrive(m_l, m_r);
ColorSensor colorSensor = new ColorSensor(); 
Xbox m_stick = new Xbox(0);
int counter = 0;

  @Override
public void teleopPeriodic() {
  colorSensor.getColorValue();
  System.out.println(counter);
  if(m_stick.Ybutton()){
    counter++;
  }
  if((counter ==1)){
     colorSensor.runWheel(true);
  } else{
    colorSensor.stopColorMotor();
  }
  if(counter == 2){
    counter =0;
    colorSensor.stopColorMotor();
  }
}
}

  //  System.out.println("counter " + counter);
       // m_l.set(0.5);
    // m_r.set(0.5);
    
    // Drive with arcade drive.
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
    // m_right.setInverted(true);
    // m_right2.setInverted(true);
    //m_robotDrive.arcadeDrive(m_stick.getRawAxis(4), m_stick.getRawAxis(1));
