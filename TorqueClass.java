public class TorqueClass//TorqueClass ??? = new TorqueClass("Lawan Brown", 20);
{
    private String answer;
    private double force1;
    private double marm1;
    private double theta1;
    private double mass1;
    private double velocity1;
    public TorqueClass()
    {
        String answer = "None";
        force1 = 0;
        marm1 = 0;
        theta1 = 0;
        mass1 = 0;
        velocity1 = 0;
    }
    public TorqueClass(String a, double f1, double mar1, double th1, double m1, double v1)
    {
        answer = a;
        force1 = f1;
        marm1 = mar1;
        theta1 = th1;
        mass1 = m1;
        velocity1 =v1;
    }
    public void set(String a, double f1, double mar1, double th1, double m1, double v1)
    {
        answer = a;
        force1 = f1;
        marm1 = mar1;
        theta1 = th1;
        mass1 = m1;
        velocity1 = v1;
    }
    public double Torque1()
    {
        return(force1*marm1);
    }
    public double Torque2()
    {
        return(marm1*force1*Math.sin(theta1/57));
    }
    public double Torque3()
    {
        return(force1*marm1);
    }
    public double TorqueV()
    {
        return(force1*marm1*Math.sin(theta1/57));
    }
    public double AngAcc()
    {
        return((2*force1)/(mass1*marm1));
    }
    public double TorqueP()
    {
        return(force1*velocity1);
    }
    public double AngularM1()
    {
        return(marm1*force1);
    }
    public double AngularM2()
    {
        return(marm1 *(mass1*velocity1));
    }
    public double AngularM3()
    {
        return(mass1*velocity1);
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("Torque1"))
        {
            System.out.print("The torque is " + Torque1() + " N*m\n");
        }
        else if(answer.equalsIgnoreCase("Torque2"))
        {
            System.out.print("The torque is " + Torque2() + " N*m\n");
        }
        else if(answer.equalsIgnoreCase("Torque3"))
        {
            System.out.print("The torque is " + Torque3() + " N*m\n");
        }
        else if(answer.equalsIgnoreCase("TorqueV"))
        {
            System.out.print("The torque vector is " + TorqueV() + " N*m\n");
        }
        else if(answer.equalsIgnoreCase("AngAcc"))
        {
            System.out.print("The angular acceleration is " + AngAcc() + " rad/s^2\n");
        }
        else if(answer.equalsIgnoreCase("TorqueP"))
        {
            System.out.print("The power of the torque is " + TorqueP() + " W\n");
        }
        else if(answer.equalsIgnoreCase("AngularM1"))
        {
            System.out.print("The angular momentum is " + AngularM1() + " kg*m^2/s\n");
        }
        else if(answer.equalsIgnoreCase("AngularM2"))
        {
            System.out.print("The angular momentum is " + AngularM2() + " kg*m^2/s\n");
        }
        else if(answer.equalsIgnoreCase("AngularM3"))
        {
            System.out.print("The angular momentum is " + AngularM3() + " kg*m^2/s\n");
        }
    }
}
