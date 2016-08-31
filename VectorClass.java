public class VectorClass //VectorClass ??? = new VectorClass("Lawan Brown", 20);
{
    private String answer;
    private double vectorx1;
    private double vectorx2;
    private double vectory1;
    private double vectory2;
    private double vectorz1;
    private double vectorz2;
    private double resultant1;
    private double resultant2;
    private double time1;
    private double time2;
    private double theta;
    private double gravity;
    public VectorClass()
    {
        String answer = "None";
        vectorx1 = 0;
        vectorx2 = 0;
        vectory2 = 0;
        vectory2 = 0;
        vectorz1 = 0;
        vectorz2 = 0;
        resultant1 = 0;
        resultant2 = 0;
        time1 = 0;
        time2 = 0;
        theta = 0;
        gravity = 0;
    }
    public VectorClass(String a, double vx1, double vx2, double vy1, double vy2, double vz1, double vz2, double r1, double r2, double t1, double t2, double th, double gr )
    {
        answer = a;
        vectorx1 = vx1;
        vectorx2 = vx2;
        vectory1 = vy1;
        vectory2 = vy2;
        vectorz1 = vz1;
        vectorz2 = vz2;
        resultant1 = r1;
        resultant2 = r2;
        time1 = t1;
        time2 = t2;
        theta = th;
        gravity = gr;
    }
    public void set(String a, double vx1, double vx2, double vy1, double vy2, double vz1, double vz2, double r1, double r2, double t1, double t2, double th, double gr)
    {
        answer = a;
        vectorx1 = vx1;
        vectorx2 = vx2;
        vectory1 = vy1;
        vectory2 = vy2;
        vectorz1 = vz1;
        vectorz2 = vz2;
        resultant1 = r1;
        resultant2 = r2;
        time1 = t1;
        time2 = t2;
        theta = th;
        gravity = gr;
    }
    public double resultant()
    {
        return(Math.sqrt(Math.pow(vectorx1,2) + Math.pow(vectory1,2) + Math.pow(vectorz1,2)));
    }
    public double componentx()
    {
        return(resultant1*Math.cos(theta/57));
    }
    public double componenty()
    {
        return(resultant1*Math.sin(theta/57));
    }
    public double scalar()
    {
        return(resultant1*resultant2*Math.cos(theta/57));
    }
    public double Vectorp()
    {
        return(resultant1*resultant2*Math.sin(theta/57));
    }
    public double PositionVX()
    {
        return(vectorx2-vectorx1);
    }
    public double PositionVY()
    {
        return(vectory2-vectory1);
    }
    public double PositionVZ()
    {
        return(vectorz2-vectorz1);
    }
    public double AverageVV()
    {
        return((resultant2-resultant1)/(time2-time1));
    }
    public double AverageAV()
    {
        return((vectorx2-vectorx1)/(time2-time1));
    }
    public double ProjectilePX()
    {
        return((vectorx1 * Math.cos(theta/57))*time1);
    }
    public double ProjectilePY()
    {
        return((vectorx1 * Math.sin(theta/57)) * time1 - (.5*gravity * Math.pow(time1,2)));
    }
    public double ProjectileVX()
    {
        return(vectorx1 * Math.cos(theta/57));
    }
    public double ProjectileVY()
    {
        return((vectorx1 * Math.sin(theta/57)) - (gravity*time1));
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("Resultant"))
        {
            System.out.print("Resultant: " + resultant()+ " Meters\n");
        }
        else if(answer.equalsIgnoreCase("Components"))
        {
            System.out.print("X-component: " + componentx() + " Meters");
            System.out.print("\nY-component: " + componenty() + " Meters\n");
        }
        else if(answer.equalsIgnoreCase("Scalar"))
        {
            System.out.print("Scalar Product: " + scalar()+ "\n");
        }
        else if(answer.equalsIgnoreCase("Vectorp"))
        {
            System.out.print("Vector Product: " + Vectorp()+ "\n");
        }
        else if(answer.equalsIgnoreCase("PositionV"))
        {
            System.out.print("Position Vectors: "+PositionVX()+ "i + " + PositionVY()+"j + "+ PositionVZ()+"k\n");
        }
        else if(answer.equalsIgnoreCase("AverageVV"))
        {
            System.out.print("The average vector velocity: "+AverageVV()+" m/s\n");
        }
        else if(answer.equalsIgnoreCase("AverageAV"))
        {
            System.out.print("The average acceleration vector: "+AverageAV()+" m/s^2\n");
        }
        else if(answer.equalsIgnoreCase("ProjectilePX"))
        {
            System.out.print("The projectile component in the x direction: "+ProjectilePX()+ " m\n");
        }
        else if(answer.equalsIgnoreCase("ProjectilePY"))
        {
            System.out.print("The projectile component in the y direction: "+ProjectilePY()+ " m\n");
        }
        else if(answer.equalsIgnoreCase("ProjectileVX"))
        {
            System.out.print("The projectile velocity in the x direction: " +ProjectileVX()+ " m/s\n");
        }
        else if(answer.equalsIgnoreCase("ProjectileVY"))
        {
            System.out.print("The projectile velocity in the y direction: "+ProjectileVY()+ " m/s\n");
        }
    }
}