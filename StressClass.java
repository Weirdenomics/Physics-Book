public class StressClass
{
    private String answer;
    private double mass1;
    private double mass2;
    private double distance1;
    private double distance2;
    private double pressure1;
    private double pressure2;
    private double gravity1;
    private double force1;
    private double force2;
    public StressClass()
    {
        String answer = "None";
        mass1 = 0;
        mass2 = 0;
        distance1 = 0;
        distance2 = 0;
        pressure1 = 0;
        pressure2 = 0;
        gravity1 = 0;
        force1 = 0;
        force2= 0;
    }
    public StressClass(String a, double m1, double m2, double d1, double d2, double p1, double p2, double g1,double f1, double f2)
    {
        answer = a;
        mass1 = m1;
        mass2 = m1;
        distance1 = d1;
        distance2 = d2;
        pressure1 = p1;
        pressure2 =  p2;
        gravity1 = g1;
        force1 = f1;
        force2 = f2;
    }
    public void set(String a, double m1, double m2, double d1, double d2, double p1, double p2, double g1, double f1, double f2)
    {
        answer = a;
        mass1 = m1;
        mass2 = m2;
        distance1 = d1;
        distance2= d2;
        pressure1 = p1;
        pressure2 = p2;
        gravity1 = g1;
        force1 = f1;
        force2 = f2;
    }
    public double TStress()
    {
        return((mass1*gravity1)/distance1);
    }
    public double TStrain()
    {
        return(force1/force2);
    }
    public double YoungM()
    {
        return(TStress()/TStrain());
    }
    public double PressureIF()
    {
        return((force1)/distance1);
    }
    public double BulkM()
    {
        return(pressure1/pressure2);
    }
    public double SStress()
    {
        return(force1/distance1);
    }
    public double SStrain()
    {
        return(distance1/distance2);
    }
    public double ShearM()
    {
        return(SStress()/SStrain());
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("TStress"))
        {
            System.out.print("The tensile stress is " + TStress() + " Pa\n");
        }
        if(answer.equalsIgnoreCase("TStrain"))
        {
            System.out.print(" " + TStrain() + " \n");
        }
        if(answer.equalsIgnoreCase("YoungM"))
        {
            System.out.print(" " + YoungM() + " \n");
        }
        if(answer.equalsIgnoreCase("PressureIF"))
        {
            System.out.print(" " + PressureIF() + " \n");
        }
        if(answer.equalsIgnoreCase("BulkM"))
        {
            System.out.print(" " + BulkM() + " \n");
        }
        if(answer.equalsIgnoreCase("SStress"))
        {
            System.out.print(" " + SStress() + " N*m\n");
        }
        if(answer.equalsIgnoreCase("SStrain"))
        {
            System.out.print(" " + SStrain() + " \n");
        }
        if(answer.equalsIgnoreCase("ShearM"))
        {
            System.out.print(" " + ShearM() + " \n");
        }
        
    }
}
