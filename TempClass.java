public class TempClass//TempClass ??? = new TempClass("Lawan Brown", 20);
{
    private String answer;
    private double temp1;
    private double temp2;
    private double temp3;
    private double pres1;
    private double pres2;
    private double distance1;
    private double distance2;
    private double mass1;
    private double mass2;
    
    
    
    public TempClass()
    {
        String answer = "None";
        temp1 = 0;
        temp2 = 0;
        temp3 = 0;
        pres1 = 0;
        pres2 = 0;
        distance1 = 0;
        distance2 = 0;
        mass1 = 0;
        mass2 = 0;
        
        
    }
    public TempClass(String a, double t1, double t2, double t3, double p1, double p2, double d1, double d2, double m1, double m2)
    {
        answer = a;
        temp1 = 0;
        temp2 = 0;
        temp3 = 0;
        pres1 = 0;
        pres2 = 0;
        distance1 = 0;
        distance2 = 0;
        mass1 = 0;
        mass2 = 0;
        
    }
    public void set(String a, double t1, double t2, double t3, double p1, double p2, double d1, double d2, double m1, double m2)
    {
        answer = a;
        temp1 = t1;
        temp2 = t2;
        temp3 = t3;
        pres1 = p1;
        pres2 = p2;
        distance1 = d1;
        distance2 = d2;
        mass1 = m1;
        mass2 = m2;
    }
    public double TempFa()
    {
        return((temp1*9/5) + 32);
    }
    public double TempC()
    {
        return(.555*(temp1-32));
    }
    public double TempK()
    {
        return(temp1 + 273.15);
    }
    public double TempI()
    {
        return((pres1*temp2)/pres2);
    }
    public double TempF()
    {
        return((pres2*temp1)/pres1);
    }
    public double PresI()
    {
        return((temp1*pres2)/pres1);
    }
    public double PresF()
    {
        return((pres1*temp2)/temp1);
    }
    public double LinearE()
    {
        return(distance1*temp1);
    }
    public double VolumeE()
    {
        return(distance1*temp1);
    }
    public double ThermalS()
    {
        return(-temp1);
    }
    public double HeatM()
    {
        return(temp1*mass1);
    }
    public double HeatT()
    {
        return(mass1);
    }
    public double HeatC()
    {
        return(distance1*((temp2-temp1)/distance2));
    }
    public double HeatCR()
    {
        return((5.67*(1/Math.pow(10,8)))*distance1*temp2*Math.pow(temp1,4));
    }
    public double HeatCRN()
    {
        return(distance1*temp2*(5.67*(1/Math.pow(10,8)))*(Math.pow(temp1,4) - Math.pow(temp3,4)));
    }
    public void writeOutput()
    {
        if(answer.equalsIgnoreCase("TempFa"))
        {
            System.out.print("The temperature is " + TempFa() + " degrees Fahrenheit\n");
        }
        else if(answer.equalsIgnoreCase("TempC"))
        {
            System.out.print("The temperature is " + TempC() + " degrees Celsius\n");
        }
        else if(answer.equalsIgnoreCase("TempI"))
        {
            System.out.print("The initial temperature is " + TempI() + " K\n");
        }
        else if(answer.equalsIgnoreCase("TempF"))
        {
            System.out.print("The final temperature is " + TempF() + " K\n");
        }
        else if(answer.equalsIgnoreCase("PresI"))
        {
            System.out.print("The initial pressure is " + PresI() + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("PresF"))
        {
            System.out.print("The final pressure is " + PresF() + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("LinearEA"))
        {
            System.out.print("The change in length is " + (LinearE()* 2.4*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("LinearEB"))
        {
            System.out.print("The change in length is " + (LinearE()* 2.0*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("LinearEC"))
        {
            System.out.print("The change in length is " + (LinearE()* 1.7*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("LinearEG"))
        {
            System.out.print("The change in length is " + (LinearE()* .4*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("LinearEI"))
        {
            System.out.print("The change in length is " + (LinearE()* .09*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("LinearEQ"))
        {
            System.out.print("The change in length is " + (LinearE()* .04*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("LinearES"))
        {
            System.out.print("The change in length is " + (LinearE()* 1.2*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeEA"))
        {
            System.out.print("The change in length is " + (VolumeE()* 7.2*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeEB"))
        {
            System.out.print("The change in length is " + (VolumeE()* 6.0*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeEC"))
        {
            System.out.print("The change in length is " + (VolumeE()* 5.1*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeEG"))
        {
            System.out.print("The change in length is " + (VolumeE()* 1.2*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeEI"))
        {
            System.out.print("The change in length is " + (VolumeE()* .27*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeEQ"))
        {
            System.out.print("The change in length is " + (VolumeE()* .12*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("VolumeES"))
        {
            System.out.print("The change in length is " + (VolumeE()* 3.6*(1/Math.pow(10,5))) + " m\n");
        }
        else if(answer.equalsIgnoreCase("ThermalSA"))
        {
            System.out.print("The thermal stress is " + ThermalS()* 2.4*(1/Math.pow(10,5))*(7*Math.pow(10,10)) + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("ThermalSB"))
        {
            System.out.print("The thermal stress is " + ThermalS()* 2*(1/Math.pow(10,5))*(9*Math.pow(10,10)) + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("ThermalSC"))
        {
            System.out.print("The thermal stress is " + ThermalS()* 1.7*(1/Math.pow(10,5))*(11*Math.pow(10,10)) + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("ThermalSG"))
        {
            System.out.print("The thermal stress is " + ThermalS()* .4*(1/Math.pow(10,5))*(6*Math.pow(10,10)) + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("ThermalSI"))
        {
            System.out.print("The thermal stress is " + ThermalS()* .09*(1/Math.pow(10,5))*(21*Math.pow(10,10)) + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("ThermalSS"))
        {
            System.out.print("The thermal stress is " + ThermalS()* 1.2*(1/Math.pow(10,5))*(20*Math.pow(10,10)) + " Pa\n");
        }
        else if(answer.equalsIgnoreCase("HeatMA"))
        {
            System.out.print("The heat required is " + HeatM()*910 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMB"))
        {
            System.out.print("The heat required is " + HeatM()*1970 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMC"))
        {
            System.out.print("The heat required is " + HeatM()*390 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatME"))
        {
            System.out.print("The heat required is " + HeatM()*2428 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMEG"))
        {
            System.out.print("The heat required is " + HeatM()*2386 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMI"))
        {
            System.out.print("The heat required is " + HeatM()*2100 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMIr"))
        {
            System.out.print("The heat required is " + HeatM()*470 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatML"))
        {
            System.out.print("The heat required is " + HeatM()*130 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMM"))
        {
            System.out.print("The heat required is " + HeatM()*879 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMME"))
        {
            System.out.print("The heat required is " + HeatM()*138 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMSa"))
        {
            System.out.print("The heat required is " + HeatM()*879 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMSi"))
        {
            System.out.print("The heat required is " + HeatM()*234 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatMW"))
        {
            System.out.print("The heat required is " + HeatM()*4190 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNA"))
        {
            System.out.print("The heat required is " + HeatM()*24.6 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNB"))
        {
            System.out.print("The heat required is " + HeatM()*17.7 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNC"))
        {
            System.out.print("The heat required is " + HeatM()*24.8 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNE"))
        {
            System.out.print("The heat required is " + HeatM()*111.9 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNEG"))
        {
            System.out.print("The heat required is " + HeatM()*148 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNI"))
        {
            System.out.print("The heat required is " + HeatM()*37.8 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNIr"))
        {
            System.out.print("The heat required is " + HeatM()*26.3+ " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNL"))
        {
            System.out.print("The heat required is " + HeatM()*26.9+ " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNM"))
        {
            System.out.print("The heat required is " + HeatM()*87.9 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNME"))
        {
            System.out.print("The heat required is " + HeatM()*27.7 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNSa"))
        {
            System.out.print("The heat required is " + HeatM()*51.4 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNSi"))
        {
            System.out.print("The heat required is " + HeatM()*25.3 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatNW"))
        {
            System.out.print("The heat required is " + HeatM()*75.4 + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTH"))
        {
            System.out.print("The heat transferred is " + HeatT()*(58.6*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTN"))
        {
            System.out.print("The heat transferred is " + HeatT()*(25.5*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTO"))
        {
            System.out.print("The heat transferred is " + HeatT()*(13.8*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTE"))
        {
            System.out.print("The heat transferred is " + HeatT()*(104.2*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTM"))
        {
            System.out.print("The heat transferred is " + HeatT()*(11.8*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTW"))
        {
            System.out.print("The heat transferred is " + HeatT()*(334*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTS"))
        {
            System.out.print("The heat transferred is " + HeatT()*(38.1*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTL"))
        {
            System.out.print("The heat transferred is " + HeatT()*(24.5*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTA"))
        {
            System.out.print("The heat transferred is " + HeatT()*(165*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTS"))
        {
            System.out.print("The heat transferred is " + HeatT()*(88.3*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTG"))
        {
            System.out.print("The heat transferred is " + HeatT()*(64.5*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTC"))
        {
            System.out.print("The heat transferred is " + HeatT()*(134*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTHe"))
        {
            System.out.print("The heat transferred is " + HeatT()*(20.9*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTHy"))
        {
            System.out.print("The heat transferred is " + HeatT()*(452*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTNi"))
        {
            System.out.print("The heat transferred is " + HeatT()*(201*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTOx"))
        {
            System.out.print("The heat transferred is " + HeatT()*(213*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTEt"))
        {
            System.out.print("The heat transferred is " + HeatT()*(854*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTMe"))
        {
            System.out.print("The heat transferred is " + HeatT()*(272*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTWa"))
        {
            System.out.print("The heat transferred is " + HeatT()*(2256*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTSu"))
        {
            System.out.print("The heat transferred is " + HeatT()*(326*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTLe"))
        {
            System.out.print("The heat transferred is " + HeatT()*(871*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTAn"))
        {
            System.out.print("The heat transferred is " + HeatT()*(561*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTSi"))
        {
            System.out.print("The heat transferred is " + HeatT()*(2336*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTGo"))
        {
            System.out.print("The heat transferred is " + HeatT()*(1578*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatTCo"))
        {
            System.out.print("The heat transferred is " + HeatT()*(5069*Math.pow(10,3)) + " J\n");
        }
        else if(answer.equalsIgnoreCase("HeatCAl"))
        {
            System.out.print("The heat current is " + HeatC()*205 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCBr"))
        {
            System.out.print("The heat current is " + HeatC()*109 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCCo"))
        {
            System.out.print("The heat current is " + HeatC()*385 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCLe"))
        {
            System.out.print("The heat current is " + HeatC()*34.7 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCMe"))
        {
            System.out.print("The heat current is " + HeatC()*8.3 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCSi"))
        {
            System.out.print("The heat current is " + HeatC()*406 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCSt"))
        {
            System.out.print("The heat current is " + HeatC()*50.2 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCBi"))
        {
            System.out.print("The heat current is " + HeatC()*.15 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCBr"))
        {
            System.out.print("The heat current is " + HeatC()*.6 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCCon"))
        {
            System.out.print("The heat current is " + HeatC()*.8 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCCor"))
        {
            System.out.print("The heat current is " + HeatC()*.04+ " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCFe"))
        {
            System.out.print("The heat current is " + HeatC()*.04+ " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCFi"))
        {
            System.out.print("The heat current is " + HeatC()*.04+ " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCGl"))
        {
            System.out.print("The heat current is " + HeatC()*.8+ " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCIc"))
        {
            System.out.print("The heat current is " + HeatC()*1.6 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCRW"))
        {
            System.out.print("The heat current is " + HeatC()*.04 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCSty"))
        {
            System.out.print("The heat current is " + HeatC()*.027 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCWo"))
        {
            System.out.print("The heat current is " + HeatC()*.12+ " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCAi"))
        {
            System.out.print("The heat current is " + HeatC()*.024+ " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCAr"))
        {
            System.out.print("The heat current is " + HeatC()*.016 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCHe"))
        {
            System.out.print("The heat current is " + HeatC()*.14 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCHy"))
        {
            System.out.print("The heat current is " + HeatC()*.14 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCOx"))
        {
            System.out.print("The heat current is " + HeatC()*.023 + " W(J/s)\n");
        }
        else if(answer.equalsIgnoreCase("HeatCR"))
        {
            System.out.print("The heat current radiated is " + HeatCR() + " W\n");
        }
        else if(answer.equalsIgnoreCase("HeatCRN"))
        {
            System.out.print("The net rate of radiation is " + HeatCRN() + " W\n");
        }
    }
}