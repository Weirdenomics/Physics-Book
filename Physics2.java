import java.text.DecimalFormat;
import java.util.Scanner;
class Physics2
{
    public static double exp(String num)
    {
        double n1 = 0;
        double n2 = 0;
        char[] s = num.toCharArray();
        for(int k=0; k<s.length; k++)
        {
            if(s[k]=='e')
            {
                String[] parts1 = num.split("e",2);
                n1 = Double.parseDouble(parts1[0]);
                n2 = Double.parseDouble(parts1[1]);
            }
            else
            {
                String[] parts1 = num.split("",1);
                n1 = Double.parseDouble(parts1[0]);
                n2=0;
            }
        }
        return (double)n1*Math.pow(10,n2);
    }
    public static void main(String[] args)
    
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat f2 = new DecimalFormat("0.00");
        boolean go = true;
        while(go)
        {
            System.out.println("\nWhat # would you like to look into today Sir?");
            System.out.println("\n3.Thermodynamics\n4.Electromagnetism Pt.1\n0.Quit");
            System.out.print("Input:");
            int response = input.nextInt();
            if(response==3)
            {
                boolean go3 = true;
                while(go3)
                {
                    System.out.println("\nWhich Topic #?");
                    System.out.println("\n1.Temperature and Heat\n2.Thermal Properties of Matter\n3.The First Law of Thermodynamics(I)\n4.The First Law of Thermodynamics(II)\n5.The Second Law of Thermodynamics\n6.Back");
                    System.out.print("Input:");
                    int response3 = input.nextInt();
                    if(response3==1)
                    {
                        boolean go1q = true;
                        while(go1q)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Temp in F given C\n2.Find Temp in C given F\n3.Find Temp in K given C\n4.Find Temp or Pressure with T/P Ratio(W/Constant Volume)\n5.Find Linear Expansion\n6.Find Volume Thermal Expanision\n7.Find Thermal Stress\n8.Find Heat Required for Temp Change in Material\n9.Find Heat Required for Temp Change in Moles of material\n10.Find Heat Transfer in Phase Change\n11.Find Heat Current in Conduction\n12.Find Heat Current in Radiation\n13.Find Net Radiation Rate from Body-T1 in Atm-T2\n14.Back\n");
                            System.out.print("Input:");
                            int response1q = input.nextInt();
                            if(response1q==1)
                            {
                                TempClass me2 = new TempClass();
                                System.out.print("\nThe Expression being used: T=(9/5)*T1+32 ~ temperature F\n");
                                input.next();
                                System.out.print("Temperature(Celsius): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                me2.set("TempFa", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1q==2)
                            {
                                TempClass me2 = new TempClass();
                                System.out.print("\nThe Expression being used: T=(5/9)*T1 - 32 ~ temperature C\n");
                                input.next();
                                System.out.print("Temperature(Fahrenheit): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                me2.set("TempC", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1q==3)
                            {
                                TempClass me2 = new TempClass();
                                System.out.print("\nThe Expression being used: T= T1 + 273.15 ~ temperature K\n");
                                input.next();
                                System.out.print("Temperature(Celsius): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                me2.set("TempK", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1q==4)
                            {
                                
                                System.out.print("\nThe Expression being used: T2/T1 = P2/P1\n");
                                input.next();
                                System.out.print("Would you like to find Initial Temp(1), Final Temp(2), Initial Pressure(3) or Final Pressure(4)\nInput:");
                                int num = input.nextInt();
                                if(num==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("Initial Pressure(Pa): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Final Pressure(Pa): ");
                                    String p2p1 = input.next();
                                    double p2 = exp(p2p1);
                                    System.out.print("Final Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    me2.set("TempI", 0, t2, 0, p1, p2, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(num==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("Initial Pressure(Pa): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Final Pressure(Pa): ");
                                    String p2p1 = input.next();
                                    double p2 = exp(p2p1);
                                    System.out.print("Initial Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("TempF", t1, 0, 0, p1, p2, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(num==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("Final Pressure(Pa): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Initial Temperature(K): ");
                                    String p2p1 = input.next();
                                    double p2 = exp(p2p1);
                                    System.out.print("Final Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    me2.set("PresI", 0, t2, 0, p1, p2, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(num==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("Initial Pressure(Pa): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Initial Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Final Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    me2.set("PresF", t1, t2, 0, p1, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else
                                    System.out.print("Ok.");
                            }
                            else if(response1q==5)
                            {
                                System.out.print("\nExpression being used: DL= alpha*L*DT ~ linear thermal expansion\n");
                                input.next();
                                System.out.print("\nPlease select which material type:\nAluminum(1)\nBrass(2)\nCopper(3)\nGlass(4)\nInvar(Nickel-Iron Alloy)(5)\nQuartz(fused)(6)\nSteel(7)\nOther Metal(8)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("LinearEA", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                    
                                }
                                else if(mt==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("LinearEB", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("LinearEC", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = input.nextDouble();
                                    me2.set("LinearEG", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("LinearEI", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("LinearEQ", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("LinearES", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    System.out.print("\nOriginal length(m): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Linear Expansion Coefficient of Material(/K): ");
                                    String alphap1 = input.next();
                                    double alpha = exp(alphap1);
                                    double ans = (alpha*t1*d1);
                                    System.out.print("The change in length is " + ans + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.\n");
                            }
                            else if(response1q==6)
                            {
                                System.out.print("\nExpression being used: DV= Beta*V*DT ~ volume thermal expansion\n");
                                input.next();
                                System.out.print("\nPlease select which material type:\nAluminum(1)\nBrass(2)\nCopper(3)\nGlass(4)\nInvar(Nickel-Iron Alloy)(5)\nQuartz(fused)(6)\nSteel(7)\nOther Metal(8)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeEA", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeEB", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeEC", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeEG", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeEI", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeEQ", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("VolumeES", t1, 0, 0, 0, 0, d1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    System.out.print("\nOriginal volume(m^3): ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Volume Expansion Coefficient of Material(/K): ");
                                    String betap1 = input.next();
                                    double beta = exp(betap1);
                                    double ans = (beta*t1*d1);
                                    System.out.print("The change in length is " + ans + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.\n");
                            }
                            else if(response1q==7)
                            {
                                System.out.print("\nExpression being used: F/A= Y*alpha*DT ~ thermal stress\n");
                                input.next();
                                System.out.print("\nPlease select which material type:\nAluminum(1)\nBrass(2)\nCopper(3)\nGlass(4)\nInvar(Nickel-Iron Alloy)(5)\nSteel(6)\nOther Metal(7)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nChange in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ThermalSA", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nChange in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ThermalSB", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nChange in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ThermalSC", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nChange in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ThermalSG", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nChange in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ThermalSI", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nChange in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ThermalSS", t1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    System.out.print("\nYoung's Modulus of Material: ");
                                    String d1p1 = input.next();
                                    double d1 = exp(d1p1);
                                    System.out.print("Change in Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Linear Expansion Coefficient of Material(/K): ");
                                    String betap1 = input.next();
                                    double beta = exp(betap1);
                                    double ans = (beta*t1*d1);
                                    System.out.print("The thermal stress is " + ans + " Pa\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.\n");
                            }
                            else if(response1q==8)
                            {
                                System.out.print("\nExpression being used: Q= m*c*DT ~ Heat\n");
                                input.next();
                                System.out.print("\nPlease select which material type:\nAluminum(1)\nBeryllium(2)\nCopper(3)\nEthanol(4)\nEthylene glycol(5)\nIce(Near 0 degrees)(6)\nIron(7)\nLead(8)\nMarble(9)\nMercury(10)\nSalt(11)\nSilver(12)\nWater(13)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    double t1 = input.nextDouble();
                                    me2.set("HeatMA", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMB", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMC", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatME", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMEG", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMI", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMIr", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatML", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==9)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMM", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==10)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMME", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==11)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMSa", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==12)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMSi", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==13)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nMass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatMW", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else
                                    System.out.print("Ok.");
                            }
                            else if(response1q==9)
                            {
                                System.out.print("\nExpression being used: Q= n*C*DT ~ Heat\n");
                                input.next();
                                System.out.print("\nPlease select which material type:\nAluminum(1)\nBeryllium(2)\nCopper(3)\nEthanol(4)\nEthylene glycol(5)\nIce(Near 0 degrees)(6)\nIron(7)\nLead(8)\nMarble(9)\nMercury(10)\nSalt(11)\nSilver(12)\nWater(13)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNA", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNB", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNC", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNE", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNEG", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNI", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNIr", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNL", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==9)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNM", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==10)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNME", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==11)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNSa", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==12)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNSi", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==13)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nNumber of moles: ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Change in temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("HeatNW", t1, 0, 0, 0, 0, 0, 0, m1, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else
                                    System.out.print("Ok.");
                            }
                            else if(response1q==10)
                            {
                                System.out.print("\nExpression being used: Q=(+ or -) m*L ~ Heat transfer\n");
                                input.next();
                                System.out.print("Which type of phase transfer would you like: Fusion(1) or Vaporization(2)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    System.out.print("\nPlease select which material type:\nHydrogen(1)\nNitrogen(2)\nOxygen(3)\nEthanol(4)\nMercury(5)\nWater(6)\nSulfer(7)\nLead(8)\nAntimony(9)\nSilver(10)\nGold(11)\nCopper(12)\nInput:");
                                    int mp = input.nextInt();
                                    if(mp==1)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTH", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==2)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTN", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==3)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTO", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==4)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTE", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==5)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTM", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==6)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTW", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==7)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTS", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==8)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTL", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==9)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTA", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==10)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTS", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==11)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTG", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==12)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTC", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                }
                                else if(mt==2)
                                {
                                    System.out.print("\nPlease select which material type:\nHelium(1)\nHydrogen(2)\nNitrogen(3)\nOxygen(4)\nEthanol(5)\nMercury(6)\nWater(7)\nSulfer(8)\nLead(9)\nAntimony(10)\nSilver(11)\nGold(12)\nCopper(13)\nInput:");
                                    int mp = input.nextInt();
                                    if(mp==1)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTHe", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==2)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTHy", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==3)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTNi", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==4)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTOx", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==5)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTEt", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==6)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTMe", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==7)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTWa", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==8)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTSu", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==9)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTLe", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==10)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTAn", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==11)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTSi", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==12)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTGo", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mp==13)
                                    {
                                        TempClass me2 = new TempClass();
                                        System.out.print("\nMass(kg): ");
                                        String m1p1 = input.next();
                                        double m1 = exp(m1p1);
                                        me2.set("HeatTCo", 0, 0, 0, 0, 0, 0, 0, m1, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                }
                                else
                                    System.out.print("Ok.");
                            }
                            else if(response1q==11)
                            {
                                System.out.print("\nExpression being used: H=k*A*(T2-T1/L) ~ Heat current\n");
                                input.next();
                                System.out.print("Which type of material is the heat flowing through:\nAluminum(1)\nBrass(2)\nCopper(3)\nLead(4)\nMercury(5)\nSilver(6)\nSteel(7)\nBrick(insulating)(8)\nBrick(red)(9)\nConcrete(10)\nCork(11)\nFelt(12)\nFiberglass(13)\nGlass(14)\nIce(15)\nRock wool(16)\nStyrofoam(17)\nWood(18)\nAir(19)\nArgon(20)\nHelium(21)\nHydrogen(22)\nOxygen(23)\nInput:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCAl", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCBr", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCCo", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCLe", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCMe", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCSi", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCSt", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCBi", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==9)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCBr", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==10)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCCon", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==11)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCCor", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==12)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCFe", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==13)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCFi", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==14)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCGl", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==15)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCIc", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==16)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCRW", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==17)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCSty", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==18)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCWo", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==19)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCAi", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==20)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCAr", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==21)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCHe", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==22)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCHy", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(mt==23)
                                {
                                    TempClass me2 = new TempClass();
                                    System.out.print("\nCross section of material(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Lower Temperature(K): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Higher Temperature(K): ");
                                    String t2p1 = input.next();
                                    double t2 = exp(t2p1);
                                    System.out.print("Length of heat flow path(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    me2.set("HeatCOx", t1, t2, 0, 0, 0, a1, l, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1q==12)
                            {
                                TempClass me2 = new TempClass();
                                System.out.print("\nExpression being used: H = A*e*SBC*T^4 ~Heat current radiation\n");
                                input.next();
                                System.out.print("Surface Area(m^2): ");
                                String a1p1 = input.next();
                                double a1 = exp(a1p1);
                                System.out.print("Temperature(K): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Emissivity: ");
                                String ep1 = input.next();
                                double e = exp(ep1);
                                me2.set("HeatCR", t1, e, 0, 0, 0, a1, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1q==13)
                            {
                                TempClass me2 = new TempClass();
                                System.out.print("\nExpression being used: A*e*SBC*(T^4-T_s^2) ~ net radiation\n");
                                input.next();
                                System.out.print("Surface Area(m^2): ");
                                String a1p1 = input.next();
                                double a1 = exp(a1p1);
                                System.out.print("Temperature(K): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Temperature of surrounding(K): ");
                                String t3p1 = input.next();
                                double t3 = exp(t3p1);
                                System.out.print("Emissivity: ");
                                String ep1 = input.next();
                                double e = exp(ep1);
                                me2.set("HeatCRN", t1, e, t3, 0, 0, a1, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1q==14)
                                go1q=false;
                        }
                    }
                    else if(response3==2)
                    {
                        boolean go1r = true;
                        while(go1r)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Molar Mass, Number of Molecules or Total Mass\n2.Use Ideal Gas Equation\n3.Find Molar Mass or Total Mass using Avagadro's Number\n4.Find Average Translational Kinetic Energy of Moles of Ideal Gas\n5.Find Average Translational Kinetic Energy of Gas Molecule\n6.Find Root-Mean-Square Speed of Gas Molecule\n7.Find Mean Free Path of Gas Molecule\n8.Use Maxwell Boltzmann Distribution\n9.Back\n");
                            System.out.print("Input:");
                            int response1r = input.nextInt();
                            if(response1r==1)
                            {
                                System.out.print("\nWould you like to find:\nMolar Mass(1)\nNumber of Moles(2)\nTotal Mass(3)\nInput:");
                                int mm = input.nextInt();
                                if(mm==1)
                                {
                                    System.out.print("Expression being used: M = m_tot/n ~ molar mass of gas\n");
                                    input.next();
                                    System.out.print("\nNumber of moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Total Mass of Gas(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe molar mass is " + (m/n) + " kg/mol\n");
                                    input.next();
                                }
                                else if(mm==2)
                                {
                                    System.out.print("Expression being used: n = m_tot/M ~ number of moles of gas\n");
                                    input.next();
                                    System.out.print("\nMolar Mass of Gas(kg): ");
                                    String Mp1 = input.next();
                                    double M = exp(Mp1);
                                    System.out.print("Total Mass of Gas(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe number of moles is " + (m/M) + " mols of gas\n");
                                    input.next();
                                }
                                else if(mm==3)
                                {
                                    System.out.print("Expression being used: m_tot = M*n ~ total mass of gas\n");
                                    input.next();
                                    System.out.print("\nNumber of moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Molar Mass of Gas(kg): ");
                                    String Mp1 = input.next();
                                    double M = exp(Mp1);
                                    System.out.print("\nThe total mass is " + (M*n) + " kg\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1r==2)
                            {
                                System.out.print("\nWould you like to find:\nPressure(1)\nVolume(2)\nNumber of Moles(3)\nTemperature(4)\nInput:");
                                int ig = input.nextInt();
                                if(ig==1)
                                {
                                    System.out.print("\nExpression being used: P = n*R*T/V ~ pressure of ideal gas\n");
                                    input.next();
                                    System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                    double R = 8.314472;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Temperature of Gas(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("Volume of Gas(m^3): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe pressure of the gas is " + (n*R*T/V) + " Pa\n");
                                    input.next();
                                }
                                else if(ig==2)
                                {
                                    System.out.print("\nExpression being used: V = n*R*T/P ~ volume of ideal gas\n");
                                    input.next();
                                    System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                    double R = 8.314472;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Temperature of Gas(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("Pressure of Gas(Pa): ");
                                    String Pp1 = input.next();
                                    double P = exp(Pp1);
                                    System.out.print("\nThe volume of the gas is " + (n*R*T/P) + " m^3 or " + (n*R*T/P)*1000 + " L\n");
                                    input.next();
                                }
                                else if(ig==3)
                                {
                                    System.out.print("\nExpression being used: n = PV/RT ~ number of moles of ideal gas\n");
                                    input.next();
                                    System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                    double R = 8.314472;
                                    System.out.print("Pressure of Gas(Pa): ");
                                    String Pp1 = input.next();
                                    double P = exp(Pp1);
                                    System.out.print("Temperature of Gas(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("Volume of Gas(m^3): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe number of mols of the gas is " + (P*V/(R*T)) + " mols\n");
                                    input.next();
                                }
                                else if(ig==4)
                                {
                                    System.out.print("\nExpression being used: T = P*V/n*R ~ temperature of ideal gas\n");
                                    input.next();
                                    System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                    double R = 8.314472;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Pressure of Gas(Pa): ");
                                    String Pp1 = input.next();
                                    double P = exp(Pp1);
                                    System.out.print("Volume of Gas(m^3): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe temperature of the gas is " + (P*V/(n*R)) + " K\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1r==3)
                            {
                                System.out.print("\nWould you like to find:\nMolar Mass(1)\nMass per Atom(2)\nInput:");
                                int mm = input.nextInt();
                                if(mm==1)
                                {
                                    System.out.print("\nExpression being used: M = N_A*m ~ molar mass of gas\n");
                                    input.next();
                                    System.out.print("\nAvagadro's Number(molecules/mol): 6.022*10^23\n");
                                    double N = 6.022*Math.pow(10,23);
                                    System.out.print("Total Mass of Gas(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe molar mass is " + (N*m) + " kg/mol\n");
                                    input.next();
                                }
                                else if(mm==2)
                                {
                                    System.out.print("\nExpression being used: m_tot = M/N_A ~ mass per atom\n");
                                    input.next();
                                    System.out.print("\nAvagadro's Number(molecules/mol): 6.022*10^23\n");
                                    double N = 6.022*Math.pow(10,23);
                                    System.out.print("Molar Mass of Gas(kg/mol): ");
                                    String Mp1 = input.next();
                                    double M = exp(Mp1);
                                    System.out.print("\nThe total mass is " + (M/N) + " kg/atom\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1r==4)
                            {
                                System.out.print("\nExpression being used: K_tr = 3/2*n*R*T ~ avg translational kinetic energy of ideal gas\n");
                                input.next();
                                System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                double R = 8.314472;
                                System.out.print("Number of Moles of Gas: ");
                                String np1 = input.next();
                                double n = exp(np1);
                                System.out.print("Temperature of Gas(K): ");
                                String Tp1 = input.next();
                                double T = exp(Tp1);
                                System.out.print("\nThe average translational kinetic energy is " + (1.5*n*R*T) + " J\n");
                                input.next();
                            }
                            else if(response1r==5)
                            {
                                System.out.print("\nWould you like to find the Translational Kinetic Energy in terms of:\nMass and Average Velocity(1)\nTemperature(2)\nInput:");
                                int av = input.nextInt();
                                if(av==1)
                                {
                                    System.out.print("\nExpression being used: K_tr = 1/2*m(v)_avg^2 ~ avg translational kinetic energy\n");
                                    input.next();
                                    System.out.print("\nMass of Molecule(kg):");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Average Velocity of Molecule(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe average translational kinetic energy is " + (.5*m*Math.pow(v,2)) + " J\n");
                                    input.next();
                                }
                                else if(av==2)
                                {
                                    System.out.print("\nExpression being used: K_tr = 3/2*K*T ~ avg translational kinetic energy of gas\n");
                                    input.next();
                                    System.out.print("\nBoltzmann Constant(J/molecule*K): 1.381*10^-23\n");
                                    double k = 1.381*1/Math.pow(10,23);
                                    System.out.print("Temperature of Gas(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("\nThe average translational kinetic energy is " + (1.5*k*T) + " J\n");
                                    input.next();
                                }
                            }
                            else if(response1r==6)
                            {
                                System.out.print("\nWould you like to find the RMS Speed in terms of:\nAverage Velocity(1)\nTemperature and Mass of Molecule(2)\nTemperature and Molar Mass(3)\nInput:");
                                int rm = input.nextInt();
                                if(rm==1)
                                {
                                    System.out.print("\nExpression being used: v_rms = sqrt(v_avg^2) ~ root-mean-square speed of gas molecule\n");
                                    input.next();
                                    System.out.print("\nAverage Velocity of Molecule(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe root mean square speed of the molecule is " + (Math.sqrt(Math.pow(v,2))) + " m/s or " + (Math.sqrt(Math.pow(v,2)))*2.23692 + " mph\n");
                                    input.next();
                                }
                                else if(rm==2)
                                {
                                    System.out.print("\nExpression being used: v_rms = sqrt(3*k*T/m) ~ root-mean-square speed of gas molecule\n");
                                    input.next();
                                    System.out.print("\nBoltzmann Constant(J/molecule*K): 1.381*10^-23\n");
                                    double k = 1.381*1/Math.pow(10,23);
                                    System.out.print("Mass of Molecule(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Temperature of Gas(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("\nThe root mean square speed of the molecule is " + (Math.sqrt(3*k*T/m)) + " m/s or " + (Math.sqrt(3*k*T/m))*2.23692 + " mph\n");
                                    input.next();
                                }
                                else if(rm==3)
                                {
                                    System.out.print("\nExpression being used: v_rms = sqrt(3*R*T/M) ~ root-mean-square speed of gas molecule\n");
                                    input.next();
                                    System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                    double R = 8.314472;
                                    System.out.print("Molar Mass of Molecule(kg/mol): ");
                                    String Mp1 = input.next();
                                    double M = exp(Mp1);
                                    System.out.print("Temperature of Gas(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("\nThe root mean square speed of the molecule is " + (Math.sqrt(3*R*T/M)) + " m/s or " + (Math.sqrt(3*R*T/M))*2.23692 + " mph\n");
                                    input.next();
                                }
                            }
                            else if(response1r==7)
                            {
                                System.out.print("\nWould you like to find the:\nMean Free Path of a Molecule(1)\nMean Free Time of a Molecule(2)\nInput:");
                                int mfp = input.nextInt();
                                if(mfp==1)
                                {
                                    System.out.print("\nWould you like to find the Mean Free Path is terms of:\nMolecule's Speed and Mean Free Time(1)\nVolume of Gas, Number of Molecules and Cross Sectional Area of Molecule(2)\nGas Temperature, Pressure, and Cross Sectional area of Molecules(3)\nInput:");
                                    int fp = input.nextInt();
                                    if(fp==1)
                                    {
                                        System.out.print("\nExpression being used: lambda = v*t_mean ~ mean free path of gas molecules\n");
                                        input.next();
                                        System.out.print("\nSpeed of Molecule(m/s): ");
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("Mean Free Time of Molecules(s) :");
                                        String tp1 = input.next();
                                        double t = exp(tp1);
                                        System.out.print("\nThe average distance between collisions is " + (v*t) + " m\n");
                                        input.next();
                                    }
                                    else if(fp==2)
                                    {
                                        System.out.print("\nExpression being used: lambda = V/(4*PI*sqrt(2)*r^2*N) ~ mean free path of molecules\n");
                                        input.next();
                                        System.out.print("\nVolume of Gas(m^3): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        System.out.print("Radius of Molecules(m): ");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        System.out.print("Number of Molecules: ");
                                        String Np1 = input.next();
                                        double N = exp(Np1);
                                        System.out.print("\nThe average distance between collisions is " + (V/(4*Math.PI*Math.sqrt(2)*Math.pow(r,2)*N)) + " m\n");
                                        input.next();
                                    }
                                    else if(fp==3)
                                    {
                                        System.out.print("\nExpression being used: lambda = k*T/(4*PI*sqrt(2)*r^2*P) ~ mean free path of molecules\n");
                                        input.next();
                                        System.out.print("\nBoltzmann Constant(J/molecule*K): 1.381*10^-23\n");
                                        double k = 1.381*1/Math.pow(10,23);
                                        System.out.print("Temperature of Gas(K): ");
                                        String Tp1 = input.next();
                                        double T = exp(Tp1);
                                        System.out.print("Radius of Molecules(m): ");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        System.out.print("Pressure of Gas(Pa): ");
                                        String Pp1 = input.next();
                                        double P = exp(Pp1);
                                        System.out.print("\nThe average distance between collisions is " + (k*T/(4*Math.PI*Math.sqrt(2)*Math.pow(r,2)*P)) + " m\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(mfp==2)
                                {
                                    System.out.print("\nWould you like to find the Mean Free Time in terms of:\nMean Free Path and Velocity of Molecules(1)\nVolume of Gas, Velocity of Molecules, Cross Sectional Area of Molecules, and Number of Molecules(2)\nInput:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: t_mean = lambda/v ~ mean free time of molecules\n");
                                        input.next();
                                        System.out.print("\nMean Free Path of Molecules(M): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("Velocity of Molecules(m/s): ");
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("\nThe average time between collisions is " + (l/v) + " s\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: t_mean = V/(v*4*PI*sqrt(2)*r^2*N) ~ mean free time of molecules\n");
                                        input.next();
                                        System.out.print("\nVolume of Gas(m^3): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        System.out.print("Radius of Molecules(m): ");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        System.out.print("Number of Molecules: ");
                                        String Np1 = input.next();
                                        double N = exp(Np1);
                                        System.out.print("Velocity of Molecules(m/s): ");
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("\nThe average time between collisions is " + (V/(v*4*Math.PI*Math.sqrt(2)*Math.pow(r,2)*N)) + " m\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1r==8)
                            {
                                System.out.print("\nExpression being used: 4*PI*(m/(2*PI*k*T))^(3/2)*v^2*e^-(mv^2/2*kT) ~ maxwell-boltzman distribution\n");
                                input.next();
                                System.out.print("\nBoltzmann Constant(J/molecule*K): 1.381*10^-23\n");
                                double k = 1.381*1/Math.pow(10,23);
                                System.out.print("Mass of Molecules(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Temperature of Gas(K): ");
                                String Tp1 = input.next();
                                double T = exp(Tp1);
                                System.out.print("Velocity of Molecules(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("\nThe fraction of molecules at this speed is " + (4*Math.PI*(m/(2*Math.PI*k*T))*Math.pow(v,2)*Math.exp(-m*Math.pow(v,2)/(2*k*T))) + " \n");
                                input.next();
                            }
                            else if(response1r==9)
                                go1r = false;
                        }
                    }
                    else if(response3==3)//go1s
                    {
                        boolean go1s = true;
                        while(go1s)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Work Done at Constant Pressure with Volume Change\n2.Use First Law of Thermodynamics\n3.Find Work Done in Adiabatic Process of an Ideal Gas\n4.Back\n");
                            System.out.print("Input:");
                            int response1s = input.nextInt();
                            if(response1s==1)
                            {
                                System.out.print("\nExpression being used: W = p(V2-V1) ~ work done at constant pressure by gas\n");
                                input.next();
                                System.out.print("\nPressure of System(Pa): ");
                                String pp1 = input.next();
                                double p = exp(pp1);
                                System.out.print("Initial Volume of System(m^3): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Final Volume of System(m^3): ");
                                String v2p1 = input.next();
                                double v2 = exp(v2p1);
                                System.out.print("\nThe work done is " + (p*(v2-v1)) + " J\n");
                                input.next();
                            }
                            else if(response1s==2)
                            {
                                System.out.print("\nWould you like to find the:\nChange in Internal Energy of the System(1)\nThe Heat Added or Taken away From The System(2)\nThe Work Done on or by the System(3)\nInput:");
                                int td = input.nextInt();
                                if(td==1)
                                {
                                    System.out.print("\nExpression being used: DU = Q - W ~ change in internal energy of the system\n");
                                    input.next();
                                    System.out.print("\nDont Forget Sign Notation!\n");
                                    System.out.print("Heat Added or Taken Out(J): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Work Done On or By System(J): ");
                                    String Wp1 = input.next();
                                    double W = exp(Wp1);
                                    System.out.print("\nThe change in internal energy is " + (Q-W) + " J\n");
                                    input.next();
                                }
                                else if(td==2)
                                {
                                    System.out.print("\nExpression being used: Q = DU + W  ~ heat added or taken out of the system\n");
                                    input.next();
                                    System.out.print("\nDont Forget Sign Notation!\n");
                                    System.out.print("Change in Internal Energy of the System(J): ");
                                    String DUp1 = input.next();
                                    double DU = exp(DUp1);
                                    System.out.print("Work Done On or By System(J): ");
                                    String Wp1 = input.next();
                                    double W = exp(Wp1);
                                    System.out.print("\nThe change in internal energy is " + (DU+W) + " J\n");
                                    input.next();
                                }
                                else if(td==3)
                                {
                                    System.out.print("\nExpression being used: W = Q - DU ~ work done on or by the system\n");
                                    input.next();
                                    System.out.print("\nDont Forget Sign Notation!\n");
                                    System.out.print("Heat Added or Taken Out(J): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Change in Internal Energy of the System(J): ");
                                    String DUp1 = input.next();
                                    double DU = exp(DUp1);
                                    System.out.print("\nThe change in internal energy is " + (Q-DU) + " J\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1s==3)
                            {
                                System.out.print("\nWhat kind of Gas is being observed?:He(1)\nAr(2)\nH_2(3)\nN_2(4)\nO_2(5)\nCO(6)\nCO_2(7)\nSO_2(8)\nH_2S(9)\nOther(10)\nInput:");
                                int gs = input.nextInt();
                                if(gs==1)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 12.47\n");
                                    double Cv = 12.47;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==2)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 12.47\n");
                                    double Cv = 12.47;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==3)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.42\n");
                                    double Cv = 20.42;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==4)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.76\n");
                                    double Cv = 20.76;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==5)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.85\n");
                                    double Cv = 20.85;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==6)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.85\n");
                                    double Cv = 12.47;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==7)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 28.46\n");
                                    double Cv = 28.46;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==8)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 31.39\n");
                                    double Cv = 31.39;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==9)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 34.60\n");
                                    double Cv = 34.60;
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else if(gs==10)
                                {
                                    System.out.print("\nExpression being used: W = n*C_v*(T1-T2) work done in adiabatic process for ideal gas\n");
                                    input.next();
                                    System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): ");
                                    String Cvp1 = input.next();
                                    double Cv = exp(Cvp1);
                                    System.out.print("Number of Moles of Gas: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Initial Temperature of Gas(K): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature of Gas(K): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe work done is " + (n*Cv*(T1-T2)) + " J\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1s==4)
                                go1s = false;
                        }
                    }
                    else if(response3==4)
                    {
                        boolean go1s = true;
                        while(go1s)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Work Done at Constant Pressure with Volume Change\n2.Use First Law of Thermodynamics\n3.Find Work Done in Adiabatic Process of an Ideal Gas\n4.Back\n");
                            System.out.print("Input:");
                            int response1s = input.nextInt();
                            if(response1s==1)
                            {
                                System.out.print("\nExpression being used: W = p(V2-V1) ~ work done at constant pressure by gas\n");
                                input.next();
                                System.out.print("\nPressure of System(Pa): ");
                                String pp1 = input.next();
                                double p = exp(pp1);
                                System.out.print("Initial Volume of System(m^3): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Final Volume of System(m^3): ");
                                String v2p1 = input.next();
                                double v2 = exp(v2p1);
                                System.out.print("\nThe work done is " + (p*(v2-v1)) + " J\n");
                                input.next();
                            }
                            else if(response1s==2)
                            {
                                System.out.print("\nWould you like to find the:\nChange in Internal Energy of the System(1)\nThe Heat Added or Taken away From The System(2)\nThe Work Done on or by the System(3)\nInput:");
                                int td = input.nextInt();
                                if(td==1)
                                {
                                    System.out.print("\nExpression being used: DU = Q - W ~ change in internal energy of the system\n");
                                    input.next();
                                    System.out.print("\nDont Forget Sign Notation!\n");
                                    System.out.print("Heat Added or Taken Out(J): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Work Done On or By System(J): ");
                                    String Wp1 = input.next();
                                    double W = exp(Wp1);
                                    System.out.print("\nThe change in internal energy is " + (Q-W) + " J\n");
                                    input.next();
                                }
                                else if(td==2)
                                {
                                    System.out.print("\nExpression being used: Q = DU + W  ~ heat added or taken out of the system\n");
                                    input.next();
                                    System.out.print("\nDont Forget Sign Notation!\n");
                                    System.out.print("Change in Internal Energy of the System(J): ");
                                    String DUp1 = input.next();
                                    double DU = exp(DUp1);
                                    System.out.print("Work Done On or By System(J): ");
                                    String Wp1 = input.next();
                                    double W = exp(Wp1);
                                    System.out.print("\nThe change in internal energy is " + (DU+W) + " J\n");
                                    input.next();
                                }
                                else if(td==3)
                                {
                                    System.out.print("\nExpression being used: W = Q - DU ~ work done on or by the system\n");
                                    input.next();
                                    System.out.print("\nDont Forget Sign Notation!\n");
                                    System.out.print("Heat Added or Taken Out(J): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Change in Internal Energy of the System(J): ");
                                    String DUp1 = input.next();
                                    double DU = exp(DUp1);
                                    System.out.print("\nThe change in internal energy is " + (Q-DU) + " J\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1s==3)
                            {
                                System.out.print("\nWould you like to find the Work in terms of:\nMolar Heat Capacity at Constant Volume, Ideal Gas Constant, Initial and Final Pressure, Initial and Final Volume(1)\nRatio of Heat Capacities, Initial and Final Pressure, Initial and Final Volume(2)\nInput:");
                                int api = input.nextInt();
                                if(api==1)
                                {
                                    System.out.print("\nWhat kind of Gas is being observed?:He(1)\nAr(2)\nH_2(3)\nN_2(4)\nO_2(5)\nCO(6)\nCO_2(7)\nSO_2(8)\nH_2S(9)\nOther(10)\nInput:");
                                    int gs = input.nextInt();
                                    if(gs==1)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("Molar Heat Capacity at Volume(J/mol*K): 12.47\n");
                                        double Cv = 12.47;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==2)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 12.47\n");
                                        double Cv = 12.47;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==3)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.42\n");
                                        double Cv = 20.42;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==4)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.76\n");
                                        double Cv = 20.76;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==5)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.85\n");
                                        double Cv = 20.85;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==6)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 20.85\n");
                                        double Cv = 20.85;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==7)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 28.46\n");
                                        double Cv = 28.46;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==8)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 31.39\n");
                                        double Cv = 31.39;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==9)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): 29.95\n");
                                        double Cv = 25.95;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==10)
                                    {
                                        System.out.print("\nExpression being used: W = (C_v/R)*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nIdeal Gas Constant(J/mol*K): 8.314\n");
                                        double R = 8.314472;
                                        System.out.print("\nMolar Heat Capacity at Volume(J/mol*K): ");
                                        String Cvp1 = input.next();
                                        double Cv = exp(Cvp1);
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((Cv/R)*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(api==2)
                                {
                                    System.out.print("\nWhat kind of Gas is being observed?:He(1)\nAr(2)\nH_2(3)\nN_2(4)\nO_2(5)\nCO(6)\nCO_2(7)\nSO_2(8)\nH_2S(9)\nOther(10)\nInput:");
                                    int gs = input.nextInt();
                                    if(gs==1)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.67\n");
                                        double g = 1.67;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==2)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.67\n");
                                        double g = 1.67;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==3)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.41\n");
                                        double g = 1.41;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==4)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.40\n");
                                        double g = 1.40;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==5)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.40\n");
                                        double g = 1.40;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==6)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.40\n");
                                        double g = 1.40;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==7)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.30\n");
                                        double g = 1.30;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==8)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.29\n");
                                        double g = 1.29;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==9)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: 1.33\n");
                                        double g = 1.33;
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else if(gs==10)
                                    {
                                        System.out.print("\nExpression being used: W = (1/(gamma-1))*(p1V1-p2V2) work done in adiabatic process for ideal gas\n");
                                        input.next();
                                        System.out.print("\nRatio of Heat Capacities: ");
                                        double g = input.nextDouble();
                                        System.out.print("Initial Pressure of Gas(Pa): ");
                                        String p1p1 = input.next();
                                        double p1 = exp(p1p1);
                                        System.out.print("Final Pressure of Gas(Pa): ");
                                        String p2p1 = input.next();
                                        double p2 = exp(p2p1);
                                        System.out.print("Initial Volume of Gas(m^3): ");
                                        String V1p1 = input.next();
                                        double V1 = exp(V1p1);
                                        System.out.print("Final Volume of Gas(m^3): ");
                                        String V2p1 = input.next();
                                        double V2 = exp(V2p1);
                                        System.out.print("\nThe work done is " + ((1/(g-1))*((p1*V1)-(p2*V2))) + " J\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1s==4)
                                go1s = false;
                        }
                    }
                    else if(response3==5)//go1t
                    {
                        boolean go1t = true;
                        while(go1t)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Thermal Efficiency of an Engine\n2.Find Thermal Efficiency in Otto Cycle\n3.Find Coefficient of Performance of Refrigerator\n4.Find Efficiency of Carnot Engine\n5.Find Coefficient of Performance of Carnot Refrigerator\n6.Find Entropy Change in Reversible Process\n7.Use Microscopic Expression for Entropy\n8.Back\n");
                            System.out.print("Input:");
                            int response1t = input.nextInt();
                            if(response1t==1)
                            {
                                System.out.print("\nWould you like to find the Thermal Efficiency in terms of:\nWork and Heat Supplied by Hot Reservoir(1)\nHeat Supplied by Hot Reservoi and Absorbed by cold Reservoir(2)\nInput:");
                                int te = input.nextInt();
                                if(te==1)
                                {
                                    System.out.print("\nExpression being used: e = W/H_h ~ thermal efficieny of engine\n");
                                    input.next();
                                    System.out.print("\nWork Done by the Working Substance(J): ");
                                    String Wp1 = input.next();
                                    double W = exp(Wp1);
                                    System.out.print("Heat supplied by Hot Reservoir(J): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("\nThe thermal efficieny of the engine is " + (W/Q) + " or " + (W/Q)*100 + " percent\n");
                                    input.next();
                                }
                                else if(te==2)
                                {
                                    System.out.print("\nExpression being used: e = 1 + (Qc/Qh) ~ thermal efficieny of engine\n");
                                    input.next();
                                    System.out.print("\nHeat Absorbed by Cold Reservoir(J): ");
                                    String Qcp1 = input.next();
                                    double Qc = exp(Qcp1);
                                    System.out.print("Heat Supplied by Hot Reservoir(J): ");
                                    String Qhp1 = input.next();
                                    double Qh = exp(Qhp1);
                                    System.out.print("\nThe thermal efficieny of the engine is " + (1+(Qc/Qh)) + " or " + (1+(Qc/Qh))*100 + " percent\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1t==2)
                            {
                                System.out.print("\nExpressiong being used: e = 1 - (1/(r^(gamma-1))) ~ thermal efficiency in otto cycle\n");
                                input.next();
                                System.out.print("\nCompression Ratio: ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Ratio of Heat Capacities of Gas: ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                System.out.print("\nThe thermal efficiency is " + (1 -(1/(Math.pow(r,g-1)))) + " or " + (1 -(1/(Math.pow(r,g-1))))*100 + " percent\n");
                                input.next();
                            }
                            else if(response1t==3)
                            {
                                System.out.print("\nWould you like to find the Coefficient of Performance in terms of:\nHeat Absorbed by Cold Reservoir and Work Done by Substance(1)\nHeat Absorbed be Cold Reservoir and Supplied by Hot Reservoir(2)\nInput:");
                                int cp = input.nextInt();
                                if(cp==1)
                                {
                                    System.out.print("Expression being used: K = Qc/W ~ coefficient of performance of refrigerator\n");
                                    input.next();
                                    System.out.print("\nHeat Absorbed by Cold Reservoir(+J): ");
                                    String Qcp1 = input.next();
                                    double Qc = exp(Qcp1);
                                    System.out.print("Work Done by Working Substance(+J): ");
                                    String Wp1 = input.next();
                                    double W = exp(Wp1);
                                    System.out.print("The coefficient of performance is " + (Qc/W) + " \n");
                                    input.next();
                                }
                                else if(cp==2)
                                {
                                    System.out.print("Expression being used: K = Qc/(Q_h - Q_c) ~ coefficient of performance of refrigerator\n");
                                    input.next();
                                    System.out.print("\nHeat Absorbed by Cold Reservoir(+J): ");
                                    String Qcp1 = input.next();
                                    double Qc = exp(Qcp1);
                                    System.out.print("Heat Supplied by Hot Substance(+J): ");
                                    String Qhp1 = input.next();
                                    double Qh = exp(Qhp1);
                                    System.out.print("The coefficient of performance is " + (Qc/(Qh-Qc)) + " \n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                                
                            }
                            else if(response1t==4)
                            {
                                System.out.print("\nExpression being used: 1 - (T_c/T_h) ~ efficiency of carnot engine\n");
                                input.next();
                                System.out.print("\nTemperature of Hot Reservoir(K): ");
                                String Thp1 = input.next();
                                double Th = exp(Thp1);
                                System.out.print("Temperature of Cold Reservoir(K): ");
                                String Tcp1 = input.next();
                                double Tc = exp(Tcp1);
                                System.out.print("\nThe efficiency of the Carnot engine is " + (1-(Tc/Th)) + " or " + (1-(Tc/Th))*100 + " percent\n");
                                input.next();
                            }
                            else if(response1t==5)
                            {
                                System.out.print("\nExpression being used: Tc/(Th-Tc) ~ coefficient of performance of carnot refrigerator\n");
                                input.next();
                                System.out.print("\nTemperature of Cold Reservoir(K): ");
                                String Tcp1 = input.next();
                                double Tc = exp(Tcp1);
                                System.out.print("Temperature of Hot Reservoir(K): ");
                                String Thp1 = input.next();
                                double Th = exp(Thp1);
                                System.out.print("\nThe coefficient of performance of the Carnot refrigerator is " + (Tc/(Th-Tc)) + " \n");
                                input.next();
                            }
                            else if(response1t==6)
                            {
                                System.out.print("\nExpression being used: DS = m*c*ln(T2/T1) ~ change in entropy of reversible process\n");
                                input.next();
                                System.out.print("\nMass of Substance(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Specific Heat of Substance(J/kg*K): ");
                                String cp1 = input.next();
                                double c = exp(cp1);
                                System.out.print("Initial Temperature(K): ");
                                String T1p1 = input.next();
                                double T1 = exp(T1p1);
                                System.out.print("Final Temperature(K): ");
                                String T2p1 = input.next();
                                double T2 = exp(T2p1);
                                System.out.print("\nThe change in entropy of the system is " + (m*c*Math.log(T2/T1)) + " J/K\n");
                                input.next();
                            }
                            else if(response1t==7)
                            {
                                System.out.print("\nExpression being used: S = k*ln(w) ~ microscopic expression for entropy\n");
                                input.next();
                                System.out.print("\nBoltzmann Constant(J/K): 1.381*10^-23\n");
                                double k = 1.381*1/Math.pow(10,23);
                                System.out.print("Multiplicity of System: ");
                                String wp1 = input.next();
                                double w = exp(wp1);
                                System.out.print("\nThe entropy of the system is " + (k*Math.log(w)) + " J/K\n");
                                input.next();
                            }
                            else if(response1t==8)
                                go1t = false;
                        }
                    }
                    
                    else if(response3==6)
                        go3 = false;
                }
            }
            else if(response==4)
            {
                boolean go4 = true;
                while(go4)
                {
                    System.out.println("\nWhich Topic #?");
                    System.out.println("\n1.Electric Charge and Electric Field\n2.Gauss's Law\n3.Electrical Potential\n4.Capacitance and Dielectrics\n5.Current Resistance and Electromotive Force\n6.Back");
                    System.out.print("Input:");
                    int response4 = input.nextInt();
                    if(response4==1)
                    {
                        boolean go1u = true;
                        while(go1u)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Force between Two Point Charges(Coulomb's Law)\n2.Use Definition of Electric Field\n3.Find Electric Field of a Point Charge\n4.Find Magnitude of Torque on an Electric Dipole\n5.Find Potential Energy for a Dipole in Electric Field\n6.Back\n");
                            System.out.print("Input:");
                            int response1u = input.nextInt();
                            if(response1u==1)
                            {
                                System.out.print("\nExpression being used: q1*q2/(4*PI*epsilon_0*r^2) ~ force between two point charges\n");
                                input.next();
                                System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                double ep = 8.854*1/Math.pow(10,12);
                                System.out.print("Electron Charge(C) e : 1.602*10^-19\n");
                                double e = 1.602176487*1/Math.pow(10,19);
                                System.out.print("Distance Between Charges(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Charge of Particle 1(C): ");
                                String q1p1 = input.next();
                                double q1 = exp(q1p1);
                                System.out.print("Charge of Particle 2(C): ");
                                String q2p1 = input.next();
                                double q2 = exp(q2p1);
                                double k = 1/(4*Math.PI*ep);
                                double q = (q1*q2);
                                System.out.print("\nThe force between the two charges is " + (k*q/Math.pow(r,2)) + " N\n");
                                input.next();
                            }
                            else if(response1u==2)
                            {
                                System.out.print("\nExpression being used: E = F/q ~ definition of electric field\n");
                                input.next();
                                System.out.print("\nElectric Force(N): ");
                                String Fp1 = input.next();
                                double F = exp(Fp1);
                                System.out.print("Test Charge(C): ");
                                String qp1 = input.next();
                                double q = exp(qp1);
                                System.out.print("The electric field is " + (F/q) + " N/C\n");
                                input.next();
                            }
                            else if(response1u==3)
                            {
                                System.out.print("\nExpression being used: E = q/(4*PI*epsilon_0*r^2) ~ electric field of a point charge\n");
                                input.next();
                                System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                double ep = 8.854*1/Math.pow(10,12);
                                System.out.print("Distance from Source Charge(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Charge of Point(C): ");
                                String qp1 = input.next();
                                double q = exp(qp1);
                                double k = 1/(4*Math.PI*ep);
                                System.out.print("The electric field of the point charge is " + (k*q/Math.pow(r,2)) + " N/C\n");
                                input.next();
                            }
                            else if(response1u==4)
                            {
                                System.out.print("\nExpression being used: t = p*E*sin(phi) ~ magnitude of torque on electric dipole\n");
                                input.next();
                                System.out.print("\nElectric Dipole Moment(C*m): ");
                                String pp1 = input.next();
                                double p = exp(pp1);
                                System.out.print("Magnitude of Electric Field(N/C): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Angle between Dipole Moment and Electric Field Vectors(degrees): ");
                                String phip1 = input.next();
                                double phi = exp(phip1);
                                System.out.print("\nThe magnitude of torque on the electric dipole is " + (p*E*Math.sin(phi/57)) + " N*m\n");
                                input.next();
                            }
                            else if(response1u==5)
                            {
                                System.out.print("\nExpression being used: t = -p*E*cos(phi) ~ potential energy for dipole in electric field\n");
                                input.next();
                                System.out.print("\nElectric Dipole Moment(C*m): ");
                                String pp1 = input.next();
                                double p = exp(pp1);
                                System.out.print("Magnitude of Electric Field(N/C): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Angle between Dipole Moment and Electric Field Vectors(degrees): ");
                                String phip1 = input.next();
                                double phi = exp(phip1);
                                System.out.print("\nThe magnitude of torque on the electric dipole is " + (p*E*Math.cos(phi/57)) + " N*m\n");
                                input.next();
                            }
                            else if(response1u==6)
                                go1u = false;
                        }
                    }
                    else if(response4==2)//go1v
                    {
                        boolean go1v = true;
                        while(go1v)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Electric Flux(Dot Product)\n2.Find Electric Field Magnitude\n3.Back\n");
                            System.out.print("Input:");
                            int response1v = input.nextInt();
                            if(response1v==1)
                            {
                                System.out.print("\nExpression being used: phi_E = E*A*cos(phi) ~ electic flux\n");
                                input.next();
                                System.out.print("\nElectric Field Magnitude(N/C): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Area of Surface(m^2): ");
                                String Ap1 = input.next();
                                double A = exp(Ap1);
                                System.out.print("Angle between Normal Vector of Surface and Electric Field Vector(degrees): ");
                                String phip1 = input.next();
                                double phi = exp(phip1);
                                System.out.print("\nThe electrix flux across the area is " + (E*A*Math.cos(phi/57)) + " N*m^2/C\n");
                                input.next();
                            }
                            else if(response1v==2)
                            {
                                System.out.print("Would you like to find the Electric Field Magnitude of:\nSingle Point Charge(1)\nSurface of Conducting Sphere(2)\nPoint Away from Conduction Wire(3)\nPoint away from Conducting Cylinder(4)\nPoint Outside or Inside Solid Sphere(5)\nPoint on Conduction Sheet(6)\nPoint in between Two Conducting Plates(7)\nPoint just outside Conductor(8)\nInput:");
                                int ef = input.nextInt();
                                if(ef==1)
                                {
                                    System.out.print("\nExpression being used: E = q/(4*PI*epsilon_0*r^2) ~ electric field of point charge\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Distance from Source Charge(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Charge of Point(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    double k = 1/(4*Math.PI*ep);
                                    System.out.print("The electric field of the point charge is " + (k*q/Math.pow(r,2)) + " N/C\n");
                                    input.next();
                                }
                                else if(ef==2)
                                {
                                    System.out.print("\nExpression being used: E = q/(4*PI*epsilon_0*r^2) ~ electric field of surface of conducting sphere\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Distance from Source Charge(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Charge of Point(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    double k = 1/(4*Math.PI*ep);
                                    System.out.print("The electric field of the surface of the sphere is " + (k*q/Math.pow(r,2)) + " N/C\n");
                                    input.next();
                                }
                                else if(ef==3)
                                {
                                    System.out.print("\nExpression being used: E = q/(2*PI*epsilon_0*r^2) ~ electric field of point away from conduction wire\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Distance from Source Charge(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Charge of Point(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Charge per Unit Length(C/m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    double k = 1/(2*Math.PI*ep);
                                    System.out.print("The electric field of the point is " + (k*q*l/Math.pow(r,2)) + " N/C\n");
                                    input.next();
                                }
                                else if(ef==4)
                                {
                                    System.out.print("\nExpression being used: E = q/(2*PI*epsilon_0*r^2) ~ electric field of point outside of conducting cylinder\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Distance from Source Charge(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Charge of Point(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Charge per Unit Length(C/m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    double k = 1/(2*Math.PI*ep);
                                    System.out.print("The electric field of the point is " + (k*q*l/Math.pow(r,2)) + " N/C\n");
                                    input.next();
                                }
                                else if(ef==5)
                                {
                                    System.out.print("\nWould you like to find the Electric Field of:\nPoint Outside the Sphere(1)\nPoint Inside the Sphere(2)\nInput:");
                                    int ep1 = input.nextInt();
                                    if(ep1==1)
                                    {
                                        System.out.print("\nExpression being used: E = Q/(2*PI*epsilon_0*r^2) ~ electric field of point outside of conducting cylinder\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Distance from Source Charge(m): ");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        System.out.print("Charge Distributed on Surface(C): ");
                                        String Qp1 = input.next();
                                        double Q = exp(Qp1);
                                        double k = 1/(4*Math.PI*ep);
                                        System.out.print("The electric field of the point is " + (k*Q/Math.pow(r,2)) + " N/C\n");
                                        input.next();
                                    }
                                    else if(ep1==2)
                                    {
                                        System.out.print("\nExpression being used: E = Q*r/(4*PI*epsilon_0*R^3) ~ electric field of point outside of conducting cylinder\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Distance from Source Charge(m): ");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        System.out.print("Radius of Sphere(m): ");
                                        String Rp1 = input.next();
                                        double R = exp(Rp1);
                                        System.out.print("Charge Distributed on Surface(C): ");
                                        String Qp1 = input.next();
                                        double Q = exp(Qp1);
                                        double k = 1/(4*Math.PI*ep);
                                        System.out.print("The electric field of the point is " + (k*Q*r/Math.pow(R,3)) + " N/C\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(ef==6)
                                {
                                    System.out.print("\nExpression being used: E = sigma/(2*epsilon_0) ~ electric field of point around conducting sheet\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Charge per Unit Area(C/m^2): ");
                                    String sip1 = input.next();
                                    double si = exp(sip1);
                                    double k = 1/(2*ep);
                                    System.out.print("The electric field of the point is " + (k*si) + " N/C\n");
                                    input.next();
                                }
                                else if(ef==7)
                                {
                                    System.out.print("\nExpression being used: E = sigma/(epsilon_0) ~ electric field of point between conducting plates\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Charge Density(C/m^3): ");
                                    String sip1 = input.next();
                                    double si = exp(sip1);
                                    double k = 1/(ep);
                                    System.out.print("The electric field of the point is " + (k*si) + " N/C\n");
                                    input.next();
                                }
                                else if(ef==8)
                                {
                                    System.out.print("\nExpression being used: E = sigma/(epsilon_0) ~ electric field of point between conducting plates\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Charge Density(C/m^3): ");
                                    String sip1 = input.next();
                                    double si = exp(sip1);
                                    double k = 1/(ep);
                                    System.out.print("The electric field of the point is " + (k*si) + " N/C\n");
                                    input.next();
                                }
                            }
                            else if(response1v==3)
                                go1v = false;
                            
                        }
                    }
                    else if(response4==3)//go1w
                    {
                        boolean go1w = true;
                        while(go1w)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Electric Potential Energy of Two Point Charges\n2.Find Potential due to a Point Charge\n3.\n3.Back\n");
                            System.out.print("Input:");
                            int response1w = input.nextInt();
                            if(response1w==1)
                            {
                                System.out.print("\nExpression being used: q_0*q/(4*PI*epsilon_0) ~ electric potential energy of two point charges\n");
                                input.next();
                                System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                double ep = 8.854*1/Math.pow(10,12);
                                System.out.print("\nMagnitude of First Charge(C): ");
                                String q1p1 = input.next();
                                double q1 = exp(q1p1);
                                System.out.print("Magnitude of Second Charge(C): ");
                                String q2p1 = input.next();
                                double q2 = exp(q2p1);
                                System.out.print("Distance Between Charges(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                double k = 1/(4*Math.PI*ep);
                                System.out.print("\nThe electric potential energy of the two charges is " + (q1*q2*k/r) + " J\n");
                                input.next();
                            }
                            else if(response1w==2)
                            {
                                System.out.print("\nWould you like to find the Potential in terms of:\n Potential Energy and Charge(1)\nCharge and Distance from Charge to Point(2)\nInput:");
                                int p = input.nextInt();
                                if(p==1)
                                {
                                    System.out.print("\nExpression being used: V = U/q_0 ~ potential due to point charge\n");
                                    input.next();
                                    System.out.print("\nPotential Energy(J): ");
                                    String Up1 = input.next();
                                    double U = exp(Up1);
                                    System.out.print("Charge Magnitude(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("\nThe potential due to the charge is " + (U/q) + " V\n");
                                    input.next();
                                }
                                else if(p==2)
                                {
                                    System.out.print("\nExpression being used: q_0*q/(4*PI*epsilon_0) ~ electric potential energy of two point charges\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Magnitude of Charge(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Distance from Charge to Observed Point(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    double k = 1/(4*Math.PI*ep);
                                    System.out.print("\nThe potential due to the charge is " + (q*k/r) + " V\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1w==3)
                                go1w = false;
                        }
                    }
                    else if(response4==4)//go1x
                    {
                        boolean go1x = true;
                        while(go1x)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Use Definition of Capacitance\n2.Find Capacitance of Parallel-Plate Capacitor in Vacuum\n3.Find Equivalent Capacitance of Capacitors in Series\n4.Find Equivalent Capacitance of Capacitor in Parallel\n5.Find Potential Energy Stored in Capacitor\n6.Find Electric Energy Density in a Vacuum\n7.Find Capacitance of Parallel-Plates with Dielectric in Between\n8.Find Electric Energy Density in a Dielectric\n9.Back\n");
                            System.out.print("Input:");
                            int response1x = input.nextInt();
                            if(response1x==1)
                            {
                                System.out.print("\nWould you like to find:\nCapacitance(1)\nPotential Difference(2)\nMagnitude of Charge on Each Conductor(3)\nInput:");
                                int cd = input.nextInt();
                                if(cd==1)
                                {
                                    System.out.print("\nExpression being used: C = Q/V ~ capacitance\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Charge on each Conductor(C): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Potential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe capacitance is " + (Q/V) + " F\n");
                                    input.next();
                                }
                                else if(cd==2)
                                {
                                    System.out.print("\nExpression being used: V = Q/C ~ potential difference\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Charge on each Conductor(C): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Capacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe potential difference is " + (Q/C) + " V\n");
                                    input.next();
                                }
                                else if(cd==3)
                                {
                                    System.out.print("\nExpression being used: Q = C*V ~ magnitude of charge on each conductor\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Potential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe magnitude of charge on each conductor is " + (C*V) + " C\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1x==2)
                            {
                                System.out.print("\nWould you like to find the Capacitance in terms of:\nMagnitude of Charge on each Conductor and Potential Diffrence(1)\nArea of each Plate and Distance of Seperation(2)\nInput:");
                                int cm = input.nextInt();
                                if(cm==1)
                                {
                                    System.out.print("\nExpression being used: C = Q/V ~ capacitance\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Charge on each Conductor(C): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Potential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe capacitance is " + (Q/V) + " F\n");
                                    input.next();
                                }
                                else if(cm==2)
                                {
                                    System.out.print("\nWould you like to find:\nCapacitance(1)\nArea of Conductors(2)\nInput:");
                                    int ca = input.nextInt();
                                    if(ca==1)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Area of Plate(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Seperation Distance(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance is " + (ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(ca==2)
                                    {
                                        System.out.print("\nExpression being used: A = C*d/epsilon_0 ~ area of plate\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("Seperation Distance(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe area of the plate is " + (C*d/ep) + " m^2\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1x==3)
                            {
                                System.out.print("\nExpression being used: C_eq = 1/C + 1/C + 1/C... ~ equivalent capacitance\n");
                                System.out.print("How many Capacitors are there?\nInput:");
                                int count = 0;
                                double sum = 0;
                                double sum1 = 0;
                                int cn = input.nextInt();
                                while(count < cn)
                                {
                                    System.out.print("\nCapacitor " + (count+1) + " magnitude(F):");
                                    String cp1 = input.next();
                                    double c = exp(cp1);
                                    sum1 = ((1/c) + sum);
                                    sum = sum1;
                                    count ++;
                                }
                                System.out.print("\nThe equivalant capacitance is " + (1/sum1) + " F\n");
                                input.next();
                            }
                            else if(response1x==4)
                            {
                                System.out.print("\nExpression being used: C_eq = C1 + C2 + C3... ~ equivalent capacitance\n");
                                System.out.print("\nHow many Capacitors are there?\nInput:");
                                int count = 0;
                                double sum = 0;
                                double sum1 = 0;
                                int cn = input.nextInt();
                                while(count < cn)
                                {
                                    System.out.print("\nCapacitor " + (count+1) + " magnitude(F):");
                                    String cp1 = input.next();
                                    double c = exp(cp1);
                                    sum1 = (c + sum);
                                    sum = sum1;
                                    count ++;
                                }
                                System.out.print("\nThe equivelant capacitance is " + (sum1) + " F\n");
                                input.next();
                            }
                            else if(response1x==5)
                            {
                                System.out.print("\nWould you like to find the Potential Energy in terms of:\nMagnitude of Charge and Capacitance(1)\nCapacitance and Potential Difference(2)\nMagnitude of Charge and Potential Difference(3)\nInput:");
                                int pe = input.nextInt();
                                if(pe==1)
                                {
                                    System.out.print("\nExpression being used: U = Q^2/(2*C) ~ potential energy stored in capacitor\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Charge(C): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Capacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe potential energy in the capacitor is " + (Math.pow(Q,2)/(2*C)) + " J or " + (Math.pow(Q,2)/(2*C))*1.602*1/Math.pow(10,19) + "eV\n");
                                    input.next();
                                }
                                else if(pe==2)
                                {
                                    System.out.print("\nExpression being used: U = 1/2*C*V^2 ~ potential energy stored in capacitor\n");
                                    input.next();
                                    System.out.print("\nPotential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Capacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe potential energy in the capacitor is " + (C*Math.pow(V,2)/2) + " J or " + (C*Math.pow(V,2)/2)*1.602*1/Math.pow(10,19) + "eV\n");
                                    input.next();
                                }
                                else if(pe==3)
                                {
                                    System.out.print("\nExpression being used: U = 1/2*Q*V ~ potential energy stored in capacitor\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Charge(C): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Potential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe potential energy in the capacitor is " + (Q*V/2) + " J or " + (Q*V/2)*1.602*1/Math.pow(10,19) + "eV\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1x==6)
                            {
                                System.out.print("\nWould you like to find:\nElectric Energy Density(1)\nElectric Field Magnitude(2)\nInput:");
                                int ef = input.nextInt();
                                if(ef==1)
                                {
                                    System.out.print("\nExpression being used: u = 1/2*epsilon_0*E^2 ~ electric energy density in vacuum\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density is " + (Math.pow(E,2)*ep/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(ef==2)
                                {
                                    System.out.print("\nExpression being used: E = sqrt(2*u/epsilon_0)  ~ electric field magnitude\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Electric Energy Density(J/m^3): ");
                                    String up1 = input.next();
                                    double u = exp(up1);
                                    System.out.print("\nThe electric field magnitude is " + (Math.sqrt(2*u/ep)) + " V/m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1x==7)
                            {
                                System.out.print("\nDielectric being used:\nVacuum(1)\nAir at 1 atm(2)Air at 100atm(3)\nTeflon(4)\nPolythylene(5)\nBenzene(6)\nMica(7)\nMylar(8)\nPolyvinyl Chloride(9)\nPlexiglas(10)\nGlass(11)\nNeoprene(12)\nGermanium(13)\nGlycerin(14)\nWater(15)\nStrontium Titanate(16)\nOther(17)\nInput:");
                                int di = input.nextInt();
                                if(di==1)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 1\n");
                                        double K = 1;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 1\n");
                                        double K = 1;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 1\n");
                                        double K = 1;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==2)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 1.00059\n");
                                        double K = 1.00059;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 1.00059\n");
                                        double K = 1.00059;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 1.00059\n");
                                        double K = 1.00059;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==3)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 1.0548\n");
                                        double K = 1.0548;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 1.0548\n");
                                        double K = 1.0548;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 1.0548\n");
                                        double K = 1.0548;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==4)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 2.1\n");
                                        double K = 2.1;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 2.1\n");
                                        double K = 2.1;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 2.1\n");
                                        double K = 2.1;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==5)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 2.25\n");
                                        double K = 2.25;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 2.25\n");
                                        double K = 2.25;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 2.25\n");
                                        double K = 2.25;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==6)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 2.28\n");
                                        double K = 2.28;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 2.28\n");
                                        double K = 2.28;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 2.28\n");
                                        double K = 2.28;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==7)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 3\n");
                                        double K = 3;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3\n");
                                        double K = 3;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3\n");
                                        double K = 3;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==8)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 3.1\n");
                                        double K = 3.1;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3.1\n");
                                        double K = 3.1;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3.1\n");
                                        double K = 3.1;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==9)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 3.18\n");
                                        double K = 3.18;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3.18\n");
                                        double K = 3.18;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3.18\n");
                                        double K = 3.18;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==10)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 3.4\n");
                                        double K = 3.4;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3.4\n");
                                        double K = 3.4;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 3.4\n");
                                        double K = 3.4;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==11)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 5\n");
                                        double K = 5;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 5\n");
                                        double K = 5;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 5\n");
                                        double K = 5;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==12)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 6.7\n");
                                        double K = 6.7;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 6.7\n");
                                        double K = 6.7;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 6.7\n");
                                        double K = 6.7;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==13)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 16\n");
                                        double K = 16;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 16\n");
                                        double K = 16;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 16\n");
                                        double K = 16;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==14)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 42.5\n");
                                        double K = 42.5;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 42.5\n");
                                        double K = 42.5;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 42.5\n");
                                        double K = 42.5;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==15)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 80.4\n");
                                        double K = 80.4;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 80.4\n");
                                        double K = 80.4;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 80.4\n");
                                        double K = 80.4;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==16)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: 310\n");
                                        double K = 310;
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 310\n");
                                        double K = 310;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: 310\n");
                                        double K = 310;
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(di==17)
                                {
                                    System.out.print("\nWould you like to find the Capcitance in terms of:\nDielctric Constant and Original Capacitance(1)\nDielectric Constant, Area of Conductor, and Seperation Distance between Plates(2)\nArea of Conductor and Seperation Distance between Plates(3)\nInput:");
                                    int cp = input.nextInt();
                                    if(cp==1)
                                    {
                                        System.out.print("\nExpression being used: C = K*C_0 ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nDielectric Constant: ");
                                        String Kp1 = input.next();
                                        double K = exp(Kp1);
                                        System.out.print("Original Capacitance(F): ");
                                        String Cp1 = input.next();
                                        double C = exp(Cp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*C) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==2)
                                    {
                                        System.out.print("\nExpression being used: C = K*epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: ");
                                        String Kp1 = input.next();
                                        double K = exp(Kp1);
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe capacitance with this dielectric is " + (K*ep*A/d) + " F\n");
                                        input.next();
                                    }
                                    else if(cp==3)
                                    {
                                        System.out.print("\nExpression being used: C = epsilon_0*A/d ~ capacitance with dielectric\n");
                                        input.next();
                                        System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                        double ep = 8.854*1/Math.pow(10,12);
                                        System.out.print("Dielectric Constant: ");
                                        String Kp1 = input.next();
                                        double K = exp(Kp1);
                                        System.out.print("Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Distance in Between Conducting Plates(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        double ep1 = K*ep;
                                        System.out.print("\nThe capacitance with this dielectric is " + (ep1*A/d) + " F\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1x==8)
                            {
                                System.out.print("\nDielectric being used:\nVacuum(1)\nAir at 1 atm(2)Air at 100atm(3)\nTeflon(4)\nPolythylene(5)\nBenzene(6)\nMica(7)\nMylar(8)\nPolyvinyl Chloride(9)\nPlexiglas(10)\nGlass(11)\nNeoprene(12)\nGermanium(13)\nGlycerin(14)\nWater(15)\nStrontium Titanate(16)\nOther(17)\nInput:");
                                int di = input.nextInt();
                                if(di==1)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 1\n");
                                    double K = 1;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==2)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 1.00059\n");
                                    double K = 1.00059;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==3)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 1.0548\n");
                                    double K = 1.0548;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==4)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 2.1\n");
                                    double K = 2.1;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==5)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 2.25\n");
                                    double K = 2.25;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==6)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 2.28\n");
                                    double K = 2.28;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==7)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 3\n");
                                    double K = 3;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==8)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 3.1\n");
                                    double K = 3.1;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==9)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 3.18\n");
                                    double K = 3.18;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==10)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 3.4\n");
                                    double K = 3.4;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==11)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 5\n");
                                    double K = 5;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==12)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 6.7\n");
                                    double K = 6.7;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==13)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 16\n");
                                    double K = 16;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==14)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 42.5\n");
                                    double K = 42.5;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==15)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 80.4\n");
                                    double K = 80.4;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==16)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: 310\n");
                                    double K = 310;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else if(di==17)
                                {
                                    System.out.print("\nExpression being used: 1/2*K*epsilon_0*E^2 ~ electric energy density in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Space(C^2/(N^2*m^2)): 8.854*10^-12\n");
                                    double ep = 8.854*1/Math.pow(10,12);
                                    System.out.print("Dielectic Constant: ");
                                    String Kp1 = input.next();
                                    double K = exp(Kp1);
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe electric energy density in the dielectric is " + (K*ep*Math.pow(E,2)/2) + " J/m^3\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1x==9)
                                go1x = false;
                        }
                    }
                    else if(response4==5)//go1y
                    {
                        boolean go1y = true;
                        while(go1y)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Use General Expression or Current\n2.Find the Current Density Vector\n3.Use Definition of Resistivity\n4.Find Resisitivty as a Function of Temperature\n5.Use Relationship between Resistance and Resistivity\n6.Use Relationship between Voltage, Current, and Resistance\n7.Find Terminal Voltage\n8.Find Rate at which Energy is Delivered or Extracted from Circuit Element\n9.Find Power Delivered to Resistor\n10.Back\n");
                            System.out.print("Input:");
                            int response1y = input.nextInt();
                            if(response1y==1)
                            {
                                System.out.print("\nWould you like to find:\nCurrent(1)\nConcentration of Particles(2)\nDrift Velocity(3)\nCross-Sectional Area of Conductor(4)\nInput:");
                                int cu = input.nextInt();
                                if(cu==1)
                                {
                                    System.out.print("\nExpression being used: I = n*q*v_d*A ~ expression for current\n");
                                    input.next();
                                    System.out.print("\nConcentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Drift Velocity(m/s): ");
                                    String vdp1 = input.next();
                                    double vd = exp(vdp1);
                                    System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe current through the conductor is " + (n*q*vd*A) + " A\n");
                                    input.next();
                                }
                                else if(cu==2)
                                {
                                    System.out.print("\nExpression being used: n = I/(q*v_d*A) ~ expression for concentration of particles\n");
                                    input.next();
                                    System.out.print("\nCurrent through Conductor(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Drift Velocity(m/s): ");
                                    String vdp1 = input.next();
                                    double vd = exp(vdp1);
                                    System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe concentration of particles through the conductor is " + I/(q*vd*A) + " /m^3\n");
                                    input.next();
                                }
                                else if(cu==3)
                                {
                                    System.out.print("\nExpression being used: v_d = I/(n*q*A) ~ expression for drift velocity\n");
                                    input.next();
                                    System.out.print("\nConcentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Current through Conductor(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe drift velocity is " + I/(n*q*A) + " m/s\n");
                                    input.next();
                                }
                                else if(cu==4)
                                {
                                    System.out.print("\nExpression being used: A = I/(n*q*v_d) ~ expression for cross-sectional area of condutor\n");
                                    input.next();
                                    System.out.print("\nConcentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Drift Velocity(m/s): ");
                                    String vdp1 = input.next();
                                    double vd = exp(vdp1);
                                    System.out.print("Current through Conductor(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe cross-sectional area of the conductor is " + I/(n*q*vd) + " m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==2)
                            {
                                System.out.print("\nWould you like to find:\nCurrent Density(1)\nConcentration of Particles(2)\nDrift Velocity(3)\nInput:");
                                int cu = input.nextInt();
                                if(cu==1)
                                {
                                    System.out.print("\nExpression being used: J = n*q*v_d ~ expression for current density\n");
                                    input.next();
                                    System.out.print("\nConcentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Drift Velocity(m/s): ");
                                    String vdp1 = input.next();
                                    double vd = exp(vdp1);
                                    System.out.print("\nThe current density is " + (n*q*vd) + " A/m^2\n");
                                    input.next();
                                }
                                else if(cu==2)
                                {
                                    System.out.print("\nExpression being used: n = J/(q*v_d) ~ expression for concentration of particles\n");
                                    input.next();
                                    System.out.print("\nCurrent Density(A/m^2): ");
                                    String Jp1 = input.next();
                                    double J = exp(Jp1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Drift Velocity(m/s): ");
                                    String vdp1 = input.next();
                                    double vd = exp(vdp1);
                                    System.out.print("\nThe concentration of particles through the conductor is " + J/(q*vd) + " /m^3\n");
                                    input.next();
                                }
                                else if(cu==3)
                                {
                                    System.out.print("\nExpression being used: v_d = J/(n*q) ~ expression for drift velocity\n");
                                    input.next();
                                    System.out.print("\nConcentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Current Density(A/m^2): ");
                                    String Jp1 = input.next();
                                    double J = exp(Jp1);
                                    System.out.print("\nThe drift velocity is " + J/(n*q) + " m/s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==3)
                            {
                                System.out.print("\nExpression being used: rho = E/J ~ resistivity\n");
                                input.next();
                                System.out.print("\nElectric Field Magnitude(V/m): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Current Density(A/m^2): ");
                                String Jp1 = input.next();
                                double J = exp(Jp1);
                                System.out.print("\nThe resistivity is " + (E/J) + " V*m/A\n");
                                input.next();
                            }
                            else if(response1y==4)
                            {
                                System.out.print("\nWhich Material is being used:\nSilver(1)\nCopper(2)\nGold(3)\nAluminum(4)\nTungsten(5)\nSteel(6)\nLead(7)\nMercury(8)\nManganin(9)\nConstantan(10)\nNichrome(11)\nGraphite(12)\nGermainium(13)\nSilicon(14)\nAmber(15)\nGlass(16)\nLucite(17)\nMica(18)\nQuartz(19)\nSulfur(20)\nTeflon(21)\nWood(22)\nBrass(23)\nIron(24)\nOther(25)\nInput:");
                                int rs = input.nextInt();
                                if(rs==1)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 1.47*10^-8\n");
                                    double rho = 1.47*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .0038\n");
                                    double al = .0038;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==2)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 1.72*10^-8\n");
                                    double rho = 1.72*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .00393\n");
                                    double al = .00393;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==3)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 2.44*10^-8\n");
                                    double rho = 2.44*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==4)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 2.75*10^-8\n");
                                    double rho = 2.75*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .0039 \n");
                                    double al = .0039;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==5)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 5.25*10^-8\n");
                                    double rho = 5.25*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .0045\n");
                                    double al = .0045;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==6)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 20*10^-8\n");
                                    double rho = 20*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==7)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 22*10^-8\n");
                                    double rho = 22*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .0043\n");
                                    double al = .0043;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==8)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 95*10^-8\n");
                                    double rho = 95*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .00088\n");
                                    double al = .00088;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==9)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 44*10^-8\n");
                                    double rho = 44*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): 0\n");
                                    double al = 0;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==10)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 49*10^-8\n");
                                    double rho = 49*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .00001\n");
                                    double al = .00001;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==11)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 100*10^-8\n");
                                    double rho = 100*1/Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .0004\n");
                                    double al = .0004;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==12)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 3.5*10^-5\n");
                                    double rho = 3.5*1/Math.pow(10,5);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): -.0005\n");
                                    double al = -.0005;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==13)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): .6\n");
                                    double rho = .6;
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==14)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 2300\n");
                                    double rho = 2300;
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==15)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 5*10^14\n");
                                    double rho = 5*Math.pow(10,14);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==16)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 10^10\n");
                                    double rho = Math.pow(10,10);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==17)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 10^14\n");
                                    double rho = Math.pow(10,14);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==18)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 10^11 \n");
                                    double rho = Math.pow(10,11);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==19)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 75*10^16\n");
                                    double rho = 75*Math.pow(10,16);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==20)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 10^15\n");
                                    double rho = Math.pow(10,15);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==21)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 10^12 \n");
                                    double rho = Math.pow(10,12);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==22)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): 10^8 \n");
                                    double rho = Math.pow(10,8);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==23)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .002\n");
                                    double al = .002;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==24)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): .005\n");
                                    double al = .005;
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rs==25)
                                {
                                    System.out.print("\nExpression being used: rho(T) = rho_0*(1 + alpha*(T-T_0)) ~ resistivity based on temperature\n");
                                    input.next();
                                    System.out.print("\nResistivity of Material(V*m/A): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Temperature Coefficient of Resistivity for Material(degree C^-1): \n");
                                    String alp1 = input.next();
                                    double al = exp(alp1);
                                    System.out.print("Initial Temperature(K or C): ");
                                    String T1p1 = input.next();
                                    double T1 = exp(T1p1);
                                    System.out.print("Final Temperature(K or C): ");
                                    String T2p1 = input.next();
                                    double T2 = exp(T2p1);
                                    System.out.print("\nThe resistivity due to the temperature change is " + (rho*(1 + al*(T2-T1))) + " V*m/A\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==5)
                            {
                                System.out.print("\nWould you like to find:\nResistance of Conductor(1)\nResistivity of Conductor(2)\nCross Sectional Area of Conductor(3)\nLength of Conductor(4)\nInput:");
                                int rst = input.nextInt();
                                if(rst==1)
                                {
                                    System.out.print("\nExpression being used: R = rho*L/A ~ resistance\n");
                                    input.next();
                                    System.out.print("\nResistivity of Conductor(V*m/A): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Length of Conductor(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe resistance of the conductor is " + (rho*L/A) + " Ohms\n");
                                    input.next();
                                }
                                else if(rst==2)
                                {
                                    System.out.print("\nExpression being used: rho = R*A/L ~ resistivity\n");
                                    input.next();
                                    System.out.print("\nResistance of Conductor(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Length of Conductor(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe resistivity of the conductor is " + (R*A/L) + " V*m/A\n");
                                    input.next();
                                }
                                else if(rst==3)
                                {
                                    System.out.print("\nExpression being used: L = R*A/rho ~ length of conductor\n");
                                    input.next();
                                    System.out.print("\nResistivity of Conductor(V*m/A): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Resistance of Conductor(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe length of the conductor is " + (R*A/rho) + " m\n");
                                    input.next();
                                }
                                else if(rst==4)
                                {
                                    System.out.print("\nExpression being used: A = rho*L/R ~ cross-sectional area of conductor\n");
                                    input.next();
                                    System.out.print("\nResistivity of Conductor(V*m/A): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Resistance of Conductor(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Length of Conductor(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe cross-sectional area of the conductor is " + (rho*L/R) + " m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==6)
                            {
                                System.out.print("\nWould you like to find:\nVoltage(1)\nCurrent(2)\nResistance(3)\nInput:");
                                int vcr = input.nextInt();
                                if(vcr==1)
                                {
                                    System.out.print("\nExpression being used: V = I*R ~ voltage\n");
                                    input.next();
                                    System.out.print("\nCurrent(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe voltage is " + (I*R) + " V\n");
                                    input.next();
                                }
                                else if(vcr==2)
                                {
                                    System.out.print("\nExpression being used: I = V/R ~ current\n");
                                    input.next();
                                    System.out.print("\nVoltage(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe current is " + (V/R) + " A\n");
                                    input.next();
                                }
                                else if(vcr==3)
                                {
                                    System.out.print("\nExpression being used: R = V/I ~ resistance\n");
                                    input.next();
                                    System.out.print("\nCurrent(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Voltage(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe resistance is " + (V/I) + " Ohms\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==7)
                            {
                                System.out.print("\nWould you like to find:\nTerminal Voltage(1)\nElectromotive Force(2)\nCurrent(3)\nInternal Resistance(4)\nInput:");
                                int tv = input.nextInt();
                                if(tv==1)
                                {
                                    System.out.print("\nExpression being used: V = Em - I*r ~ terminal voltage\n");
                                    input.next();
                                    System.out.print("\nCurrent(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Electromotive Force(V): ");
                                    String Emp1 = input.next();
                                    double Em = exp(Emp1);
                                    System.out.print("Internal Resistance(Ohms): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe terminal voltage is " + (Em - (I*r)) + " V\n");
                                    input.next();
                                }
                                else if(tv==2)
                                {
                                    System.out.print("\nExpression being used: Em = V + (I*r) ~ electromotive force\n");
                                    input.next();
                                    System.out.print("\nCurrent(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Terminal Voltage(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Internal Resistance(Ohms): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe electromotive force is " + (V + (I*r)) + " V\n");
                                    input.next();
                                }
                                else if(tv==3)
                                {
                                    System.out.print("\nExpression being used: I = (Em-V)/r ~ current\n");
                                    input.next();
                                    System.out.print("\nTerminal Voltage(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Electromotive Force(V): ");
                                    String Emp1 = input.next();
                                    double Em = exp(Emp1);
                                    System.out.print("Internal Resistance(Ohms): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe current is " + (Em - V)/r + " A\n");
                                    input.next();
                                }
                                else if(tv==4)
                                {
                                    System.out.print("\nExpression being used: r = (Em - V)/I ~ internal resistance\n");
                                    input.next();
                                    System.out.print("\nCurrent(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Electromotive Force(V): ");
                                    String Emp1 = input.next();
                                    double Em = exp(Emp1);
                                    System.out.print("Terminal Voltage(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe internal resistance is " + (Em - V)/I + " Ohms\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==8)
                            {
                                System.out.print("Expression being used: P = V*I ~ rate energy is delivered or extracted\n");
                                input.next();
                                System.out.print("\nPotential Difference(V): ");
                                String Vp1 = input.next();
                                double V = exp(Vp1);
                                System.out.print("Current(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("\nThe rate is " + (V*I) + " W\n");
                                input.next();
                            }
                            else if(response1y==9)
                            {
                                System.out.print("\nWould you like to find the power in terms of:\nVoltage and Current(1)\nCurrent and Resitance(2)\nVoltage and Resistance(3)\nInput:");
                                int pt = input.nextInt();
                                if(pt==1)
                                {
                                    System.out.print("\nExpression being used: P = V*I ~ rate energy is delivered or extracted\n");
                                    input.next();
                                    System.out.print("\nPotential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Current(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe rate is " + (V*I) + " W\n");
                                    input.next();
                                }
                                else if(pt==2)
                                {
                                    System.out.print("\nExpression being used: P = I^2*R ~ rate energy is delivered or extracted\n");
                                    input.next();
                                    System.out.print("\nResistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Current(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe rate is " + (Math.pow(I,2)*R) + " W\n");
                                    input.next();
                                }
                                else if(pt==3)
                                {
                                    System.out.print("\nExpression being used: P = V^2/R ~ rate energy is delivered or extracted\n");
                                    input.next();
                                    System.out.print("\nPotential Difference(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe rate is " + (Math.pow(V,2)/R) + " W\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1y==10)
                                go1y = false;
                        }
                    }
                        else if(response4==6)
                        go4 = false;
                }
            }
            else if(response==0)
            {
                System.out.println("Have a nice day Sir.");
                go=false;
            }
        }
    }
}