public class EnergyClass
{
    private String answer;
    private double mass1;
    private double velocity1;
    private double distance1;
    
    public EnergyClass()
    {
        String answer = "None";
        mass1 = 0;
        velocity1 = 0;
        distance1 = 0;
    }
    public EnergyClass(String a, double m1, double v1, double d1)
    {
        answer = a;
        mass1 = m1;
        velocity1 = v1;
        distance1 = d1;
        
    }
    public void set(String a, double m1, double v1, double d1)
    {
        answer = a;
        mass1 = m1;
        velocity1 = v1;
        distance1 = d1;
    }
    public double KETR()
    {
        return((1/2*mass1*Math.pow(velocity1, 2))+(1/2*(1/2*mass1*Math.pow(distance1,2))*(Math.pow(velocity1,2)/Math.pow(distance1,2))));
    }
    
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("KETR"))
        {
            System.out.print("The kinetic energy is " + KETR() + " J\n");
        }
    }
}