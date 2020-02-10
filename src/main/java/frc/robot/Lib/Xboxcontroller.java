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

public int Abutton(){
    return Xboxcontroller.getRawButton(variables.Abutton);
}

public int Bbutton(){
    return Xboxcontroller.getRawButton(variables.Bbutton);
}

public int Xbutton(){
    return Xboxcontroller.getRawButton(variables.Xbutton);
}

public int Ybutton(){
    return Xboxcontroller.getRawButton(variables.Ybutton);
}

public int LeftBumperbutton(){
    return Xboxcontroller.getRawButton(variables.LeftBumperbutton);
}

public int RightBumperbutton(){
    return Xboxcontroller.getRawButton(variables.RightBumperbutton);
}

public int Backbutton(){
    return Xboxcontroller.getRawButton(variables.Backbutton);
}

public int Startbutton(){
    return Xboxcontroller.getRawButton(variables.Startbutton);
}

public int LeftStickTogglebutton(){
    return Xboxcontroller.getRawButton(variables.LeftStickTogglebutton);
}

public int RightStickTogglebutton(){
    return Xboxcontroller.getRawButton(variables.RightStickTogglebutton);
}

public int Abutton(){
    return Xboxcontroller.getRawButton(variables.Abutton);
}

}
