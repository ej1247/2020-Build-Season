/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import org.json.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.sensors.ColorSensor;
import frc.robot.libs.Xbox;
import java.io.File;
import org.apache.commons.io.FileUtils;


/**
 * This is a demo program showing the use of the DifferentialDrive class.
 * Runs the motors with arcade steering.
 */
public class Robot extends TimedRobot  {

SpeedController m_right = new Spark(1);
SpeedController m_right2 = new Spark(2);
SpeedController m_left = new Spark(3);
SpeedController m_left2 = new Spark(4);
SpeedController m_belt = new VictorSP(5);
SpeedController m_magazine = new VictorSP(6);
SpeedControllerGroup m_beltDrive = new SpeedControllerGroup(m_belt);
SpeedControllerGroup m_l = new SpeedControllerGroup(m_left, m_left2);
SpeedControllerGroup m_r = new SpeedControllerGroup(m_right, m_right2);
DifferentialDrive m_robotDrive = new DifferentialDrive(m_l, m_r);
ColorSensor colorSensor = new ColorSensor(); 
Xbox m_stick = new Xbox(0);
int counter = 0;


public void tumblr(boolean enabled){
  if(enabled == true){
    double speed = 0;
        
    if((m_stick.getRawAxis(2))>= 1){
      speed = 0.3;
      m_belt.set(speed);
    } else if((m_stick.getRawAxis(3))>= 1){
      speed = -0.3;
      m_belt.set(speed);
    }else{
       speed = 0; 
       m_belt.set(speed);
     }
  }else{
    System.out.println("Belt is disabled");
  }
}

public void magazine(boolean enabled){
  if(enabled == true){

    if(m_stick.Abutton()){
      m_right2.setInverted(false);
      m_magazine.set(1);
      System.out.println("A");
    }else if(m_stick.Bbutton()){
      m_right2.setInverted(true);
      m_magazine.set(1);
      System.out.println("B");
    }else{
      m_magazine.set(0);
    }
  }else{
    System.out.println("magazine is disabled");
  }
} 

public void drive(boolean enabled,double speed){
if(enabled == true){
    m_l.set(speed);
    m_r.set(speed);
    
    // Drive with arcade drive.
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
    m_right.setInverted(true);
    m_right2.setInverted(true);
    m_robotDrive.arcadeDrive(m_stick.getRawAxis(4), m_stick.getRawAxis(1));
    
}else{
System.out.println("Drive is disabled");
}
}

public void colorSensor(boolean enabled){
  if(enabled == true){
  colorSensor.getColorValue();
  System.out.println(counter);
  if(m_stick.Ybutton()){
    counter++;
    colorSensor.colorCounter = 0;
  }
    if(m_stick.Xbutton()){
    colorSensor.countColors(2);
  }
  if((counter ==1)){
     colorSensor.runWheel(true);
  } else{
    colorSensor.runWheel(false);
  }
  if(counter == 2){
    counter =0;
    colorSensor.runWheel(false);
  }

  }else{
    System.out.println("Color sensor is disabled");
  }
} 

public void features() throws Exception{
  File file = new File("teamvars/vars.json");
  String content = FileUtils.readFileToString(file, "utf-8");

  JSONObject json = new JSONObject(content);
  System.out.println(json.get("drive"));

}
@Override
public void teleopPeriodic() {
  try
  {
  features();
  }catch(Exception e){

  }
  // tumblr(true);
 /* String features = json.getJSONObject("");
  for()
}
*/
}
  
}