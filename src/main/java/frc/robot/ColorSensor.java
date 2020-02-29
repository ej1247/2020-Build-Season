package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;

public class ColorSensor{
REV3ColorSensor colorSensor;
SpeedController m_colorMotor = new Spark(0);

private String value = "Unknown";
Dashboard newDash;

    public ColorSensor(){
        colorSensor = new REV3ColorSensor();
        newDash =new Dashboard();
    }
    public Boolean getColorValue(){
        readFMS();
        return newDash.putString("Color ",  getFMSColor());
    }
    public String getFMSColor(){
        return this.value;
    }
    public void setColorValue(String value){
        this.value = value;
    }
    public void readFMS(){
        String gameData;
        String colorValue;
        gameData = DriverStation.getInstance().getGameSpecificMessage();
        if(gameData.length() > 0)
        {       
        switch (gameData.charAt(0))
        {
        case 'B' :
        //Blue case code
        System.out.println("R");
        colorValue = "R";
        setColorValue(colorValue);
        break;
        case 'G' :
        //Green case code
        System.out.println("Y");
        colorValue = "Y";
        setColorValue(colorValue);
        break;
        case 'R' :
        //Red case code
        System.out.println("B");
        colorValue = "B";
        setColorValue(colorValue);
        break;
        case 'Y' :
        //Yellow case code
        System.out.println("G");
        colorValue = "G";
        setColorValue(colorValue);
        break;
        default :
        colorValue = "Unknown";
        setColorValue(colorValue);
        break;
        }
        } else {

        }   
    }
    public String colorSensor(){
        return colorSensor.matchColors();
    }
    public void startColorMotor(){
            m_colorMotor.set(0.2);
    }
    public void stopColorMotor(){
    m_colorMotor.set(0.0);
    }
    public void runWheel(Boolean on){
    if(colorSensor().equals(getFMSColor()) && on == true){
        stopColorMotor();
    }else if(on == false){
        stopColorMotor();
    }else{
        startColorMotor(); 
    }
}
}