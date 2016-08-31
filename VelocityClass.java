public class VelocityClass//VectorClass ??? = new VectorClass("Lawan Brown", 20);
{
    private String answer;
    private double position1;
    private double position2;
    private double velocity1;
    private double velocity2;
    private double acceleration1;
    private double time1;
    private double time2;
    private double radius;
    private double period;
    private double theta1;
    private double theta2;
    public VelocityClass()
    {
        String answer = "None";
        position1 = 0;
        position2 = 0;
        velocity1 = 0;
        velocity2 = 0;
        acceleration1 = 0;
        time1 = 0;
        time2 = 0;
        radius = 0;
        period = 0;
        theta1 = 0;
        theta2 = 0;
    }
    public VelocityClass(String a, double p1, double p2, double v1, double v2, double acc, double t1, double t2, double ra, double pe, double th1, double th2)
    {
        answer = a;
        position1 = p1;
        position2 = p2;
        velocity1 = v1;
        velocity2 = v2;
        acceleration1 = acc;
        time1 = t1;
        time2 = t2;
        radius = ra;
        period = pe;
        theta1 = th1;
        theta2 = th2;
    }
    public void set(String a, double p1, double p2, double v1, double v2, double acc, double t1, double t2, double ra, double pe, double th1, double th2)
    {
        answer = a;
        position1 = p1;
        position2 = p2;
        velocity1 = v1;
        velocity2 = v2;
        acceleration1 = acc;
        time1= t1;
        time2 =t2;
        radius = ra;
        period = pe;
        theta1 = th1;
        theta2 = th2;
    }
    public double AverageV()
    {
        return((position2-position1)/(time2-time1));
    }
    public double InstaVCA()
    {
        return(velocity1 + (acceleration1*time1));
    }
    public double AverageA()
    {
        return((velocity2-velocity1)/(time2-time1));
    }
    public double PositionX()
    {
        return(position1 + (velocity1*time1) + (.5*acceleration1*Math.pow(time1,2)));
    }
    public double VelocityWT()
    {
        return(Math.sqrt(Math.pow(velocity1,2) + (2*acceleration1*(position2-position1))));
    }
    public double PositionWAO()
    {
        return(-(((velocity1 + velocity2)/2)*time1) + position2);
    }
    public double PositionWA()
    {
        return((((velocity1 + velocity2)/2)*time1) + position1);
    }
    public double AccelerationUCM()
    {
        return(Math.pow(velocity1,2)/radius);
    }
    public double AccelerationUCMP()
    {
        return((4*Math.pow(Math.PI,2)*radius)/(Math.pow(period,2)));
    }
    public double RelativeV()
    {
        return(velocity1 + velocity2);
    }
    public double RelativeVS()
    {
        return(Math.sqrt(Math.pow(velocity1,2)+Math.pow(velocity2,2)));
    }
    public double AngularVAVG()
    {
        return((theta2 -theta1)/(time2-time1));
    }
    public double LinearFA()
    {
        return(radius*velocity1);
    }
    public double TanA()
    {
        return(acceleration1*radius);
    }
    public double RadA1()
    {
        return(Math.pow(velocity1,2)/radius);
    }
    public double RadA2()
    {
        return(Math.pow(velocity1,2)*radius);
    }
    public double VRollNSlip()
    {
        return(velocity1*radius);
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("AverageV"))
        {
            System.out.print("Average Velocity: " + AverageV()+ " m/s\n");
        }
        else if(answer.equalsIgnoreCase("InstaVCA"))
        {
            System.out.print(InstaVCA() +" m/s\n");
        }
        else if(answer.equalsIgnoreCase("AverageA"))
        {
            System.out.print("The average acceleration is " + AverageA() + " m/s^2\n");
        }
        else if(answer.equalsIgnoreCase("PositionX"))
        {
            System.out.print("The position is "+PositionX()+ " m\n");
        }
        else if(answer.equalsIgnoreCase("VelocityWT"))
        {
            System.out.print("The velocity is "+VelocityWT() + " m/s\n");
        }
        else if(answer.equalsIgnoreCase("PositionWAO"))
        {
            System.out.print("The original postion is "+PositionWAO() + " m\n");
        }
        else if(answer.equalsIgnoreCase("PositionWA"))
        {
            System.out.print("The final position is "+PositionWA() + " m\n");
        }
        else if(answer.equalsIgnoreCase("AccelerationUCM"))
        {
            System.out.print("The acceleration is "+AccelerationUCM()+ " m/s^2"+(AccelerationUCM()/9.8)+ " g's\n");
        }
        else if(answer.equalsIgnoreCase("AccelerationUCMP"))
        {
            System.out.print("The acceleration is "+AccelerationUCMP()+" m/s^2 or " +(AccelerationUCMP()/9.8)+" g's\n");
        }
        else if(answer.equalsIgnoreCase("RelativeV"))
        {
            System.out.print("The relative velocity of P to A is " +RelativeV()+ " m/s\n");
        }
        else if(answer.equalsIgnoreCase("RelativeVS"))
        {
            System.out.print("The relative velocity of P to A is " +RelativeVS()+ " m/s\n");
        }
        else if(answer.equalsIgnoreCase("AngularVAVG"))
        {
            System.out.print("The average angular velocity is " + AngularVAVG() + " rad/s\n");
        }
        else if(answer.equalsIgnoreCase("AngularVAT"))
        {
            System.out.print(InstaVCA() + " rad/s\n");
        }
        else if(answer.equalsIgnoreCase("AngularP1"))
        {
            System.out.print("The original angle is " + PositionWAO() + " radians\n");
        }
        else if(answer.equalsIgnoreCase("AngularP2"))
        {
            System.out.print("The final angle is " + PositionWA() + " radians\n");
        }
        else if(answer.equalsIgnoreCase("AngleX"))
        {
            System.out.print("The angle is "+ PositionX() + " rad\n");
        }
        else if(answer.equalsIgnoreCase("AngularVWT"))
        {
            System.out.print("The angular velocity is "+ VelocityWT() + " rad/s\n");
        }
        else if(answer.equalsIgnoreCase("LinearFA"))
        {
            System.out.print("The linear speed " + LinearFA() + " m/s\n");
        }
        else if(answer.equalsIgnoreCase("TanA"))
        {
            System.out.print("The tangential acceleration is " + TanA() + " m/s^2\n");
        }
        else if(answer.equalsIgnoreCase("RadA1"))
        {
            System.out.print("The centripital acceleration is " + RadA1() + " m/s^2\n");
        }
        else if (answer.equalsIgnoreCase("RadA2"))
        {
            System.out.print("The centripital acceleration is " + RadA2() + " m/s^2\n");
        }
        else if(answer.equalsIgnoreCase("VRollNSlip"))
        {
            System.out.print("The velocity is " + VRollNSlip() + " m/s\n");
        }
    }
}
