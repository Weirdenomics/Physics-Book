public class LightClass//LightClass ??? = new LightClass("Lawan Brown", 20);
{
    private String answer;
    private double frequency1;
    private double wavelength1;
    
    public LightClass()
    {
        String answer = "None";
        frequency1 = 0;
        wavelength1 = 0;
    }
    public LightClass(String a, double f1, double w1)
    {
        answer = a;
        frequency1 = f1;
        wavelength1 = w1;
    }
    public void set(String a, double f1, double w1)
    {
        answer = a;
        frequency1 = f1;
        wavelength1 = w1;
    }
    
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("Frequency"))
        {
            if(frequency1<=2.99*Math.pow(10,8))
            {
                System.out.print("(Radio Waves)\n");
            }
            if(frequency1>=3*Math.pow(10,8)&&frequency1<=2.99*Math.pow(10,11))
            {
                System.out.print("(Microwaves)\n");
            }
            if(frequency1>=3*Math.pow(10,11)&&frequency1<=3.99*Math.pow(10,14))
            {
                System.out.print("(Infrared)\n");
            }
            if(frequency1>=4*Math.pow(10,14)&&frequency1<=4.84*Math.pow(10,14))
            {
                System.out.print("(Red)\n");
            }
            if(frequency1>=4.85*Math.pow(10,14)&&frequency1<=5.08*Math.pow(10,14))
            {
                System.out.print("(Orange)\n");
            }
            if(frequency1>=5.09*Math.pow(10,14)&&frequency1<=5.26*Math.pow(10,14))
            {
                System.out.print("(Yellow)\n");
            }
            if(frequency1>=5.27*Math.pow(10,14)&&frequency1<=6.06*Math.pow(10,14))
            {
                System.out.print("(Green)\n");
            }
            if(frequency1>=6.07*Math.pow(10,14)&&frequency1<=6.68*Math.pow(10,14))
            {
                System.out.print("(Blue)\n");
            }
            if(frequency1>=6.69*Math.pow(10,14)&&frequency1<=7.89*Math.pow(10,14))
            {
                System.out.print("(Violet)\n");
            }
            if(frequency1>=7.9*Math.pow(10,14)&&frequency1<=2.99*Math.pow(10,16))
            {
                System.out.print("(Ultraviolet)\n");
            }
            if(frequency1>=3*Math.pow(10,16)&&frequency1<=2.99*Math.pow(10,19))
            {
                System.out.print("(X-Ray)\n");
            }
            if(frequency1>=3*Math.pow(10,19))
            {
                System.out.print("(Gamma)\n");
            }
        }
        if(answer.equalsIgnoreCase("Wavelength"))
        {
            if(wavelength1>=.1)
            {
                System.out.print("(Radio Waves)\n");
            }
            if(wavelength1>=.0001&&wavelength1<=.09)
            {
                System.out.print("(Microwaves) ");
            }
            if(wavelength1>=7*1/Math.pow(10,5)&&wavelength1<=.00009)
            {
                System.out.print("(Infrared)\n");
            }
            if(wavelength1>=6.5*1/Math.pow(10,7)&&wavelength1<=6.9*1/Math.pow(10,5))
            {
                System.out.print("(Red)\n");
            }
            if(wavelength1>=5.9*1/Math.pow(10,7)&&wavelength1<=6.49*1/Math.pow(10,7))
            {
                System.out.print("(Orange)\n");
            }
            if(wavelength1>=5.7*1/Math.pow(10,7)&&wavelength1<=5.89*1/Math.pow(10,7))
            {
                System.out.print("(Yellow)\n");
            }
            if(wavelength1>=5.1*1/Math.pow(10,7)&&wavelength1<=5.69*1/Math.pow(10,7))
            {
                System.out.print("(Green)\n");
            }
            if(wavelength1>=4.75*1/Math.pow(10,7)&&wavelength1<=5.09*1/Math.pow(10,7))
            {
                System.out.print("(Blue)\n");
            }
            if(wavelength1>=4.01*1/Math.pow(10,7)&&wavelength1<=4.74*1/Math.pow(10,7))
            {
                System.out.print("(Violet)\n");
            }
            if(wavelength1>=9*1/Math.pow(10,9)&&wavelength1<=4*1/Math.pow(10,7))
            {
                System.out.print("(Ultraviolet)\n");
            }
            if(wavelength1>=9*1/Math.pow(10,11)&&wavelength1<=1/Math.pow(10,9))
            {
                System.out.print("(X-Ray)\n");
            }
            if(wavelength1<=1/Math.pow(10,11))
            {
                System.out.print("(Gamma)\n");
            }
        }
    }
}