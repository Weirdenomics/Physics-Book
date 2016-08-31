public class WorkClass//ForceClass ??? = new WorkClass("Lawan Brown", 20);
{
    private String answer;
    private double forcex1;
    private double forcey1;
    private double distancex1;
    private double distancey1;
    private double distancez1;
    private double theta1;
    private double theta2;
    private double theta3;
    private double mass1;
    private double mass2;
    private double mass3;
    private double velocity1;
    private double velocity2;
    private double velocity3;
    private double gravity;
    private double time1;
    private double time2;
    
    public WorkClass()
    {
        String answer = "None";
        forcex1 = 0;
        forcey1 = 0;
        distancex1 = 0;
        distancey1 = 0;
        distancez1 = 0;
        theta1 = 0;
        theta2 = 0;
        theta3 = 0;
        mass1 = 0;
        mass2 = 0;
        mass3 = 0;
        velocity1 = 0;
        velocity2 = 0;
        velocity3 = 0;
        gravity = 0;
        time1 = 0;
        time2 = 0;
    }
    public WorkClass(String a, double fx1, double fy1, double dx1, double dy1, double dz1, double th1, double th2, double th3, double m1,double m2, double m3, double v1, double v2, double v3, double g, double t1, double t2)
    {
        answer = a;
        forcex1 = fx1;
        forcey1 = fy1;
        distancex1 = dx1;
        distancey1 = dy1;
        distancez1 = dz1;
        theta1 = th1;
        theta2 = th2;
        theta3 = th3;
        mass1 = m1;
        mass2 = m2;
        mass3 = m3;
        velocity1 = v1;
        velocity2 = v2;
        velocity3 = v3;
        gravity = g;
        time1 = t1;
        time2 = t2;
    }
    public void set(String a, double fx1, double fy1, double dx1, double dy1, double dz1, double th1, double th2, double th3, double m1, double m2, double m3, double v1, double v2, double v3, double g, double t1, double t2)
    {
        answer = a;
        forcex1 = fx1;
        forcey1 = fy1;
        distancex1 = dx1;
        distancey1 = dy1;
        distancez1 = dz1;
        theta1 = th1;
        theta2 = th2;
        theta3 = th3;
        mass1 = m1;
        mass2 = m2;
        mass3 = m3;
        velocity1 = v1;
        velocity2 = v2;
        velocity3 = v3;
        gravity = g;
        time1 = t1;
        time2 = t2;
    }
    public double WorkA()
    {
        return(forcex1*distancex1*Math.cos(theta1/57));
    }
    public double WorkD()
    {
        return((forcex1*distancex1) + (forcey1 *distancey1));
    }
    public double KEnergy()
    {
        return(.5*mass1*Math.pow(velocity1,2));
    }
    public double WorkK()
    {
        return(forcey1 - forcex1);
    }
    public double PowerA()
    {
        return(forcex1/forcey1);
    }
    public double PowerD()
    {
        return((forcex1*distancex1) + (forcey1 *distancey1));
    }
    public double WorkW()
    {
        return((mass1*gravity*distancex1) - (mass1*gravity*distancey1));
    }
    public double EnergyP()
    {
        return(mass1*gravity*distancey1);
    }
    public double EnergyPT()
    {
        return(forcex1 - forcey1);
    }
    public double TotME()
    {
        return((.5*mass1*Math.pow(velocity1,2)) + (mass1*gravity*distancey1));
    }
    public double EnergyPE()
    {
        return(.5*forcex1*Math.pow(distancex1,2));
    }
    public double WorkEPE()
    {
        return(forcex1 - forcey1);
    }
    public double TotEPE()
    {
        return((1/2*mass1*Math.pow(velocity1,2)) + (1/2*forcex1*Math.pow(distancex1,2)));
    }
    public double Mom()
    {
        return(mass1*velocity1);
    }
    public double Impulse()
    {
        return(forcex1*(time2-time1));
    }
    public double ImpulseP()
    {
        return(forcey1 - forcex1);
    }
    public double Mom2()
    {
        return((mass1*velocity1) + (mass2*velocity2));
    }
    public double Mom3()
    {
        return((mass1*velocity1) + (mass2*velocity2) + (mass3*velocity3));
    }
    public double COM()
    {
        return(mass1*distancex1);
    }
    public double COM2()
    {
        return((mass1*distancex1) + (mass2*distancey1));
    }
    public double COM3()
    {
        return((mass1*distancex1) + (mass2*distancey1) + (mass3*distancez1));
    }
    public double MOI()
    {
        return((mass1*Math.pow(distancex1,2)) + (mass2*Math.pow(distancey1,2)));
    }
    public double RotKE()
    {
        return(.5*mass1*Math.pow(velocity1,2));
    }
    public double InertiaPAT()
    {
        return(mass1 +(mass2*Math.pow(distancex1,2)));
    }
    public double WorkCT()
    {
        return(forcex1*(theta2-theta1));
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("WorkA"))
        {
            System.out.print("\nThe work done is " + WorkA() + " J\n");
        }
        else if(answer.equalsIgnoreCase("Workd"))
        {
            System.out.print("\nThe work done is " + WorkD() + " J\n");
        }
        else if(answer.equalsIgnoreCase("KEnergy"))
        {
            System.out.print("\nThe kinetic energy is " + KEnergy() + " J\n");
        }
        else if(answer.equalsIgnoreCase("WorkK"))
        {
            System.out.print("\nThe work done is " + WorkK() + " J\n");
        }
        else if(answer.equalsIgnoreCase("PowerA"))
        {
            System.out.print("\nThe average power is " + PowerA() + " W\n");
        }
        else if(answer.equalsIgnoreCase("PowerD"))
        {
            System.out.print("\nThe power is " + PowerD() + " W\n");
        }
        else if(answer.equalsIgnoreCase("WorkW"))
        {
            System.out.print("\nThe work done is " + WorkW() + " J\n");
        }
        else if(answer.equalsIgnoreCase("EnergyP"))
        {
            System.out.print("\nThe potential energy is " + EnergyP() + " J\n");
        }
        else if(answer.equalsIgnoreCase("EnergyPT"))
        {
            System.out.print("\nThe work done by gravity is " + EnergyPT() + " J\n");
        }
        else if(answer.equalsIgnoreCase("TotME"))
        {
            System.out.print("\n The total mechanical energy is " + TotME() + " J\n");
        }
        else if(answer.equalsIgnoreCase("EnergyPE"))
        {
            System.out.print("\nThe elastic potential energy is " + EnergyPE() + " J\n");
        }
        else if(answer.equalsIgnoreCase("WorkEPE"))
        {
            System.out.print("\nThe work done by the elastic force is " + WorkEPE() + " J\n");
        }
        else if(answer.equalsIgnoreCase("TotEPE"))
        {
            System.out.print("\nThe total mechanical energy is " + TotEPE() + " J\n");
        }
        else if(answer.equalsIgnoreCase("Mom"))
        {
            System.out.print("\nThe momentum is " + Mom() + " kg*m/s\n");
        }
        else if(answer.equalsIgnoreCase("Impulse"))
        {
            System.out.print("\nThe impulse is " + Impulse() + " N*s\n");
        }
        else if(answer.equalsIgnoreCase("ImpulseP"))
        {
            System.out.print("\nThe impulse is " + ImpulseP() + " N*s\n");
        }
        else if(answer.equalsIgnoreCase("Mom2"))
        {
            System.out.print("\nThe total momentum " + Mom2() + " kg*m/s\n");
        }
        else if(answer.equalsIgnoreCase("Mom3"))
        {
            System.out.print("\nThe total momentum " + Mom3() + " kg*m/s\n");
        }
        else if(answer.equalsIgnoreCase("COM"))
        {
            System.out.print("\nThe distance to the center of mass is " + COM() + " m\n");
        }
        else if(answer.equalsIgnoreCase("COM2"))
        {
            System.out.print("\nThe distance to the center of mass is " + COM2() + " m\n");
        }
        else if(answer.equalsIgnoreCase("COM3"))
        {
            System.out.print("\nThe distance to the center of mass is " + COM3() + " m\n");
        }
        else if(answer.equalsIgnoreCase("MOI"))
        {
            System.out.print("The moment of inertia is " + MOI() + " kg*m^2\n");
        }
        else if(answer.equalsIgnoreCase("RotKE"))
        {
            System.out.print("The rotational kinetic energy  is " + RotKE() + " J\n");
        }
        else if(answer.equalsIgnoreCase("InertiaPAT"))
        {
            System.out.print("The inertia for along a parallel axis is " + InertiaPAT() + " kg*m^2\n");
        }
        else if(answer.equalsIgnoreCase("WorkCT"))
        {
            System.out.print("The work done is " + WorkCT() + " J\n");
        }
    }
}
