package frc.robot.libs;

import edu.wpi.first.wpilibj.*;

public class ExtremeProLogitech{

ControllerConstants variables = new ControllerConstants();
int port; 

Joystick flightStick = new Joystick(port);

public ExtremeProLogitech(int port){
    this.port = port;
}

public double Xchannel(){
    return flightStick.getRawAxis(variables.flightStickXchannel);
}

public double Ychannel(){
    return flightStick.getRawAxis(variables.flightStickYchannel);
}

public double Zchannel(){
    return flightStick.getRawAxis(variables.Zchannel);
}

public double Slider(){
    return flightStick.getRawAxis(variables.Slider);
}

public boolean button1(){
    return flightStick.getRawButton(variables.button1);
}

public boolean button2(){
    return flightStick.getRawButton(variables.button2);
}

public boolean button3(){
    return flightStick.getRawButton(variables.button3);
}

public boolean button4(){
    return flightStick.getRawButton(variables.button4);
}

public boolean button5(){
    return flightStick.getRawButton(variables.button5);
}

public boolean button6(){
    return flightStick.getRawButton(variables.button6);
}

public boolean button7(){
    return flightStick.getRawButton(variables.button7);
}

public boolean button8(){
    return flightStick.getRawButton(variables.button8);
}

public boolean button9(){
    return flightStick.getRawButton(variables.button9);
}

public boolean button10(){
    return flightStick.getRawButton(variables.button10);
}
}
