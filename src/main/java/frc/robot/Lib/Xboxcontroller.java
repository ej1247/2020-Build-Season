import edu.wpi.first.wpilibj.*;



public class Xboxcontroller{

Env variables = new Env();


Joystick Xboxcontroller = new Joystick(variables.Xboxcontroller);

public Xboxcontroller(){

}

public double Xchannel(){
    return Xboxcontroller.getRawAxis(variables.Xchannel);
}

public double Ychannel(){
    return Xboxcontroller.getRawAxis(variables.Ychannel);
}

public double Ltrigger(){
    return Xboxcontroller.getRawAxis(variables.Ltrigger);
}

public double Rtrigger(){
    return Xboxcontroller.getRawAxis(variables.Rtrigger);
}

public boolean Abutton(){
    return Xboxcontroller.getRawButton(variables.Abutton);
}

public boolean Bbutton(){
    return Xboxcontroller.getRawButton(variables.Bbutton);
}

public boolean Xbutton(){
    return Xboxcontroller.getRawButton(variables.Xbutton);
}

public boolean Ybutton(){
    return Xboxcontroller.getRawButton(variables.Ybutton);
}

public boolean LeftBumperbutton(){
    return Xboxcontroller.getRawButton(variables.LeftBumperbutton);
}

public boolean RightBumperbutton(){
    return Xboxcontroller.getRawButton(variables.RightBumperbutton);
}

public boolean Backbutton(){
    return Xboxcontroller.getRawButton(variables.Backbutton);
}

public boolean Startbutton(){
    return Xboxcontroller.getRawButton(variables.Startbutton);
}

public boolean LeftStickTogglebutton(){
    return Xboxcontroller.getRawButton(variables.LeftStickTogglebutton);
}

public boolean RightStickTogglebutton(){
    return Xboxcontroller.getRawButton(variables.RightStickTogglebutton);
}



}
