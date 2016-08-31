public class ForceClass
{
    private String answer;
    private double forcex1;
    private double forcey1;
    private double forcex2;
    private double forcey2;
    private double forcex3;
    private double forcey3;
    private double theta1;
    private double theta2;
    private double theta3;
    private double mass;
    private double acceleration;
    public ForceClass()
    {
        String answer = "None";
        forcex1 = 0;
        forcey1 = 0;
        forcex2 = 0;
        forcey2 = 0;
        forcex3 = 0;
        forcey3 = 0;
        theta1 = 0;
        theta2 = 0;
        theta3 = 0;
        mass = 0;
        acceleration = 0;
    }
    public ForceClass(String a, double fx1, double fy1, double fx2, double fy2, double fx3, double fy3, double th1, double th2, double th3, double m, double acc)
    {
        answer = a;
        forcex1 = fx1;
        forcey1 = fy1;
        forcex2 = fx2;
        forcey2 = fy2;
        forcex3 = fx3;
        forcey3 = fy3;
        theta1 = th1;
        theta2 = th2;
        theta3 = th3;
        mass = m;
        acceleration = acc;
    }
    public void set(String a, double fx1, double fy1, double fx2, double fy2, double fx3, double fy3, double th1, double th2, double th3, double m, double acc)
    {
        answer = a;
        forcex1 = fx1;
        forcey1 = fy1;
        forcex2 = fx2;
        forcey2 = fy2;
        forcex3 = fx3;
        forcey3 = fy3;
        theta1 = th1;
        theta2 = th2;
        theta3 = th3;
        mass = m;
        acceleration = acc;
    }
    public double Resultantx2()
    {
        return((forcex1*Math.cos(theta1/57)) + (forcex2*Math.cos(theta2/57)));
    }
    public double Resultanty2()
    {
        return((forcey1*Math.sin(theta1/57)) + (forcey1*Math.sin(theta2/57)));
    }
    public double Resultantx3()
    {
        return((forcex1*Math.cos(theta1/57)) + (forcex2*Math.cos(theta2/57)) + (forcex3*Math.cos(theta3/57)));
    }
    public double Resultanty3()
    {
        return((forcey1*Math.sin(theta1/57)) + (forcey2*Math.sin(theta2/57)) + (forcey3*Math.sin(theta3/57)));
    }
    public double ResultantTot2()
    {
        return(Math.sqrt(Math.pow(Resultantx2(),2) + (Math.pow(Resultanty2(),2))));
    }
    public double ResultantTot3()
    {
        return(Math.sqrt(Math.pow(Resultantx3(),2) + (Math.pow(Resultanty3(),2))));
    }
    public double Force()
    {
        return(mass*acceleration);
    }
    public double Weight()
    {
        return(mass*acceleration);
    }
    public double CKF()
    {
        return(forcex2/forcex1);
    }
    public double MKF()
    {
        return(forcex1*forcex2);
    }
    public double CSF()
    {
        return(forcex2/forcex1);
    }
    public double MSF()
    {
        return(forcex1*forcex2);
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("Resultant2"))
        {
            System.out.print("\nThe resultant force in the x direction is " + Resultantx2() + " N\n");
            System.out.print("The resultant force in the y direction is " + Resultanty2() + " N\n");
            System.out.print("The total magnitude of the force is " +ResultantTot2()+ " N\n");
        }
        else if(answer.equalsIgnoreCase("Resultant3"))
        {
            System.out.print("\nThe resultant force in the x direction is " + Resultantx3() + " N\n");
            System.out.print("The resultant force in the y direction is " + Resultanty3() + " N\n");
            System.out.print("The total magnitude of the force is " +ResultantTot3()+ " N\n");
        }
        else if(answer.equalsIgnoreCase("Force"))
        {
            System.out.print("The force exerted on the mass is " + Force() + " N\n");
        }
        else if(answer.equalsIgnoreCase("Weight"))
        {
            System.out.print("The weight of the mass is " + Weight() + " N" + " or " +(Weight()*.225)+ " pounds\n");
        }
        else if(answer.equalsIgnoreCase("NTL"))
        {
            System.out.print("The opposing force is " + -forcex1 + " N\n");
        }
        else if(answer.equalsIgnoreCase("CKF"))
        {
            System.out.print("The coefficient of kinetic friction is " + CKF() + "\n");
        }
        else if(answer.equalsIgnoreCase("MKF"))
        {
            System.out.print("The magnitude of kinetic friction is " + MKF() + " N" + " or " +(MKF()*.225)+ " pounds\n");
        }
        else if(answer.equalsIgnoreCase("CST"))
        {
            System.out.print("The coefficient of static friction is " + CSF() + "\n");
        }
        else if(answer.equalsIgnoreCase("MSF"))
        {
            System.out.print("The magnitude of static friction is " + MSF() + " N"+ " or " +(MSF()*.225)+ " pounds\n");
        }
    }
}
