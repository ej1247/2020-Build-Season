package frc.robot.dashboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Dashboard {

    public Dashboard(){
        
    }
    public double getNumber(String key,double number){
        return SmartDashboard.getNumber(key,number);
    }

    public boolean putNumber(String key,double number){
        return SmartDashboard.putNumber(key,number);
    }
    public boolean putString(String key, String value){
        return SmartDashboard.putString(key,value);
    }
}