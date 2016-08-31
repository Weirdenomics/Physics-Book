import java.text.DecimalFormat;
import java.util.Scanner;
class Physics3
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
            System.out.println("\n5.Electromagnetism Pt.2\n6.Optics\n7.Modern Physics\n0.Quit");
            System.out.print("Input:");
            int response = input.nextInt();
            if (response==5)
            {
                boolean go4 = true;
                while(go4)
                {
                    System.out.println("\nWhich Topic #?");
                    System.out.println("\n1.Direct-Current Circuits\n2.Magnetic Field and Magnetic Forces\n3.Sources of Magnetic Field\n4.Electromagnetic Induction\n5.Inductance\n6.Alternating Current\n7.Electromagnetic Waves\n8.Back");
                    System.out.print("Input:");
                    int response4 = input.nextInt();
                    if(response4==1)//go1z
                    {
                        boolean go1z = true;
                        while(go1z)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Equivalent Resistance of Resistors in Parallel or in Series\n2.Find Charge on Capacitor(Charging Capacitor)\n3.Find Current through Circuit(Charging Capacitor)\n4.Find Charge on Capacitor(Discharging Capacitor)\n5.Find Current through Circuit(Discharging Capacitor)\n6.Back\n");
                            System.out.print("Input:");
                            int response1z = input.nextInt();
                            if(response1z==1)
                            {
                                System.out.print("\nWould you like to find:\nEquivalent Resistance for Resistors in Parallel(1)\nEquivalent Resistance for Resistors in Series(2)\nInput:");
                                int er = input.nextInt();
                                if(er==1)
                                {
                                    System.out.print("\nExpression being used: R_eq = 1/R1 + 1/R2 + 1/R3... ~ equivalent resistance\n");
                                    System.out.print("How many Resistors are there?\nInput:");
                                    int count = 0;
                                    double sum = 0;
                                    double sum1 = 0;
                                    int cn = input.nextInt();
                                    while(count < cn)
                                    {
                                        System.out.print("\nResistor " + (count+1) + " magnitude(Ohm):");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        sum1 = ((1/r) + sum);
                                        sum = sum1;
                                        count ++;
                                    }
                                    System.out.print("\nThe equivalent resistance is " + (1/sum1) + " Ohms\n");
                                    input.next();
                                }
                                else if(er==2)
                                {
                                    System.out.print("\nExpression being used: R_eq = R1 + R2 + R3... ~ equivalent rapacitance\n");
                                    System.out.print("\nHow many Resistors are there?\nInput:");
                                    int count = 0;
                                    double sum = 0;
                                    double sum1 = 0;
                                    int cn = input.nextInt();
                                    while(count < cn)
                                    {
                                        System.out.print("\nResistor " + (count+1) + " magnitude(Ohm):");
                                        String rp1 = input.next();
                                        double r = exp(rp1);
                                        sum1 = (r + sum);
                                        sum = sum1;
                                        count ++;
                                    }
                                    System.out.print("\nThe equivalent resistance is " + (sum1) + " Ohms\n");
                                    input.next();
                                    
                                }
                            }
                            else if(response1z==2)
                            {
                                System.out.print("\nWould you like to find the charge in terms of:\nCapacitance, Resistance, Time, and Electromotive Force(1)\nFinal Charge, Time, Resistance, Capacitance(2)\nInput:");
                                int chr = input.nextInt();
                                if(chr==1)
                                {
                                    System.out.print("\nExpression being used: q = C*epsilon*(1-e^(-t/R*C)) ~ charge in charging capacitor\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Electromotive Force(V): ");
                                    String emfp1 = input.next();
                                    double emf = exp(emfp1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Time Observed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe charge in the capacitor is " + (C*emf*(1-Math.exp(-t/(R*C)))) + " C\n");
                                    input.next();
                                }
                                else if(chr==2)
                                {
                                    System.out.print("\nExpression being used: q = Q_f*(1-e^(-t/R*C)) ~ charge in charging capacitor\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Final Charge Value(C): ");
                                    String Qfp1 = input.next();
                                    double Qf = exp(Qfp1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Time Observed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe charge in the capacitor is " + (Qf*(1-Math.exp(-t/(R*C)))) + " C\n");
                                    input.next();
                                }
                            }
                            else if(response1z==3)
                            {
                                System.out.print("\nWould you like to find the current in terms of:\nCapacitance, Resistance, Time, and Electromotive Force(1)\nInitial Current, Time, Resistance, Capacitance(2)\nInput:");
                                int crrt = input.nextInt();
                                if(crrt==1)
                                {
                                    System.out.print("\nExpression being used: i = E/R*(e^(-t/(R*C))) ~ current in circuit during capacitor charge\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Electromotive Force(V): ");
                                    String emfp1 = input.next();
                                    double emf = exp(emfp1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Time Observed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe current through the circuit is " + ((emf/R)*Math.exp(-t/(R*C))) + " A\n");
                                    input.next();
                                }
                                else if(crrt==2)
                                {
                                    System.out.print("\nExpression being used: i = I_o*e^(-t/R*C) ~ current in circuit during capacitor charge\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Initial Current(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Time Observed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe current through the circuit is " + (I*Math.exp(-t/(R*C))) + " A\n");
                                    input.next();
                                }
                            }
                            else if(response1z==4)
                            {
                                System.out.print("\nExpression being used: q = Q_o*e^(-t/R*C) ~ charge in discharging  capacitor\n");
                                input.next();
                                System.out.print("\nCapacitance(F): ");
                                String Cp1 = input.next();
                                double C = exp(Cp1);
                                System.out.print("Intital Charge of Capacitor(C): ");
                                String Qp1 = input.next();
                                double Q = exp(Qp1);
                                System.out.print("Resistance(Ohms): ");
                                String Rp1 = input.next();
                                double R = exp(Rp1);
                                System.out.print("Time Observed(s): ");
                                String tp1 = input.next();
                                double t = exp(tp1);
                                System.out.print("\nThe charge in the capacitor is " + (Q*Math.exp(-t/(R*C))) + " C\n");
                                input.next();
                            }
                            else if(response1z==5)
                            {
                                System.out.print("\nWould you like to find the current in terms of:\nCapacitance, Resistance, Time, and Initial Capacitor Charge(1)\nInitial Current, Time, Resistance, Capacitance(2)\nInput:");
                                int crrt = input.nextInt();
                                if(crrt==1)
                                {
                                    System.out.print("\nExpression being used: i = (Q_0/(R*C))*(e^(-t/(R*C))) ~ current in circuit during capacitor discharge\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Initial Charge in Capacitor(C): ");
                                    String Qp1 = input.next();
                                    double Q = exp(Qp1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Time Observed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe current through the circuit is " + ((-Q/(R*C))*Math.exp(-t/(R*C))) + " A\n");
                                    input.next();
                                }
                                else if(crrt==2)
                                {
                                    System.out.print("\nExpression being used: i = I_o*e^(-t/R*C) ~ current in circuit during capacitor discharge\n");
                                    input.next();
                                    System.out.print("\nCapacitance(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Initial Current(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Resistance(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Time Observed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe current through the circuit is " + (I*Math.exp(-t/(R*C))) + " A\n");
                                    input.next();
                                }
                            }
                            else if(response1z==6)
                                go1z = false;
                        }
                    }
                    else if(response4==2)//go1A
                    {
                        boolean go1A = true;
                        while(go1A)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Magnetic Force on Moving Charged Particle\n2.Find Radius of Circular Orbit in Magnetic Field\n3.Find Magnetic Force on Straight Wire Segment\n4.Find Vector Torque on Current Loop\n5.Find Potential Energy for Magnetic Dipole\n6.Use Hall Effect\n7.Back\n");
                            System.out.print("Input:");
                            int response1A = input.nextInt();
                            if(response1A==1)
                            {
                                System.out.print("\nExpression being used: F = q*v*B*sin(theta) ~ magnetic force on moving charged particle\n");
                                input.next();
                                System.out.print("\nMagnitude of Charge(C): ");
                                String qp1 = input.next();
                                double q = exp(qp1);
                                System.out.print("Velocity Vector Magnitude of Particle(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Magnitude of Magnetic Field(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("Angle between Magnetic Field and Particle(degrees): ");
                                String thp1 = input.next();
                                double th = exp(thp1);
                                System.out.print("\nThe magnetic force on the charge is " + (q*v*B*Math.sin(th/57)) + " N\n");
                                input.next();
                            }
                            else if(response1A==2)
                            {
                                System.out.print("\nExpression being used: R = m*v/q*B ~ radius of orbit in magnetic field\n");
                                input.next();
                                System.out.print("\nMass of Particle(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Velocity of Particle(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Charge Magnitude of Particle(C): ");
                                String qp1 = input.next();
                                double q = exp(qp1);
                                System.out.print("Magnetic Field Strength(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("\nThe radius of the orbit is " + (m*v/(q*B)) + " m\n");
                                input.next();
                            }
                            else if(response1A==3)
                            {
                                System.out.print("\nExpression being used: I*l*B*sin(theta) ~ magnetic force on straight wire segment\n");
                                input.next();
                                System.out.print("\nTotal Current in Wire(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Length of Wire(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("Magnetic Field Strength(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("Angle between Wire and Magnetic Field(degrees): ");
                                String thp1 = input.next();
                                double th = exp(thp1);
                                System.out.print("\nThe magnetic force is " + (I*l*B*Math.sin(th/57)) + " N\n");
                                input.next();
                            }
                            else if(response1A==4)
                            {
                                System.out.print("\nExpression being used: torque = mu*B*sin(phi) ~ magnitude of torque on current loop\n");
                                input.next();
                                System.out.print("\nMagnetic Dipole Moment(A*m^2): ");
                                String mup1 = input.next();
                                double mu = exp(mup1);
                                System.out.print("Magnetic Field Strength(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("Angle between Magnetic Moment and Magnetic Field(degrees): ");
                                String thp1 = input.next();
                                double th = exp(thp1);
                                System.out.print("\nThe magnitude of the torque is " + (mu*B*Math.sin(th/57)) + " N*m\n");
                                input.next();
                            }
                            else if(response1A==5)
                            {
                                System.out.print("\nExpression being used: U = -mu*B*cos(phi) ~ potential energy for magnetic dipole");
                                input.next();
                                System.out.print("\nMagnetic Dipole Moment(A*m^2): ");
                                String mup1 = input.next();
                                double mu = exp(mup1);
                                System.out.print("Magnetic Field Strength(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("Angle between Magnetic Moment and Magnetic Field(degrees): ");
                                String thp1 = input.next();
                                double th = exp(thp1);
                                System.out.print("\nThe potential energy of the magnetic moment is " + (-mu*B*Math.cos(th/57)) + " J\n");
                                input.next();
                            }
                            else if(response1A==6)
                            {
                                System.out.print("\nWould you like to find:\nCurrent Density(1)\nElectric Field Strength(2)\nConcentration of Particles(3)\nMagnetic Field Strength(4)\nCharge of Particle(5)\nInput:");
                                int he = input.nextInt();
                                if(he==1)
                                {
                                    System.out.print("\nWould you like to find the Current Density in terms of:\nCurrent and Cross-Sectional Area(1)\nConcentration of Particles, Charge of Particles, Electic Field Strength, and Magnetic Field Strength(2)\nInput:");
                                    int he2 = input.nextInt();
                                    if(he2==1)
                                    {
                                        System.out.print("\nExpression being used: J = I/A ~ current density\n");
                                        input.next();
                                        System.out.print("\nCurrent in Conductor(A): " );
                                        String Ip1 = input.next();
                                        double I = exp(Ip1);
                                        System.out.print("Cross-Sectional Area of Conductor(m^2): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("\nThe current density is " + (I/A) + " A/m^2\n");
                                        input.next();
                                    }
                                    else if(he2==2)
                                    {
                                        System.out.print("\nExpression being used: J = -n*q*E/B ~ current density\n");
                                        input.next();
                                        System.out.print("\nConcentration of Particles(m^-3): ");
                                        String np1 = input.next();
                                        double n = exp(np1);
                                        System.out.print("Charge of Particles(C): ");
                                        String qp1 = input.next();
                                        double q = exp(qp1);
                                        System.out.print("Electric Field Strength(V/m): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        System.out.print("Magnetic Field Strength(T): ");
                                        String Bp1 = input.next();
                                        double B = exp(Bp1);
                                        System.out.print("\nThe current density is " + (-n*q*E/B) + " A/m^2\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(he==2)
                                {
                                    System.out.print("\nWould you like to find the Electric Field Strenth in terms of:\nPotential Difference and Conductor Diameter(1)\nConcentration of Particles, Charge of Particles, Current Density, and Magnetic Field Strength(2)\nInput:");
                                    int he2 = input.nextInt();
                                    if(he2==1)
                                    {
                                        System.out.print("\nExpression being used: E = V/d ~ eletric field strength\n");
                                        input.next();
                                        System.out.print("\nPotential Difference(V): " );
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        System.out.print("Diameter of Conductor(m): ");
                                        String dp1 = input.next();
                                        double d = exp(dp1);
                                        System.out.print("\nThe electric field strength is " + (V/d) + " V/m\n");
                                        input.next();
                                    }
                                    else if(he2==2)
                                    {
                                        System.out.print("\nExpression being used: E = -J*B/(n*q*E) ~ electric field strength\n");
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
                                        System.out.print("Magnetic Field Strength(T): ");
                                        String Bp1 = input.next();
                                        double B = exp(Bp1);
                                        System.out.print("\nThe electric field strength is " + (-J*B/(n*q)) + " V/m\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(he==3)
                                {
                                    System.out.print("\nExpression being used: n = -J*B/(E*q) ~ concentration of particles\n");
                                    input.next();
                                    System.out.print("\nElectric Field Strength(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Current Density(A/m^2): ");
                                    String Jp1 = input.next();
                                    double J = exp(Jp1);
                                    System.out.print("Magnetic Field Strength(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("\nThe concentration of particles is " + (-J*B/(E*q)) + " m^-3\n");
                                    input.next();
                                }
                                else if(he==4)
                                {
                                    System.out.print("\nExpression being used: B = -n*q*E/J ~ magnetic field strength\n");
                                    input.next();
                                    System.out.print("\nElectric Field Strength(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("Charge of Particles(C): ");
                                    String qp1 = input.next();
                                    double q = exp(qp1);
                                    System.out.print("Current Density(A/m^2): ");
                                    String Jp1 = input.next();
                                    double J = exp(Jp1);
                                    System.out.print("Concentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("\nThe magnetic field strength is " + (-n*q*E/J) + " T\n");
                                    input.next();
                                }
                                else if(he==5)
                                {
                                    System.out.print("\nExpression being used: q = -J*B/E*n ~ charge of particle\n");
                                    input.next();
                                    System.out.print("\nElectric Field Strength(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("Concentration of Particles(m^-3): ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Current Density(A/m^2): ");
                                    String Jp1 = input.next();
                                    double J = exp(Jp1);
                                    System.out.print("Magnetic Field Strength(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("\nThe charge of the particles is " + (-J*B/(E*n)) + " C\n");
                                    input.next();
                                }
                                else
                                    System.out.print("Ok\n");
                            }
                            else if(response1A==7)
                                go1A = false;
                        }
                    }
                    else if(response4==3)//go1B
                    {
                        boolean go1B = true;
                        while(go1B)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Magnetic Field of Point Charge with Constant Velocity\n2.Find Magnetic Field of Current Element\n3.Find Magnetic Field near Straight Current-Carrying Conductor\n4.Find Force Per unit Length Between Parallel Current Carrying-Conductors\n5.Find Magnetic Field of Circular Loop\n6.Find Magnetic Field at Center of Circular Loops\n7.Use Amphere's Law\n8.Back\n");
                            System.out.print("Input:");
                            int response1B = input.nextInt();
                            if(response1B==1)
                            {
                                System.out.print("\nExpression being used: B = mu_0*q*(v*r*sin(theta))/(4*PI*r^2) ~ magnetic field of point with constant velocity\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Point Charge Magnitude(C): ");
                                String qp1 = input.next();
                                double q = exp(qp1);
                                System.out.print("Velocity of Charge(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Distance from Point Charge(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Angle of Velocity Vector from Distance Vector(degrees): ");
                                String thetap1 = input.next();
                                double theta = exp(thetap1);
                                System.out.print("\nThe magnetic field magnitude at this point is " + (mu*q*v*r*Math.sin(theta/57)/(4*Math.PI*Math.pow(r,2))) + " T\n");
                                input.next();
                            }
                            else if(response1B==2)
                            {
                                System.out.print("\nExpression being used: B = mu_0*I*(dl*r*sin(theta))/(4*PI*r^2) ~ magnetic field of current element\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Current in Conductor(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Length of Current Segment(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("Distance from Current Segment(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Angle of Length Vector from Distance Vector(degrees): ");
                                String thetap1 = input.next();
                                double theta = exp(thetap1);
                                System.out.print("\nThe magnetic field magnitude at this point is " + (mu*I*l*r*Math.sin(theta/57)/(4*Math.PI*Math.pow(r,2))) + " T\n");
                                input.next();
                            }
                            else if(response1B==3)
                            {
                                System.out.print("\nWould you like to find:\nMagnetic Field at Point(1)\nCurrent going through Conductor(2)\nDistance of Resulting Magnetic Field(3)\nInput:");
                                int mf = input.nextInt();
                                if(mf==1)
                                {
                                    System.out.print("\nExpression being used: B = mu_0*I/(2*PI*r) ~ magnetic field near straight current-carrying conductor\n");
                                    input.next();
                                    System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                    double mu = 4*Math.PI*(1/Math.pow(10,7));
                                    System.out.print("Current in Conductor(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Length of Current Segment(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance from Current Segment(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Angle of Length Vector from Distance Vector(degrees): ");
                                    String thetap1 = input.next();
                                    double theta = exp(thetap1);
                                    System.out.print("\nThe magnetic field magnitude at this point is " + (mu*I/(2*Math.PI*r)) + " T\n");
                                    input.next();
                                }
                                else if(mf==2)
                                {
                                    System.out.print("\nExpression being used: I = B*2*PI*r/(mu_0) ~ current through conductor\n");
                                    input.next();
                                    System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                    double mu = 4*Math.PI*(1/Math.pow(10,7));
                                    System.out.print("Magnitude of Magnetic Field(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("Distance from Conductor(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe current through the conductor is " + (B*2*Math.PI*r/(mu)) + " A\n");
                                    input.next();
                                }
                                else if(mf==3)
                                {
                                    System.out.print("\nExpression being used: r = (mu_0)*I/(2*PI*B) ~ distance magnetic field from conductor\n");
                                    input.next();
                                    System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                    double mu = 4*Math.PI*(1/Math.pow(10,7));
                                    System.out.print("Magnitude of Magnetic Field(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("Current through Conductor(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe distance of the magnetic field from the conductor is " + (mu*I/(2*Math.PI*B)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1B==4)
                            {
                                System.out.print("\nExpression being used: F/L = mu_0*I*I'/(2*PI*r) ~ force per unit length between two parallel conductors\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Current through Conductor 1(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Current through Conductor 2(A): ");
                                String I2p1 = input.next();
                                double I2 = exp(I2p1);
                                System.out.print("Distance of Seperation between Conductors(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("\nThe force per unit length is " + (mu*I*I2/(2*Math.PI*r)) + " N/m\n");
                                input.next();
                            }
                            else if(response1B==5)
                            {
                                System.out.print("\nExpression being used: B_x = N*mu_0*I*a^2/(2*(x^2 + a^2)^(3/2)) ~ magnetic field on axis of circular loop\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Current through Conductor(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Radius of Conductor Loop(m): ");
                                String ap1 = input.next();
                                double a = exp(ap1);
                                System.out.print("Distance of Observed Point from Center of Loop(m): ");
                                String xp1 = input.next();
                                double x = exp(xp1);
                                System.out.print("Number of Loops: ");
                                String Np1 = input.next();
                                double N = exp(Np1);
                                System.out.print("\nThe magnetic field magnitude in the conducting loops is " + (N*mu*I*Math.pow(a,2)/(2*Math.pow((Math.pow(x,2) + Math.pow(a,2)),1.5))) + " T\n");
                                input.next();
                            }
                            else if(response1B==6)
                            {
                                System.out.print("\nExpression being used: B_x = mu*N*I/(2*a) ~ magnetic field at center of N circular loops\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Current through Conductor(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Radius of Conductor Loop(m): ");
                                String ap1 = input.next();
                                double a = exp(ap1);
                                System.out.print("Number of Loops: ");
                                String Np1 = input.next();
                                double N = exp(Np1);
                                System.out.print("\nThe magnetic field magnitude in the loops is " + (mu*N*I/(2*a)) + " T\n");
                                input.next();
                            }
                            else if(response1B==7)
                            {
                                System.out.print("\nExpression being used: integral_B*dl = mu*I_encl ~ Ampere's Law\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Sum of Currents through Conductors(A): ");
                                String Ienp1 = input.next();
                                double Ien = exp(Ienp1);
                                System.out.print("\nThe magnetic field is " + (mu*Ien) + " T*m\n");
                                input.next();
                            }
                            else if(response1B==8)
                                go1B = false;
                        }
                    }
                    else if(response4==4)//go1C
                    {
                        boolean go1C = true;
                        while(go1C)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Motional Electromotive Force\n2.Back\n");
                            System.out.print("Input:");
                            int response1C = input.nextInt();
                            if(response1C==1)
                            {
                                System.out.print("\nExpression being used: Emf = v*B*L ~ motional electromotive force\n");
                                input.next();
                                System.out.print("\nVelocity of Inducer(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Length of Inducer(m): ");
                                String Lp1 = input.next();
                                double L = exp(Lp1);
                                System.out.print("Magnitude of Magnetic Field(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("\nThe motional electromotive force is " + (v*L*B) + " V\n");
                                input.next();
                            }
                            else if(response1C==2)
                                go1C = false;
                        }
                    }
                    else if(response4==5)//go1D
                    {
                        boolean go1D = true;
                        while(go1D)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Mutual Inductance between Two Solenoids\n2.Find Self-Inductance\n3.Find Energy Stored in Inductor\n4.Find Magnetic Energy Density in Vacuum\n5.Find Magnetic Energy Density in Material\n6.Find Time Constant in R-L Circuit(Resistor-Inductor)\n7.Find Angular Frequency of Oscillation in L-C Circuit(Inductor-Capacitor)\n8.Find Angular frequency of Underdamped L-R-C Circuit\n9.Back\n");
                            System.out.print("Input:");
                            int response1D = input.nextInt();
                            if(response1D==1)
                            {
                                System.out.print("\nExpression being used: M = mu_0*A*N1*N2/l ~ mutual inductance of 2 solenoids\n");
                                input.next();
                                System.out.print("\nProportionality Constant(Wb/(A*m)): 4*PI*10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Cross-Sectional Area of Surrounded Solenoid(m^2): ");
                                String Ap1 = input.next();
                                double A = exp(Ap1);
                                System.out.print("Number of turns in Surrounded Solenoid: ");
                                String N1p1 = input.next();
                                double N1 = exp(N1p1);
                                System.out.print("Number of turns in Surrounding Solenoid: ");
                                String N2p1 = input.next();
                                double N2 = exp(N2p1);
                                System.out.print("Length of Surrounded Solenoid(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("The mutual inductance of the two solenoids is " + (mu*A*N1*N2/l) + " H\n");
                                input.next();
                            }
                            else if(response1D==2)
                            {
                                System.out.print("\nExpression being used: L = N*phi_B/i ~ self inductance\n");
                                input.next();
                                System.out.print("\nNumber of Coil Turns in Circuit: ");
                                String Np1 = input.next();
                                double N = exp(Np1);
                                System.out.print("Magnetic Flux through Coils((Wb): ");
                                String phibp1 = input.next();
                                double phib = exp(phibp1);
                                System.out.print("Time-Varying Current Magnitude(A): ");
                                String ip1 = input.next();
                                double i = exp(ip1);
                                System.out.print("\nThe self inductance in the circuit is " + (N*phib*i) + " H\n");
                                input.next();
                            }
                            else if(response1D==3)
                            {
                                System.out.print("\nWould you like to find:\nEnergy Stored in Inductor(1)\nInductance in Circuit(2)\nCurrent in Circuit(3)\nInput:");
                                int es = input.nextInt();
                                if(es==1)
                                {
                                    System.out.print("\nExpression being used: U = 1/2*L*I^2 ~ energy stored in inductor\n");
                                    input.next();
                                    System.out.print("\nInductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Final Steady Current Magnitude(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe total energy stored in the inductor is " + (.5*L*Math.pow(I,2)) + " J\n");
                                    input.next();
                                }
                                else if(es==2)
                                {
                                    System.out.print("\nExpression being used: L = 2*U/I^2 ~ inductance in circuit\n");
                                    input.next();
                                    System.out.print("\nEnergy Stored in Inductor(J): ");
                                    String Up1 = input.next();
                                    double U = exp(Up1);
                                    System.out.print("Current through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe inductance in the circuit is " + (2*U/Math.pow(I,2)) + " H\n");
                                    input.next();
                                }
                                else if(es==3)
                                {
                                    System.out.print("\nExpression being used: I = sqrt(2*U/L) ~ current in circuit\n");
                                    input.next();
                                    System.out.print("\nEnergy Stored in Inductor(J): ");
                                    String Up1 = input.next();
                                    double U = exp(Up1);
                                    System.out.print("Inductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe current in the circuit is " + (Math.sqrt(2*U/L)) + " H\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1D==4)
                            {
                                System.out.print("\nExpression being used: u = B^2/(2*mu_0) ~ magnetic energy density in vacuum\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 4*PI*10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Magnetic Field Magnitude(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("\nThe magnetic energy density in a vacuum is " + (Math.pow(B,2)/(2*mu)) + " J/m^3\n");
                                input.next();
                            }
                            else if(response1D==5)
                            {
                                System.out.print("\nExpression being used: u = B^2/(2*K*mu) ~ magnetic energy density in material\n");
                                input.next();
                                System.out.print("\nProportionality Constant(T*m/A): 4*PI*10^-7\n");
                                double mu = 4*Math.PI*(1/Math.pow(10,7));
                                System.out.print("Magnetic Permeability of Material: ");
                                String Kp1 = input.next();
                                double K = exp(Kp1);
                                System.out.print("Magnetic Field Magnitude(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("\nThe magnetic energy density in the material is " + (Math.pow(B,2)/(2*K*mu)) + " J/m^3\n");
                                input.next();
                            }
                            else if(response1D==6)
                            {
                                System.out.print("\nWould you like to find:\nTime Constant for R-L Circuit(1)\nInductance in R-L Circuit(2)\nResistance in R-L Circuit(3)\nInput:");
                                int tc = input.nextInt();
                                if(tc==1)
                                {
                                    System.out.print("\nExpression being used: t = L/R ~ time constant in R-L circuit\n");
                                    input.next();
                                    System.out.print("\nInductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe time it take for the current to reach its final value is " + (L/R) + " s\n");
                                    input.next();
                                }
                                else if(tc==2)
                                {
                                    System.out.print("\nExpression being used: L = R*t ~ inductance in R-L circuit\n");
                                    input.next();
                                    System.out.print("\nTime Taken for Current to Reach Final Value(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe inductance in the circuit is " + (t*R) + " H\n");
                                    input.next();
                                }
                                else if(tc==3)
                                {
                                    System.out.print("\nExpression being used: R = L/t ~ resistance in R-L circuit\n");
                                    input.next();
                                    System.out.print("\nInductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Time Taken for Current to Reach Final Value(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe resistance in the R-L circuit is " + (L/t) + " Ohms\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1D==7)
                            {
                                System.out.print("\nWould you like to find:\nAngular Frequency of Oscillation in L-C Circuit(1)\nInductance in L-C Circuit(2)\nCapacitance in L-C Circuit(3)\nInput:");
                                int tc = input.nextInt();
                                if(tc==1)
                                {
                                    System.out.print("\nExpression being used: omega = sqrt(1/(L*C)) ~ angular frequency of oscillation in L-C circuit\n");
                                    input.next();
                                    System.out.print("\nInductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Capacitance in Circuit(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe angular frequency of oscillation in the circuit is " + (Math.sqrt(1/(L*C))) + " rad/s\n");
                                    input.next();
                                }
                                else if(tc==2)
                                {
                                    System.out.print("\nExpression being used: L = 1/(C*omega^2) ~ inductance in L-C circuit\n");
                                    input.next();
                                    System.out.print("\nAngular Frequency of Oscillations in Circuit(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Capacitance in Circuit(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe inductance in the L-C circuit is " + (1/(C*Math.pow(o,2))) + " H\n");
                                    input.next();
                                }
                                else if(tc==3)
                                {
                                    System.out.print("\nExpression being used: C = 1/(L*omega^2) ~ capacitance in R-L circuit\n");
                                    input.next();
                                    System.out.print("\nInductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Angular Frequency of Oscillations in Circuit(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("\nThe capacitance in the L-C circuit is " + (1/(L*Math.pow(o,2))) + " F\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1D==8)
                            {
                                System.out.print("\nExpression being used: omega' = sqrt((1/(L*C))-(R^2/(4*L^2))) ~ angular frequency of underdamped L-R-C series circuit\n");
                                input.next();
                                System.out.print("\nInductance in circuit(H): ");
                                String Lp1 = input.next();
                                double L = exp(Lp1);
                                System.out.print("Capacitance in circuit(F): ");
                                String Cp1 = input.next();
                                double C = exp(Cp1);
                                System.out.print("Resistance in circuit(Ohms): ");
                                String Rp1 = input.next();
                                double R = exp(Rp1);
                                System.out.print("\nThe angular frequency of the underdamped circuit is " + (Math.sqrt((1/(L*C))-(Math.pow(R,2)/(4*Math.pow(L,2))))) + " rad/s\n");
                                input.next();
                            }
                            else if(response1D==9)
                                go1D = false;
                        }
                        
                    }
                    else if(response4==6)//go1E
                    {
                        boolean go1E = true;
                        while(go1E)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Instantaneous Current\n2.Find Rectified Average of Sinusoidal Current\n3.Find Root-Mean-Square of Sinusoidal Current\n4.Find Root-Mean-Square of Sinusoidal Voltage\n5.Find Amplitude of Voltage across Resistor(AC Circuit)\n6.Find Amplitude of Voltage Across Inductor(AC Circuit)\n7.Find Amplitude Voltage across Capacitor(AC Circuit)\n8.Find Amplitude Voltage across AC Circuit\n9.Find Impedence of L-R-C Series Circuit\n10.Find Phase Angle of L-R-C Series Circuit\n11.Find Average Power into General AC Circuit\n12.Find Resonance Angular Frequency\n13.Find Primary or Secondary Terminal Voltages of Transformer\n14.Find Primary or Secondary Currents in Transformer\n15.Back\n");
                            System.out.print("Input:");
                            int response1E = input.nextInt();
                            if(response1E==1)
                            {
                                System.out.print("\nExpression being used: i = I*cos(omega*t) ~ instantaneous current\n");
                                input.next();
                                System.out.print("\nMaximum Current Available(A): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Angular Frequency of Current(rad/s): ");
                                String op1 = input.next();
                                double o = exp(op1);
                                System.out.print("At Time(s): ");
                                String tp1 = input.next();
                                double t = exp(tp1);
                                System.out.print("\nThe instantaneous current in the circuit is " + (I*Math.cos(o*t)) + " A\n");
                                input.next();
                            }
                            else if(response1E==2)
                            {
                                System.out.print("\nWould you like to find:\nRectified Average Current(1)\nMaximum Current Available(2)\nInput:");
                                int ra = input.nextInt();
                                if(ra==1)
                                {
                                    System.out.print("\nExpression being used: I_rav = .637I ~ rectified average current\n");
                                    input.next();
                                    System.out.print("\nMaximum Current Available(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe rectified average current in the circuit is " + (.637*I) + " A\n");
                                    input.next();
                                }
                                else if(ra==2)
                                {
                                    System.out.print("\nExpression being used: I = I_rav/.637 ~ maximum current available\n");
                                    input.next();
                                    System.out.print("\nRectified Average Current(A): ");
                                    String Irp1 = input.next();
                                    double Ir = exp(Irp1);
                                    System.out.print("\nThe maximum current in the circuit is " + (Ir/.637) + " A\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==3)
                            {
                                System.out.print("\nWould you like to find:\nRoot-Mean-Square Current(1)\nMaximum Current Available(2)\nInput:");
                                int ra = input.nextInt();
                                if(ra==1)
                                {
                                    System.out.print("\nExpression being used: I_rms = I/sqrt(2) ~ root-mean-square current\n");
                                    input.next();
                                    System.out.print("\nMaximum Current Available(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe root-mean-square current in the circuit is " + (I/Math.sqrt(2)) + " A\n");
                                    input.next();
                                }
                                else if(ra==2)
                                {
                                    System.out.print("\nExpression being used: I = I_rms*sqrt(2) ~ maximum current available\n");
                                    input.next();
                                    System.out.print("\nRoot-Mean-Square Current(A): ");
                                    String Irmsp1 = input.next();
                                    double Irms = exp(Irmsp1);
                                    System.out.print("\nThe maximum current in the circuit is " + (Irms*Math.sqrt(2)) + " A\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==4)
                            {
                                System.out.print("\nWould you like to find:\nRoot-Mean-Square Voltage(1)\nMaximum Voltage Available(2)\nInput:");
                                int ra = input.nextInt();
                                if(ra==1)
                                {
                                    System.out.print("\nExpression being used: V_rms = V/sqrt(2) ~ root-mean-square voltage\n");
                                    input.next();
                                    System.out.print("\nMaximum Voltage Available(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe root-mean-square voltage in the circuit is " + (V/Math.sqrt(2)) + " V\n");
                                    input.next();
                                }
                                else if(ra==2)
                                {
                                    System.out.print("\nExpression being used: V = V_rms*sqrt(2) ~ maximum voltage available\n");
                                    input.next();
                                    System.out.print("\nRoot-Mean-Square Voltage(V): ");
                                    String Vrmsp1 = input.next();
                                    double Vrms = exp(Vrmsp1);
                                    System.out.print("\nThe maximum voltage in the circuit is " + (Vrms*Math.sqrt(2)) + " V\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==5)
                            {
                                System.out.print("\nWould you like to find:\nMaximum Voltage Available(1)\nCurrent through Circuit(2)\nResistance in Circut(3)\nInput:");
                                int ra = input.nextInt();
                                if(ra==1)
                                {
                                    System.out.print("\nExpression being used: V_r = I*R ~ amplitude of voltage across resistor\n");
                                    input.next();
                                    System.out.print("\nCurrent in Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe maximum voltage in the circuit is " + (I*R) + " V\n");
                                    input.next();
                                }
                                else if(ra==2)
                                {
                                    System.out.print("\nExpression being used: I = R/V_r ~ current in circuit\n");
                                    input.next();
                                    System.out.print("\nVoltage in Circuit(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("\nThe current in the circuit is " + (R/V) + " A\n");
                                    input.next();
                                }
                                else if(ra==3)
                                {
                                    System.out.print("\nExpression being used: R = V_r/I ~ resistance in circuit\n");
                                    input.next();
                                    System.out.print("\nCurrent in Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Voltage in Circuit(): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe resistance in the circuit is " + (V/I) + " Ohms\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==6)
                            {
                                System.out.print("\nWould you like to find:\nMaximum Voltage across Inductor(1)\nInductive Reactance(2)\nCurrent in Circuit(3)\nInput:");
                                int rs = input.nextInt();
                                if(rs==1)
                                {
                                    System.out.print("\nExpression being used: V_L = omega*L*I ~ voltage across inductor\n");
                                    input.next();
                                    System.out.print("\nAngular frequency of Current(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Inductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Current through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe voltage across the inductor is " + (o*L*I) + " V\n");
                                    input.next();
                                }
                                else if(rs==2)
                                {
                                    System.out.print("\nExpression being used: omega*L = V_L/I ~ inductive reactance\n");
                                    input.next();
                                    System.out.print("\nVoltage across Inductor(V): ");
                                    String Vlp1 = input.next();
                                    double Vl = exp(Vlp1);
                                    System.out.print("Current through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe inductive reactance is " + (Vl/I) + " Ohms\n");
                                    input.next();
                                }
                                else if(rs==3)
                                {
                                    System.out.print("\nExpression being used: I = V_L/(omega*L)) ~ current in circuit\n");
                                    input.next();
                                    System.out.print("\nVoltage across Inductor(V): ");
                                    String Vlp1 = input.next();
                                    double Vl = exp(Vlp1);
                                    System.out.print("Angular Frequency of Current(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Inductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe voltage across the inductor is " + (Vl/(o*L)) + " A\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==7)
                            {
                                System.out.print("\nWould you like to find:\nMaximum Voltage across Capacitor(1)\nCapacitive Reactance(2)\nCurrent in Circuit(3)\nInput:");
                                int rs = input.nextInt();
                                if(rs==1)
                                {
                                    System.out.print("\nExpression being used: V_C = I*(1/(omega*C)) ~ voltage across capacitor\n");
                                    input.next();
                                    System.out.print("\nAngular frequency of Current(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Capacitance in Circuit(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("Current through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe voltage across the capacitor is " + (I*(1/(o*C))) + " V\n");
                                    input.next();
                                }
                                else if(rs==2)
                                {
                                    System.out.print("\nExpression being used: (1/omega*C) = V_C/I ~ capacitive reactance\n");
                                    input.next();
                                    System.out.print("\nVoltage across Capacitor(V): ");
                                    String Vcp1 = input.next();
                                    double Vc = exp(Vcp1);
                                    System.out.print("Current through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe capacitive reactance is " + (Vc/I) + " Ohms\n");
                                    input.next();
                                }
                                else if(rs==3)
                                {
                                    System.out.print("\nExpression being used: I = V_c/(1/omega*C)) ~ current in circuit\n");
                                    input.next();
                                    System.out.print("\nVoltage across Capacitor(V): ");
                                    String Vcp1 = input.next();
                                    double Vc = exp(Vcp1);
                                    System.out.print("Angular Frequency of Current(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Capacitance in Circuit(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe current across the capacitor is " + (Vc/(1/(o*C))) + " A\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==8)
                            {
                                System.out.print("\nWould you like to find:\nMaximum Voltage across Circuit(1)\nCurrent in Circuit(2)\nImpedance of Circuit(3)\nInput:");
                                int rs = input.nextInt();
                                if(rs==1)
                                {
                                    System.out.print("\nExpression being used: V = I*Z ~ voltage amplitude in circuit\n");
                                    input.next();
                                    System.out.print("\nCurrent through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Impedance of Circuit(Ohms): ");
                                    String Zp1 = input.next();
                                    double Z = exp(Zp1);
                                    System.out.print("\nThe maximum voltage in the ciruit is " + (I*Z) + " V\n");
                                    input.next();
                                }
                                else if(rs==2)
                                {
                                    System.out.print("\nExpression being used: I = V/Z ~ current in circuit\n");
                                    input.next();
                                    System.out.print("\nMaximum Voltage in Circuit(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Impedance of Circuit(Ohms): ");
                                    String Zp1 = input.next();
                                    double Z = exp(Zp1);
                                    System.out.print("\nThe current in the ciruit is " + (V/Z) + " A\n");
                                    input.next();
                                }
                                else if(rs==3)
                                {
                                    System.out.print("\nExpression being used: Z = V/I ~ impedance of circuit\n");
                                    input.next();
                                    System.out.print("\nMaximum Voltage in Circuit(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Current through Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe impedance of the circuit is " + (V/I) + " Ohms\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==9)
                            {
                                System.out.print("\nWould you like to find the impedance in terms of:\nResistance, Inductive Reactance, and Capacitive Reactance(1)\nResistance, Angular Frequency of Current, Inductance, and Capacitance(2)\nInput:");
                                int rs= input.nextInt();
                                if(rs==1)
                                {
                                    System.out.print("\nExpression being used: Z = sqrt(R^2 + (X_L - X_C)) ~ impedance of L-R-C series circuit\n");
                                    input.next();
                                    System.out.print("\nResistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Inductive Reactance(Ohms): ");
                                    String Xlp1 = input.next();
                                    double Xl = exp(Xlp1);
                                    System.out.print("Capacitive Reactance(Ohms): ");
                                    String Xcp1 = input.next();
                                    double Xc = exp(Xcp1);
                                    System.out.print("\nThe impedance of the circuit is " + (Math.sqrt(Math.pow(R,2)+ Math.pow((Xl-Xc),2))) + " Ohms\n");
                                    input.next();
                                }
                                else if(rs==2)
                                {
                                    System.out.print("\nExpression being used: Z = sqrt(R^2 + (omega*L - (1/(omega*C)))^2) impedance of L-R-C series circuit\n");
                                    input.next();
                                    System.out.print("\nAngular Frequency of Current(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Inductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Capacitance in Circuit(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe impedance of the circuit is " + (Math.sqrt(Math.pow(R,2)+Math.pow((o*L-(1/(o*C))),2))) + " Ohms\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==10)
                            {
                                System.out.print("\nWould you like to find the phase angle in terms of:\nAngular Frequency of Current, Inductance, Capacitance, and Resistance(1)\nCapacitive Reactance, Inductive Reactance, and Resistance(2)\nInput:");
                                int rs = input.nextInt();
                                if(rs==1)
                                {
                                    System.out.print("\nExpression being used: phi = atan((omega*L-(1/(omega*C)))/R) ~ phase angle of L-R-C series circuit\n");
                                    input.next();
                                    System.out.print("\nAngular Frequency of Current(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Inductance in Circuit(H): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Capacitance in Circuit(F): ");
                                    String Cp1 = input.next();
                                    double C = exp(Cp1);
                                    System.out.print("\nThe phase angle of the circuit is " + (Math.atan((o*L-(1/(o*C)))/R)) + " rad or " + (Math.atan((o*L-(1/(o*C)))/R))*57 + " degrees\n");
                                    input.next();
                                    
                                }
                                else if(rs==2)
                                {
                                    System.out.print("\nExpression being used: phi = atan((X_L-X_C)/R) ~ phase angle of L-R-C series circuit\n");
                                    input.next();
                                    System.out.print("\nInductive Reactance(Ohms): ");
                                    String XLp1 = input.next();
                                    double XL = exp(XLp1);
                                    System.out.print("Resistance in Circuit(Ohms): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Capacitive Reactance(Ohms): ");
                                    String XCp1 = input.next();
                                    double XC = exp(XCp1);
                                    System.out.print("\nThe phase angle of the circuit is " + (Math.atan((XL-XC)/R)) + " rad or " + (Math.atan((XL-XC)/R))*57 + " degrees\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==11)
                            {
                                System.out.print("\nWould you like to find the average power in terms of:\nMaximum Voltage, Current, and Phase Angle(1)\nRoot-Mean-Square Voltage, Root-Mean-Square Current, and Phase Angle(2)\nInput:");
                                int ap = input.nextInt();
                                if(ap==1)
                                {
                                    System.out.print("\nExpression being used: P_av = 1/2*V*I*cos(phi) ~ average power into ac circuit\n");
                                    input.next();
                                    System.out.print("\nMaximum Voltage in Circuit(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Current in Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Phase Angle between Current and Voltage(degrees): ");
                                    String php1 = input.next();
                                    double ph = exp(php1);
                                    System.out.print("\nThe average power into the circuit is " + (.5*V*I*Math.cos(ph/57)) + " W\n");
                                    input.next();
                                }
                                else if(ap==2)
                                {
                                    System.out.print("\nExpression being used: P_av = V_rms*I_rms*cos(phi) ~ average power into ac circuit\n");
                                    input.next();
                                    System.out.print("\nRoot-Mean-Square Voltage in Circuit(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("Root-Mean-Square Current in Circuit(A): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Phase Angle between Current and Voltage(degrees): ");
                                    String php1 = input.next();
                                    double ph = exp(php1);
                                    System.out.print("\nThe average power into the circuit is " + (V*I*Math.cos(ph/57)) + " W\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==12)
                            {
                                System.out.print("\nExpression being used: omega_0 = 1/sqrt(L*C) ~ resonance angular frequency\n");
                                input.next();
                                System.out.print("\nInducatance in Circuit(H): ");
                                String Lp1 = input.next();
                                double L = exp(Lp1);
                                System.out.print("Capacitance in Circuit(F): ");
                                String Cp1 = input.next();
                                double C = exp(Cp1);
                                System.out.print("\nThe resonance angular frequency is " + (1/(Math.sqrt(L*C))) + " rad/s\n");
                                input.next();
                            }
                            else if(response1E==13)
                            {
                                System.out.print("\nWould you like to find:\nPrimary Voltage(1)\nSecondary Voltage(2)\nPrimary Number of Turns(3)\nSecondary Number Turns(4)\nInput:");
                                int pv = input.nextInt();
                                if(pv==1)
                                {
                                    System.out.print("\nExpression being used: V1 = V2*N1/N2 ~ voltage through primary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Secondary Coil(V): ");
                                    String V2p1 = input.next();
                                    double V2 = exp(V2p1);
                                    System.out.print("Number of Windings of Primary Coil: ");
                                    String N1p1 = input.next();
                                    double N1 = exp(N1p1);
                                    System.out.print("Number of Windings of Secondary Coil: ");
                                    String N2p1 = input.next();
                                    double N2 = exp(N2p1);
                                    System.out.print("\nThe voltage going through the primary coil is " + (V2*N1/N2) + " V\n");
                                    input.next();
                                }
                                else if(pv==2)
                                {
                                    System.out.print("\nExpression being used: V2 = V1*N2/N1 ~ voltage through secondary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Primary Coil(V): ");
                                    String V1p1 = input.next();
                                    double V1 = exp(V1p1);
                                    System.out.print("Number of Windings of Primary Coil: ");
                                    String N1p1 = input.next();
                                    double N1 = exp(N1p1);
                                    System.out.print("Number of Windings of Secondary Coil: ");
                                    String N2p1 = input.next();
                                    double N2 = exp(N2p1);
                                    System.out.print("\nThe voltage going through the secondary coil is " + (V1*N2/N1) + " V\n");
                                    input.next();
                                }
                                else if(pv==3)
                                {
                                    System.out.print("\nExpression being used: N1 = V1*N2/V2 ~ number of windings of primary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Primary Coil(V): ");
                                    String V1p1 = input.next();
                                    double V1 = exp(V1p1);
                                    System.out.print("Voltage through Secondary Coil(V): ");
                                    String V2p1 = input.next();
                                    double V2 = exp(V2p1);
                                    System.out.print("Number of Windings of Secondary Coil: ");
                                    String N2p1 = input.next();
                                    double N2 = exp(N2p1);
                                    System.out.print("\nThe number of windings in the primary coil is " + (V1*N2/V2) + " windings\n");
                                    input.next();
                                }
                                else if(pv==4)
                                {
                                    System.out.print("\nExpression being used: N2 = N1*V2/V1 ~ number of windings of secondary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Primary Coil(V): ");
                                    String V1p1 = input.next();
                                    double V1 = exp(V1p1);
                                    System.out.print("Voltage through Secondary Coil(V): ");
                                    String V2p1 = input.next();
                                    double V2 = exp(V2p1);
                                    System.out.print("Number of Windings of Primary Coil: ");
                                    String N1p1 = input.next();
                                    double N1 = exp(N1p1);
                                    System.out.print("\nThe number of windings in the secondary coil is " + (V2*N1/V1) + " windings\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==14)
                            {
                                System.out.print("\nWould you like to find:\nPrimary Voltage(1)\nSecondary Voltage(2)\nPrimary Current Flow(3)\nSecondary Current Flow(4)\nInput:");
                                int pv = input.nextInt();
                                if(pv==1)
                                {
                                    System.out.print("\nExpression being used: V1 = V2*I2/I1 ~ voltage through primary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Secondary Coil(V): ");
                                    String V2p1 = input.next();
                                    double V2 = exp(V2p1);
                                    System.out.print("Current through Primary Coil: ");
                                    String I1p1 = input.next();
                                    double I1 = exp(I1p1);
                                    System.out.print("Current through Secondary Coil: ");
                                    String I2p1 = input.next();
                                    double I2 = exp(I2p1);
                                    System.out.print("\nThe voltage going through the primary coil is " + (V2*I2/I1) + " V\n");
                                    input.next();
                                }
                                else if(pv==2)
                                {
                                    System.out.print("\nExpression being used: V2 = V1*I1/I2 ~ voltage through secondary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Primary Coil(V): ");
                                    String V1p1 = input.next();
                                    double V1 = exp(V1p1);
                                    System.out.print("Current through Primary Coil(A): ");
                                    String I1p1 = input.next();
                                    double I1 = exp(I1p1);
                                    System.out.print("Current through Secondary Coil(A): ");
                                    String I2p1 = input.next();
                                    double I2 = exp(I2p1);
                                    System.out.print("\nThe voltage going through the secondary coil is " + (V1*I1/I2) + " V\n");
                                    input.next();
                                }
                                else if(pv==3)
                                {
                                    System.out.print("\nExpression being used: I1 = V2*I2/V1 ~ current through primary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Primary Coil(V): ");
                                    String V1p1 = input.next();
                                    double V1 = exp(V1p1);
                                    System.out.print("Voltage through Secondary Coil(V): ");
                                    String V2p1 = input.next();
                                    double V2 = exp(V2p1);
                                    System.out.print("Current through Secondary Coil: ");
                                    String I2p1 = input.next();
                                    double I2 = exp(I2p1);
                                    System.out.print("\nThe current going through the primary coil is " + (V2*I2/V1) + " A\n");
                                    input.next();
                                }
                                else if(pv==4)
                                {
                                    System.out.print("\nExpression being used: I2 = I1*V1/V2 ~ current through secondary coil\n");
                                    input.next();
                                    System.out.print("\nVoltage through Primary Coil(V): ");
                                    String V1p1 = input.next();
                                    double V1 = exp(V1p1);
                                    System.out.print("Voltage through Secondary Coil(V): ");
                                    String V2p1 = input.next();
                                    double V2 = exp(V2p1);
                                    System.out.print("Current through Primary Coil: ");
                                    String I1p1 = input.next();
                                    double I1 = exp(I1p1);
                                    System.out.print("\nThe current going through the secondary coil is " + (I1*V1/V2) + " A\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1E==15)
                                go1E = false;
                        }
                    }
                    else if(response4==7)//go1F
                    {
                        boolean go1F = true;
                        while(go1F)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Electric or Magnetic Field Magnitude in Vacuum\n2.Find Speed of Electromagnetic Wave in a Dielectric\n3.Find Poynting Vector in Vacuum\n4.Intensity of Sinusoidal Wave in Vacuum\n5.Find Flow Rate of Electromagnetic Momentum\n6.Back\n");
                            System.out.print("Input:");
                            int response1F = input.nextInt();
                            if(response1F==1)
                            {
                                System.out.print("\nWould you like to find:\nElectric Field Magnitude(1)\nMagnetic Field Magnitude(2)\nInput:");
                                int em = input.nextInt();
                                if(em==1)
                                {
                                    System.out.print("\nExpression being used: E = c*B ~ elecric field magnitude\n");
                                    input.next();
                                    System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                    double c = 299792458;
                                    System.out.print("Mangetic Field Magnitude(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("\nThe electric field magnitude is " + (c*B) + " V/m\n");
                                    input.next();
                                }
                                else if(em==2)
                                {
                                    System.out.print("\nExpression being used: B = E/c ~ magnetic field magnitude\n");
                                    input.next();
                                    System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                    double c = 299792458;
                                    System.out.print("Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe magnetic field magnitude is " + (E/c) + " T\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1F==2)
                            {
                                System.out.print("\nWould you like to find the speed in terms of:\nPermittivity and Permeability of the Dielectric(1)\nDielectric Constant and Permeability of Dielectric(2)\nSpeed of Light, Dielectric Constant, and Permeability of Dielectric(3)\nInput:");
                                int sp = input.nextInt();
                                if(sp==1)
                                {
                                    System.out.print("\nExpression being used: v = 1/sqrt(mu*epsilon) ~ speed of electromagnetic wave in dielectric\n");
                                    input.next();
                                    System.out.print("\nPermittivity of Dielectric(C^2/N*m^2): ");
                                    String epp1 = input.next();
                                    double ep = exp(epp1);
                                    System.out.print("Permeability of Dielectric(T*m/A): ");
                                    String mup1 = input.next();
                                    double mu = exp(mup1);
                                    System.out.print("\nThe speed of the electromagnetic wave is the dielectric is " + (1/Math.sqrt(ep*mu)) + " m/s or " + (1/Math.sqrt(ep*mu))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(sp==2)
                                {
                                    System.out.print("\nWhich medium type:\nVacuum(1)\nAir at 1 atm(2)\nAir at 100 atm(3)\nTeflon(4)\nPolyethylene(5)\nBenzene(6)\nMica(7)\nMylar(8)\nPolyvinyl Chloride(9)\nPlexiglas(10)\nGlass(11)\nNeoprene(12)\nGermanium(13)\nGlycerin(14)\nWater(15)\nStrontium Titanate(16)\nOther(17)\nInput:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 1\n");
                                        double K = 1;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 1.00059\n");
                                        double K = 1.00059;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 1.0548\n");
                                        double K = 1.0548;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 2.1\n");
                                        double K = 2.1;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 2.25\n");
                                        double K = 2.25;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 2.28\n");
                                        double K = 2.28;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 3\n");
                                        double K = 3;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 3.1\n");
                                        double K = 3.1;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 3.18\n");
                                        double K = 3.18;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==10)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 3.4\n");
                                        double K = 3.4;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==11)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 5\n");
                                        double K = 5;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==12)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 6.7\n");
                                        double K = 6.7;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==13)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 16\n");
                                        double K = 16;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==14)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 42.5\n");
                                        double K = 42.5;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==15)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 80.4\n");
                                        double K = 80.4;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==16)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: 310\n");
                                        double K = 310;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==17)
                                    {
                                        System.out.print("\nExpression being used: v = 1/sqrt(K*K_m)*1/sqrt(epsilon_0*mu_0) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nEpsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Dielectric Constant: ");
                                        String Kp1 = input.next();
                                        double K = exp(Kp1);
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (1/Math.sqrt(K*Km)*1/Math.sqrt(ep*mu)) + " m/s\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(sp==3)
                                {
                                    System.out.print("\nWhich medium type:\nVacuum(1)\nAir at 1 atm(2)\nAir at 100 atm(3)\nTeflon(4)\nPolyethylene(5)\nBenzene(6)\nMica(7)\nMylar(8)\nPolyvinyl Chloride(9)\nPlexiglas(10)\nGlass(11)\nNeoprene(12)\nGermanium(13)\nGlycerin(14)\nWater(15)\nStrontium Titanate(16)\nOther(17)\nInput:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 1\n");
                                        double K = 1;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 1.00059\n");
                                        double K = 1.00059;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 1.0548\n");
                                        double K = 1.0548;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 2.1\n");
                                        double K = 2.1;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 2.25\n");
                                        double K = 2.25;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 2.28\n");
                                        double K = 2.28;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 3\n");
                                        double K = 3;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 3.1\n");
                                        double K = 3.1;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 3.18\n");
                                        double K = 3.18;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==10)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 3.4\n");
                                        double K = 3.4;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==11)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 5\n");
                                        double K = 5;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==12)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 6.7\n");
                                        double K = 6.7;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        double Km = input.nextDouble();
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==13)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 16\n");
                                        double K = 16;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==14)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 42.5\n");
                                        double K = 42.5;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==15)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 80.4\n");
                                        double K = 80.4;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==16)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: 310\n");
                                        double K = 310;
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(mt==17)
                                    {
                                        System.out.print("\nExpression being used: v = c/sqrt(K*K_m) ~ speed of electromagnetic wave in dielectric\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Dielectric Constant: ");
                                        String Kp1 = input.next();
                                        double K = exp(Kp1);
                                        System.out.print("Relative Permeability of Dielectric(T*m/A): ");
                                        String Kmp1 = input.next();
                                        double Km = exp(Kmp1);
                                        System.out.print("\nThe speed of the electromagnetic wave is " + (c/Math.sqrt(K*Km)) + " m/s\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1F==3)
                            {
                                System.out.print("\nExpression being used: S = E*B*sin(theta)/mu_0 ~ poynting vector in vacuum\n");
                                input.next();
                                System.out.print("\nMu_not(T*m/A)= 7*PI*10^-7\n");
                                double mu = 7*Math.PI*1/Math.pow(10,7);
                                System.out.print("Angle between E and B field(degrees): 90");
                                System.out.print("\nElectric Field Magnitude(V/m): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Magnetic Field Magnitude(T): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("\nThe poynting vector is " + (E*B/mu) + " W/m^2\n");
                                input.next();
                            }
                            else if(response1F==4)
                            {
                                System.out.print("\nWould you like to find the Intensity in terms of:\nMaximum Electric Field Magnitude and Maximum Magnetic Field Magnitude(1)\nMaximum Electric Field Magnitude(2)\nInput:");
                                int meb = input.nextInt();
                                if(meb==1)
                                {
                                    System.out.print("\nExpression being used: I = E_max*B_max/(2*mu_0) ~ intensity of sinusoidal wave in vacuum\n");
                                    input.next();
                                    System.out.print("\nMu_not(T*m/A)= 7*PI*10^-7\n");
                                    double mu = 7*Math.PI*1/Math.pow(10,7);
                                    System.out.print("Maximum Electric Field Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("Maximum Magnetic Field Magnitude(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("The intensity of the wave is " + (E*B/(2*mu)) + " W/m^2\n");
                                    input.next();
                                }
                                else if(meb==2)
                                {
                                    System.out.print("\nWould you like to find:\nIntensity(1)\nElectric Field Magnitude(2)\nMagnetic Field Magnitude(3)\nInput:");
                                    int it = input.nextInt();
                                    if(it==1)
                                    {
                                        System.out.print("\nExpression being used: I = E_max^2*c*epsilon_0/2 ~ intensity of sinusoidal wave in vacuum\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Epsilon_not(C^2/N*m^2)= 8.85*10^-12\n");
                                        double ep = 8.85*1/Math.pow(10,12);
                                        System.out.print("Maximum Electric Field Magnitude(V/m): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        System.out.print("Maximum Magnetic Field Magnitude(T): ");
                                        String Bp1 = input.next();
                                        double B = exp(Bp1);
                                        System.out.print("The intensity of the wave is " + (Math.pow(E,2)*c*ep/2) + " W/m^2\n");
                                        input.next();
                                    }
                                    else if(it==2)
                                    {
                                        System.out.print("\nExpression being used: E = sqrt(2*mu_0*c*I) ~ magnitude of electric field of wave in vacuum\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Intensity of Wave(W/m^2): ");
                                        String Sp1 = input.next();
                                        double S = exp(Sp1);
                                        System.out.print("The electric field magnitude of the wave is " + (Math.sqrt(2*mu*c*S)) + " V/m\n");
                                        input.next();
                                    }
                                    else if(it==3)
                                    {
                                        System.out.print("\nExpression being used: B = I*2*mu_0/E ~ magnitude of magnetic field of wave in vacuum\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                        double mu = 7*Math.PI*1/Math.pow(10,7);
                                        System.out.print("Maximum Electric Field Magnitude(V/m): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        System.out.print("Intensity of Wave(W/m^2): ");
                                        String Sp1 = input.next();
                                        double S = exp(Sp1);
                                        System.out.print("The magnetic field magnitude of the wave is " + (S*2*mu/E) + " T\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1F==5)
                            {
                                System.out.print("\nWould you like to find the flow rate of the electromagnetic momentum in terms of:\nIntensity(1)\nElectric and Magnetic Field Magnitude(2)\nInput:");
                                int emp = input.nextInt();
                                if(emp==1)
                                {
                                    System.out.print("\nExpression being used: Flow Rate of Momentum = S/c ~ flow rate of electromagnetic momentum\n");
                                    input.next();
                                    System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                    double c = 299792458;
                                    System.out.print("Intensity of Electromagnetic Wave(W/m^2): ");
                                    String Sp1 = input.next();
                                    double S = exp(Sp1);
                                    System.out.print("\nThe flow rate of the momentum is " + (S/c) + " W*s/m^3\n");
                                    input.next();
                                }
                                else if(emp==2)
                                {
                                    System.out.print("\nExpression being used: Flow Rate of Momentum = E*B/(mu_0*c) ~ flow rate of electromagnetic momentum\n");
                                    input.next();
                                    System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                    double c = 299792458;
                                    System.out.print("Mu_not(T*m/A)= 7*PI*10^-7\n");
                                    double mu = 7*Math.PI*1/Math.pow(10,7);
                                    System.out.print("Electric Field  Magnitude(V/m): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("Magnetic Field Magnitude(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("\nThe flow rate of the momentum is " + (E*B/(mu*c)) + " W*s/m^3\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1F==6)
                                go1F = false;
                        }
                    }
                    else if(response4==8)
                        go4 = false;
                }
            }
            else if(response==6)
            {
                boolean go5 = true;
                while(go5)
                {
                    System.out.println("\nWhich Topic #?");
                    System.out.println("\n1.The Nature and Propagation of light\n2.Geometric Optics\n3.Interference\n4.Diffraction\n5.Back");
                    System.out.print("Input:");
                    int response5 = input.nextInt();
                    if(response5==1)//go1G
                    {
                        boolean go1G = true;
                        while(go1G)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Index of Refraction\n2.Use Law of Refraction\n3.Find Wavelength of Light in Material\n4.Find Critical Angle for Total Internal Reflection\n5.Use Malus's Law for Polarized Light\n6.Use Brewster's Law for Polarized Light\n7.Back\n");
                            System.out.print("Input:");
                            int response1G = input.nextInt();
                            if(response1G==1)
                            {
                                System.out.print("\nWould you like to find:\nIndex of Refraction(1)\nVelocity of Light Material(2)\nInput:");
                                int iof = input.nextInt();
                                if(iof==1)
                                {
                                    System.out.print("\nExpression being used: n = c/v ~ index of refraction of material\n");
                                    input.next();
                                    System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                    double c = 299792458;
                                    System.out.print("Velocity of Light in Material(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe index of refraction of the material " + (c/v) + " \n");
                                    input.next();
                                }
                                else if(iof==2)
                                {
                                    System.out.print("\nMaterial Type:\nIce(H20)(1)\nFlourite(2)\nPolystyrene(3)\nRock Salt(4)\nQuartz(5)\nZircon(6)\nDiamond(7)\nFabulite(8)\nRutile(9)\nCrown Glass(10\nLight Flint Glass(11)\nMedium Flint Glass(12)\nDense Flint Glass(13)\nLanthanum Flint Glass(14)\nMethanol(15)\nWater(16)\nEthanol(17)\nCarbon TetraChloride(18)\nTurpentine(19)\nGlycerine(20)\nBenzene(21)\nCarbon Disulfide(22)\nOther(23)\nInput:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.309\n");
                                        double n = 1.309;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.434\n");
                                        double n = 1.434;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.49\n");
                                        double n = 1.49;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.544\n");
                                        double n = 1.544;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.544\n");
                                        double n = 1.544;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.923\n");
                                        double n = 1.923;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:2.417\n");
                                        double n = 2.417;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:2.409\n");
                                        double n = 2.409;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:2.62\n");
                                        double n = 2.62;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==10)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.52\n");
                                        double n = 1.52;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==11)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.58\n");
                                        double n = 1.58;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==12)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.62\n");
                                        double n = 1.62;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==13)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.66\n");
                                        double n = 1.66;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==14)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.8\n");
                                        double n = 1.8;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==15)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.329\n");
                                        double n = 1.329;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==16)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.333\n");
                                        double n = 1.333;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==17)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.36\n");
                                        double n = 1.36;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==18)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.46\n");
                                        double n = 1.46;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==19)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.472\n");
                                        double n = 1.472;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==20)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.473\n");
                                        double n = 1.473;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==21)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.501\n");
                                        double n = 1.501;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==22)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material:1.628\n");
                                        double n = 1.628;
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(mt==23)
                                    {
                                        System.out.print("\nExpression being used: v = c/n ~ velocity of light in material\n");
                                        input.next();
                                        System.out.print("\nSpeed of Light(m/s): 299,792,458\n");
                                        double c = 299792458;
                                        System.out.print("Index of Refraction of Material: ");
                                        String np1 = input.next();
                                        double n = exp(np1);
                                        System.out.print("\nThe speed of light in the material is " + (c/n) + " m/s or " + (c/n)*2.2 + " mph\n");
                                        input.next();
                                    }
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1G==2)
                            {
                                System.out.print("\nWould you like to find:\nIndex of Refraction of First Material(1)\nIndex of Refraction of Second Material(2)\nAngle of Incident Ray(3)\nAngle of Refracted Ray(4)\nInput:");
                                int rr = input.nextInt();
                                if(rr==1)
                                {
                                    System.out.print("\nExpression being used: n_a = n_b*sin(theta_b)/sin(theta_a) ~ index of refraction of first material\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("Incident angle(degrees): ");
                                    String iap1 = input.next();
                                    double ia = exp(iap1);
                                    System.out.print("Refracted angle(degrees): ");
                                    String rap1 = input.next();
                                    double ra = exp(rap1);
                                    System.out.print("\nThe index of refraction of the first material is about " + (nb*Math.sin(ra/57)/Math.sin(ia/57)) + " \n");
                                    input.next();
                                }
                                else if(rr==2)
                                {
                                    System.out.print("\nExpression being used: n_b = n_a*sin(theta_a)/sin(theta_b) ~ index of refraction of second material\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Incident angle(degrees): ");
                                    String iap1 = input.next();
                                    double ia = exp(iap1);
                                    System.out.print("Refracted angle(degrees): ");
                                    String rap1 = input.next();
                                    double ra = exp(rap1);
                                    System.out.print("\nThe index of refraction of the first material is about " + (na*Math.sin(ia/57)/Math.sin(ra/57)) + " \n");
                                    input.next();
                                }
                                else if(rr==3)
                                {
                                    System.out.print("\nExpression being used: theta_a = asin(n_b*sin(theta_b)/n_a) ~ angle of incident ray\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Index of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("Refracted angle(degrees): ");
                                    String rap1 = input.next();
                                    double ra = exp(rap1);
                                    System.out.print("\nThe angle of the incoming incident ray from the normal is " + (Math.asin(nb*Math.sin(ra/57)/na))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(rr==4)
                                {
                                    System.out.print("\nExpression being used: theta_b = asin(n_a*sin(theta_a)/n_b) ~ angle of refracted ray\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Index of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("Incident angle(degrees): ");
                                    String iap1 = input.next();
                                    double ia = exp(iap1);
                                    System.out.print("\nThe angle of the refracted ray from the normal is " + (Math.asin(na*Math.sin(ia/57)/nb))*57 + " degrees\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1G==3)
                            {
                                System.out.print("\nWould you like to find:\nWavelength Inside of Material(1)\nIndex of Refraction of Material(2)\nWavelength Outside of Material(3)\nInput:");
                                int ow = input.nextInt();
                                if(ow==1)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda = lambda_0/n ~ wavelength inside of material\n");
                                    input.next();
                                    System.out.print("\nWavelength Outside of Material(m): ");
                                    String lop1 = input.next();
                                    double lo = exp(lop1);
                                    System.out.print("Index of Refraction of Material: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    double ln = lo/n;
                                    System.out.print("\nThe wavelength inside the material is " + (lo/n) + " m\n");
                                    me2.set("Wavelength", 0, ln);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(ow==2)
                                {
                                    System.out.print("\nExpression being used: n = lambda_0/lambda ~ index of refraction of material\n");
                                    input.next();
                                    System.out.print("\nWavelength Outside of Material(m): ");
                                    String lop1 = input.next();
                                    double lo = exp(lop1);
                                    System.out.print("Wavelength Inside of Material(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\nThe index of refraction of the material is " + (lo/l) + " \n");
                                    input.next();
                                }
                                else if(ow==3)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda_0 = n*lambda ~ wavelength outside of material\n");
                                    input.next();
                                    System.out.print("\nWavelength Inside Material(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Index of Refraction of Material: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    double ln = l*n;
                                    System.out.print("\nThe wavelength outside the material is " + (n*l) + " m\n");
                                    me2.set("Wavelength", 0, ln);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1G==4)
                            {
                                System.out.print("\nWould you like to find:\nCritical Angle of Full Internal Reflection(1)\nIndex of Refraction of First Material(2)\nIndex of Refraction of Second Material(3)\nInput:");
                                int ca = input.nextInt();
                                if(ca==1)
                                {
                                    System.out.print("\nExpression being used: theta_crit = asin(n_b/n_a) ~ critical angle for internal reflection\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Index of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("\nThe critical angle for internal reflection is " + (Math.asin(nb/na))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ca==2)
                                {
                                    System.out.print("\nExpression being used: n_a = n_b/sin(theta_crit) ~ index of refraction of first material\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("Critical Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe index of refraction of the first material is " + (nb/Math.sin(th/57)) + " \n");
                                    input.next();
                                }
                                else if(ca==3)
                                {
                                    System.out.print("\nExpression being used: n_b = n_a*sin(theta_crit) ~ index of refraction of second material\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Critical Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe index of refraction of the second material is " + (na*Math.sin(th/57)) + " \n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1G==5)
                            {
                                System.out.print("\nWould you like to find:\nTransmitted Intensity(1)\nMaximum intensity(2)\nInput:");
                                int ti = input.nextInt();
                                if(ti==1)
                                {
                                    System.out.print("\nExpression being used: I = I_max*cos^2(theta) ~ transmitted intenisty\n");
                                    input.next();
                                    System.out.print("\nMaximum Intensity of Source(W/m^2): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Angle of Polarizer(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe transmitted intensity is " + (I*Math.pow(Math.cos(th/57),2)) + " W/m^2\n");
                                    input.next();
                                }
                                else if(ti==2)
                                {
                                    System.out.print("\nExpression being used: I_max = I/cos^2(theta) ~ maximum intenisty\n");
                                    input.next();
                                    System.out.print("\nTransmitted Intensity(W/m^2): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("Angle of Polarizer(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe maximum intensity is " + (I/Math.pow(Math.cos(th/57),2)) + " W/m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1G==6)
                            {
                                System.out.print("\nWould you like to find:\nPolarizing Angle(1)\nIndex of Refraction of First Material(2)\nIndex of Refraction of Second Material(3)\nInput:");
                                int pa = input.nextInt();
                                if(pa==1)
                                {
                                    System.out.print("\nExpression being used: theta_p = atan(n_b/n_a) ~ polarizing angle\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Index of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("\nThe polarizing angle is " + (Math.atan(nb/na))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(pa==2)
                                {
                                    System.out.print("\nExpression being used: na = nb/tan(theta_p) ~ index of refraction of first material\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of Second Material: ");
                                    String nbp1 = input.next();
                                    double nb = exp(nbp1);
                                    System.out.print("Polarizing Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe index of refraction of the first material is " + (nb/Math.tan(th/57)) + " \n");
                                    input.next();
                                }
                                else if(pa==3)
                                {
                                    System.out.print("\nExpression being used: nb = na*tan(theta_p) ~ index of refraction of second material\n");
                                    input.next();
                                    System.out.print("\nIndex of Refraction of First Material: ");
                                    String nap1 = input.next();
                                    double na = exp(nap1);
                                    System.out.print("Polarizing Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe index of refraction of the first material is " + (na*Math.tan(th/57)) + " \n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1G==7)
                                go1G = false;
                        }
                    }
                    else if(response5==2)//go1H
                    {
                        boolean go1H = true;
                        while(go1H)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Lateral Magnification\n2.Use Object-Image Relationship for Thin Lens\n3.Find Focal Length using Lensmakers Equation for Thin Lens\n4.Find f-number\n5.Find Angular Magnification for a Simple Magnifier\n6.Back\n");
                            System.out.print("Input:");
                            int response1H = input.nextInt();
                            if(response1H==1)
                            {
                                System.out.print("\nWould you like to find:\nLateral Magnification(1)\nImage Height(2)\nObject Height(3)\nInput:");
                                int lm = input.nextInt();
                                if(lm==1)
                                {
                                    System.out.print("\nExpression being used: m = y'/y ~ lateral magnification\n");
                                    input.next();
                                    System.out.print("\nImage Height(m): ");
                                    String ypp1 = input.next();
                                    double yp = exp(ypp1);
                                    System.out.print("Object Height(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("\nThe lateral magnification is " + (yp/y) + " \n");
                                    input.next();
                                }
                                else if(lm==2)
                                {
                                    System.out.print("\nExpression being used:  y' = m*y ~ image height\n");
                                    input.next();
                                    System.out.print("\nLateral Magnification: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Object Height(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("\nThe image height is " + (m*y) + " m\n");
                                    input.next();
                                }
                                else if(lm==3)
                                {
                                    System.out.print("\nExpression being used:  y = y'/m ~ object height\n");
                                    input.next();
                                    System.out.print("\nImage Height(m): ");
                                    String ypp1 = input.next();
                                    double yp = exp(ypp1);
                                    System.out.print("Lateral Magnification: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe object height is " + (yp/m) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1H==2)
                            {
                                System.out.print("\nWould you like to find:\nFocal Length(1)\nImage Distance(2)\nObject Distance(3)\nInput:");
                                int fl = input.nextInt();
                                if(fl==1)
                                {
                                    System.out.print("\nExpression being used: f = 1/(1/s + 1/s') ~ focal length\n");
                                    input.next();
                                    System.out.print("\nImage distance(m): " );
                                    String spp1 = input.next();
                                    double sp = exp(spp1);
                                    System.out.print("Object Distance(m): ");
                                    String sp1 = input.next();
                                    double s = exp(sp1);
                                    System.out.print("\nThe focal length is " + (1/((1/s)+(1/sp))) + " m\n");
                                    input.next();
                                }
                                else if(fl==2)
                                {
                                    System.out.print("\nExpression being used: s' = 1/(1/f - 1/s) ~ image distance\n");
                                    input.next();
                                    System.out.print("\nFocal Length(m): " );
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Object Distance(m): ");
                                    String sp1 = input.next();
                                    double s = exp(sp1);
                                    System.out.print("\nThe image distance is " + (1/((1/f)-(1/s))) + " m\n");
                                    input.next();
                                }
                                else if(fl==3)
                                {
                                    System.out.print("\nExpression being used: s = 1/(1/f - 1/s') ~ object distance\n");
                                    input.next();
                                    System.out.print("\nFocal Length(m): " );
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Image Distance(m): ");
                                    String spp1 = input.next();
                                    double sp = exp(spp1);
                                    System.out.print("\nThe object distance is " + (1/((1/f)-(1/sp))) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1H==3)
                            {
                                System.out.print("\nExpression being used: f = 1/((n-1)*((1/R1)-(1/R2))) ~ focal length\n");
                                input.next();
                                System.out.print("\nLens Index of Refraction: ");
                                String np1 = input.next();
                                double n = exp(np1);
                                System.out.print("Radii of Curvature of First Surface(m): ");
                                String R1p1 = input.next();
                                double R1 = exp(R1p1);
                                System.out.print("Radii of Curvature of Second Surface(m): ");
                                String R2p1 = input.next();
                                double R2 = exp(R2p1);
                                System.out.print("\nThe focal length is " + (1/((n-1)*((1/R1)-(1/R2)))) + " m\n");
                                input.next();
                            }
                            else if(response1H==4)
                            {
                                System.out.print("\nWould you like to find:\nf-Number(1)\nFocal Length(2)\nAperture Diameter(3)\nInput:");
                                int fn = input.nextInt();
                                if(fn==1)
                                {
                                    System.out.print("\nExpression being used: f-number = f/D ~ f-number\n");
                                    input.next();
                                    System.out.print("\nFocal Length(m): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Aperture Diameter(m): ");
                                    String Dp1 = input.next();
                                    double D = exp(Dp1);
                                    System.out.print("\nThe f-number is " + (f/D) + " \n");
                                    input.next();
                                }
                                else if(fn==2)
                                {
                                    System.out.print("\nExpression being used: f = f-number*D  ~ focal length\n");
                                    input.next();
                                    System.out.print("\nf-number(m): ");
                                    String fnump1 = input.next();
                                    double fnum = exp(fnump1);
                                    System.out.print("Aperture Diameter(m): ");
                                    String Dp1 = input.next();
                                    double D = exp(Dp1);
                                    System.out.print("\nThe focal length is " + (fnum*D) + " m\n");
                                    input.next();
                                }
                                else if(fn==3)
                                {
                                    System.out.print("\nExpression being used: D = f/f-number ~ aperture diameter\n");
                                    input.next();
                                    System.out.print("\nFocal Length(m): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("f-number: ");
                                    String fnump1 = input.next();
                                    double fnum  = exp(fnump1);
                                    System.out.print("\nThe aperture diameter is " + (f/fnum) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1H==5)
                            {
                                System.out.print("\nWould you like to find the Angular Magnification in terms of:\nSubteneded Angle of object from Eye and Magnifier(1)\nf-number(2)\nInput:");
                                int am = input.nextInt();
                                if(am==1)
                                {
                                    System.out.print("\nExpression being used: M = theta_prime/theta ~ angular magnification\n");
                                    input.next();
                                    System.out.print("\nAngle of Object with Respect to Eye(degrees): ");
                                    String th1p1 = input.next();
                                    double th1 = exp(th1p1);
                                    System.out.print("Angle of Object with Respect to Magnifier(degrees): ");
                                    String th2p1 = input.next();
                                    double th2 = exp(th2p1);
                                    System.out.print("\nThe angular magnification is " + (th2/th1) + " \n");
                                    input.next();
                                }
                                else if(am==2)
                                {
                                    System.out.print("\nExpression being used: M = 25cm / f-number ~ angular magnification\n");
                                    input.next();
                                    System.out.print("\nf-number: ");
                                    String fnump1 = input.next();
                                    double fnum = exp(fnump1);
                                    System.out.print("\nThe angular magnification is " + (25/fnum) + " \n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1H==6)
                                go1H = false;
                        }
                    }
                    else if(response5==3)//go1I
                    {
                        boolean go1I = true;
                        while(go1I)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Constructive Interference Angle(Two Slits)\n2.Find Destructive Interference Angle(Two Slits)\n3.Find Constructive Wave Characteristics(Young's Experiment)\n4.Find Amplitude of a Two-Source Interference\n5.Find Intensity of a Two-Source Interference\n6.Use Phase Difference and Path Difference Relationship\n7.Find Thickness Required for Constructive Reflection of a Wavelength\n8.Find Thickness Required for Destructive Reflection of a Wavelength\n9.Back\n");
                            System.out.print("Input:");
                            int response1I = input.nextInt();
                            if(response1I==1)
                            {
                                System.out.print("\nWould you like to find:\nAngle of Constructive Interference(1)\nDistance Between Two Slits(2)\nInput:");
                                int ac = input.nextInt();
                                if(ac==1)
                                {
                                    System.out.print("\nExpression being used: theta = asin(m*lambda/d) ~ angle of constructive interference\n");
                                    input.next();
                                    System.out.print("\nWavelength Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance Between Slits(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe angle from the center where constructive interference occurs is " + (Math.asin(m*l/d))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ac==2)
                                {
                                    System.out.print("\nExpression being used: d = m*lambda/sin(theta) ~ distance between slits\n");
                                    input.next();
                                    System.out.print("\nWavelength Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Angle from Center where Interference Occurs(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe distance between the two slits is " + (m*l/Math.sin(th/57)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1I==2)
                            {
                                System.out.print("\nWould you like to find:\nAngle of Destructive Interference(1)\nDistance Between Two Slits(2)\nInput:");
                                int ac = input.nextInt();
                                if(ac==1)
                                {
                                    System.out.print("\nExpression being used: theta = asin((m+1/2)*lambda/d) ~ angle of destructive interference\n");
                                    input.next();
                                    System.out.print("\nWavelength Number(1/2 will be added so only input whole number): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance Between Slits(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe angle from the center where constructive interference occurs is " + (Math.asin((m+.5)*l/d))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ac==2)
                                {
                                    System.out.print("\nExpression being used: d = (m+1/2)*lambda/sin(theta) ~ distance between slits\n");
                                    input.next();
                                    System.out.print("\nWavelength Number(1/2 will be added so only input whole number): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Angle from Center where Interference Occurs(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe distance between the two slits is " + ((m+.5)*l/Math.sin(th/57)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1I==3)
                            {
                                System.out.print("\nWould you like to find:\nDistance from Center of Pattern To Bright Fringe(1)\nDistance from Slits to Screen(2)\nDistance between Slits(3)\nWavelength(4)\nInput:");
                                int dc = input.nextInt();
                                if(dc==1)
                                {
                                    System.out.print("\nExpression being used: y_m = R*m*lambda/d ~ distance from center to fringe\n");
                                    input.next();
                                    System.out.print("\nDistance from Slits to Screen(m): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Wavelength Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance between Slits(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe distance from the center of the pattern to the fringe is " + (R*m*l/d) + " m\n");
                                    input.next();
                                }
                                else if(dc==2)
                                {
                                    System.out.print("\nExpression being used: R = y_m*d/(m*lambda) ~ distance from slit to screen\n");
                                    input.next();
                                    System.out.print("\nDistance from Center of Pattern to Fringe(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("Wavelength Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance between Slits(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe distance from the slits to the screen is " + (y*d/(m*l)) + " m\n");
                                    input.next();
                                }
                                else if(dc==3)
                                {
                                    System.out.print("\nExpression being used: d = R*m*lambda/y ~ distance between slits\n");
                                    input.next();
                                    System.out.print("\nDistance from Slits to Screen(m): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Wavelength Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance from Center of Pattern to Fringe(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("\nThe distance between the slits is " + (R*m*l/y) + " m\n");
                                    input.next();
                                }
                                else if(dc==4)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda = y_m*d/(R*m) ~ wavelength\n");
                                    input.next();
                                    System.out.print("\nDistance from Slits to Screen(m): ");
                                    String Rp1 = input.next();
                                    double R = exp(Rp1);
                                    System.out.print("Wavelength Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Distance from Center of Pattern to Fringe(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("Distance between Slits(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    double wl = y*d/(R*m);
                                    System.out.print("\nThe wavelength is " + (y*d/(R*m)) + " m\n");
                                    me2.set("Wavelength", 0, wl);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1I==4)
                            {
                                System.out.print("\nExpression being used: E_p = 2*E*(phi/2) ~ amplitude of wave in two-source interference\n");
                                input.next();
                                System.out.print("\nAmplitude of Wave(m): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Phase Angle between the Waves(degrees): ");
                                String phip1 = input.next();
                                double phi = exp(phip1);
                                System.out.print("\nThe amplitude of the wave of the interference is " + (2*E*(phi/2)) + " m\n");
                                input.next();
                            }
                            else if(response1I==5)
                            {
                                System.out.print("\nExpression being used: E = I_0*cos^2(phi/2) ~ intensity of wave in two-source interference\n");
                                input.next();
                                System.out.print("\nIntensity of Waves(m): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Phase Angle between the Waves(degrees): ");
                                String phip1 = input.next();
                                double phi = exp(phip1);
                                System.out.print("\nThe intensity of the wave of the interference is " + (I*Math.pow(Math.cos(phi/2),2)) + " W/m^2\n");
                                input.next();
                            }
                            else if(response1I==6)
                            {
                                System.out.print("\nExpression being used: phi = (2*PI/lambda)*d*sin(theta) ~ phase difference\n");
                                input.next();
                                System.out.print("\nWavelength of Source(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("Distance between Two Sources(m): ");
                                String dp1 = input.next();
                                double d = exp(dp1);
                                System.out.print("Angle Between Waves(degrees): ");
                                String thp1 = input.next();
                                double th = exp(thp1);
                                System.out.print("\nThe phase difference is " + (2*Math.PI*d*Math.sin(th/57)/l) + " degrees\n");
                                input.next();
                            }
                            else if(response1I==7)
                            {
                                System.out.print("\nWould you like to find Thickness Required for Constructive Reflectance with:\nNo Relative Phase Shift(1)\nHalf-Cycle Relative Phase Shift(2)\nInput:");
                                int cr = input.nextInt();
                                if(cr==1)
                                {
                                    System.out.print("\nExpression being used: t = m*lambda/2 ~ thickness required for constructive interference\n");
                                    input.next();
                                    System.out.print("\nWavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\n The thickness required for constructive interference is " + (m*l/2) + " m\n");
                                    input.next();
                                }
                                else if(cr==2)
                                {
                                    System.out.print("\nExpression being used: t = m*lambda/2 ~ thickness required for constructive interference\n");
                                    input.next();
                                    System.out.print("\nWavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\n The thickness required for constructive interference is " + ((m+.5)*l/2) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                                
                            }
                            else if(response1I==8)
                            {
                                System.out.print("\nWould you like to find Thickness Required for Destructive Reflectance with:\nHalf-Cycle Relative Phase Shift(1)\nNo Relative Phase Shift(2)\nInput:");
                                int cr = input.nextInt();
                                if(cr==1)
                                {
                                    System.out.print("\nExpression being used: t = m*lambda/2 ~ thickness required for destructive interference\n");
                                    input.next();
                                    System.out.print("\nWavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\nThe thickness required for destructive interference is " + (m*l/2) + " m\n");
                                    input.next();
                                }
                                else if(cr==2)
                                {
                                    System.out.print("\nExpression being used: t = m*lambda/2 ~ thickness required for destructive interference\n");
                                    input.next();
                                    System.out.print("\nWavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\nThe thickness required for destructive interference is " + ((m+.5)*l/2) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1I==9)
                                go1I = false;
                        }
                    }
                    else if(response5==4)//go1J1
                    {
                        boolean go1J1 = true;
                        while(go1J1)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Angle of Dark Fringe in Single Slit Diffraction\n2.Find Intensity in Single Slit Diffraction\n3.Find Intensity Maxima in Multiple Slit Diffraction\n4.Use Bragg Condition for Constructive Interference in an Array\n5.Find Angular Radius of Dark Fringe to Center of Pattern\n6.Back\n");
                            System.out.print("Input:");
                            int response1J1 = input.nextInt();
                            if(response1J1==1)
                            {
                                System.out.print("\nWould you like to find:\nAngle of Darke Fringe from Slit(1)\nSlit Width(2)\nDistance From Fringe to Center of Pattern(3)\nWavelength(4)\nDistance from Slit to Screen(5)\nInput:");
                                int ad = input.nextInt();
                                if(ad==1)
                                {
                                    System.out.print("\nExpression being used: theta = asin(m*l/a) ~ angle of dark fringe from slit\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Wavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Slit Width(m): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe angle of the dark fringe from the slit is " + (Math.asin(m*l/a))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ad==2)
                                {
                                    System.out.print("\nExpression being used: a = x*lambda/y ~ slit width\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance from Slit to Screen(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Distance from Fringe to Center of Pattern(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("\nThe slit width is " + (x*l/y) + " m\n");
                                    input.next();
                                }
                                else if(ad==3)
                                {
                                    System.out.print("\nExpression being used: y = x*lambda/a ~ distance from fringe to center of pattern\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance from Slit to Screen(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Slit Width(m): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe distance from the fringe to the center of the pattern is " + (x*l/a) + " m\n");
                                    input.next();
                                }
                                else if(ad==4)
                                {
                                    System.out.print("\nExpression being used: lambda = y*a/x ~ wavelength\n");
                                    input.next();
                                    System.out.print("\nDistance from Fringe to Center of Pattern(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("Distance from Slit to Screen(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Slit Width(m): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe wavelength is " + (y*a/x) + " m\n");
                                    input.next();
                                }
                                else if(ad==5)
                                {
                                    System.out.print("\nExpression being used: x = y*a/lambda ~ distance from slit to screen\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Distance from Fringe to Center of Pattern(m): ");
                                    String yp1 = input.next();
                                    double y = exp(yp1);
                                    System.out.print("Slit Width(m): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe from the slit to the screen is " + (y*a/l) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1J1==2)
                            {
                                System.out.print("\nExpression being used: I = I_0*(sin(PI*a*sin(theta)/lambda)/PI*a*(sin(theta))/lambda)^2 ~ intensity in single slit-diffraction\n");
                                input.next();
                                System.out.print("\nSlit Width(m): ");
                                String ap1 = input.next();
                                double a = exp(ap1);
                                System.out.print("Wavelength of Source(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("Original Intensity(W/m^2): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("Angle away from Central Maximum(degrees): ");
                                String thp1 = input.next();
                                double th = exp(thp1);
                                System.out.print("\nThe intensity at this point is " + (I*Math.pow(((Math.sin(Math.PI*a*Math.sin(th/57)/l))/(Math.PI*a*Math.sin(th/57)/l)),2)) + " W/m^2\n");
                                input.next();
                            }
                            else if(response1J1==3)
                            {
                                System.out.print("\nWould you like to find:\nAngle at which Intensity Maxima can be Found(1)\nDistance of Grating Spacing(2)\nInput:");
                                int ai = input.nextInt();
                                if(ai==1)
                                {
                                    System.out.print("\nExpression being used: theta = asin(m*lambda/d) ~ angle of maxima\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Wavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Distance of Grating Spacings(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe angle at which the maxima exists is " + (Math.asin(m*l/d))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ai==2)
                                {
                                    System.out.print("\nExpression being used: d = m*lambda/sin(theta) ~ distance between gratings\n");
                                    input.next();
                                    System.out.print("\nWavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Angle of Deviation from Center(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe distance between the gratings is " + (m*l/Math.sin(th/57)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1J1==4)
                            {
                                System.out.print("\nWould you like to find:\nAngle at which Intensity Maxima can be Found(1)\nDistance of Grating Spacing(2)\nInput:");
                                int ai = input.nextInt();
                                if(ai==1)
                                {
                                    System.out.print("\nExpression being used: theta = asin(m*lambda/2*d) ~ angle of maxima\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Wavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Distance of Grating Spacings in Crystal(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe angle at which the maxima exists is " + (Math.asin(m*l/2*d))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ai==2)
                                {
                                    System.out.print("\nExpression being used: d = m*lambda/2*sin(theta) ~ distance between gratings\n");
                                    input.next();
                                    System.out.print("\nWavenumber: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Wavelength(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Angle of Deviation from Center(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe distance between the gratings in the crystal is " + (m*l/(2*Math.sin(th/57))) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1J1==5)
                            {
                                System.out.print("\nOnly for First Radii...\n");
                                System.out.print("\nWould you like to find the:\nAngular Radii(1)\nWavelength(2)\nAperture Diameter(3)\nInput:");
                                int ar = input.nextInt();
                                if(ar==1)
                                {
                                    System.out.print("\nExpression being used: theta_1 = asin(1.22*lambda/D) ~ angular radii\n");
                                    input.next();
                                    System.out.print("\nWavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Aperture Diameter(m): ");
                                    String Dp1 = input.next();
                                    double D = exp(Dp1);
                                    System.out.print("\nThe angular radii is " + (Math.asin(1.22*l/D))*57 + " degrees\n");
                                    input.next();
                                }
                                else if(ar==2)
                                {
                                    System.out.print("\nExpression being used: lambda = sin(theta_1)*D/1.22 ~ wavelength of source\n");
                                    input.next();
                                    System.out.print("\nAngular Radii(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("Aperture Diameter(m): ");
                                    String Dp1 = input.next();
                                    double D = exp(Dp1);
                                    System.out.print("\nThe wavelength is " + (Math.sin(th/57)*D/1.22) + " m\n");
                                    input.next();
                                }
                                else if(ar==3)
                                {
                                    System.out.print("\nExpression being used: D = lambda*1.22/sin(theta_1) ~ aperture diameter\n");
                                    input.next();
                                    System.out.print("\nAngular Radii(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("Wavelength of Source(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\nThe aperture diameter is " + (l*1.22/Math.sin(th/57)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1J1==6)
                                go1J1 = false;
                        }
                    }
                    else if(response5==5)
                        go5 = false;
                }
            }
            else if(response==7)
            {
                boolean go6 = true;
                while(go6)
                {
                    System.out.println("\nWhich Topic #?");
                    System.out.println("\n1.Relativity\n2.Photons:Lights Waves Behaving as Particles\n3.Particles Behaving as Waves\n4.Quantum Mechanics\n5.Atomic Structure\n6.Molecules and Condensed Matter\n7.Nuclear Physics\n8.Back");
                    System.out.print("Input:");
                    int response6 = input.nextInt();
                    if(response6==1)//go1J
                    {
                        boolean go1J = true;
                        while(go1J)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Time Dilation\n2.Gamma(Relativity)\n3.Length Contraction\n4.Use Lorentz Coordinate Transformations\n5.Find Frequency(Doppler Effect)\n6.Find Relativistic Momentum\n7.Find Relativistic Kinetic Energy\n8.Find Total Energy of Particle at Rest\n9.Find Total Energy of Particle not at Rest\n10.Back\n");
                            System.out.print("Input:");
                            int response1J = input.nextInt();
                            if(response1J==1)
                            {
                                System.out.print("\nExpression being used: DT = DT_0*gamma ~ time dilation\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("\nTime Interval(s): ");
                                String tp1 = input.next();
                                double t = exp(tp1);
                                System.out.print("Object Speed(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("\nThe time dilation is " + (t/(Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2))))) + " s or " + (t/(Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2)))))/60 + " min or " + (t/(Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2)))))/3600 + " hrs\n");
                                input.next();
                            }
                            else if(response1J==2)
                            {
                                System.out.print("\nExpression being used: gamma = 1/sqrt(1-(u^2/c^2)) ~ gamma value\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("\nObject Speed(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("\nThe value of gamma is " + (1/Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2)))) + " \n");
                                input.next();
                            }
                            else if(response1J==3)
                            {
                                System.out.print("\nExpression being used: l_0/gamma ~ length contraction\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Object Speed(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Original Length of Object(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("\nThe length contraction is " + (l*Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2)))) + " m\n");
                                input.next();
                            }
                            else if(response1J==4)
                            {
                                System.out.print("\nWould you like to find:\nX Coordinate Lorentz Transformation(1)\nTime Coordinate Lorentz Transformation(2)\nVelocity Lorentz Transformation(3)\nInput:");
                                int lt = input.nextInt();
                                if(lt==1)
                                {
                                    System.out.print("\nExpression being used: (x-ut)*gamma ~ x coordinate lorentz transformation\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Galilean X Coordinate(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Object Speed(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe lorentz x coordinate is " + ((x-(v*t))/Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2)))) + " m\n");
                                    input.next();
                                }
                                else if(lt==2)
                                {
                                    System.out.print("\nExpression being used: (t-ux/c^2)*gamma ~ time coordinate lorentz transformation\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Galilean X Coordinate(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Object Speed(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe lorentz time coordinate is " + ((t-(v*x/Math.pow(c,2)))/Math.sqrt(1-(Math.pow(v,2)/Math.pow(c,2)))) + " m\n");
                                    input.next();
                                }
                                else if(lt==3)
                                {
                                    System.out.print("\nExpression being used: (v_x - u)/(1-((u*v_x)/c^2)) ~ velocity coordinate lorentz transformation\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Relative Velocity in Reference Frame(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Object Velocty(m/s): ");
                                    String vxp1 = input.next();
                                    double vx = exp(vxp1);
                                    System.out.print("\nThe lorentz velocity transformation is " + ((vx-v)/(1-((v*vx)/Math.pow(c,2)))) + " m/s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1J==5)
                            {
                                System.out.print("\nWould you like to find the Frequency of Photon:\nApproaching Observer(1)\nMoving Away From Observer(2)\nSpeed of Source(3)\nInput:");
                                int de = input.nextInt();
                                if(de==1)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: f = sqrt((c+u)/(c-u))*f_0 ~ frequency from object approaching\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Frequency of Emitted Light(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Speed of Object(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    double fr = (Math.sqrt((c+v)/(c-v))*f);
                                    System.out.print("\nThe frequency of the observed photon is " + (Math.sqrt((c+v)/(c-v))*f) + " Hz\n");
                                    me2.set("Frequency", fr, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(de==2)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: f = sqrt((c+u)/(c-u))*f_0 ~ frequency from object moving away\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Frequency of Emitted Light(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Speed of Object(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    double fr = (Math.sqrt((c-v)/(c+v))*f);
                                    System.out.print("\nThe frequency of the observed photon is " + (Math.sqrt((c-v)/(c+v))*f) + " Hz\n");
                                    me2.set("Frequency", fr, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(de==3)
                                {
                                    System.out.print("\nExpression being used: v = (((f/f_0)^2 - 1)/((f/f_0)^2+1))*c ~ speed of source\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Frequency of Emitted Light(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Frequency of Observed Light(Hz): ");
                                    String f1p1 = input.next();
                                    double f1 = exp(f1p1);
                                    System.out.print("\nThe speed of the source is " + ((((Math.pow((f1/f),2))-1)/((Math.pow((f1/f),2))+1))*c) + " m/s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1J==6)
                            {
                                System.out.print("\nExpression being used: p = m*v/(sqrt(1-v^2/c^2)) ~ relativistic momentum\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Velocity(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                double gamma = 1/Math.sqrt(1-Math.pow((v/c),2));
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe relativistic momentum is " + (m*v*gamma) + " kg*m/s\n");
                                input.next();
                            }
                            else if(response1J==7)
                            {
                                System.out.print("\nExpression being used: p = m*v/(sqrt(1-v^2/c^2)) ~ relativistic kinetic energy\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Velocity(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                double gamma = 1/Math.sqrt(1-Math.pow((v/c),2));
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe relativistic kinetic energy is " + ((m*Math.pow(c,2)*gamma) - m*Math.pow(c,2)) + " J or " + ((m*Math.pow(c,2)*gamma) - m*Math.pow(c,2))/(1.602*1/Math.pow(10,19)) + " eV\n");
                                input.next();
                            }
                            else if(response1J==8)
                            {
                                System.out.print("\nExpression being used: E = mc^2 ~ energy of particle at rest\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe energy of the particle is " + (m*Math.pow(c,2)) + " J or " + (m*Math.pow(c,2))/(1.602*1/Math.pow(10,19)) + " eV\n");
                                input.next();
                            }
                            else if(response1J==9)
                            {
                                System.out.print("\nExpression being used: E = sqrt((m*c^2)^2 + (p*c)^2) ~ energy of particle\n");
                                input.next();
                                System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Momentum(kg*m/s): ");
                                String pp1 = input.next();
                                double p = exp(pp1);
                                System.out.print("\nThe energy of the particle is " + (Math.pow(m*Math.pow(c,2),2)+ Math.pow(p*c,2)) + " J or " + (Math.pow(m*Math.pow(c,2),2) + Math.pow(p*c,2))/(1.602*1/Math.pow(10,19)) + " eV\n");
                                input.next();
                            }
                            else if(response1J==10)
                                go1J=false;
                        }
                    }
                    else if(response6==2)//go1K
                    {
                        boolean go1K = true;
                        while(go1K)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Energy of Photon\n2.Use Photoelectric Effect\n3.Find Momentum of Photon\n4.Use Bremsstrahlung Equation\n5.Use Compton Scattering Equation\n6.Use Heisenberg Uncertainty Principle\n7.Back\n");
                            System.out.print("Input:");
                            int response1K = input.nextInt();
                            if(response1K==1)
                            {
                                System.out.print("\nWould you like to find:\nEnergy of Photon(1)\nPhoton Frequency(2)\nWavelength of Photons(3)\nInput:");
                                int pe = input.nextInt();
                                if(pe==1)
                                {
                                    System.out.print("\nWould you like to find the energy in terms of:\n Photon Frequency(1)\n Photon Wavelength(2)\nInput:");
                                    int pe1 = input.nextInt();
                                    if(pe1==1)
                                    {
                                        System.out.print("\nExpression being used: E = h*f ~ photon energy\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34 or 4.136*10^-15 (eV*s)\n");
                                        double h1 = 6.62606896*1/Math.pow(10,34);
                                        double h2 = 4.136*1/Math.pow(10,15);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe energy of the photon is " + (h1*f) + " J or " + (h2*f) + "eV\n");
                                        input.next();
                                    }
                                    else if(pe1==2)
                                    {
                                        System.out.print("\nExpression being used: E = h*c/lambda ~ photon energy\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Planck's Constant(J*s): 6.63*10^-34 or 4.136*10^-15 (eV*s)\n");
                                        double h1 = 6.62606896*1/Math.pow(10,34);
                                        double h2 = 4.136*1/Math.pow(10,15);
                                        System.out.print("Wavelength of Photon(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe energy of the photon is " + (h1*c/l) + " J or " + (h2*c/l) + " eV\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(pe==2)
                                {
                                    System.out.print("\nWould you like to find the Photon Frequency in terms of:\nPhoton Energy(1)\nPhoton Wavelength(2)\nInput:");
                                    int pe1 = input.nextInt();
                                    if(pe1==1)
                                    {
                                        System.out.print("\nPhoton energy in Joules(1) or eV(2)\nInput:");
                                        int pe2 = input.nextInt();
                                        if(pe2==1)
                                        {
                                            LightClass me2 = new LightClass();
                                            System.out.print("\nExpression being used: f = E/h ~ photon frequency\n");
                                            input.next();
                                            System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                            double h = 6.62606896*1/Math.pow(10,34);
                                            System.out.print("Energy of Photon(J): ");
                                            String Ep1 = input.next();
                                            double E = exp(Ep1);
                                            System.out.print("\nThe frequency of the photon is " + (E/h) + " Hz\n");
                                            double f = (E/h);
                                            me2.set("Frequency", f, 0);
                                            me2.writeOutput();
                                            input.next();
                                            
                                        }
                                        else if(pe2==2)
                                        {
                                            LightClass me2 = new LightClass();
                                            System.out.print("\nExpression being used: f = E/h ~ photon frequency\n");
                                            input.next();
                                            System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                            double h = 4.136*1/Math.pow(10,15);
                                            System.out.print("Energy of Photon(eV): ");
                                            String Ep1 = input.next();
                                            double E = exp(Ep1);
                                            System.out.print("\nThe frequency of the photon is " + (E/h) + " Hz\n");
                                            double f = (E/h);
                                            me2.set("Frequency", f, 0);
                                            me2.writeOutput();
                                            input.next();
                                        }
                                    }
                                    else if(pe1==2)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = c/lambda ~ photon frequency\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Photon Wavelength(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        double f = (c/l);
                                        System.out.print("\nThe frequency of the photon is " + (c/l) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(pe==3)
                                {
                                    System.out.print("\nWould you like to find the Photon Wavelength in terms of:\nPhoton Frequency(1)\nPhoton Energy(2)\nInput:");
                                    int pe3 = input.nextInt();
                                    if(pe3==1)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: lambda = c/f ~ photon wavelength\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Photon Frequency(Hz): " );
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        double l = (c/f);
                                        System.out.print("\nThe photon wavelength is " + (c/f) + " m\n");
                                        me2.set("Wavelength", 0 , l);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(pe3==2)
                                    {
                                        System.out.print("\nPhoton Energy in Joules(1) or eV(2)\nInput:");
                                        int ph = input.nextInt();
                                        if(ph==1)
                                        {
                                            LightClass me2 = new LightClass();
                                            System.out.print("\nExpression being used: lambda = hc/E ~ photon wavelength\n");
                                            input.next();
                                            System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                            double c = 2.99*Math.pow(10,8);
                                            System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                            double h = 6.62606896*1/Math.pow(10,34);
                                            System.out.print("Photon Energy(J): " );
                                            String Ep1 = input.next();
                                            double E = exp(Ep1);
                                            double l = (h*c/E);
                                            System.out.print("\nThe photon wavelength is " + (h*c/E) + " m\n");
                                            me2.set("Wavelength", 0, l);
                                            me2.writeOutput();
                                            input.next();
                                        }
                                        else if(ph==2)
                                        {
                                            LightClass me2 = new LightClass();
                                            System.out.print("\nExpression being used: lambda = hc/E ~ photon wavelength\n");
                                            input.next();
                                            System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                            double c = 2.99*Math.pow(10,8);
                                            System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                            double h = 4.136*1/Math.pow(10,15);
                                            System.out.print("Photon Energy(eV): " );
                                            String Ep1 = input.next();
                                            double E = exp(Ep1);
                                            double l = (h*c/E);
                                            System.out.print("\nThe photon wavelength is " + (h*c/E) + " m\n");
                                            me2.set("Wavelength", 0, l);
                                            me2.writeOutput();
                                            input.next();
                                        }
                                        else
                                            System.out.print("\nOk.");
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1K==2)
                            {
                                System.out.print("\nWould you like to find:\nMaximum Kinetic Energy of Emitted Electron(1)\nWork Function(2)\nPhoton Frequency(3)\nInput:");
                                int pe = input.nextInt();
                                if(pe==1)
                                {
                                    System.out.print("\nType of Material Carrying Electrons:\nAluminum(1)\nCarbon(2)\nCopper(3)\nGold(4)\nNickel(5)\nSilicon(6)\nSilver(7)\nSodium(8)\nOther(9)\nInput:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 4.3\n");
                                        double phi = 4.3;
                                        double phi2 = 4.3*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 5\n");
                                        double phi = 5;
                                        double phi2 = 5*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 4.7\n");
                                        double phi = 4.7;
                                        double phi2 = 4.7*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 5.1\n");
                                        double phi = 5.1;
                                        double phi2 = 5.1*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 5.1\n");
                                        double phi = 5.1;
                                        double phi2 = 5.1*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 4.8\n");
                                        double phi = 4.8;
                                        double phi2 = 4.8*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 4.3\n");
                                        double phi = 4.3;
                                        double phi2 = 4.3*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): 2.7\n");
                                        double phi = 2.7;
                                        double phi2 = 2.7*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: eV_0 = hf - phi ~ maximum kinetic energy\n");
                                        input.next();
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        double h2 = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Work Function(eV): \n");
                                        double phi = input.nextDouble();
                                        double phi2 = phi*1.602*1/Math.pow(10,19);
                                        System.out.print("Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe maximum kinetic energy of the emmitted electron is " + (h1*f - phi) + " eV or " + (h2*f - phi2) + " J\n");
                                        input.next();
                                    }
                                }
                                else if(pe==2)
                                {
                                    System.out.print("\nExpression being used: phi = h*f-e*V ~ work function\n");
                                    input.next();
                                    System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                    double e = 1.6*1/Math.pow(10,19);
                                    System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                    double h = 4.136*1/Math.pow(10,15);
                                    System.out.print("Frequency of Photon(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Stopping Potential(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe work function is " + (h*f-V) + " eV\n");
                                    input.next();
                                }
                                else if(pe==3)
                                {
                                    System.out.print("\nType of Material Carrying Electrons:\nAluminum(1)\nCarbon(2)\nCopper(3)\nGold(4)\nNickel(5)\nSilicon(6)\nSilver(7)\nSodium(8)\nOther(9)\nInput:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 4.3\n");
                                        double phi = 4.3;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 5\n");
                                        double phi = 5;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 4.7\n");
                                        double phi = 4.7;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 5.1\n");
                                        double phi = 5.1;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 5.1\n");
                                        double phi = 5.1;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 4.8\n");
                                        double phi = 4.8;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 4.3\n");
                                        double phi = 4.3;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): 2.7\n");
                                        double phi = 2.7;
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = (e*V_0 - phi)/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nElectron Charge(C): 1.6*10^-19\n");
                                        double e = 1.6*1/Math.pow(10,19);
                                        System.out.print("Planck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Work Function(eV): ");
                                        String phip1 = input.next();
                                        double phi = exp(phip1);
                                        System.out.print("Stopping Potential(V): ");
                                        String Vp1 = input.next();
                                        double V = exp(Vp1);
                                        double f = (e*V - phi)/h;
                                        System.out.print("\nThe frequency is " + ((e*V - phi)/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1K==3)
                            {
                                System.out.print("\nWould you like to find:\nPhoton Momentum(1)\nPhoton Energy(2)\nPhoton Frequency(3)\nPhoton Wavelength(4)\nInput:");
                                int pm = input.nextInt();
                                if(pm==1)
                                {
                                    System.out.print("\nWould you like to find Momentum of Photon in terms of:\nPhoton Energy(1)\nPhoton Frequency(2)\nPhoton Wavelength(3)\nInput:");
                                    int mp = input.nextInt();
                                    if(mp==1)
                                    {
                                        System.out.print("\nExpression being used: p = E/c ~ photon momentum\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Energy of Photon(J): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        System.out.print("\nThe momentum of the photon is " + (E/c) + " kg*m/s\n");
                                        input.next();
                                    }
                                    else if(mp==2)
                                    {
                                        System.out.print("\nExpression being used: p = h*f/c ~ photon momentum\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Frequency of Photon(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe momentum of the photon is " + (h*f/c) + " kg*m/s\n");
                                        input.next();
                                    }
                                    else if(mp==3)
                                    {
                                        System.out.print("\nExpression being used: p = h/lambda ~ photon momentum\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Wavelength of Photon(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe momentum of the photon is " + (h/l) + " kg*m/s\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(pm==2)
                                {
                                    System.out.print("\nWould you like to find the Photon Energy in terms of:\nPhoton Momentum(1)\nPhoton Frequency(2)\nWavelength(3)\nInput:");
                                    int pe = input.nextInt();
                                    if(pe==1)
                                    {
                                        System.out.print("\nExpression being used: E = p*c ~ photon energy\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Photon Momentum(kg*m/s): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe energy of the photon is " + (p*c) + " J or " + (p*c)/(1.602*1/Math.pow(10,19)) + " eV\n");
                                        input.next();
                                    }
                                    else if(pe==2)
                                    {
                                        System.out.print("\nExpression being used: E = h*f ~ photon energy\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Photon Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe energy of the photon is " + (h*f) + " J or " + (h*f)/(1.602*1/Math.pow(10,19)) + " eV\n");
                                        input.next();
                                    }
                                    else if(pe==3)
                                    {
                                        System.out.print("\nExpression being used: E = h*c/lambda ~ photon energy\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Photon Wavelength(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe energy of the photon is " + (h*c/l) + " J or " + (h*c/l)/(1.602*1/Math.pow(10,19)) + " eV\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(pm==3)
                                {
                                    System.out.print("\nWould you like to find the Photon Frequency in terms of:\nMomentum(1)\nEnergy(2)\nWavelength(3)\nInput:");
                                    int pf = input.nextInt();
                                    if(pf==1)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = p*c/h ~ photon frequency\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("\nPhoton Momentum(kg*m/s): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        double f = (p*c/h);
                                        System.out.print("\nThe photon frequency is " + (p*c/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(pf==2)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = E/h ~ photon frequency\n");
                                        input.next();
                                        System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("\nPhoton Energy(J): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        double f = (E/h);
                                        System.out.print("\nThe photon frequency is " + (E/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(pf==3)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = c/lambda ~ photon frequency\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("\nPhoton Wavelength(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        double f = (c/l);
                                        System.out.print("\nThe photon frequency is " + (c/l) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(pm==4)
                                {
                                    System.out.print("\nWould you like to find the Photon Wavelength in terms of: Photon Momentum(1)\nPhoton Energy(2)\nPhoton Frequency(3)\nInput:");
                                    int pw = input.nextInt();
                                    if(pw==1)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: lambda = h/p ~ photon wavelength\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Photon Momentum(kg*m/s): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        double l = h/p;
                                        System.out.print("\nThe photon wavelength is " + (h/p) + " m\n");
                                        me2.set("Wavelength", 0, l);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(pw==2)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: lambda = c*h/E ~ photon wavelength\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Photon Energy(J): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        double l = c*h/E;
                                        System.out.print("\nThe photon wavelength is " + (c*h/E) + " m\n");
                                        me2.set("Wavelength", 0, l);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(pw==3)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: lambda = c/f ~ photon wavelength\n");
                                        input.next();
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Photon Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        double l = c/f;
                                        System.out.print("\nThe photon wavelength is " + (c/f) + " m\n");
                                        me2.set("Wavelength", 0, l);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1K==4)
                            {
                                System.out.print("\nWould you like to find:\nKinetic Energy of Accelerated Electron(1)\nMaximum Frequency of X-Ray(2)\nMinimum Wavelength of X-Ray(3)\nPotential Increase(4)\nInput:");
                                int br = input.nextInt();
                                if(br==1)
                                {
                                    System.out.print("\nWould you like to find the Kinetic Energy in terms of:\nFrequency(1)\nWavelength(2)\nInput:");
                                    int ke = input.nextInt();
                                    if(ke==1)
                                    {
                                        System.out.print("\nExpression being used: eV_AC = h*f_max ~ kinetic energy\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        System.out.print("Electron Charge(C): 1.602*10^-19\n");
                                        double e = 1.602*1/Math.pow(10,19);
                                        System.out.print("Maximum Frequency of X-Ray(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe kinetic energy of the electron is " + (h*f) + " J\n or " + (h1*f) + " eV\n");
                                        input.next();
                                    }
                                    else if(ke==2)
                                    {
                                        System.out.print("\nExpression being used: eV_AC = h*c/lambda_min ~ kinetic energy\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Electron Charge(C): 1.602*10^-19\n");
                                        double e = 1.602*1/Math.pow(10,19);
                                        System.out.print("Wavelength of X-Ray(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe kinetic energy of the electron is " + (h*c/l) + " J\n or " + (h1*c/l) + " eV\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(br==2)
                                {
                                    System.out.print("Would you like to find the X-Ray Frequency in terms of:\nKinetic Energy(1)\nWavelength(2)\nInput:");
                                    int xw = input.nextInt();
                                    if(xw==1)
                                    {
                                        System.out.print("\nExpression being used: f_max = e*V_AC/h ~ x-ray frequency\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Kinetic Energy of Electron(J): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("\nThe frequency of the x-ray is " + (k/h) + " Hz\n");
                                        input.next();
                                    }
                                    else if(xw==2)
                                    {
                                        System.out.print("\nExpression bein used: f_max = c/lambda_min ~ x-ray frequency\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Wavelength of X-ray(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe maximum frequency of the x-ray is " + (c/l) + " Hz\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(br==3)
                                {
                                    System.out.print("\nWould you like to find the Minimum Wavelength of the X-Ray in terms of:\nKinetic Energy(1)\nMinimum Frequency(2)\nInput:");
                                    int xl = input.nextInt();
                                    if(xl==1)
                                    {
                                        System.out.print("\nExpression being used: lambda_min = h*c/e*V_AC ~ minimum wavelength of x-ray\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Kinetic Energy of Electron(J): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("\nThe minimum wavelength of the x-ray is " + (h*c/k) + " m\n");
                                        input.next();
                                    }
                                    else if(xl==2)
                                    {
                                        System.out.print("\nExpression being used: lambda_min = c/lambda_max ~ minimum wavelength of x-ray\n");
                                        input.next();
                                        System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Minimum Frequency of X-Ray(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe minimum wavelength of the x-ray is " + (c/f) + " m\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(br==4)
                                {
                                    System.out.print("\nWould you like to find the Potential Increase in terms of:\nMaximum Frequency(1)\nMinimum Wavelength(2)\nInput:");
                                    int pi = input.nextInt();
                                    if(pi==1)
                                    {
                                        System.out.print("\nExpression being used: V_AC = h*f_max/e ~ potential increase\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Electron Charge(C): 1.602*10^-19\n");
                                        double e = 1.602*1/Math.pow(10,19);
                                        System.out.print("Maximum Frequency(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe potential increase is " + (h*f/e) + " V\n");
                                        input.next();
                                    }
                                    else if(pi==2)
                                    {
                                        System.out.print("\nExpression being used: V_AC = h*c/e*lambda_min ~ potential increase\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Electron Charge(C): 1.602*10^-19\n");
                                        double e = 1.602*1/Math.pow(10,19);
                                        System.out.print("Minimum Wavelength(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe potential increase is " + (h*c/l*e) + " V\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1K==5)
                            {
                                System.out.print("\nWould you like to find the:\nDifference in Wavelengths(1)\nInitial Wavelength(2)\nFinal Wavelength(3)\nScatter Angle(4)\nInput:");
                                int cs = input.nextInt();
                                if(cs==1)
                                {
                                    System.out.print("\nExpression being used: lambda_f - lambda_i = h/m*c*(1-cos(phi))~ difference in wavelengths\n");
                                    input.next();
                                    System.out.print("\nh/mc (m): 2.43*10^-12\n");
                                    double h = 2.43*1/Math.pow(10,12);
                                    System.out.print("Scattering Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe difference in wavelengths is " + (h*(1-(th/57))) + " m\n");
                                    input.next();
                                }
                                else if(cs==2)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda_i = -h/m*c*(1-cos(phi)) + lambda_f~ initial wavelength\n");
                                    input.next();
                                    System.out.print("\nh/mc (m): 2.43*10^-12\n");
                                    double h = 2.43*1/Math.pow(10,12);
                                    System.out.print("Scattering Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("Final Wavelength of Photon(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    double l1 = -h*(1-(th/57))+l;
                                    System.out.print("\nThe initial wavelength of the photon is " + (-h*(1-(th/57))+l) + " m\n");
                                    me2.set("Wavelength", 0, l1);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(cs==3)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda_f = h/m*c*(1-cos(phi)) + lambda_i~ final wavelength\n");
                                    input.next();
                                    System.out.print("\nh/mc (m): 2.43*10^-12\n");
                                    double h = 2.43*1/Math.pow(10,12);
                                    System.out.print("Scattering Angle(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("Initial Wavelength of Photon(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    double l1 = -h*(1-(th/57))+l;
                                    System.out.print("\nThe final wavelength of the photon is " + (-h*(1-(th/57))+l) + " m\n");
                                    me2.set("Wavelength", 0, l1);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(cs==4)
                                {
                                    System.out.print("\nExpression being used: phi = acos(1-Dlambda/(h/m*c)) ~ angle of scatter\n");
                                    input.next();
                                    System.out.print("\nh/mc (m): 2.43*10^-12\n");
                                    double h = 2.43*1/Math.pow(10,12);
                                    System.out.print("Difference in Wavelengths(m): ");
                                    String dlp1 = input.next();
                                    double dl = exp(dlp1);
                                    System.out.print("\nThe scattering angle of the photon is " + (Math.acos(1-(dl/h)))*57 + " degrees or " + (Math.acos(1-(dl/h))) + " radians\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1K==6)
                            {
                                System.out.print("\nWould you like to find the Uncertainty in:\nPosition(1)\nMomentum(2)\nTime(3)\nEnergy(4)\nInput:");
                                int hu = input.nextInt();
                                if(hu==1)
                                {
                                    System.out.print("\nExpression being used: dx>=h_bar/2*dp ~ position uncertainty\n");
                                    input.next();
                                    System.out.print("\nh/2*Pi(J*s): 1.054*10^-34\n");
                                    double hb = 1.054571628*1/Math.pow(10,34);
                                    System.out.print("Momentum Uncertainty(kg*m/s): ");
                                    String dpp1 = input.next();
                                    double dp = exp(dpp1);
                                    System.out.print("\nThe position uncertainty is " + (hb/(2*dp)) + " m\n");
                                    input.next();
                                }
                                else if(hu==2)
                                {
                                    System.out.print("\nExpression being used: dp>=h_bar/2*dx ~ momentum uncertainty\n");
                                    input.next();
                                    System.out.print("\nh/2*Pi(J*s): 1.054*10^-34\n");
                                    double hb = 1.054571628*1/Math.pow(10,34);
                                    System.out.print("Position Uncertainty(m): ");
                                    String dxp1 = input.next();
                                    double dx = exp(dxp1);
                                    System.out.print("\nThe momentum uncertainty is " + (hb/(2*dx)) + " kg*m/s\n");
                                    input.next();
                                }
                                else if(hu==3)
                                {
                                    System.out.print("\nExpression being used: dt>=h_bar/2*dE ~ time uncertainty\n");
                                    input.next();
                                    System.out.print("\nh/2*Pi(J*s): 1.054*10^-34\n");
                                    double hb = 1.054571628*1/Math.pow(10,34);
                                    System.out.print("Energy Uncertainty(J): ");
                                    String Ep1 = input.next();
                                    double dE = exp(Ep1);
                                    System.out.print("\nThe time uncertainty is " + (hb/(2*dE)) + " s\n");
                                    input.next();
                                }
                                else if(hu==4)
                                {
                                    System.out.print("\nExpression being used: dE>=h_bar/2*dt ~ energy uncertainty\n");
                                    input.next();
                                    System.out.print("\nh/2*Pi(J*s): 1.054*10^-34\n");
                                    double hb = 1.054571628*1/Math.pow(10,34);
                                    System.out.print("Time Uncertainty(s): ");
                                    String dtp1 = input.next();
                                    double dt = exp(dtp1);
                                    System.out.print("\nThe energy uncertainty is " + (hb/(2*dt)) + " J\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1K==7)
                                go1K=false;
                        }
                    }
                    else if(response6==3)//go1L
                    {
                        boolean go1L = true;
                        while(go1L)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find de Broglie Wavelength\n2.Find Particle Energy\n3.Find de Broglie Wavelength of Electron\n4.Find Energy of Emitted Photon\n5.Find Quantization of Angular Momentum\n6.Find Orbital Radii in Bohr Model\n7.Find Orbital Speed in Bohr Model\n8.Find Total Energy in Bohr Model\n9.Use Stefan-Boltzmann Law for Blackbody\n10.Use Wein Displacement Law\n11.Use Plank Radiation Law\n12.Back\n");
                            System.out.print("Input:");
                            int response1L = input.nextInt();
                            if(response1L==1)
                            {
                                System.out.print("\nWould you like to find the Wavelength in terms of:\nMomentum(1)\nMass and Velocity(2)\nInput:");
                                int p = input.nextInt();
                                if(p==1)
                                {
                                    System.out.print("\nExpression being used: lambda = h/p ~ wavelength of particle\n");
                                    input.next();
                                    System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                    double h = 6.62606896*1/Math.pow(10,34);
                                    System.out.print("\nMomentum of Particle(kg*m/s): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("\nThe wavelength of the particle is " + (h/p1) + " m\n");
                                    input.next();
                                }
                                else if(p==2)
                                {
                                    System.out.print("\nExpression being used: lambda = h/p ~ wavelength of particle\n");
                                    input.next();
                                    System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                    double h = 6.62606896*1/Math.pow(10,34);
                                    System.out.print("Mass of Particle(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nVelocity of Particle(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe wavelength of the particle is " + (h/(m*v)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1L==2)
                            {
                                System.out.print("\nExpression being used: E = h*f ~ energy of particle\n");
                                input.next();
                                System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                double h = 6.62606896*1/Math.pow(10,34);
                                System.out.print("Frequency of Particle(Hz): ");
                                String fp1 = input.next();
                                double f = exp(fp1);
                                System.out.print("\nThe energy of the particle is " + (h*f) + " J");
                            }
                            else if(response1L==3)
                            {
                                System.out.print("\nWould you like to find the Electron Wavelength in terms of:\nElectron Momentum(1)\nMass and Potential Increase(2)\nInput:");
                                int db = input.nextInt();
                                if(db==1)
                                {
                                    System.out.print("\nExpression being used: lambda = h/p ~ electron wavelength\n");
                                    input.next();
                                    System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                    double h = 6.62606896*1/Math.pow(10,34);
                                    System.out.print("Momentum of Electron(kg*m/s): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("\nThe wavelength of the electron is " + (h/p1) + " m\n");
                                    input.next();
                                }
                                else if(db==2)
                                {
                                    System.out.print("\nExpression being used: lambda = h/sqrt(2*m*e*V_ba) ~ electron wavelength\n");
                                    input.next();
                                    System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                    double h = 6.62606896*1/Math.pow(10,34);
                                    System.out.print("Electron Charge(C): 1.602*10^-19\n");
                                    double e = 1.602*1/Math.pow(10,19);
                                    System.out.print("Mass of Electron(kg): 9.109*10^-31\n");
                                    double m = 9.109*1/Math.pow(10,31);
                                    System.out.print("Potential Increase(V): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe wavelength of the electron is " + (h/Math.sqrt(2*m*e*V)) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1L==4)
                            {
                                System.out.print("\nWould you like to find:\nEnergy of Photon(1)\nWavelength of Photon(2)\nFrequency of Photon(3)\nInput:");
                                int ep = input.nextInt();
                                if(ep==1)
                                {
                                    System.out.print("\nWould you like to find the Photon Energy in terms of:\nFrequency(1)\nWavelength(2)\nInput:");
                                    int w = input.nextInt();
                                    if(w==1)
                                    {
                                        System.out.print("\nExpression being used: E = h*f ~ energy of photon\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        System.out.print("Frequency of Photon(Hz): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("\nThe energy of the photon is " + (h*f) + " J or " + (h1*f) + " eV\n");
                                        input.next();
                                    }
                                    else if(w==2)
                                    {
                                        System.out.print("\nExpression being used: E = h*f ~ energy of photon\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        double h1 = 4.136*1/Math.pow(10,15);
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Wavelength of Photon(m): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe energy of the photon is " + (h*c/l) + " J or " + (h1*c/l) + " eVn");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(ep==2)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda = c/f ~ wavelength of photon\n");
                                    input.next();
                                    System.out.print("\nSpeed of light(m/s): 2.99*10^8\n");
                                    double c = 2.99*Math.pow(10,8);
                                    System.out.print("Frequency of Photon(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    double l = (c/f);
                                    System.out.print("\nThe wavelength of the photon is " + (c/f) + " m\n");
                                    me2.set("Wavelength", 0, l);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(ep==3)
                                {
                                    System.out.print("\nEnergy of Photon in:\nJoules(1)\nElectron Volts(2)\nInput:");
                                    int ep1 = input.nextInt();
                                    if(ep1==1)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = E/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Energy of Photon(J): ");
                                        String Ep1 =input.next();
                                        double E = exp(Ep1);
                                        double f = (E/h);
                                        System.out.print("\nThe frequency of the photon is " + (E/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(ep1==2)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: f = E/h ~ frequency of photon\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Energy of Photon(eV): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        double f = (E/h);
                                        System.out.print("\nThe frequency of the photon is " + (E/h) + " Hz\n");
                                        me2.set("Frequency", f, 0);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1L==5)
                            {
                                System.out.print("\nWould you like to find the Quantization of Angular Momentum in terms of:\nVelocity and Radius of Orbit(1)\nPrincipal Quantum Number(2)\nInput:");
                                int qm = input.nextInt();
                                if(qm==1)
                                {
                                    System.out.print("\nExpression being used: L_n = m*v_n*r_n ~ quantization of angular momentum\n");
                                    input.next();
                                    System.out.print("Mass of Electron(kg): 9.109*10^-31\n");
                                    double m = 9.109*1/Math.pow(10,31);
                                    System.out.print("Radius of Orbit(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Velocity of Electron(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe quantization of angular momentum is " + (m*r*v) + " kg*m^2/s \n");
                                    input.next();
                                }
                                else if(qm==2)
                                {
                                    System.out.print("\nExpression being used: L_n = n*h/2*PI ~ quantization of angular momentum\n");
                                    input.next();
                                    System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                    double h = 6.62606896*1/Math.pow(10,34);
                                    System.out.print("Principle Quantum Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("\nThe quantization of angular momentum is " + (n*h/(2*Math.PI)) + " kg*m^2/s \n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1L==6)
                            {
                                System.out.print("\nExpression being used: r_n = n^2*Bohr Radius ~ orbital radii in Bohr model\n");
                                input.next();
                                System.out.print("\nBohr Radius(m): 5.29*10^-11\n");
                                double r = 5.29*1/Math.pow(10,11);
                                System.out.print("Principal Quantum Number: ");
                                String np1 = input.next();
                                double n = exp(np1);
                                System.out.print("\nThe  orbital radii is " + (Math.pow(n,2)*r) + " m\n");
                                input.next();
                            }
                            else if(response1L==7)
                            {
                                System.out.print("\nExpression being used: v_n = 1/epsilon_0*(e^2/2*n*h) ~ orbital speed in Bohr Model\n");
                                input.next();
                                System.out.print("\nEpsilon_0(C^2/N*m^2): 8.854*10^-12\n");
                                double ep = 8.854*1/Math.pow(10,12);
                                System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                double h = 6.62606896*1/Math.pow(10,34);
                                System.out.print("Electron Charge(C): 1.602*10^-19\n");
                                double e = 1.602*1/Math.pow(10,19);
                                System.out.print("Principal Quantum Number: " );
                                String np1 = input.next();
                                double n = exp(np1);
                                System.out.print("\ntThe orbital speed is " + (1/ep*(Math.pow(e,2)/(2*n*h))) + "m/s\n");
                                input.next();
                            }
                            else if(response1L==8)
                            {
                                System.out.print("\nExpression being used: E_n = -h*c*R/n^2 ~ total energy in bohr model\n");
                                input.next();
                                System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                double h = 6.62606896*1/Math.pow(10,34);
                                System.out.print("Rydberg Constant(/m): 1.097*10^7\n");
                                double R = 1.097*Math.pow(10,7);
                                System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Principal Quantum Number: ");
                                String np1 = input.next();
                                double n = exp(np1);
                                System.out.print("\nThe total energy is " + (-h*c*R/Math.pow(n,2)) + " J or " + (-h*c*R/Math.pow(n,2))/(1.602*1/Math.pow(10,19)) + " eV\n");
                                input.next();
                            }
                            else if(response1L==9)
                            {
                                System.out.print("\nWould you like to find:\n Total Intensity Emitted(1)\nTemperature of BlackBody(2)\nInput:");
                                int sb = input.nextInt();
                                if(sb==1)
                                {
                                    System.out.print("\nExpression being used: I = sigma*T^4 ~ total intensity emitted\n");
                                    input.next();
                                    System.out.print("\nStefan-Boltzmann constant(W/m^2*K^4): 5.67*10^-8\n");
                                    double s = 5.670400*1/Math.pow(10,8);
                                    System.out.print("Temperature of Blackbody(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("\nThe total intensity is " + (s*Math.pow(T,4)) + " W/m^2\n");
                                    input.next();
                                }
                                else if(sb==2)
                                {
                                    System.out.print("\nExpression being used: T = 4^sqrt(I/sigma) ~ temperature of blackbody\n");
                                    input.next();
                                    System.out.print("\nStefan-Boltzmann constant(W/m^2*K^4): 5.67*10^-8\n");
                                    double s = 5.670400*1/Math.pow(10,8);
                                    System.out.print("Intensity of Blackbody(W/m^2): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe temperature of the blackbody is " + (Math.pow((I/s),.1428571429)) + " K\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1L==10)
                            {
                                System.out.print("\nWould you like to find:\nWavelength of Greatest Emittance(1)\nTemperature of Blackbody(2)\nInput:");
                                int wd = input.nextInt();
                                if(wd==1)
                                {
                                    LightClass me2 = new LightClass();
                                    System.out.print("\nExpression being used: lambda_m = 2.9*10^-3 / T ~ wavelength of greatest emittance\n");
                                    input.next();
                                    System.out.print("\nExperimental Constant(m*K): 2.9*10^-3\n");
                                    double c = 2.9*1/Math.pow(10,3);
                                    System.out.print("Temperature of Blackbody(K): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    double l = c/T;
                                    System.out.print("\nThe wavelength of greatest emittance is " + (c/T) + " m\n");
                                    me2.set("Wavelength", 0, l);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(wd==2)
                                {
                                    System.out.print("\nExpression being used: T = 2.9*10^-3 / lambda_m ~ temperature of blackbody\n");
                                    input.next();
                                    System.out.print("\nExperimental Constant(m*K): 2.9*10^-3\n");
                                    double c = 2.9*1/Math.pow(10,3);
                                    System.out.print("Wavelength of Greatest Emittance(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\nThe wavelength of greatest emittance is " + (c/l) + " K\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1L==11)
                            {
                                System.out.print("\nExpression being used: I(lambda) = 2*PI*h*c^2/(lambda^5*(e^(h*c/(lambda*k*T)-1)) ~ spectral emittance\n");
                                input.next();
                                System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                double h = 6.62606896*1/Math.pow(10,34);
                                System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("Boltzmann Constant(J/K): 1.381*10^-23\n");
                                double k = 1.381*1/Math.pow(10,23);
                                System.out.print("Wavelength of Interest(m): ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("Temperature of Blackbody(K): ");
                                String Tp1 = input.next();
                                double T = exp(Tp1);
                                double ex = h*c/(l*k*T);
                                System.out.print("\nThe spectral emittance is " + (2*Math.PI*h*Math.pow(c,2)/(Math.pow(l,5)*(Math.exp(ex)-1))) + " W/m^3\n");
                                input.next();
                            }
                            else if(response1L==12)
                                go1L = false;
                            
                        }
                    }
                    else if(response6==4)//go1M
                    {
                        boolean go1M = true;
                        while(go1M)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Energy Levels of Particle in Box\n2.Find Energy Levels for Harmonic Oscillations\n3.Back\n");
                            System.out.print("Input:");
                            int response1M = input.nextInt();
                            if(response1M==1)
                            {
                                System.out.print("\nWould you like to find the energy level in terms of:\nParticle Momentum in Energy Level and PArticle Mass(1)\nEnergy Level Number, Mass of Particle, and Length of Box(2)\nPI, Energy Level Number, Mass of Particle, and Length of Box(3)\nInput:");
                                int el = input.nextInt();
                                if(el==1)
                                {
                                    System.out.print("\nExpression being used: E_n = p_n^2/2*m ~ energy level of particle in box\n");
                                    input.next();
                                    System.out.print("Momentum of Particle in Box(kg*m/s): ");
                                    String pp1 = input.next();
                                    double p = exp(pp1);
                                    System.out.print("Mass of Particle(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe energy level is " + (Math.pow(p,2)/(2*m))+ " J or " + (Math.pow(p,2)/(2*m))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                    input.next();
                                }
                                else if(el==2)
                                {
                                    System.out.print("\nExpression being used: E_n = n^2*h^2/8*m*L^2 ~ energy level of particle in box\n");
                                    input.next();
                                    System.out.print("Planck's Constant(J*s): 6.63*10^-34\n");
                                    double h = 6.62606896*1/Math.pow(10,34);
                                    System.out.print("Energy Level Integer: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Mass of Particle(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Length of Box(m):");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe energy level is " + (Math.pow(n,2)*Math.pow(h,2)/(8*m*Math.pow(L,2)))+ " J or " + (Math.pow(n,2)*Math.pow(h,2)/(8*m*Math.pow(L,2)))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                    input.next();
                                }
                                else if(el==3)
                                {
                                    System.out.print("\nExpression being used: E_n = n^2*PI^2*h_bar^2/2*m*L^2 ~ energy level of particle in box\n");
                                    input.next();
                                    System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                    double hb = 1.054571726*1/Math.pow(10,34);
                                    System.out.print("Energy Level Integer: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Mass of Particle(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Length of Box(m):");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe energy level is " + (Math.pow(Math.PI,2)*Math.pow(n,2)*Math.pow(hb,2)/(2*m*Math.pow(L,2)))+ " J or " + (Math.pow(Math.PI,2)*Math.pow(n,2)*Math.pow(hb,2)/(2*m*Math.pow(L,2)))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1M==2)
                            {
                                System.out.print("\nWould you like to find:\nEnergy Levels in Harmonic Oscillator(1)\nAngular Frequency in Harmonic Oscillator(2)\nForce Constant in Oscillation(3)\nSpacing between Energy Levels(4)\nWavelength of Photon Emitted by Oscillation(5)\nInput:");
                                int e = input.nextInt();
                                if(e==1)
                                {
                                    System.out.print("\nWould you like to find the energy level in terms of:\nForce Constant, Quantum Number, and Mass(1)\nAngular Frequency and Quantum Number(2)\nInput:");
                                    int el = input.nextInt();
                                    if(el==1)
                                    {
                                        System.out.print("\nExpression being used: E_n = (n+1/2)*h_bar*sqrt(k'/m) ~ energy level in harmonic oscillator\n");
                                        input.next();
                                        System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                        double hb = 1.054571726*1/Math.pow(10,34);
                                        System.out.print("Mass of Particle(kg): ");
                                        String mp1 = input.next();
                                        double m = exp(mp1);
                                        System.out.print("Force Constant(N/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Quantum Number: " );
                                        String np1 = input.next();
                                        double n = exp(np1);
                                        System.out.print("\nThe energy level in the harmonic oscillator is " + ((n+.5)*hb*Math.sqrt(k/m)) + " J or " + ((n+.5)*hb*Math.sqrt(k/m))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                        input.next();
                                        
                                    }
                                    else if(el==2)
                                    {
                                        System.out.print("\nExpression being used: E_n = (n+1/2)*h_bar*omega ~ energy level in harmonic oscillator\n");
                                        input.next();
                                        System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                        double hb = 1.054571726*1/Math.pow(10,34);
                                        System.out.print("Angular Frequency(rad/s): ");
                                        String fp1 = input.next();
                                        double f = exp(fp1);
                                        System.out.print("Quantum Number: " );
                                        String np1 = input.next();
                                        double n = exp(np1);
                                        System.out.print("\nThe energy level in the harmonic oscillator is " + ((n+.5)*hb*f) + " J or " + ((n+.5)*hb*f)/(1.6*1/Math.pow(10,19)) + " eV\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(e==2)
                                {
                                    System.out.print("\nExpression being used: omega = sqrt(k/m) ~ angular frequency in harmonic oscillator\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Mass of Particle(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe angular frequency in the harmonic oscillator is " + (Math.sqrt(k/m)) + " rad/s\n");
                                    input.next();
                                }
                                else if(e==3)
                                {
                                    
                                    System.out.print("\nExpression being used: k = 2*PE/x^2 ~ force constant in oscillator\n");
                                    input.next();
                                    System.out.print("\nPotential Energy of Particle(J): ");
                                    String Up1 = input.next();
                                    double U = exp(Up1);
                                    System.out.print("Displacement from Equilibrium Position(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("\nThe force constant in the oscillator is " + (2*U/Math.pow(x,2)) + " N/m\n");
                                    input.next();
                                }
                                else if(e==4)
                                {
                                    System.out.print("\nExpression being used: h_bar*omega ~ spacing between adjacent energy levels\n");
                                    input.next();
                                    System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                    double hb = 1.054571726*1/Math.pow(10,34);
                                    System.out.print("Angular Frequency(rad/s): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe spacing between adjacent energy levels is " + (hb*f) + " J or " + (hb*f)/(1.6*1/Math.pow(10,19)) + " eV\n");
                                    input.next();
                                }
                                else if(e==5)
                                {
                                    System.out.print("\nIs the Energy in Joules(1) or Electron Volts(2)\nInput:");
                                    int ep = input.nextInt();
                                    if(ep==1)
                                    {
                                        LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: lambda = h*c/E ~ wavelength of photon emitted\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(J*s): 6.63*10^-34\n");
                                        double h = 6.62606896*1/Math.pow(10,34);
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Energy of Photon(J): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        double l = h*c/E;
                                        System.out.print("\nThe wavelength of the emitted photon is " + (h*c/E) + " m");
                                        me2.set("Wavelength", 0, l);
                                        me2.writeOutput();
                                        input.next();
                                    }
                                    else if(ep==2)
                                    {LightClass me2 = new LightClass();
                                        System.out.print("\nExpression being used: lambda = h*c/E ~ wavelength of photon emitted\n");
                                        input.next();
                                        System.out.print("\nPlanck's Constant(eV*s): 4.136*10^-15\n");
                                        double h = 4.136*1/Math.pow(10,15);
                                        System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                        double c = 2.99*Math.pow(10,8);
                                        System.out.print("Energy of Photon(eV): ");
                                        String Ep1 = input.next();
                                        double E = exp(Ep1);
                                        double l = h*c/E;
                                        System.out.print("\nThe wavelength of the emitted photon is " + (h*c/E) + " m");
                                        me2.set("Wavelength", 0, l);
                                        me2.writeOutput();
                                        input.next();
                                        
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1M==3)
                                go1M = false;
                        }
                    }
                    else if(response6==5)//go1N
                    {
                        boolean go1N = true;
                        while(go1N)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Allowed Energies for Particle in 3 dimensional Cubical Box\n2.Find Energy Levels of Hydrogen\n3.Find Magnitude of Orbital Angluar Momentum\n4.Find Component of Orbital Angular Momentum\n5.Find Orbital Magnetic Interation Energy\n6.Find Effective Charge attracting Electron (Screening)\n7.Use Moseley's Law(X-Ray Frequencies)\n8.Back\n");
                            System.out.print("Input:");
                            int response1N = input.nextInt();
                            if(response1N==1)
                            {
                                System.out.print("\nExpression being used: E_nx,ny,nz = (n_x^2 + n_y^2 + n_z^2)*PI^2*h_bar^2/2*m*L^2 ~ energy level in 3 dimensional box\n");
                                input.next();
                                System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                double hb = 1.054571726*1/Math.pow(10,34);
                                System.out.print("Quantum Number of X component: ");
                                String nxp1 = input.next();
                                double nx = exp(nxp1);
                                System.out.print("Quantum Number of Y Component: ");
                                String nyp1 = input.next();
                                double ny = exp(nyp1);
                                System.out.print("Quantum Number of Z Component: ");
                                String nzp1 = input.next();
                                double nz = exp(nzp1);
                                System.out.print("Length of Box side(m): ");
                                String Lp1 = input.next();
                                double L = exp(Lp1);
                                System.out.print("Mass of Particle(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe energy level of the particle is " + (((Math.pow(nx,2)+Math.pow(ny,2)+Math.pow(nz,2))*Math.pow(Math.PI,2)*Math.pow(hb,2))/(2*m*Math.pow(L,2))) + " J or  " + (((Math.pow(nx,2)+Math.pow(ny,2)+Math.pow(nz,2))*Math.pow(Math.PI,2)*Math.pow(hb,2))/(2*m*Math.pow(L,2)))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                input.next();
                            }
                            else if(response1N==2)
                            {
                                System.out.print("\nExpression being used: -13.60eV/n^2 ~ hydrogen energy level\n");
                                input.next();
                                System.out.print("\nPrincipal Quantum Number: ");
                                String np1 = input.next();
                                double n = exp(np1);
                                System.out.print("\nThe energy level of hydrogen is " + (-13.60/Math.pow(n,2)) + " eV\n");
                                input.next();
                            }
                            else if(response1N==3)
                            {
                                System.out.print("\nExpression being used: L = sqrt(l*(l+1))*h_bar ~ magnitude of orbital angular momentum\n");
                                input.next();
                                System.out.print("\nh_bar(J*s) = 1.05*10^-34\n");
                                double hb = 1.054571726*1/Math.pow(10,34);
                                System.out.print("Orbital Angular-Momentum Quantum Number: ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("\nThe magnitude of orbital angular momentum is " + (hb*Math.sqrt(l*(l+1))) + " or " + (Math.sqrt(l*(l+1))) + "h_bar\n");
                                input.next();
                            }
                            else if(response1N==4)
                            {
                                System.out.print("\nWould you like to find:\nComponent of Orbital Angular Momentum(1)\nMinimum Angle between Magnitude of Orbital Angular Momentum and Z-axis(2)\nInput:");
                                int el = input.nextInt();
                                if(el==1)
                                {
                                    System.out.print("\nExpression being used: L_z = m_l*h_bar ~ component of orbital angular momentum\n");
                                    input.next();
                                    System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                    double hb = 1.054571726*1/Math.pow(10,34);
                                    System.out.print("Quantum Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe magnitude of orbital angular momentum is " + (m*hb) + " or " + (m) + "h_bar\n");
                                    input.next();
                                }
                                else if(el==2)
                                {
                                    System.out.print("\nExpression being used: theta_L = acos(L_z/L) ~ minimum angle between angular momentum and z-axis\n");
                                    input.next();
                                    System.out.print("\nComponent of Orbital Angular Momentum: ");
                                    String Lzp1 = input.next();
                                    double Lz = exp(Lzp1);
                                    System.out.print("Magnitude of Orbital Angular Momentum: ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("The minimum angle from the z-axis is " + (Math.acos(Lz/L)) + " radians or " + (Math.acos(Lz/L)*57) + " degrees\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1N==5)
                            {
                                System.out.print("\nWould you like to find the Magnetic Interation Energy in terms of Electron Volts(1) or Joules(2)\nInput:");
                                int bm = input.nextInt();
                                if(bm==1)
                                {
                                    System.out.print("\nExpression being used: U = m_l*mu_z*B ~ orbital magnetic interaction energy\n");
                                    input.next();
                                    System.out.print("\nBohr Magneton(eV/T): 5.788*10^-5\n");
                                    double bmg = 5.788*1/Math.pow(10,5);
                                    System.out.print("Quantum Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Strength of Magnetic Field(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("\nThe orbital magnetic interaction energy is (+ or -) + " + (m*B*bmg) + " eV\n");
                                    input.next();
                                }
                                else if(bm==2)
                                {
                                    System.out.print("\nExpression being used: U = m_l*mu_z*B ~ orbital magnetic interaction energy\n");
                                    input.next();
                                    System.out.print("\nBohr Magneton(J/T): 9.274*10^-24\n");
                                    double bmg = 9.274*1/Math.pow(10,24);
                                    System.out.print("Quantum Number: ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Strength of Magnetic Field(T): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("\nThe orbital magnetic interaction energy is (+ or -) " + (m*B*bmg) + " J\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1N==6)
                            {
                                System.out.print("\nWould you like to find:\nEffective Charge on Electron(1)\nEnergy of Single Valence Electron State(2)\nInput:");
                                int ze = input.nextInt();
                                if(ze==1)
                                {
                                    System.out.print("\nExpression being used: Z_eff = sqrt((-n^2*E_n)/ 13.6eV) ~ effective charge attracting electron\n");
                                    input.next();
                                    System.out.print("\nQuantum Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Energy State(eV): ");
                                    String Ep1 = input.next();
                                    double E = exp(Ep1);
                                    System.out.print("\nThe effective charge attracting the electron is " + (Math.sqrt((Math.pow(n,2)*E)/13.6)) + " e\n");
                                    input.next();
                                }
                                else if(ze==2)
                                {
                                    System.out.print("\nExpression being used: E_n = (Z_eff^2*13.6eV)/n^2 ~ energy of valence electron state\n");
                                    input.next();
                                    System.out.print("\nEffective Charge: 1\n");
                                    System.out.print("\nQuantum Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("\nThe energy of the valence electron state is " + (-13.6/Math.pow(n,2)) + " eV\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1N==7)
                            {
                                System.out.print("\nWould you like to find the:\nElement's X-Ray Frequency(1)\nElement that emits X-Ray Frequency(2)\nInput:");
                                int xr = input.nextInt();
                                if(xr==1)
                                {
                                    System.out.print("\nExpression being used: f = (2.58*10^15Hz)*(Z-1)^2 ~ element's x-ray frequency\n");
                                    input.next();
                                    System.out.print("\nElement's Atomic Number: ");
                                    String Zp1 = input.next();
                                    double Z = exp(Zp1);
                                    System.out.print("\nThe frequency at which this elements emits x-rays is " + (2.58*Math.pow(10,15)*Math.pow(Z-1,2)) + " Hz\n");
                                    input.next();
                                }
                                else if(xr==2)
                                {
                                    System.out.print("\nExpression being used: Z = 1+sqrt(f/2.58*10^15Hz) ~ element atomic number according to x-ray frequency\n");
                                    input.next();
                                    System.out.print("\nX-Ray Frequency Emitted(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe atomic number of the element that emits this x-ray frequency is " + (1 + Math.sqrt(f/(2.48*Math.pow(10,15)))) + "\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1N==8)
                                go1N = false;
                        }
                    }
                    else if(response6==6)//go1O
                    {
                        boolean go1O = true;
                        while(go1O)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find the Rotational Energy Levels of a Diatomic Molecule\n2.Find the Reduced Mass of a Molecule\n3.Find Moment of Inertia of Diatomic Molecule\n4.Find Vibrational Energy Levels of Diatomic Molecule\n5.Use Density of States in the Free Electron Model Formula\n6.Use Fermi-Dirac Distribution\n7.Find Current through a p-n Junction\n8.Back\n");
                            System.out.print("Input:");
                            int response1O = input.nextInt();
                            if(response1O==1)
                            {
                                System.out.print("\nExpression being used: E_l = l*(l+1)h_bar^2/(2*l) ~ rotational energy levels of diatomic molecule\n");
                                input.next();
                                System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                double hb = 1.054571726*1/Math.pow(10,34);
                                System.out.print("Quantum Number: ");
                                String lp1 = input.next();
                                double l = exp(lp1);
                                System.out.print("Moment of Intertia(kg*m^2): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("\nThe rotational energy level of the diatomic molecule is " + (l*(l+1)*(Math.pow(hb,2)/(2*I))) + " J or " + (l*(l+1)*(Math.pow(hb,2)/(2*I)))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                input.next();
                            }
                            else if(response1O==2)
                            {
                                System.out.print("\nExpression being used: m_r = m1*m2/(m1+m2) ~ reduced mass of molecule\n");
                                input.next();
                                System.out.print("\nMass of 1st Particle(kg): ");
                                String m1p1 = input.next();
                                double m1 = exp(m1p1);
                                System.out.print("Mass of 2nd Particle(kg): ");
                                String m2p1 = input.next();
                                double m2 = exp(m2p1);
                                System.out.print("\nThe reduced mass of the two particles is " + (m1*m2/(m1+m2)) + " kg\n");
                                input.next();
                            }
                            else if(response1O==3)
                            {
                                System.out.print("\nExpression being used: I = m_r*r_0^2 ~ moment of inertia of diatomic molecule\n");
                                input.next();
                                System.out.print("\nReduced Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Total distance between Particles(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("\nThe moment of inertia of the diatomic molecule is " + (m*Math.pow(r,2)) + " kg*m^2\n");
                                input.next();
                            }
                            else if(response1O==4)
                            {
                                System.out.print("\nWould you like to find the Vibrational Energy Level in terms of:\nAngular Frequency and Quantum Number(1)\nForce Constant, Reduced Mass, and Quantum Number(2)\nInput:");
                                int qn = input.nextInt();
                                if(qn==1)
                                {
                                    System.out.print("\nExpression being used: E_n = (n + 1/2)*h_bar*omega ~ vibrational energy level of diatomic molecule\n");
                                    input.next();
                                    System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                    double hb = 1.054571726*1/Math.pow(10,34);
                                    System.out.print("Angular Frequency(rad/s): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Quantum Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("The vibrational energy level of the molecule is " + ((n+.5)*(hb*f)) + " J or " + ((n+.5)*(hb*f))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                    input.next();
                                }
                                else if(qn==2)
                                {
                                    System.out.print("\nExpression being used: E_n = (n + 1/2)*h_bar*sqrt(k'/m_r) ~ vibrational energy level of diatomic molecule\n");
                                    input.next();
                                    System.out.print("\nh_bar(J*s)  = 1.05*10^-34\n");
                                    double hb = 1.054571726*1/Math.pow(10,34);
                                    System.out.print("Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Quantum Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("\nReduced Mass(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("The vibrational energy level of the molecule is " + ((n+.5)*(hb*Math.sqrt(k/m))) + " J or " + ((n+.5)*(hb*Math.sqrt(k/m)))/(1.6*1/Math.pow(10,19)) + " eV\n");
                                    input.next();
                                }
                                else
                                    System.out.print("Ok.");
                            }
                            else if(response1O==5)
                            {
                                System.out.print("\nExpression being used: g(E) = ((2*m)^3/2)*V*E^(1/2)/(2*PI^2*h_bar^3) ~ density of states (free electron model)\n");
                                input.next();
                                System.out.print("\nMass of Electron(kg): 9.11*10^-31\n");
                                double em = 9.11*1/Math.pow(10,31);
                                System.out.print("h_bar(J*s)  = 1.05*10^-34\n");
                                double hb = 1.054571726*1/Math.pow(10,34);
                                System.out.print("Volume of Container(m^3): ");
                                String Vp1 = input.next();
                                double V = exp(Vp1);
                                System.out.print("Energy of State(J): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("\nThe density of states from the free electron model is " + (Math.pow(2*em,1.5)*V*Math.pow(E,.5)/(2*Math.pow(Math.PI,2)*Math.pow(hb,3)) + " states/J or " + (Math.pow(2*em,1.5)*V*Math.pow(E,.5)/(2*Math.pow(Math.PI,2)*Math.pow(hb,3)))*(1.6*1/Math.pow(10,19))) + " states/eV\n");
                                input.next();
                            }
                            else if(response1O==6)
                            {
                                System.out.print("\nExpression being used: f(E): 1/(e^(E-E_f/k*T) + 1) ~ fraction of states with electron-occupied energy states\n");
                                input.next();
                                System.out.print("\nBoltzmann Constant(J/K): 1.381*10^-23\n");
                                double k = 1.381*1/Math.pow(10,23);
                                System.out.print("Temperature of State(K): ");
                                String Tp1 = input.next();
                                double T = exp(Tp1);
                                System.out.print("Observed Energy State(J): ");
                                String Ep1 = input.next();
                                double E = exp(Ep1);
                                System.out.print("Fermi Energy(J): ");
                                String Efp1 = input.next();
                                double Ef = exp(Efp1);
                                System.out.print("\nThe fraction of energy states containing electrons is " + (1/(Math.exp((E-Ef)/(k*T))+1)) + " or " + (1/(Math.exp((E-Ef)/(k*T))+1))*100 + " percent\n");
                                input.next();
                            }
                            else if(response1O==7)
                            {
                                System.out.print("\nExpression being used: I = I_s*(e^(e*V/k*T)-1) ~ current through p-n junction\n");
                                input.next();
                                System.out.print("\nQuantum of Charge(C) = 1.602*10^-19\n");
                                double e = 1.602*1/Math.pow(10,19);
                                System.out.print("Boltzmann Constant(J/K): 1.381*10^-23\n");
                                double k = 1.381*1/Math.pow(10,23);
                                System.out.print("Absolute Temperature(K): ");
                                String Tp1 = input.next();
                                double T = exp(Tp1);
                                System.out.print("Potential Difference(V): ");
                                String Vp1 = input.next();
                                double V = exp(Vp1);
                                System.out.print("\nSaturation Current(A): ");
                                String Isp1 = input.next();
                                double Is = exp(Isp1);
                                System.out.print("\nThe current the the p-n junction is " + (Is*(Math.exp(e*V/(k*T))-1)) + " A\n");
                                input.next();
                            }
                            else if(response1O==8)
                                go1O = false;
                        }
                    }
                    else if(response6==7)//go1P
                    {
                        boolean go1P = true;
                        while(go1P)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Radius of a Nucleus\n2.Find Nuclear Binding Energy\n3.Find Number of Remaining Nuclei\n4.Find Mean Lifetime of Radioactive Substance\n5.Back\n");
                            System.out.print("Input:");
                            int response1P = input.nextInt();
                            if(response1P==1)
                            {
                                System.out.print("\nExpression being used: R = R_0*A^(1/3) ~ radius of a nucleus\n");
                                input.next();
                                System.out.print("\nExperiment Constant(m): 1.2*10^-15\n");
                                double r = 1.2*1/Math.pow(10,15);
                                System.out.print("Nucleon Number: ");
                                String Ap1 = input.next();
                                double A = exp(Ap1);
                                System.out.print("\nThe radius of the nucleus is " + (r*Math.pow(A,.33333333)) + " m\n");
                                input.next();
                            }
                            else if(response1P==2)
                            {
                                System.out.print("\nExpression being used: E_b = (Z*M_H + N*m_n - M)*c^2 ~ nuclear binding energy\n");
                                input.next();
                                System.out.print("\nu(kg)= 1.66*10^-27\n");
                                double u = 1.660538782*1/Math.pow(10,27);
                                System.out.print("c^2(MeV/u) = 931.5\n");
                                double c = 931.5;
                                System.out.print("Mass of Proton(*u): 1.007825\n");
                                double mh = 1.007825;
                                System.out.print("Atomic Number: ");
                                String Zp1 = input.next();
                                double Z = exp(Zp1);
                                System.out.print("\nMass of Neutron(*u): 1.008665\n");
                                double mn = 1.008665;
                                System.out.print("Neutron Number: ");
                                String Np1 = input.next();
                                double N = exp(Np1);
                                System.out.print("\nMass of Nuetral Atom(*u): ");
                                String Mp1 = input.next();
                                double M = exp(Mp1);
                                System.out.print("\nThe binding energy is " + (((Z*mh + N*mn)-M)*c) + " MeV\n");
                                input.next();
                            }
                            else if(response1P==3)
                            {
                                System.out.print("\nWould you like to find:\nNumber of Remaining Nuclei(1)\nInitial Number of Nuclei(2)\nDecay Rate(3)\nTime to Decay(4)\nInput:");
                                int dr = input.nextInt();
                                if(dr==1)
                                {
                                    System.out.print("\nExpression being used: N(t) = N_0*e^(-lambda*t) ~ number of remaining nuclei\n");
                                    input.next();
                                    System.out.print("\nInitial Number of Nuclei: ");
                                    String nip1 = input.next();
                                    double ni = exp(nip1);
                                    System.out.print("Decay Rate of Nuclei(/s): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Time Passed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe number of remaining nuclei is " + (ni*Math.exp(-l*t)) + " nuclei\n");
                                    input.next();
                                }
                                else if(dr==2)
                                {
                                    System.out.print("\nExpression being used: N_0 = N(t)/e^(-lambda*t) ~ initial number of nuclei\n");
                                    input.next();
                                    System.out.print("\nRemaining Number of Nuclei: ");
                                    String nrp1 = input.next();
                                    double nr = exp(nrp1);
                                    System.out.print("Decay Rate of Nuclei(/s): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Time Passed(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe initial number of nuclei is " + (nr/Math.exp(-l*t)) + " nuclei\n");
                                    input.next();
                                }
                                else if(dr==3)
                                {
                                    System.out.print("\nWould you like to find the Decay Rate in terms of:\nNumber of Remaining Nuclei, Initial Number of Nuclei, and Time Passed(1)\nMean Lifetime(2)\nInput:");
                                    int drt = input.nextInt();
                                    if(drt==1)
                                    {
                                        System.out.print("\nExpression being used: lambda = ln(N(t)/N_0)/t ~ decay rate of nuclei\n");
                                        input.next();
                                        System.out.print("\nNumber of Remaining Nuclei: ");
                                        String nrp1 = input.next();
                                        double nr = exp(nrp1);
                                        System.out.print("Initial Number of Nuclei: ");
                                        String nip1 = input.next();
                                        double ni = exp(nip1);
                                        System.out.print("Time Passed(s): ");
                                        String tp1 = input.next();
                                        double t = exp(tp1);
                                        System.out.print("\nThe decay rate of the nuclei is " + (Math.log(nr/ni)/t) + " nuclei/s\n");
                                        input.next();
                                    }
                                    else if(drt==2)
                                    {
                                        System.out.print("\nExpression being used: lambda = .693/T_1/2 ~ decay rate of nuclei\n");
                                        input.next();
                                        System.out.print("\nHalf-life of Nuclei(s)");
                                        String Tp1 = input.next();
                                        double T = exp(Tp1);
                                        System.out.print("\nThe decay rate of the nuclei is " + (.693/T) + " nuclei/s");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(dr==4)
                                {
                                    System.out.print("\nExpression being used: t = ln(N(t)/N_0)/lambda ~ time passed of decay\n");
                                    input.next();
                                    System.out.print("\nNumber of Remaining Nuclei: ");
                                    String nrp1 = input.next();
                                    double nr = exp(nrp1);
                                    System.out.print("Initial Number of Nuclei: ");
                                    String nip1 = input.next();
                                    double ni = exp(nip1);
                                    System.out.print("Decay Rate of Nuclei(/s): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("\nThe time passed is " + (Math.log(nr/ni)/l) + " s = " + (Math.log(nr/ni)/l)/60 + " min = " + ((Math.log(nr/ni)/l)/3600)/24 + " days = " + (Math.log(nr/ni)/l)/ 31556900+ " years\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1P==4)
                            {
                                System.out.print("\nWould you like to find:\nMean Lifetime(1)\nDecay Rate(2)\nHalf-Life(3)\nInput:");
                                int tm = input.nextInt();
                                if(tm==1)
                                {
                                    System.out.print("\nWould you like to find the Mean Lifetime in terms of:\nDecay Rate(1)\nHalf-Life(2)\nInput:");
                                    int ml = input.nextInt();
                                    if(ml==1)
                                    {
                                        System.out.print("\nExpression being used: T_mean = 1/lambda ~ mean lifetime of nuclei\n");
                                        input.next();
                                        System.out.print("\nDecay Rate of Nuclei(/s): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe mean lifetime is " + (1/l) + " s = " + (1/l)/60 + " min = " + ((1/l)/3600)/24 + " days = " + (1/l)/31556900 + " years\n");
                                        input.next();
                                    }
                                    else if(ml==2)
                                    {
                                        System.out.print("\nExpression being used: T_mean = T_1/2/.693 ~ mean lifetime of nuclei\n");
                                        input.next();
                                        System.out.print("\nHalf-Life of Nuclei(s): ");
                                        String Tp1 = input.next();
                                        double T = exp(Tp1);
                                        System.out.print("\nThe mean lifetime is " + (T/.693) + " s = " + (T/.693)/60 + " min = " + ((T/.693)/3600)/24 + " days = " + (T/.693)/31556900 + " years\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(tm==2)
                                {
                                    System.out.print("\nWould you like to find the Decay Rate in terms of:\nMean Life-time(1)\nHalf-Life(2)\n");
                                    int mh = input.nextInt();
                                    if(mh==1)
                                    {
                                        System.out.print("\nExpression being used: lambda = 1/T_mean ~ decay rate of nuclei\n");
                                        input.next();
                                        System.out.print("\nMean Life-Time of Nuclei(s): ");
                                        String Tp1 = input.next();
                                        double T = exp(Tp1);
                                        System.out.print("\nThe decay rate of the nuclei is " + (1/T) + " nuclei/s\n");
                                        input.next();
                                    }
                                    else if(mh==2)
                                    {
                                        System.out.print("\nExpression being used: lambda = .693/T_1/2 ~ decay rate of nuclei\n");
                                        input.next();
                                        System.out.print("\nHalf-life of Nuclei(s)");
                                        String Tp1 = input.next();
                                        double T = exp(Tp1);
                                        System.out.print("\nThe decay rate of the nuclei is " + (.693/T) + " nuclei/s");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(tm==3)
                                {
                                    System.out.print("\nWould you like to find the Half-Life in terms of:\nMean Life-Time(1)\nDecay Rate(2)\nInput:");
                                    int gm = input.nextInt();
                                    if(gm==1)
                                    {
                                        System.out.print("\nExpression being used: .693/T_mean ~ half-life of nuclei\n");
                                        input.next();
                                        System.out.print("\nMean life-time of Nuclei(s): ");
                                        String Tp1 = input.next();
                                        double T = exp(Tp1);
                                        System.out.print("\nThe half-life of the nuclei is " + (.693/T) + " s = " + (.693/T)/60 + " min = " + ((.693/T)/3600)/24 + " days = " + (.693/T)/31556900 + " years\n");
                                        input.next();
                                    }
                                    else if(gm==2)
                                    {
                                        System.out.print("\nExpression being used: .693/lambda ~ half-life of nuclei\n");
                                        input.next();
                                        System.out.print("\nDecay Rate of Nuclei(/s): ");
                                        String lp1 = input.next();
                                        double l = exp(lp1);
                                        System.out.print("\nThe half-life of the nuclei is " + (.693/l) + " s = " + (.693/l)/60 + " min = " + ((.693/l)/3600)/24 + " days = " + (.693/l)/31556900 + " years\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1P==5)
                                go1P = false;
                        }
                    }
                    else if(response6==8)
                        go6 = false;
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