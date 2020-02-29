package frc.robot;

import com.revrobotics.ColorSensorV3;
import edu.wpi.first.wpilibj.I2C;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorMatch;
import edu.wpi.first.wpilibj.util.Color;

public class REV3ColorSensor{
 private final I2C.Port i2c = I2C.Port.kOnboard;
 ColorSensorV3 colorSensor = new ColorSensorV3(i2c);
 ColorMatch m_colorMatcher = new ColorMatch();
 private final Color kBlueTarget = ColorMatch.makeColor(0.143, 0.427, 0.429);
  private final Color kGreenTarget = ColorMatch.makeColor(0.197, 0.561, 0.240);
  private final Color kRedTarget = ColorMatch.makeColor(0.561, 0.232, 0.114);
  private final Color kYellowTarget = ColorMatch.makeColor(0.361, 0.524, 0.113);

    public REV3ColorSensor(){
    m_colorMatcher.addColorMatch(kBlueTarget);
    m_colorMatcher.addColorMatch(kGreenTarget);
    m_colorMatcher.addColorMatch(kRedTarget);
    m_colorMatcher.addColorMatch(kYellowTarget);  
    }
    public enum colors {BLUE, GREEN, RED, YELLOW}

    public String matchColors(){
    Color detectedColor = colorSensor.getColor();
    String colorString;
    String colorData;
    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    
    if (match.color == kBlueTarget) {
      colorString = "Blue";
      System.out.println(colorString + " color");
      return colorData = "B";
    } else if (match.color == kRedTarget) {
      colorString = "Red";
      System.out.println(colorString + " color");
      return colorData = "R";
    } else if (match.color == kGreenTarget) {
      colorString = "Green";
      System.out.println(colorString + " color");
      return colorData = "G";
    } else if (match.color == kYellowTarget) {
      colorString = "Yellow";
      System.out.println(colorString + " color");
      return colorData = "Y";
    } else {
      colorString = "Unknown";
      System.out.println(colorString + " color");
      return colorData = colorString;
    }
    }
}
