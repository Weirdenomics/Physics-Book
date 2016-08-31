# Physics-Book
Coded Physics Book
import java.text.DecimalFormat;
import java.util.Scanner;
class Physics
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
            System.out.println("\n1.Mechanics\n2.Waves/Acoustics\n0.Quit");
            System.out.print("Input:");
            int response = input.nextInt();
            if(response==1)
            {
                boolean go1 = true;
                while(go1)
                {
                    System.out.println("\nWhich Topic #?");
                    System.out.println("1.Units, Physical Quantities, Vectors\n2.Motion along a Straight Line\n3.Motion in 2-3 Dimensions\n4.Newtons Laws of Motion\n5.Work and Kinetic Energy\n6.Potential Energy and Energy Conservation\n7.Momentum,Impulse, and Collisions\n8.Rotation and Rigid Bodies\n9.Dynamics of Rotational Motion\n10.Equilibrium and Elasticity\n11.Fluid Mechanics\n12.Gravitation\n13.Periodic Motion.\n14.Back");
                    System.out.print("Input:");
                    int response1 = input.nextInt();
                    if(response1==1)
                    {
                        boolean go1a= true;
                        while(go1a)
                        {
                            System.out.println("\n\nWhich # would you like?: ");
                            System.out.println("1.Find Resultant of Vectors\n2.Find X and Y components\n3.Find Scalar Product\n4.Find Cross Product of Vectors\n5.Quit");
                            System.out.print("Input:");
                            int response1a= input.nextInt();
                            if(response1a==1)
                            {
                                VectorClass me2 = new VectorClass();
                                System.out.print("\nExpression being used: sqrt(x^2 + y^2 + z^2) ~ resultant\n");
                                input.next();
                                System.out.println("\nPlease enter vector lengths for the x and y axis.");
                                System.out.print("Vector x(m): ");
                                String vp1 = input.next();
                                double v1 = exp(vp1);
                                System.out.print("Vector y(m): ");
                                String vp2 = input.next();
                                double v2 = exp(vp2);
                                System.out.print("Vector z(m): ");
                                String vp3 = input.next();
                                double v3 = exp(vp3);
                                me2.set("resultant", v1, 1, v2, 1, v3, 1, 1, 0, 1, 1, 1, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1a==2)
                            {
                                VectorClass me2 = new VectorClass();
                                System.out.print("\nExpressions being used:\nX-component- M*cos(angle)\nY-component- M*sin(angle)\n");
                                input.next();
                                System.out.print("Magnitude: ");
                                String mp1 = input.next();
                                double m1 = exp(mp1);
                                System.out.print("Angle(degrees): ");
                                String thetap1 = input.next();
                                double theta = exp(thetap1);
                                me2.set("components", 1, 1, 1, 1, 0, 1, m1, 0, 1 , 1, theta, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1a==3)
                            {
                                VectorClass me2 = new VectorClass();
                                System.out.print("\nExpression being used: A*B*cos(angle) ~ scalar(dot) product\n");
                                input.next();
                                System.out.print("Magnitude of Vector A: ");
                                String map1 = input.next();
                                double ma = exp(map1);
                                System.out.print("Magnitude of Vector B: ");
                                String mbp1 = input.next();
                                double mb = exp(mbp1);
                                System.out.print("Angle(degrees): ");
                                String thetap1 = input.next();
                                double theta = exp(thetap1);
                                me2.set("Scalar", 0, 1, 0, 1, 0, 1, ma, mb, 1, 1, theta, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1a==4)
                            {
                                VectorClass me2 = new VectorClass();
                                System.out.print("\nExpression being used: A*B*sin(angle) ~ vector(cross) product\n");
                                input.next();
                                System.out.print("Magnitude of Vector A: ");
                                String map1 = input.next();
                                double ma = exp(map1);
                                System.out.print("Magnitude of Vector B: ");
                                String mbp1 = input.next();
                                double mb = exp(mbp1);
                                System.out.print("Angle(degrees): ");
                                String thetap1 = input.next();
                                double theta = exp(thetap1);
                                me2.set("VectorP", 0, 1, 0, 1, 0, 1, ma, mb, 1 ,1, theta, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1a==5)
                                go1a = false;
                        }
                    }
                    else if(response1==2)
                    {
                        boolean go1b = true;
                        while(go1b)
                        {
                            System.out.println("\n\nWhich # would you like?: ");
                            System.out.println("1.Find Average Velocity\n2.Find Insta Velocity with Constant Acceleration\n3.Find Average Acceleration\n4.Find Position in Time with Constant Acceleration\n5.Find Velocity without Time dependency\n6.Find Position without Acceleration Dependency\n7.Back\n");
                            System.out.print("Input:");
                            int response1b= input.nextInt();
                            if(response1b==1)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: v = (x2-x1)/(t2-t1) ~ avg Velocity\n");
                                input.next();
                                System.out.print("Final Position (m): ");
                                String p2p1 = input.next();
                                double p2 = exp(p2p1);
                                System.out.print("Initial Position(m): ");
                                String p1p1 = input.next();
                                double p1 = exp(p1p1);
                                System.out.print("Final Time(s): ");
                                String t2p1 = input.next();
                                double t2 = exp(t2p1);
                                System.out.print("Initial Time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                me2.set("AverageV", p1, p2, 1, 1, 1, t1, t2, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1b==2)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: V = Vo + A*t ~ velocity (ONLY with Constant ACC)\n");
                                input.next();
                                System.out.print("Initial Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Acceleration(m/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                System.out.print("Time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Value of function when t = " + t1 + " seconds is ");
                                me2.set("InstaVCA", 1, 1, v1, 1, acc, t1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1b==3)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: a = (v2-v1)/(t2-t1) ~ avg acceleration\n");
                                input.next();
                                System.out.print("Initial Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Final Velocity(m/s): ");
                                String v2p1 = input.next();
                                double v2 = exp(v2p1);
                                System.out.print("Initial time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Final time(s): ");
                                String t2p1 = input.next();
                                double t2 = exp(t2p1);
                                me2.set("AverageA", 1, 1, v1, v2, 1, t1, t2, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1b==4)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: x = Xo +(Vo * t)+(1/2 * Ax * t^2) ~ distance (ONLY with Constant ACC)\n");
                                input.next();
                                System.out.print("Initial position: ");
                                String p1p1 = input.next();
                                double p1 = exp(p1p1);
                                System.out.print("Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Acceleration(m/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                me2.set("PositionX", p1, 1, v1, 1, acc, t1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1b==5)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: v = sqrt(Vo^2 + 2 * Ax * (x - Xo))(ONLY with Constant ACC)\n");
                                input.next();
                                System.out.print("Initial Position(m): ");
                                String p1p1 = input.next();
                                double p1 = exp(p1p1);
                                System.out.print("Final Position(m): ");
                                String p2p1 = input.next();
                                double p2 = exp(p2p1);
                                System.out.print("Initial Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Acceleration(m/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                me2.set("VelocityWT", p1, p2, v1, 1, acc, 1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1b==6)
                            {
                                System.out.print("\nExpression being used: x - Xo = ((Vo + v)/2) * t\n");
                                input.next();
                                System.out.print("Would you like to find Initial position(1) or Final Position(2)?\n");
                                System.out.print("Input:");
                                int a = input.nextInt();
                                if(a==1)
                                {
                                    VelocityClass me2 = new VelocityClass();
                                    System.out.print("Final Position(m): ");
                                    String p2p1 = input.next();
                                    double p2 = exp(p2p1);
                                    System.out.print("Initial Velocity(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Final Velocity(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("PositionWAO", 1, p2, v1, v2, 1, t1, 1, 1, 1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(a==2)
                                {
                                    VelocityClass me2 = new VelocityClass();
                                    System.out.print("Initial Position(m): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Initial Velocity(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Final Velocity(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("PositionWA", p1, 1, v1, v2, 1, t1, 1, 1, 1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1b==7)
                            {
                                go1b = false;
                            }
                        }
                    }
                    else if(response1==3)
                    {
                        boolean go1c = true;
                        while(go1c)
                        {
                            System.out.print("\n\nWhich # would you like?\n");
                            System.out.print("1.Find Position Vector\n2.Find Average Velocity Vector\n3.Find Average Acceleration Vector\n4.Find Projectile Motion\n5.Find Insta Acceleration (Uniform Circular Motion)\n6.Find Insta Acceleration with Period (Uniform Circular Motion)\n7.Relative Velocity Along Line\n8.Relative Velocity in Space\n9.Back\n");
                            System.out.print("Input:");
                            int response1c = input.nextInt();
                            if(response1c==1)
                            {
                                System.out.print("\nExpression being used: r = (x2-x1)i + (y2-y1)j + (z2-z1)k ~ position vector\n");
                                input.next();
                                VectorClass me2 = new VectorClass();
                                System.out.print("x1: ");
                                String vx1p1 = input.next();
                                double vx1 = exp(vx1p1);
                                System.out.print("x2: ");
                                String vx2p1 = input.next();
                                double vx2 = exp(vx2p1);
                                System.out.print("y1: ");
                                String vy1p1 = input.next();
                                double vy1 = input.nextDouble();
                                System.out.print("y2: ");
                                String vy2p1 = input.next();
                                double vy2 = exp(vy2p1);
                                System.out.print("z1: ");
                                String vz1p1 = input.next();
                                double vz1 = exp(vz1p1);
                                System.out.print("z2: ");
                                String vz2p1 = input.next();
                                double vz2 = exp(vz2p1);
                                me2.set("PositionV", vx1, vx2, vy1, vy2, vz1, vz2, 0, 0, 0, 0, 0, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1c==2)
                            {
                                System.out.print("\nExpression used: v -(r2-r1)/(t2-t1) ~ avg velocity vector\n");
                                input.next();
                                VectorClass me2 = new VectorClass();
                                System.out.print("Resultant 1: ");
                                String r1p1 = input.next();
                                double r1 = exp(r1p1);
                                System.out.print("Resultant 2: ");
                                String r2p1 = input.next();
                                double r2 = exp(r2p1);
                                System.out.print("Initial time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Final time(s): ");
                                String t2p1 = input.next();
                                double t2 = exp(t2p1);
                                me2.set("AverageVV", 1, 1, 1, 1, 1, 1, r1, r2, t1, t2, 0, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1c==3)
                            {
                                System.out.print("\nExpression being used: a -(v2-v1)/(t2-t1) ~ avg acceleration vector\n");
                                input.next();
                                VectorClass me2 = new VectorClass();
                                System.out.print("Initial Velocity Vector: ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Final Velocity Vector: ");
                                String v2p1 = input.next();
                                double v2 = exp(v2p1);
                                System.out.print("Initial time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Final time(s): ");
                                String t2p1 = input.next();
                                double t2 = exp(t2p1);
                                me2.set("AverageAV", v1, v2, 1, 1, 1, 1, 1, 1, t1, t2, 0, 1);
                                me2.writeOutput();
                                input.next();
                            }
                            else if (response1c==4)
                            {
                                
                                System.out.print("\nProjectile Motion: Which # would you like?\nPosition of X-component(1)\nPosition of Y-component(2)\nVelocity X-component(3)\nVelocity Y-component(4)\n");
                                System.out.print("Input:");
                                int a = input.nextInt();
                                if(a==1)
                                {
                                    System.out.print("\nExpression being used: (Vo * cos(theta)) * time\n");
                                    input.next();
                                    VectorClass me2 = new VectorClass();
                                    System.out.print("Initial Speed(magnitude): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Angle of Velocity from x-axis(degrees): ");
                                    String thetap1 = input.next();
                                    double theta = exp(thetap1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("ProjectilePX", v1, 1, 1, 1, 1, 1, 1, 1, t1, 1, theta, 1);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(a==2)
                                {
                                    System.out.print("\nExpression being used: (Vo * sin(theta)) * time - .5 * gravity * time\n");
                                    input.next();
                                    VectorClass me2 = new VectorClass();
                                    System.out.print("Intitial Speed(magnitude): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Angle of Velocity from x-axis(degrees): ");
                                    String thetap1 = input.next();
                                    double theta = exp(thetap1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Gravitational Acceleration(m/s^2): ");
                                    String grp1 = input.next();
                                    double gr = exp(grp1);
                                    me2.set("ProjectilePY", v1, 1, 1, 1, 1, 1, 1, 1, t1, 1, theta, gr);
                                    me2.writeOutput();
                                    input.next();
                                    
                                }
                                else if(a==3)
                                {
                                    System.out.print("\nExpression being used: (Vo * cos(theta))\n");
                                    input.next();
                                    VectorClass me2 = new VectorClass();
                                    System.out.print("Initial Speed(magnitude): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Angle of Velocity from x-axis(degrees): ");
                                    String thetap1 = input.next();
                                    double theta = exp(thetap1);
                                    me2.set("ProjectileVX", v1, 1, 1, 1, 1, 1, 1, 1, 1, 1, theta, 1);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(a==4)
                                {
                                    System.out.print("\nExpression being used: Vo * sin(theta) - gravity * time\n");
                                    input.next();
                                    VectorClass me2 = new VectorClass();
                                    System.out.print("Initial Speed(magnitude): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Angle of Velocity from x-axis(degrees): ");
                                    String thetap1 = input.next();
                                    double theta = exp(thetap1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    System.out.print("Gravitational Acceleration(m/s^2): ");
                                    String grp1 = input.next();
                                    double gr = exp(grp1);
                                    me2.set("ProjectileVY", v1, 1, 1, 1, 1, 1, 1, 1, t1, 1, theta, gr);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1c==5)
                            {
                                System.out.print("\nExpression being used: a= v^2/R ~ acceleration\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Radius of circle(m): ");
                                String rap1 = input.next();
                                double ra = exp(rap1);
                                me2.set("AccelerationUCM", 1, 1, v1, 1, 1, 1, 1, ra, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                                
                            }
                            else if(response1c==6)
                            {
                                System.out.print("\nExpression being used: a= (4*PI^2*Radius)/Period^2 ~ acceleration\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Radius of the circle(m): ");
                                String rap1 = input.next();
                                double ra = exp(rap1);
                                System.out.print("Period(s): ");
                                String pep1 = input.next();
                                double pe = exp(pep1);
                                me2.set("AccelerationUCMP", 1, 1, 1, 1, 1, 1, 1, ra, pe, 0, 0);
                                me2.writeOutput();
                                input.next();
                                
                            }
                            else if(response1c==7)
                            {
                                System.out.print("\nExpression being used: Vp/x = Vp/b + Vb/a ~ relative velocity\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Velocity of p relative to b(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Velocity of b relative to a(m/s): ");
                                String v2p1 = input.next();
                                double v2 = exp(v2p1);
                                me2.set("RelativeV", 1, 1, v1, v2, 1, 1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1c==8)
                            {
                                System.out.print("\nExpression being used: Vp/x = sqrt((Vp/b)^2 + (Vb/a)^2 ~ relative velocity\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Velocity of p relative to b(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Velocity of b relative to a(m/s): ");
                                String v2p1 = input.next();
                                double v2 = exp(v2p1);
                                me2.set("RelativeVS", 1, 1, v1, v2, 1, 1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1c==9)
                            {
                                go1c = false;
                            }
                        }
                        
                    }
                    else if(response1==4)
                    {
                        boolean go1d = true;
                        while(go1d)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Resultant of a Net Force(Superposition)\n2.Find Force on object(Second Law of Motion)\n3.Find Weight\n4.Newton's Third Law of Motion\n5.Find Kinetic Friction Force\n6.Find Static Friction Force\n7.Acceleration W/Radius(Uniform Circular Motion)\n8.Acceleration W/Period(Uniform Circular Motion)\n9.Back\n");
                            System.out.print("Input:");
                            int response1d = input.nextInt();
                            if(response1d==1)
                            {
                                
                                
                                System.out.print("How many forces are there on the object(2 or 3)? ");
                                System.out.print("Input:");
                                int responsed1 = input.nextInt();
                                if (responsed1==2)
                                {
                                    System.out.print("\nExpressions being used: F*cos(theta)-x F*sin(theta)-y R=F1+F2+F3...~ resultant\n");
                                    input.next();
                                    ForceClass me2 = new ForceClass();
                                    System.out.print("Force 1 X Magnitude(N): ");
                                    String fxp1 = input.next();
                                    double fx1= exp(fxp1);
                                    System.out.print("Force 1 Y Magnitude(N): ");
                                    String fyp1 = input.next();
                                    double fy1= exp(fyp1);
                                    System.out.print("Angle at which force 1 is applied(degrees): ");
                                    String theta1p1 = input.next();
                                    double theta1 = exp(theta1p1);
                                    System.out.print("Force 2 X Magnitude(N): ");
                                    String fx2p1 = input.next();
                                    double fx2= exp(fx2p1);
                                    System.out.print("Force 2 Y Magnitude(N): ");
                                    String fy2p1 = input.next();
                                    double fy2= exp(fy2p1);
                                    System.out.print("Angle at which force 2 is applied(degrees): ");
                                    String theta2p1 = input.next();
                                    double theta2 = exp(theta2p1);
                                    me2.set("Resultant2", fx1, fy1, fx2, fy2, 0, 0, theta1, theta2, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if (responsed1==3)
                                {
                                    System.out.print("\nExpressions being used: F*cos(theta)-x F*sin(theta)-y R=F1+F2+F3...~ resultant\n");
                                    input.next();
                                    ForceClass me2 = new ForceClass();
                                    System.out.print("Force 1 X Magnitude(N): ");
                                    String fxp1 = input.next();
                                    double fx1= exp(fxp1);
                                    System.out.print("Force 1 Y Magnitude(N): ");
                                    String fy1p1 = input.next();
                                    double fy1= exp(fy1p1);
                                    System.out.print("Angle at which force 1 is applied(degrees): ");
                                    String theta1p1 = input.next();
                                    double theta1= exp(theta1p1);
                                    System.out.print("Force 2 X Magnitude(N): ");
                                    String fx2p1 = input.next();
                                    double fx2= exp(fx2p1);
                                    System.out.print("Force 2 Y Magnitude(N): ");
                                    String fy2p1 = input.next();
                                    double fy2= exp(fy2p1);
                                    System.out.print("Angle at which force 2 is applied(degrees): ");
                                    String theta2p1 = input.next();
                                    double theta2= exp(theta2p1);
                                    System.out.print("Force 3 X Magnitude(N): ");
                                    String fx3p1 = input.next();
                                    double fx3= exp(fx3p1);
                                    System.out.print("Force 3 Y Magnitude(N): ");
                                    String fy3p1 = input.next();
                                    double fy3= exp(fy3p1);
                                    System.out.print("Angle at which force 3 is applied(degrees): ");
                                    String theta3p1 = input.next();
                                    double theta3= exp(theta3p1);
                                    me2.set("Resultant3", fx1, fy1, fx2, fy2, fx3, fy3, theta1, theta2, theta3, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1d==2)
                            {
                                System.out.print("\nExpression being used: F= mass* acceleration ~ force\n");
                                input.next();
                                ForceClass me2 = new ForceClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Acceleration(m/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                me2.set("Force", 0, 0, 0, 0, 0, 0, 0, 0, 0, m, acc);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1d==3)
                            {
                                System.out.print("\nExpression being used: w = mass * gravitational force ~ weight\n");
                                input.next();
                                ForceClass me2 = new ForceClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Gravitational acceleration(m/s^2): ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                me2.set("Weight", 0, 0, 0, 0, 0, 0, 0, 0, 0, m, g);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1d==4)
                            {
                                System.out.print("\nExpression being used: Fa/b = -Fb/a ~ Newtons Thrid Law\n");
                                input.next();
                                ForceClass me2 = new ForceClass();
                                System.out.print("Force on B from A(N): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                me2.set("NTL", fx1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1d==5)
                            {
                                System.out.print("Find coeffictient(1) or magnitude(2) of the kinetic friction force?\n");
                                System.out.print("Input:");
                                int response1db = input.nextInt();
                                if(response1db==1)
                                {
                                    System.out.print("\nExpression being used: coefficient = Kinetix force / normal ~ coefficient\n");
                                    input.next();
                                    ForceClass me2 = new ForceClass();
                                    System.out.print("Normal Force(N): ");
                                    String fx1p1 = input.next();
                                    double fx1 = exp(fx1p1);
                                    System.out.print("Magnitude of Kinetic Force(N): ");
                                    String fx2p1 = input.next();
                                    double fx2 = exp(fx2p1);
                                    me2.set("CKF", fx1, 0, fx2, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(response1db==2)
                                {
                                    System.out.print("\nExpression being used: force = coefficient * normal ~ force\n");
                                    input.next();
                                    ForceClass me2 = new ForceClass();
                                    System.out.print("Normal Force(N): ");
                                    String fx1p1 = input.next();
                                    double fx1 = exp(fx1p1);
                                    System.out.print("Coefficient of Kinetic Force: ");
                                    String fx2p1 = input.next();
                                    double fx2 = exp(fx2p1);
                                    me2.set("MKF", fx1, 0, fx2, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1d==6)
                            {
                                System.out.print("Find coeffictient(1) or magnitude(2) of the static friction force?\n");
                                System.out.print("Input:");
                                int response1dc = input.nextInt();
                                if(response1dc==1)
                                {
                                    System.out.print("\nExpression being used: coefficient = Static Force / normal ~ coeffiecient\n");
                                    input.next();
                                    ForceClass me2 = new ForceClass();
                                    System.out.print("Normal Force(N): ");
                                    String fx1p1 = input.next();
                                    double fx1 = exp(fx1p1);
                                    System.out.print("Coefficient of Static Force: ");
                                    String fx2p1 = input.next();
                                    double fx2 = exp(fx2p1);
                                    me2.set("CSF", fx1, 0, fx2, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(response1dc==2)
                                {
                                    System.out.print("\nExpression being used: force = coefficient * normal ~ force\n");
                                    input.next();
                                    ForceClass me2 = new ForceClass();
                                    System.out.print("Normal Force(N): ");
                                    String fx1p1 = input.next();
                                    double fx1 = exp(fx1p1);
                                    System.out.print("Coefficient of Static Force");
                                    String fx2p1 = input.next();
                                    double fx2 = exp(fx2p1);
                                    me2.set("MSF", fx1, 0, fx2, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1d==7)
                            {
                                System.out.print("\nExpression being used: a= v^2/R ~ acceleration\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Radius of circle(m): ");
                                String rap1 = input.next();
                                double ra = exp(rap1);
                                me2.set("AccelerationUCM", 1, 1, v1, 1, 1, 1, 1, ra, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1d==8)
                            {
                                System.out.print("\nExpression being used: a= (4*PI^2*Radius)/Period^2 ~ acceleration\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Radius of the circle(m): ");
                                String rap1 = input.next();
                                double ra = exp(rap1);
                                System.out.print("Period(s): ");
                                String pep1 = input.next();
                                double pe = exp(pep1);
                                me2.set("AccelerationUCMP", 1, 1, 1, 1, 1, 1, 1, ra, pe, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1d==9)
                                go1d = false;
                        }
                    }
                    else if(response1==5)
                    {
                        boolean go1e = true;
                        while(go1e)
                        {
                            
                            System.out.print("\nWhich #would you like?\n");
                            System.out.print("1.Find Work at an angle\n2.Find Work in straight line(Dot Product\n3.Find Kinetic Energy\n4.Find Work done by net force\n5.Find Average Power\n6.Find Insta Rate Force does work(Power)\n7.Back\n");
                            System.out.print("Input:");
                            int response1e = input.nextInt();
                            if(response1e==1)
                            {
                                System.out.print("\nExpression being used: W= F*s(distance)*cos(theta) ~ Work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Force(N): ");
                                String f1p1 = input.next();
                                double f1 = exp(f1p1);
                                System.out.print("Distance(m): ");
                                String d1p1 = input.next();
                                double d1 = exp(d1p1);
                                System.out.print("Angle(degrees): ");
                                String th1p1 = input.next();
                                double th1 = exp(th1p1);
                                me2.set("WorkA", f1, 0, d1, 0, 0, th1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1e==2)
                            {
                                System.out.print("\nExpression being used: W= F * s ~ dot product Work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("X-Force(N): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("X-Distance(m): ");
                                String dx1p1 = input.next();
                                double dx1 = exp(dx1p1);
                                System.out.print("Y-Force(N): ");
                                String fy1p1 = input.next();
                                double fy1 = exp(fy1p1);
                                System.out.print("Y-Distance(m): ");
                                String dy1p1 = input.next();
                                double dy1 = exp(dy1p1);
                                me2.set("WorkD", fx1, fy1, dx1, dy1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1e==3)
                            {
                                System.out.print("\nExpression being used: K= 1/2*m*v^2 ~ Kinetic Energy\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Velocity(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                me2.set("KEnergy", 0, 0, 0, 0, 0, 0, 0, 0, m, 0 ,0, v, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1e==4)
                            {
                                System.out.print("\nExpression being used: W = K2 - K1 = DK ~ work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Initial kinetic energy(J): ");
                                String k1p1 = input.next();
                                double k1 = exp(k1p1);
                                System.out.print("Final kinetic energy(J): ");
                                String k2p1 = input.next();
                                double k2 = exp(k2p1);
                                me2.set("WorkK", k1, k2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1e==5)
                            {
                                System.out.print("\nExpression being used: P = W/t ~ Power\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Work(J): ");
                                String wp1 = input.next();
                                double w = exp(wp1);
                                System.out.print("Time period(s): ");
                                String tp1 = input.next();
                                double t = exp(tp1);
                                me2.set("PowerA", w, t, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1e==6)
                            {
                                System.out.print("\nExpression being used: P = F * v ~ Power (Dot Product)\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("X-Force(N): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("X-Velocity(m/s): ");
                                String dx1p1 = input.next();
                                double dx1 = exp(dx1p1);
                                System.out.print("Y-Force(N): ");
                                String fy1p1 = input.next();
                                double fy1 = exp(fy1p1);
                                System.out.print("Y-Velocity(m/s): ");
                                String dy1p1 = input.next();
                                double dy1 = exp(dy1p1);
                                me2.set("PowerD", fx1, fy1, dx1, dy1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1e==7)
                                go1e= false;
                        }
                    }
                    else if(response1==6)
                    {
                        boolean go1f = true;
                        while(go1f)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Work Done on Body by its Weight\n2.Find Gravitational Potential Energy\n3.Find Work Done by gravity during Displacement\n4.Find Total Mechanical Energy\n5.Find Elastic Potential\n6.Find Work done by Elastic Force\n7.Find Total Elastic Energy\n8.Back\n");
                            System.out.print("Input:");
                            int response1f = input.nextInt();
                            if(response1f==1)
                            {
                                System.out.print("\nExpression being used: Wgrav= mgy1 - mgy2 ~ Work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Gravity Acceleration(m/s^2): ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                System.out.print("Intitial Height(m): ");
                                String dx1p1 = input.next();
                                double dx1 = exp(dx1p1);
                                System.out.print("Final Height(m):");
                                String dy1p1 = input.next();
                                double dy1 = exp(dy1p1);
                                me2.set("WorkW", 0, 0, dx1, dy1, 0, 0, 0, 0, m, 0, 0, 0, 0, 0, g, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==2)
                            {
                                System.out.print("\nExpression being used: Ugrav = mgy ~Work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Gravitational Acceleration(m/s^2): ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                System.out.print("Height(m): ");
                                String dy1p1 = input.next();
                                double dy1 = exp(dy1p1);
                                me2.set("EnergyP", 0, 0, 0, dy1, 0, 0, 0, 0, m, 0, 0, 0, 0, 0, g, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==3)
                            {
                                System.out.print("\nExpression being used: Wgrav= Ugrav1 - Ugrav2 ~ Work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Initial Potential Energy(J): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("Final Potential Energy(J): ");
                                String fy1p1 = input.next();
                                double fy1 = exp(fy1p1);
                                me2.set("EnergyPT", fx1, fy1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==4)
                            {
                                System.out.print("\nExpression being used: E= 1/2*m*v^2(K) + m*g*y(U) ~ total meachanical energy\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Velocity(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Gravitational Acceleration(m/s^2): ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                System.out.print("Height(m): ");
                                String dy1p1 = input.next();
                                double dy1 = exp(dy1p1);
                                me2.set("TotME", 0, 0, 0, dy1, 0, 0, 0, 0, m, 0, 0, v, 0, 0, g, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==5)
                            {
                                System.out.print("\nExpression being used: Uel= 1/2*k*x^2 ~ elastic potential energy\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Spring Constant(N/m): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("Distance(m): ");
                                String dx1p1 = input.next();
                                double dx1 = exp(dx1p1);
                                me2.set("EnergyPE", fx1, 0, dx1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==6)
                            {
                                System.out.print("\nExpression being used: Wel= Uel1 - Uel2 ~Work\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Intial Potential Energy(J): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("Final Portential Energy(J): ");
                                String fy1p1 = input.next();
                                double fy1 = exp(fy1p1);
                                me2.set("WorkEPE", fx1, fy1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==7)
                            {
                                System.out.print("\nExpression being used: E= 1/2*m*v^2 + 1/2*k*x^2 ~energy\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Velocity(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Spring Constant(N/m): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("Distance(m): ");
                                String dx1p1 = input.next();
                                double dx1 = exp(dx1p1);
                                me2.set("TotEPE", fx1, 0, dx1, 0, 0, 0, 0, 0, m, 0, 0, v, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1f==8)
                                go1f=false;
                        }
                    }
                    else if(response1==7)
                    {
                        boolean go1g = true;
                        while(go1g)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Momentum\n2.Find Impulse w/Time\n3.Find Impluse w/Momentum\n4.Find Total Momentum\n5.Find Center of Mass(Statistical\n6.Find Total Momentum of a System\n7.Find External Force on a Mass\n8.Back\n");
                            System.out.print("Input:");
                            int response1g = input.nextInt();
                            if(response1g==1)
                            {
                                System.out.print("\nExpression being used: p= m*v ~momentum \n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Speed(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                me2.set("Momentum", 0, 0, 0, 0, 0, 0, 0, 0, m, 0, 0, v, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1g==2)
                            {
                                System.out.print("\nExpression being used: j= F*(t2-t1) ~ Impulse \n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Force(N): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("Initial time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Final time(s); ");
                                String t2p1 = input.next();
                                double t2 = exp(t2p1);
                                me2.set("Impulse", fx1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, t1, t2);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1g==3)
                            {
                                System.out.print("\nExpression being used: j= p2-p1 ~Impulse \n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Initial momentum(kg*m/s): ");
                                String fx1p1 = input.next();
                                double fx1 = exp(fx1p1);
                                System.out.print("Final momentum(kg*m/s): ");
                                String fy1p1 = input.next();
                                double fy1 = exp(fy1p1);
                                me2.set("ImpulseP", fx1, fy1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1g==4)
                            {
                                System.out.print("\nExpression being used: P=(m1*v1)+(m2*v2)+(m3*v3)\n");
                                input.next();
                                System.out.print("\nHow many particles are in the system?(Up to 3)\n");
                                int p = input.nextInt();
                                System.out.print("Input: ");
                                if(p==1)
                                {
                                    System.out.print("\nExpression being used: p= m*v ~momentum \n");
                                    input.next();
                                    WorkClass me2 = new WorkClass();
                                    System.out.print("Mass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Speed(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    me2.set("Mom", 0, 0, 0, 0, 0, 0, 0, 0, m1, 0, 0, v1, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(p==2)
                                {
                                    System.out.print("\nExpression being used: p= m*v ~momentum \n");
                                    input.next();
                                    WorkClass me2 = new WorkClass();
                                    System.out.print("Mass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Speed(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Mass(kg): ");
                                    String m2p1 = input.next();
                                    double m2 = exp(m2p1);
                                    System.out.print("Speed(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    me2.set("Mom2", 0, 0, 0, 0, 0, 0, 0, 0, m1, m2, 0, v1, v2, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(p==3)
                                {
                                    System.out.print("\nExpression being used: p= (m1*v1)+(p2*v2)+(p3*v3) ~momentum \n");
                                    input.next();
                                    WorkClass me2 = new WorkClass();
                                    System.out.print("Mass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Speed(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Mass(kg): ");
                                    String m2p1 = input.next();
                                    double m2 = exp(m2p1);
                                    System.out.print("Speed(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("Mass(kg): ");
                                    String m3p1 = input.next();
                                    double m3 = exp(m3p1);
                                    System.out.print("Speed(m/s): ");
                                    String v3p1 = input.next();
                                    double v3 = exp(v3p1);
                                    me2.set("Mom3", 0, 0, 0, 0, 0, 0, 0, 0, m1, m2, m3, v1, v2, v3, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                
                            }
                            else if(response1g==5)
                            {
                                System.out.print("\nExpression being used: d=(((m1*d1)+(m2*d2)+(m3*d3))/(m1+m2+m3) ~ position \n");
                                input.next();
                                System.out.print("\nHow many particles are in the system?(Up to 3)\n");
                                int p = input.nextInt();
                                System.out.print("Input: ");
                                if(p==1)
                                {
                                    System.out.print("\nExpression being used: r= m1*d1 ~momentum \n");
                                    input.next();
                                    WorkClass me2 = new WorkClass();
                                    System.out.print("Mass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Distance(m): ");
                                    String dx1p1 = input.next();
                                    double dx1 = exp(dx1p1);
                                    me2.set("Mom", 0, 0, dx1, 0, 0, 0, 0, 0, m1, 0, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(p==2)
                                {
                                    System.out.print("\nExpression being used: p= m*v ~momentum \n");
                                    input.next();
                                    WorkClass me2 = new WorkClass();
                                    System.out.print("Mass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Distance(m): ");
                                    String dy1p1 = input.next();
                                    double dy1 = exp(dy1p1);
                                    System.out.print("Mass(kg): ");
                                    String m2p1 = input.next();
                                    double m2 = exp(m2p1);
                                    System.out.print("Distance(m): ");
                                    String dx1p1 = input.next();
                                    double dx1 = exp(dx1p1);
                                    me2.set("Mom2", 0, 0, dx1, dy1, 0, 0, 0, 0, m1, m2, 0, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(p==3)
                                {
                                    System.out.print("\nExpression being used: p= m*v ~momentum \n");
                                    input.next();
                                    WorkClass me2 = new WorkClass();
                                    System.out.print("Mass(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Distance(m): ");
                                    String dx1p1 = input.next();
                                    double dx1 = exp(dx1p1);
                                    System.out.print("Mass(kg): ");
                                    String m2p1 = input.next();
                                    double m2 = exp(m2p1);
                                    System.out.print("Distance(m): ");
                                    String dy1p1 = input.next();
                                    double dy1 = exp(dy1p1);
                                    System.out.print("Mass(kg): ");
                                    String m3p1 = input.next();
                                    double m3 = exp(m3p1);
                                    System.out.print("Distance(m): ");
                                    String dz1p1 = input.next();
                                    double dz1 = exp(dz1p1);
                                    me2.set("Mom3", 0, 0, dx1, dy1, dz1, 0, 0, 0, m1, m2, m3, 0, 0, 0, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1g==6)
                            {
                                System.out.print("\nExpression being used: P= M*v \n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Total Mass(kg): ");
                                String m1p1 = input.next();
                                double m1 = exp(m1p1);
                                System.out.print("Velocity of Center of mass(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                me2.set("TotP", 0, 0, 0, 0, 0, 0, 0, 0, m1, 0, 0, v1, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1g==7)
                            {
                                System.out.print("\nExpression being used: F= M*a ~Force \n");
                                input.next();
                                ForceClass me2 = new ForceClass();
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Acceleration(m/s^2): ");
                                String ap1 = input.next();
                                double a = exp(ap1);
                                me2.set("Force", 0, 0, 0, 0, 0, 0, 0, 0, 0, m, a);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1g==8)
                                go1g = false;
                        }
                    }
                    else if (response1==8)
                    {
                        boolean go1h = true;
                        while(go1h)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Average Angle Velocity\n2.Find Angular Velocity(Only w/Constant Angular Acc)\n3.Find Initial/Final Angle independent of Acceleration\n4.Find Final Angle dependent on Constant ACC\n5.Find Angular Velocity with constant ACC and Angle Difference\n6.Find linear Speed from Angular Speed\n7.Find Tangential Acceleration\n8.Find Centripital Acceleration\n9.Find Moment of Inertia\n10.Find Rotational Kinetic Energy\n11.Find Moment of Inertia on different Parallel-Axis\n12.Back\n");
                            System.out.print("Input:");
                            int response1h = input.nextInt();
                            if(response1h==1)
                            {
                                System.out.print("\nExpression being used:Omega=(theta2-theta1)/(time2-time1)~ angular velocity  \n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Initial angle(radians): ");
                                String th1p1 = input.next();
                                double th1 = exp(th1p1);
                                System.out.print("Final angle(radians): ");
                                String th2p1 = input.next();
                                double th2 = exp(th2p1);
                                System.out.print("Initial time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Final time(s): ");
                                String t2p1 = input.next();
                                double t2 = exp(t2p1);
                                me2.set("AngularVAVG", 1, 1, 1, 1, 1, t1, t2, 1, 1, th1, th2);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==2)
                            {
                                System.out.print("\nExpression being used: Omega= Omega_o + acc*time ~ angular velocity\n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Initial Angular Velocity(rad/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Acceleration(rad/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                System.out.print("Time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Angular velocity when t = " + t1 + " seconds is ");
                                me2.set("AngularVAT", 1, 1, v1, 1, acc, t1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==3)
                            {
                                System.out.print("\nExpression being used: Theta2 - Theta1 = ((Omega_o + Omega)/2) * t\n");
                                input.next();
                                System.out.print("Would you like to find Initial Angle(1) or Final Angle(2)?\n");
                                System.out.print("Input:");
                                int a = input.nextInt();
                                if(a==1)
                                {
                                    VelocityClass me2 = new VelocityClass();
                                    System.out.print("Final Angle(rad): ");
                                    String p2p1 = input.next();
                                    double p2 = exp(p2p1);
                                    System.out.print("Initial Angular Velocity(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Final Angular Velocity(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("AngularP1", 1, p2, v1, v2, 1, t1, 1, 1, 1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(a==2)
                                {
                                    VelocityClass me2 = new VelocityClass();
                                    System.out.print("Initial Angle(rad): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Initial Angular Velocity(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Final Angular Velocity(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("Time(s): ");
                                    String t1p1 = input.next();
                                    double t1 = exp(t1p1);
                                    me2.set("AngularP2", p1, 1, v1, v2, 1, t1, 1, 1, 1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1h==4)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: Theta2 = Theta1 +(Omega_o * t)+(1/2 * Ax * t^2) ~ angle (ONLY with Constant ACC)\n");
                                input.next();
                                System.out.print("Initial Angle(rad): ");
                                String p1p1 = input.next();
                                double p1 = exp(p1p1);
                                System.out.print("Angular Velocity(rad/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Time(s): ");
                                String t1p1 = input.next();
                                double t1 = exp(t1p1);
                                System.out.print("Angular Acceleration(rad/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                me2.set("AngleX", p1, 1, v1, 1, acc, t1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==5)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: Omega = sqrt(Omega_o^2 + 2 * Ax * (Theta2 - Theta1))(ONLY with Constant ACC)\n");
                                input.next();
                                System.out.print("Initial Angle(rad): ");
                                String p1p1 = input.next();
                                double p1 = exp(p1p1);
                                System.out.print("Final Angle(rad): ");
                                String p2p1 = input.next();
                                double p2 = exp(p2p1);
                                System.out.print("Initial Angular Velocity(rad/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Angular Acceleration(rad/s^2): ");
                                String accp1 = input.next();
                                double acc = exp(accp1);
                                me2.set("AngularVWT", p1, p2, v1, 1, acc, 1, 1, 1, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==6)
                            {
                                System.out.print("\nExpression being used: v = r*omega ~ linear speed \n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Radius(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Angular Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                me2.set("LinearFA", 0, 0, v1, 1, 0, 1, 1, r, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==7)
                            {
                                System.out.print("\nExpression being used: Atan= r*alpha  ~ tangential acceleration  \n");
                                input.next();
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("Radius(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Rate of Change of Angular Velocity(rad/s^2): ");
                                String alphp1 = input.next();
                                double alph = exp(alphp1);
                                me2.set("TanA", 0, 0, 0, 1, alph, 1, 1, r, 1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==8)
                            {
                                System.out.print("\nExpression being used: Arad = v^2/r -Eq(1) = Omega^2 * r -Eq(2)\n");
                                input.next();
                                System.out.print("Would you like to use equation 1 or 2?\n");
                                System.out.print("Input:");
                                int ar = input.nextInt();
                                if(ar==1)
                                {
                                    VelocityClass me2 = new VelocityClass();
                                    System.out.print("Radius(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Velocity(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    me2.set("RadA2", 0, 0, v1, 1, 0, 1, 1, r, 1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(ar==2)
                                {
                                    VelocityClass me2 = new VelocityClass();
                                    System.out.print("Radius(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Angular Velocity(rad/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    me2.set("RadA2", 0, 0, v1, 1, 0, 1, 1, r, 1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            else if(response1h==9)
                            {
                                System.out.print("\nExpression being used: I = m1*r_1^2 + m2*r_2^2.... ~ Inertia\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Mass1(kg): ");
                                String m1p1 = input.next();
                                double m1 = exp(m1p1);
                                System.out.print("Radius1(m): ");
                                String r1p1 = input.next();
                                double r1 = exp(r1p1);
                                System.out.print("Mass2(kg): ");
                                String m2p1 = input.next();
                                double m2 = exp(m2p1);
                                System.out.print("Radius2(m): ");
                                String r2p1 = input.next();
                                double r2 = exp(r2p1);
                                me2.set("MOI", 0, 0, r1, r2, 0, 0, 0, 0, m1, m2,0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                                
                            }
                            else if(response1h==10)
                            {
                                System.out.print("\nExpression being used: K = 1/2*I*Omega^2 ~ Rotational Kintetic Energy\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Moment of Inertia(kg*m^2): ");
                                String ip1 = input.next();
                                double i = exp(ip1);
                                System.out.print("Angular Velocity(rad/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                me2.set("RotKE", 0, 0, 0, 0, 0, 0, 0, 0, i, 0, 0, v1, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            else if(response1h==11)
                            {
                                System.out.print("\nExpression to be used: Ip = I + M*d^2 ~ Inertia(parallel axis theorem)\n");
                                input.next();
                                WorkClass me2 = new WorkClass();
                                System.out.print("Moment of Inertia(kg*m^2): ");
                                String ip1 = input.next();
                                double i = exp(ip1);
                                System.out.print("Mass(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Distance(m): ");
                                String dp1 = input.next();
                                double d = exp(dp1);
                                me2.set("InertiaPAT", 0, 0, d, 0, 0, 0, 0, 0, i, m, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            
                            else if(response1h==12)
                                go1h=false;
                        }
                    }
                    else if(response1==9)
                    {
                        boolean go1i = true;
                        while(go1i)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Magnitude of Torque\n2.Find Torque Vector\n3.Find Acceleration (Rotational Analog of Netwon's Second Law)-Rigid Body\n4.Find Kinetic Energy with Both Translation and Rotation\n5.Find Velocity (Condition for Rolling without Slipping)\n6.Find Sum of External Forces\n7.Find Work Done by Constant Torque\n8.Find the Instant Power of Torque\n9.Find Angular Momentum of a Particle\n10.Find Angular Momentum Vector\n11.Back\n");
                            System.out.print("Input:");
                            int response1i = input.nextInt();
                            if(response1i==1)
                            {
                                System.out.print("\nWhich Equation would you like to use?\n");
                                System.out.print("Torque= F*l(1) Torque= r*F*sin(theta)(2) Torque= Ftan*r(3)\n");
                                System.out.print("Input: ");
                                int ia = input.nextInt();
                                if(ia==1)
                                {
                                    TorqueClass me2 = new TorqueClass();
                                    System.out.print("Force(N): ");
                                    String f1p1 = input.next();
                                    double f1 = exp(f1p1);
                                    System.out.print("Lever Arm(m): ");
                                    String marm1p1 = input.next();
                                    double marm1 = exp(marm1p1);
                                    me2.set("Torque1", f1, marm1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(ia==2)
                                {
                                    TorqueClass me2 = new TorqueClass();
                                    System.out.print("Position(m): ");
                                    String marm1p1 = input.next();
                                    double marm1 = exp(marm1p1);
                                    System.out.print("Force(N): ");
                                    String f1p1 = input.next();
                                    double f1 = exp(f1p1);
                                    System.out.print("Angle(degrees): ");
                                    String th1p1 = input.next();
                                    double th1 = exp(th1p1);
                                    me2.set("Torque2", f1, marm1, th1, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(ia==3)
                                {
                                    TorqueClass me2 = new TorqueClass();
                                    System.out.print("Tangential Force(N): ");
                                    String f1p1 = input.next();
                                    double f1 = exp(f1p1);
                                    System.out.print("Position(m): ");
                                    String marm1p1 = input.next();
                                    double marm1 = exp(marm1p1);
                                    me2.set("Torque3", f1, marm1, 0, 0, 0);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            if(response1i==2)
                            {
                                TorqueClass me2 = new TorqueClass();
                                System.out.print("\nExpression being used: torque= r x F ~ torque vector \n");
                                input.next();
                                System.out.print("Magnitude of Position Vector(m): ");
                                String marm1p1 = input.next();
                                double marm1 = exp(marm1p1);
                                System.out.print("Magnitude of Force Vector(N): ");
                                String f1p1 = input.next();
                                double f1 = exp(f1p1);
                                System.out.print("Angle of seperation(degrees): ");
                                String th1p1 = input.next();
                                double th1 = exp(th1p1);
                                me2.set("TorqueV", f1, marm1, th1, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==3)
                            {
                                TorqueClass me2 = new TorqueClass();
                                System.out.print("\nExpression being used: A = torque/I or (2*F/MR) ~ angular acceleration\n");
                                input.next();
                                System.out.print("Force(N): ");
                                String f1p1 = input.next();
                                double f1 = exp(f1p1);
                                System.out.print("Mass(kg): ");
                                String m1p1 = input.next();
                                double m1 = exp(m1p1);
                                System.out.print("Moment arm(m): ");
                                String marm1p1 = input.next();
                                double marm1 = exp(marm1p1);
                                me2.set("AngAcc", f1, marm1, 0, m1, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==4)
                            {
                                EnergyClass me2 = new EnergyClass();
                                System.out.print("\nExpression being used: K= 1/2*M*v^2 + 1/2*I*omega^2 ~ kinetic energy \n");
                                input.next();
                                System.out.print("Mass(kg): ");
                                String m1p1 = input.next();
                                double m1 = exp(m1p1);
                                System.out.print("Velocity(m/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                System.out.print("Radius(m): ");
                                String d1p1 = input.next();
                                double d1 = exp(d1p1);
                                me2.set("KETR", m1, v1, d1);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==5)
                            {
                                VelocityClass me2 = new VelocityClass();
                                System.out.print("\nExpression being used: v = R*Omega ~ velocity \n");
                                input.next();
                                System.out.print("Radius(m): ");
                                String rap1 = input.next();
                                double ra = exp(rap1);
                                System.out.print("Angular Speed(rad/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                me2.set("VRollNSlip", 0, 0, v1, 0, 0, 0, 0, ra, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==6)
                            {
                                System.out.print("\nExpression being used: F= M*a ~Force \n");
                                input.next();
                                ForceClass me2 = new ForceClass();
                                System.out.print("Total Mass(kg): ");
                                String m1p1 = input.next();
                                double m = exp(m1p1);
                                System.out.print("Acceleration of COM(m/s^2): ");
                                String ap1 = input.next();
                                double a = exp(ap1);
                                me2.set("Force", 0, 0, 0, 0, 0, 0, 0, 0, 0, m, a);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==7)
                            {
                                WorkClass me2 = new WorkClass();
                                System.out.print("\nExpression being used: torque(thetaF - thetaI) ~ work\n");
                                input.next();
                                System.out.print("Initial Angle(rad): ");
                                String th1p1 = input.next();
                                double th1 = exp(th1p1);
                                System.out.print("Final Angle(rad): ");
                                String th2p1 = input.next();
                                double th2 = exp(th2p1);
                                System.out.print("Torque(N*m): ");
                                String f1p1 = input.next();
                                double f1 = exp(f1p1);
                                me2.set("WorkCT", f1, 0, 0, 0, 0, th1, th2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==8)
                            {
                                TorqueClass me2 = new TorqueClass();
                                System.out.print("\nExpression being used: P = torque*omega ~ power \n");
                                input.next();
                                System.out.print("Torque(N*m): ");
                                String f1p1 = input.next();
                                double f1 = exp(f1p1);
                                System.out.print("Angular Velocity(rad/s): ");
                                String v1p1 = input.next();
                                double v1 = exp(v1p1);
                                me2.set("TorqueP", f1, 0, 0, 0, v1);
                                me2.writeOutput();
                                input.next();
                            }
                            if(response1i==9)
                            {
                                System.out.print("\nWhich expression would you like to use? L= r x p(1) or L= r x (m*V)(2) ~ angular momentum \n");
                                int am = input.nextInt();
                                input.next();
                                if(am==1)
                                {
                                    TorqueClass me2 = new TorqueClass();
                                    System.out.print("Radius(m): ");
                                    String marmp1 = input.next();
                                    double marm = exp(marmp1);
                                    System.out.print("Momentum(kg*m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    me2.set("AngularM1", 0, marm, 0, 0, v1);
                                    me2.writeOutput();
                                    input.next();
                                }
                                else if(am==2)
                                {
                                    TorqueClass me2 = new TorqueClass();
                                    System.out.print("Radius(m): ");
                                    String marmp1 = input.next();
                                    double marm = exp(marmp1);
                                    System.out.print("Mass(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Velocity(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    me2.set("AngularM2", 0, marm, 0, m, v1);
                                    me2.writeOutput();
                                    input.next();
                                }
                            }
                            if(response1i==10)
                            {
                                TorqueClass me2 = new TorqueClass();
                                System.out.print("\nExpression being used:L = omega*I ~ angular momentum\n");
                                input.next();
                                System.out.print("Inertia(kg*m^2): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Angular Velocity(rad/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                me2.set("TorqueP", 0, 0, 0, m, v);
                                me2.writeOutput();
                                input.next();
                                
                            }
                            if(response1i==11)
                                go1i=false;
                        }
                    }
                    else if(response1==10)
                    {
                        boolean go1j = true;
                        while(go1j)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Tensile Stress\n2.Find Tensile Strain\n3.Find Find Young's Modulus\n4.Find Pressure in a Fluid\n5.Find Bulk Modulus\n6.Find Shear Stress\n7.Find Shear Strain\n8.Find Shear Modulus\n9.Back\n");
                            System.out.print("Input:");
                            int response1j = input.nextInt();
                            if(response1j==1)
                            {
                                System.out.print("\nExpression being used: T Stress = F/A ~ tensile stress\n");
                                input.next();
                                System.out.print("\nMagnitude of Force(N):\nMass(kg): ");
                                String m1p1 = input.next();
                                double m1 = exp(m1p1);
                                System.out.print("Gravitational Acceleration(m/s^2): ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                System.out.print("Cross Sectional area(m^2): ");
                                String dp1 = input.next();
                                double d = exp(dp1);
                                System.out.print("\nThe tensile stress is " + (m1*g/d) + " Pa\n");
                                input.next();
                            }
                            else if(response1j==2)
                            {
                                System.out.print("\nExpression being used: T Strain = Tensile Stress/Young's M ~  tensile strain\n");
                                input.next();
                                System.out.print("\nType of Material:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");
                                System.out.print("Input:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 7*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 7*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 9*10^10\n");
                                    System.out.print("\nTensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 9*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 11*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 11*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 6*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 6*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 21*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 21*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 1.6*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 1.6*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 21*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 21*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): 20*10^10\n");
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    double Y = 20*Math.pow(10,10);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                                else if(mt==9)
                                {
                                    System.out.print("\nYoung's Modulus(Pa): \n");
                                    String Yp1 = input.next();
                                    double Y = exp(Yp1);
                                    System.out.print("Tensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    System.out.print("\nThe tensile strain is " + (ts/Y) + "\n");
                                    input.next();
                                }
                            }
                            else if(response1j==3)
                            {
                                System.out.print("\nWould you like to find Young's Modulus in terms of:\nTensile Stress and Tensile Strain(1)\nMagnitude of Force, Orginal Length, Cross Sectional Area and Change in Length(2)\nInput:");
                                int ym = input.nextInt();
                                if(ym==1)
                                {
                                    System.out.print("\nExpression being used: Y = Tensile stress/Tensile strain ~ young's modulus\n");
                                    input.next();
                                    System.out.print("\nTensile Stress(Pa): ");
                                    String tsp1 = input.next();
                                    double ts = exp(tsp1);
                                    System.out.print("Tensile Strain: ");
                                    String tsrp1 = input.next();
                                    double tsr = exp(tsrp1);
                                    System.out.print("\nThe young's modulus is " + (ts/tsr) + " Pa\n");
                                    input.next();
                                }
                                else if(ym==2)
                                {
                                    System.out.print("\nExpression being used: Y = F*l_0/(A*DL) ~ young's modulus\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Force(N): ");
                                    String f1p1 = input.next();
                                    double f = exp(f1p1);
                                    System.out.print("Original Length(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Cross-Sectional Area(m^2): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Change in Length(m): ");
                                    String dlp1 = input.next();
                                    double dl = exp(dlp1);
                                    System.out.print("\nThe young's modulus is " + ((f*l)/(A*dl)) + " Pa\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                                
                            }
                            else if(response1j==4)
                            {
                                System.out.print("\nWould you like to find:\nPressure in a Fluid(1)\nForce per unit area in Fluid(2)\nCross Sectional Area of Fluid(3)\nInput:");
                                int pf = input.nextInt();
                                if(pf==1)
                                {
                                    System.out.print("\nExpression being used: p = F/A ~ pressure in a fluid\n");
                                    input.next();
                                    System.out.print("\nForce per unit area(N/m^2): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Cross sectional area(m^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe pressure in the fluid is " + (f/a) + " Pa or " + (f/a)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (f/a)*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else if(pf==2)
                                {
                                    System.out.print("\nExpression being used: F = A*p ~ force per unit area\n");
                                    input.next();
                                    System.out.print("\nCross sectional area(m^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("Pressure in Fluid(Pa): ");
                                    String pp1 = input.next();
                                    double p = exp(pp1);
                                    System.out.print("\nThe force per unit area is " + (a*p) + " N\n");
                                    input.next();
                                }
                                else if(pf==3)
                                {
                                    System.out.print("\nExpression being used: A = F/p ~ cross-sectional area\n");
                                    input.next();
                                    System.out.print("\nPressure in Fluid(Pa): ");
                                    String pp1 = input.next();
                                    double p = exp(pp1);
                                    System.out.print("Force per Unit Area(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe cross sectional area is " + (f/p) + " m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1j==5)
                            {
                                System.out.print("\nWould you like to find the Bulk Modulus in terms of:\nBulk Stress and Bulk Strain(1)\nChange in Pressure,Original Volume and Change in Volume(2)\nInput:");
                                int bm = input.nextInt();
                                if(bm==1)
                                {
                                    System.out.print("\nExpression being used: B = Bulk Stress/Bulk Strain ~ bulk modulus\n");
                                    input.next();
                                    System.out.print("Bulk Stress(Pa): ");
                                    String btp1 = input.next();
                                    double  bt = exp(btp1);
                                    System.out.print("Bulk Strain: " );
                                    String bstp1 = input.next();
                                    double bst = exp(bstp1);
                                    System.out.print("\nThe bulk modulus is " + (bt/bst) + " Pa or" + (bt/bst)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (bt/bst)*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else if(bm==2)
                                {
                                    System.out.print("\nWould you like to find:\nBulk Modulus(1)\nChange in Volume(2)\nOriginal Volume(3)\nChange in Pressure(4)\nInput:");
                                    int bmo = input.nextInt();
                                    if(bmo==1)
                                    {
                                        System.out.print("\nExpression being used: B = DP/(DV/V_0) ~ bulk modulus\n");
                                        input.next();
                                        System.out.print("Change in Pressure(Pa): ");
                                        String dpp1 = input.next();
                                        double dp = exp(dpp1);
                                        System.out.print("Original Volume(m^3): " );
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("Change in Volume(m^3): ");
                                        String dvp1 = input.next();
                                        double dv = exp(dvp1);
                                        System.out.print("\nThe bulk modulus is " + (dp/(dv/v)) + " Pa or" + (dp/(dv/v))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dp/(dv/v))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(bmo==2)
                                    {
                                        System.out.print("\nType of Material:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");;
                                        System.out.print("Input:");
                                        int mt = input.nextInt();
                                        if(mt==1)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 7.5*10^10 ");
                                            double B = 7.5*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==2)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 6*10^10 ");
                                            double B = 6*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==3)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 14*10^10");
                                            double B = 14*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==4)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 5*10^10 ");
                                            double B = 5*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==5)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                            double B = 16*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==6)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 4.1*10^10 ");
                                            double B = 4.1*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==7)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 17*10^10");
                                            double B = 17*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==8)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                            double B = 16*Math.pow(10,10);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==9)
                                        {
                                            System.out.print("\nExpression being used: DV = V_0*DP/B ~ change in volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Original Volume(m^3): " );
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Bulk Modulus(Pa): ");
                                            String Bp1 = input.next();
                                            double B = exp(Bp1);
                                            System.out.print("\nThe change in volume is " + (v*dp/B) + " m^3\n");
                                            input.next();
                                        }
                                    }
                                    else if(bmo==3)
                                    {
                                        System.out.print("\nType of Material:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");;
                                        System.out.print("Input:");
                                        int mt = input.nextInt();
                                        if(mt==1)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("\nChange in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 7.5*10^10 ");
                                            double B = 7.5*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==2)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 6*10^10 ");
                                            double B = 6*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==3)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 14*10^10");
                                            double B = 14*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==4)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 5*10^10 ");
                                            double B = 5*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==5)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 =input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                            double B = 16*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==6)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 4.1*10^10 ");
                                            double B = 4.1*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==7)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 17*10^10");
                                            double B = 17*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==8)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                            double B = 16*Math.pow(10,10);
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                        else if(mt==9)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Change in Pressure(Pa): ");
                                            String dpp1 = input.next();
                                            double dp = exp(dpp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): ");
                                            double B = input.nextDouble();;
                                            System.out.print("\nThe original volume is " + (dv*B/dp) + " m^3\n");
                                            input.next();
                                        }
                                    }
                                    else if(bmo==4)
                                    {
                                        System.out.print("\nType of Material:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");;
                                        System.out.print("Input:");
                                        int mt = input.nextInt();
                                        if(mt==1)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("\nOriginal Volume(m^3): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 7.5*10^10 ");
                                            double B = 7.5*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==2)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("Original Volume(m^3): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 6*10^10 ");
                                            double B = 6*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==3)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("Original Volume): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 14*10^10");
                                            double B = 14*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==4)
                                        {
                                            System.out.print("\nExpression being used: V = DV*B/DP ~ original volume\n");
                                            input.next();
                                            System.out.print("Original Volume: ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 5*10^10 ");
                                            double B = 5*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==5)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("Original Volume(m^3): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                            double B = 16*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==6)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");;
                                            input.next();
                                            System.out.print("Original Volume(m^3): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 4.1*10^10 ");
                                            double B = 4.1*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==7)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("Original Volume(m^3): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 17*10^10");
                                            double B = 17*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==8)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("Original Volume(m^3): ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                            double B = 16*Math.pow(10,10);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                        else if(mt==9)
                                        {
                                            System.out.print("\nExpression being used: DP = DV*B/V  ~ change in pressure\n");
                                            input.next();
                                            System.out.print("Original Volume: ");
                                            String vp1 = input.next();
                                            double v = exp(vp1);
                                            System.out.print("Change in Volume(m^3): ");
                                            String dvp1 = input.next();
                                            double dv = exp(dvp1);
                                            System.out.print("Bulk Modulus(Pa): ");
                                            String Bp1 = input.next();
                                            double B = exp(Bp1);
                                            System.out.print("\nThe change in pressure is " + (dv*B/v) + " Pa or" + (dv*B/v)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (dv*B/v)*9.86*1/Math.pow(10,6) + " atm\n");
                                            input.next();
                                        }
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1j==6)
                            {
                                System.out.print("\nWould you like to find the Shear Stress in terms if: Shear's Modulus and Shear Strain(1)\nTangent Force and Area(2)\nInput:");
                                int ssr = input.nextInt();
                                if(ssr==1)
                                {
                                    System.out.print("\nType of Material:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");
                                    System.out.print("Input:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 3.5*10^10 ");
                                        double sm = 3.5*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 4.4*10^10 ");
                                        double sm = 4.4*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 7.7*10^10 ");
                                        double sm = 7.7*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): .6*10^10 ");
                                        double sm = .6*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 7.8*10^10 ");
                                        double sm = 7.8*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 7.5*10^10 ");
                                        double sm = 7.5*Math.pow(10,10);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: S Stress = Shear Modulus*Shear Strain ~ shear stress\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): ");
                                        String smp1 = input.next();
                                        double sm = exp(smp1);
                                        System.out.print("Shear Strain: ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear stress is " + (sm*ss) + " Pa or" + (sm*ss)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss*sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(ssr==2)
                                {
                                    System.out.print("\nExpression being used: S Stress = F/A ~ shear stress\n");
                                    input.next();
                                    System.out.print("\nTangent Force(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Area(m^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe shear stress is " + (f/a) + " Pa or" + (f/a)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (f/a)*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1j==7)
                            {
                                System.out.print("\nWould you like to find the shear strain in terms of: Shear's Modulus and Shear Stress(1)\nLength of Shift and Length of Side Shifted(2)\nInput:");
                                int shm = input.nextInt();
                                if(shm==1)
                                {
                                    System.out.print("\nType of Material:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");
                                    System.out.print("Input:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): 2.5*10^10 ");
                                        double sm = 2.5*Math.pow(10,10);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: S Strain = Shear Stress/Shear Modulus*Shear ~ shear strain\n");
                                        input.next();
                                        System.out.print("\nShear Modulus(Pa): ");
                                        String smp1 = input.next();
                                        double sm = exp(smp1);
                                        System.out.print("Shear Stress(Pa): ");
                                        String ssp1 = input.next();
                                        double ss = exp(ssp1);
                                        System.out.print("\nThe shear strain is " + (ss/sm) + "\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(shm==2)
                                {
                                    System.out.print("\nExpression being used: S Strain = x/h ~ shear strain\n");
                                    input.next();
                                    System.out.print("Distance of Shift(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Length of Side Shifted(m): ");
                                    String hp1 = input.next();
                                    double h = exp(hp1);
                                    System.out.print("\nThe shear strain is " + (x/h) + "\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1j==8)
                            {
                                System.out.print("\nWould you like to find the Shear Modulus in terms of: Shear Stress and Shear Strain(1)\nMagnitude of Tangent Force, Area, Distance of Shift and Length of Side Shifted(2)\nInput:");
                                int shm = input.nextInt();
                                if(shm==1)
                                {
                                    System.out.print("\nExpression being used: S Modulus = Shear Stress/Shear Modulus*Shear ~ shear modulus\n");
                                    input.next();
                                    System.out.print("\nShear Strain: ");
                                    String smp1 = input.next();
                                    double sm = exp(smp1);
                                    System.out.print("Shear Stress(Pa): ");
                                    String ssp1 = input.next();
                                    double ss = exp(ssp1);
                                    System.out.print("\nThe shear modulus is " + (ss/sm) + "Pa or" + (ss/sm)*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (ss/sm)*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else if(shm==2)
                                {
                                    System.out.print("\nExpression being used: S Modulus = (f/a)/(x/h) ~ shear modulus\n");
                                    input.next();
                                    System.out.print("\nMagnitude of Tangent Force(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Surface Area(m^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("Distance of Shift(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Length of Side Shifted(m): ");
                                    String hp1 = input.next();
                                    double h = exp(hp1);
                                    System.out.print("\nThe shear modulus is " + ((f/a)/(x/h)) + "Pa or" + ((f/a)/(x/h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + ((f/a)/(x/h))*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1j==9)
                                go1j=false;
                        }
                    }
                    else if(response1==11)//go1k
                    {
                        boolean go1k = true;
                        while(go1k)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Use Definition of Density\n2.Find Pressure in Fluid of Uniform Density\n3.Find Force Applied to Enclosed Fluid(Pascal Law)\n4.Use Continuity Equation for Incompressible Fluid\n5.Find Volume Flow Rate\n6.Find Change in Pressure (Bernoulli Equation for Incompressible Fluid)\n7.Back\n");
                            System.out.print("Input:");
                            int response1k = input.nextInt();
                            if(response1k==1)
                            {
                                System.out.print("\nWould you like to find:\nDensity(1)\nMass(2)\nVolume(3)\nInput:");
                                int de = input.nextInt();
                                if(de==1)
                                {
                                    System.out.print("\nExpression being used: rho = m/V ~ density\n");
                                    input.next();
                                    System.out.print("\nMass(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Volume(m^3): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe density is " + (m/V) + " kg/m^3\n");
                                    input.nextDouble();
                                }
                                else if(de==2)
                                {
                                    System.out.print("\nExpression being used: m = rho* ~ mass\n");
                                    input.next();
                                    System.out.print("Density(kg/m^3: ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Volume(m^3): ");
                                    String Vp1 = input.next();
                                    double V = exp(Vp1);
                                    System.out.print("\nThe density is " + (V*rho) + " kg\n");
                                    input.nextDouble();
                                }
                                else if(de==3)
                                {
                                    System.out.print("\nExpression being used: V = m/d ~ volume\n");
                                    input.next();
                                    System.out.print("Mass(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Density(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe volume is " + (m/rho) + " m^3\n");
                                    input.nextDouble();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1k==2)
                            {
                                System.out.print("\nWould you like to find the pressure in terms of:\nDensity, Gravitational Acceleration, Initial Elevation and Final Elevation(1)\nInitial Pressure, Density, Depth, Gravitiational Acceleration(2)\nInput:");
                                int ud = input.nextInt();
                                if(ud==1)
                                {
                                    System.out.print("\nSubstance with Density:\nAir(1)\nEthanol(2)\nBenzene(3)\nIce(4)\nWater(5)\nSeawater(6)\nBlood(7)\nGlycerine(8)\nConcrete(9)\nAluminum(10\nIron or Steel(11)\nBrass(12)\nCopper(13)\nSilver(14)\nLead(15)\nMercury(16)\nGold(17)\nPlatinum(18)\nWhite Dwarf Star(19)\nNeutron Star(20)\nOther(21)\nInput:");
                                    int sd = input.nextInt();
                                    if(sd==1)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.2 \n");
                                        double rho = 1.2;
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==2)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): .81*10^3 \n");
                                        double rho = .81*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==3)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): .90*10^3 \n");
                                        double rho = .90*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==4)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): .92*10^3 \n");
                                        double rho = .92*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==5)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1*10^3 \n");
                                        double rho = 1*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==6)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.03*10^3 \n");
                                        double rho = 1.03*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==7)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.06*10^3 \n");
                                        double rho = 1.06*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==8)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.26*10^3 \n");
                                        double rho = 1.26*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==9)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        double g = input.nextDouble();
                                        System.out.print("Density(kg/m^3): 2*10^3 \n");
                                        double rho = 2*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        double y1 = input.nextDouble();
                                        System.out.print("Final Elevation(m): ");
                                        double y2 = input.nextDouble();
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==10)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 2.7*10^3 \n");
                                        double rho = 2.7*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==11)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 7.8*10^3 \n");
                                        double rho = 7.8*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==12)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 =input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 8.6*10^3 \n");
                                        double rho = 8.6*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==13)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 8.9*10^3 \n");
                                        double rho = 8.9*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==14)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 10.5*10^3 \n");
                                        double rho = 10.5*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==15)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 11.3*10^3 \n");
                                        double rho = 11.3*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==16)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 13.6*10^3 \n");
                                        double rho = 13.6*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==17)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 19.3*10^3 \n");
                                        double rho = 19.3*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==18)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 21.4*10^3 \n");
                                        double rho = 21.4*Math.pow(10,3);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==19)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 10^10\n");
                                        double rho = Math.pow(10,10);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==20)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 10^18\n");
                                        double rho = Math.pow(10,18);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==21)
                                    {
                                        System.out.print("\nExpression being used: p2 - p1 = -rho*g*(y2-y1) ~ change in pressure\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): ");
                                        String rhop1 = input.next();
                                        double rho = exp(rhop1);
                                        System.out.print("Initial Elevation(m): ");
                                        String y1p1 = input.next();
                                        double y1 = exp(y1p1);
                                        System.out.print("Final Elevation(m): ");
                                        String y2p1 = input.next();
                                        double y2 = exp(y2p1);
                                        System.out.print("\nThe change in pressure is " + (-rho*g*(y2-y1)) + " Pa or " + (-rho*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (-rho*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(ud==2)
                                {
                                    System.out.print("\nSubstance with Density:\nAir(1)\nEthanol(2)\nBenzene(3)\nIce(4)\nWater(5)\nSeawater(6)\nBlood(7)\nGlycerine(8)\nConcrete(9)\nAluminum(10\nIron or Steel(11)\nBrass(12)\nCopper(13)\nSilver(14)\nLead(15)\nMercury(16)\nGold(17)\nPlatinum(18)\nWhite Dwarf Star(19)\nNeutron Star(20)\nOther(21)\nInput:");
                                    int sd = input.nextInt();
                                    if(sd==1)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.2 \n");
                                        double rho = 1.2;
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==2)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): .81*10^3 \n");
                                        double rho = .81*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==3)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): .90*10^3 \n");
                                        double rho = .90*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==4)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): .92*10^3 \n");
                                        double rho = .92*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==5)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1*10^3 \n");
                                        double rho = 1*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==6)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.03*10^3 \n");
                                        double rho = 1.03*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==7)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.06*10^3 \n");
                                        double rho = 1.06*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==8)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 1.26*10^3 \n");
                                        double rho = 1.26*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==9)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 2*10^3 \n");
                                        double rho = 2*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==10)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 2.7*10^3 \n");
                                        double rho = 2.7*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==11)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 7.8*10^3 \n");
                                        double rho = 7.8*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==12)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 8.6*10^3 \n");
                                        double rho = 8.6*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==13)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 8.9*10^3 \n");
                                        double rho = 8.9*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==14)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 10.5*10^3 \n");
                                        double rho = 10.5*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==15)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 11.3*10^3 \n");
                                        double rho = 11.3*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==16)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 13.6*10^3 \n");
                                        double rho = 13.6*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==17)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 19.3*10^3 \n");
                                        double rho = 19.3*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==18)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 21.4*10^3 \n");
                                        double rho = 21.4*Math.pow(10,3);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==19)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 10^10\n");
                                        double rho = Math.pow(10,10);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==20)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nGravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("Density(kg/m^3): 10^18\n");
                                        double rho = Math.pow(10,18);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Initial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*g*h)) + " Pa or " + (p +(rho*g*h))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*g*h))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else if(sd==21)
                                    {
                                        System.out.print("\nExpression being used: p = p_0 + rh0*g*h ~  pressure at depth\n");
                                        input.next();
                                        System.out.print("\nInitial Pressure(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Density(kg/m^3): ");
                                        String rhop1 = input.next();
                                        double rho = exp(rhop1);
                                        System.out.print("Depth(m): ");
                                        String hp1 = input.next();
                                        double h = exp(hp1);
                                        System.out.print("Gravitational Acceleration(m/s^2): ");
                                        String gp1 = input.next();
                                        double g = exp(gp1);
                                        System.out.print("\nThe pressure is " + (p +(rho*h*g)) + " Pa or " + (p +(rho*h*g))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p +(rho*h*g))*9.86*1/Math.pow(10,6) + " atm\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1k==3)
                            {
                                System.out.print("\nWould you like to find:\nInitial Force Applied(1)\nFinal Force Produced(2)\nCross-sectional area of Initial Force(3)\nCross-Sectional area of Final Force(4)\nInput:");
                                int pl = input.nextInt();
                                if(pl==1)
                                {
                                    System.out.print("\nExpression being used: F1 = F2*Al/A2 ~ initial force\n");
                                    input.next();
                                    System.out.print("\nFinal Force Produced(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Cross-Sectional Area of Initial Force(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Cross-Sectional Area of Final Force(m^2): ");
                                    String a2p1 = input.next();
                                    double a2 = exp(a2p1);
                                    System.out.print("\nThe initial force is " + ((f*a1)/a2) + " N\n");
                                    input.next();
                                }
                                else if(pl==2)
                                {
                                    System.out.print("\nExpression being used: F2 = F1*A2/A1 ~ final force\n");
                                    input.next();
                                    System.out.print("\nInitial Force Applied(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Cross-Sectional Area of Initial Force(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("Cross-Sectional Area of Final Force(m^2): ");
                                    String a2p1 = input.next();
                                    double a2 = exp(a2p1);
                                    System.out.print("\nThe initial force is " + ((f*a2)/a1) + " N\n");
                                    input.next();
                                }
                                else if(pl==3)
                                {
                                    System.out.print("\nExpression being used: A1 = A2*F1/F2 ~ cross-sectional area of initial force\n");
                                    input.next();
                                    System.out.print("\nIntial Force Applied(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nFinal Force Produced(N): ");
                                    String f1p1 = input.next();
                                    double f1 = exp(f1p1);
                                    System.out.print("Cross-Sectional Area of Final Force(m^2): ");
                                    String a2p1 = input.next();
                                    double a2 = exp(a2p1);
                                    System.out.print("\nThe cross-sectional area is " + ((a2*f)/f1) + " m^2\n");
                                    input.next();
                                }
                                else if(pl==4)
                                {
                                    System.out.print("\nExpression being used: A2 = A1*F2/F1 ~ cross-sectional area of final force\n");
                                    input.next();
                                    System.out.print("\nInitial Force Applied(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nFinal Force Produced(N): ");
                                    String f1p1 = input.next();
                                    double f1 = exp(f1p1);
                                    System.out.print("Cross-Sectional Area of Initial Force(m^2): ");
                                    String a1p1 = input.next();
                                    double a1 = exp(a1p1);
                                    System.out.print("\nThe cross-sectional area is " + ((f1*a1)/f) + " m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1k==4)
                            {
                                System.out.print("\nWould you like to use the Continuity Equation for an:\nIncompressible Fluid(Constant Density)(1)\nCompressible Fluid(2)\nInput:");
                                int ce = input.nextInt();
                                if(ce==1)
                                {
                                    System.out.print("\nWould you like to find:\nFlow Rate into Section(1)\nFlow Rate out of Section(2)\nCross-Sectional Area of Input Section(3)\nCross-Sectional Area of Output Section(4)\nInput:");
                                    int ci = input.nextInt();
                                    if(ci==1)
                                    {
                                        System.out.print("\nExpression being used: v1 = A2*v2/A1 ~ flow rate in\n");
                                        input.next();
                                        System.out.print("\nFlow Rate Out(m/s): ");
                                        String v2p1 = input.next();
                                        double v2 = exp(v2p1);
                                        System.out.print("Cross-Sectional Area of Input(m^2): ");
                                        String a1p1 = input.next();
                                        double a1 = exp(a1p1);
                                        System.out.print("Cross-Sectional Area of Output(m^2): ");
                                        String a2p1 = input.next();
                                        double a2 = exp(a2p1);
                                        System.out.print("\nThe flow rate in is " + ((a2*v2)/a1) + " m/s\n");
                                        input.next();
                                    }
                                    else if(ci==2)
                                    {
                                        System.out.print("\nExpression being used: v2 = A1*v1/A2 ~ flow rate out\n");
                                        input.next();
                                        System.out.print("\nFlow Rate In(m/s): ");
                                        String v1p1 = input.next();
                                        double v1 = exp(v1p1);
                                        System.out.print("Cross-Sectional Area of Input(m^2): ");
                                        String a1p1 = input.next();
                                        double a1 = exp(a1p1);
                                        System.out.print("Cross-Sectional Area of Output(m^2): ");
                                        String a2p1 = input.next();
                                        double a2 = exp(a2p1);
                                        System.out.print("\nThe flow rate in is " + ((a1*v1)/a2) + " m/s\n");
                                        input.next();
                                    }
                                    else if(ci==3)
                                    {
                                        System.out.print("\nExpression being used: A1 = A2*v2/v1 ~ cross-sectional area in\n");
                                        input.next();
                                        System.out.print("\nFlow Rate In(m/s): ");
                                        String v1p1 = input.next();
                                        double v1 = exp(v1p1);
                                        System.out.print("Flow Rate Out(m/s): ");
                                        String v2p1 = input.next();
                                        double v2 = exp(v2p1);
                                        System.out.print("Cross-Sectional Area of Output(m^2): ");
                                        String a2p1 = input.next();
                                        double a2 = exp(a2p1);
                                        System.out.print("\nThe cross-sectional area in is " + ((a2*v2)/v1) + " m^2\n");
                                        input.next();
                                    }
                                    else if(ci==4)
                                    {
                                        System.out.print("\nExpression being used: A2 = A1*v1/v2 ~ cross-sectional area out\n");
                                        input.next();
                                        System.out.print("\nFlow Rate In(m/s): ");
                                        String v1p1 = input.next();
                                        double v1 = exp(v1p1);
                                        System.out.print("Flow Rate Out(m/s): ");
                                        String v2p1 = input.next();
                                        double v2 = exp(v2p1);
                                        System.out.print("Cross-Sectional Area of Input(m^2): ");
                                        String a1p1 = input.next();
                                        double a1 = exp(a1p1);
                                        System.out.print("\nThe flow rate in is " + ((a1*v1)/v2) + " m/s\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(ce==2)
                                {
                                    System.out.print("\nWould you like to find:\nFlow Rate In(1)\nFlow Rate Out(2)\nInput:");
                                    int fr = input.nextInt();
                                    if(fr==1)
                                    {
                                        System.out.print("\nExpression being used: v1 = (rho2*A2*v2)/(A1*rho1) ~ flow rate in\n");
                                        input.next();
                                        System.out.print("\nDensity at Input(kg/m^3): ");
                                        String r1p1 = input.next();
                                        double r1 = exp(r1p1);
                                        System.out.print("Density at Output(kg/m^3): ");
                                        String r2p1 = input.next();
                                        double r2 = exp(r2p1);
                                        System.out.print("Cross-Sectional Area of Input(m^2): ");
                                        String a1p1 = input.next();
                                        double a1 = exp(a1p1);
                                        System.out.print("Cross-Sectional Area of Output(m^2): ");
                                        String a2p1 = input.next();
                                        double a2 = exp(a2p1);
                                        System.out.print("Flow Rate Out(m/s): ");
                                        String v2p1 = input.next();
                                        double v2 = exp(v2p1);
                                        System.out.print("\nThe flow rate in is " + ((r2*a2*v2)/(a1*r1)) + " m/s\n");
                                        input.next();
                                    }
                                    else if(fr==2)
                                    {
                                        System.out.print("\nExpression being used: v1 = (rho2*A2*v2)/(A1*rho1) ~ flow rate out\n");
                                        input.next();
                                        System.out.print("\nDensity at Input(kg/m^3): ");
                                        String r1p1 = input.next();
                                        double r1 = exp(r1p1);
                                        System.out.print("Density at Output(kg/m^3): ");
                                        String r2p1 = input.next();
                                        double r2 = exp(r2p1);
                                        System.out.print("Cross-Sectional Area of Input(m^2): ");
                                        String a1p1 =input.next();
                                        double a1 = exp(a1p1);
                                        System.out.print("Cross-Sectional Area of Output(m^2): ");
                                        String a2p1 = input.next();
                                        double a2 = exp(a2p1);
                                        System.out.print("Flow Rate In(m/s): ");
                                        String v1p1 = input.next();
                                        double v1 = exp(v1p1);
                                        System.out.print("\nThe flow rate out is " + ((r1*a1*v1)/(a2*r2)) + " m/s\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1k==5)
                            {
                                System.out.print("\nWould you like to find:\nVolume Flow Rate(1)\nCross-Sectional Area(2)\nFlow Rate(3)\nInput:");
                                int vfr = input.nextInt();
                                if(vfr==1)
                                {
                                    System.out.print("\nExpression being used: dV/dt = Av ~ volume flow rate\n");
                                    input.next();
                                    System.out.print("\nCross Sectional Area of Section(m^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("Flow Rate at Section(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("The volume flow rate is " + (a*v) + " m^3/s\n");
                                    input.next();
                                }
                                else if(vfr==2)
                                {
                                    System.out.print("\nExpression being used: A = (dV/dt)/v ~ cross-sectional area of section\n");
                                    input.next();
                                    System.out.print("\nVolume Flow Rate(m^3/s): ");
                                    String avp1 = input.next();
                                    double av = exp(avp1);
                                    System.out.print("Flow Rate at Section(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe cross-sectional area of the section is " + (av/v) + " m^2\n");
                                    input.next();
                                }
                                else if(vfr==3)
                                {
                                    System.out.print("\nExpression being used: v = (dV/dt)/A ~ flow rate at section\n");
                                    input.next();
                                    System.out.print("\nVolume Flow Rate(m^3/s): ");
                                    String avp1 = input.next();
                                    double av = exp(avp1);
                                    System.out.print("Cross-Sectional Area of Section(m^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe flow rate at the section is " + (av/a) + " m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1k==6)
                            {
                                System.out.print("\nWould you like to find:\nChange in Pressure(1)\nPressure at High Elevation(2)\nPressure at Low Elevation(3)\nInput:");
                                int be = input.nextInt();
                                if(be==1)
                                {
                                    System.out.print("\nExpression being used: p1-p2 = 1/2*rho*(v2^2-v1^2) + rho*g*(y2-y1) ~ change in pressure\n");
                                    input.next();
                                    System.out.print("\nGravitational Acceleration(m/s^2): ");
                                    String gp1 = input.next();
                                    double g = exp(gp1);
                                    System.out.print("Density of Fluid(kg/m^3): ");
                                    String rp1 = input.next();
                                    double r = input.nextDouble();
                                    System.out.print("Lower Elevation(m): ");
                                    String y1p1 = input.next();
                                    double y1 = exp(y1p1);
                                    System.out.print("Higher Elevation(m): ");
                                    String y2p1 = input.next();
                                    double y2 = exp(y2p1);
                                    System.out.print("Flow Rate at Low Elevation(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Flow Rate at High Elevation(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("\nThe change in pressure is " + (.5*r*(Math.pow(v2,2)-Math.pow(v1,2)) + r*g*(y2-y1)) + " Pa or " + (.5*r*(Math.pow(v2,2)-Math.pow(v1,2)) + r*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (.5*r*(Math.pow(v2,2)-Math.pow(v1,2)) + r*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else if(be==2)
                                {
                                    System.out.print("\nExpression being used: p2 = p1 - 1/2*rho*(v2^2-v1^2) + rho*g*(y2-y1) ~ pressure at high elevation\n");
                                    input.next();
                                    System.out.print("\nPressure at Low Elevation(Pa): ");
                                    String p1p1 = input.next();
                                    double p1 = exp(p1p1);
                                    System.out.print("Gravitational Acceleration(m/s^2): ");
                                    String g1p1 = input.next();
                                    double g = exp(g1p1);
                                    System.out.print("Density of Fluid(kg/m^3): ");
                                    String rp1 = input.next();
                                    double r = input.nextDouble();
                                    System.out.print("Lower Elevation(m): ");
                                    String y1p1 = input.next();
                                    double y1 = exp(y1p1);
                                    System.out.print("Higher Elevation(m): ");
                                    String y2p1 = input.next();
                                    double y2 = exp(y2p1);
                                    System.out.print("Flow Rate at Low Elevation(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Flow Rate at High Elevation(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("\nThe pressure at high elevation is " + (p1 - .5*r*(Math.pow(v2,2)-Math.pow(v1,2)) - r*g*(y2-y1)) + " Pa or " + (p1 - .5*r*(Math.pow(v2,2)-Math.pow(v1,2)) - r*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p1 - .5*r*(Math.pow(v2,2)-Math.pow(v1,2)) - r*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else if(be==3)
                                {
                                    System.out.print("\nExpression being used: p1 = p2 + 1/2*rho*(v2^2-v1^2) + rho*g*(y2-y1) ~ pressure at low elevation\n");
                                    input.next();
                                    System.out.print("\nPressure at High Elevation(Pa): ");
                                    String p2p1 = input.next();
                                    double p2 = exp(p2p1);
                                    System.out.print("Gravitational Acceleration(m/s^2): ");
                                    String g1p1 = input.next();
                                    double g = exp(g1p1);
                                    System.out.print("Density of Fluid(kg/m^3): ");
                                    String rp1 = input.next();
                                    double r = input.nextDouble();
                                    System.out.print("Lower Elevation(m): ");
                                    String y1p1 = input.next();
                                    double y1 = exp(y1p1);
                                    System.out.print("Higher Elevation(m): ");
                                    String y2p1 = input.next();
                                    double y2 = exp(y2p1);
                                    System.out.print("Flow Rate at Low Elevation(m/s): ");
                                    String v1p1 = input.next();
                                    double v1 = exp(v1p1);
                                    System.out.print("Flow Rate at High Elevation(m/s): ");
                                    String v2p1 = input.next();
                                    double v2 = exp(v2p1);
                                    System.out.print("\nThe pressure at low elevation is " + (p2 +.5*r*(Math.pow(v2,2)-Math.pow(v1,2)) + r*g*(y2-y1)) + " Pa or " + (p2 + .5*r*(Math.pow(v2,2)-Math.pow(v1,2)) + r*g*(y2-y1))*1.45*1/Math.pow(10,4) + " lb/in^2 or " + (p2 + .5*r*(Math.pow(v2,2)-Math.pow(v1,2)) + r*g*(y2-y1))*9.86*1/Math.pow(10,6) + " atm\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1k==7)
                                go1k=false;
                        }
                    }
                    else if(response1==12)//go1l
                    {
                        boolean go1l = true;
                        while(go1l)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Use Law of Gravitation\n2.Find Weight of Mass at Earth's Surface\n3.Find Acceleration Due to Gravity at Object's Surface\n4.Find Gravtiational Potential Energy\n5.Find Velocity in Circular Orbit\n6.Find Period of Circular Orbit\n7.Find Schwarschild Radius\n8.Back\n");
                            System.out.print("Input:");
                            int response1l = input.nextInt();
                            if(response1l==1)
                            {
                                System.out.print("\nWould you like to find:\nForce of Gravity Between Two Masses(1)\nDistance Beteween Two Masses(2)\nMass of a Body(3)\nInput:");
                                int fg = input.nextInt();
                                if(fg==1)
                                {
                                    System.out.print("\nExpression being used: F_g = G*m1*m2/r^2 ~ magnitude of gavitation force on masses\n");
                                    input.next();
                                    System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                    double G = 6.67428*1/Math.pow(10,11);
                                    System.out.print("Mass of Particle 1(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Mass og Particle 2(kg): ");
                                    String m2p1 = input.next();
                                    double m2 = exp(m2p1);
                                    System.out.print("Distance Between Masses(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe gravitational force on each mass is " + (G*m1*m2/Math.pow(r,2)) + " N\n");
                                    input.next();
                                }
                                else if(fg==2)
                                {
                                    System.out.print("\nExpression being used: r = sqrt(G*m1*m2/F_g) ~ distance between masses\n");
                                    input.next();
                                    System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                    double G = 6.67428*1/Math.pow(10,11);
                                    System.out.print("Mass of Particle 1(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Mass og Particle 2(kg): ");
                                    String m2p1 = input.next();
                                    double m2 = exp(m2p1);
                                    System.out.print("Magnitude of Gravitational Force(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe distance between the two masses is " + (Math.sqrt(G*m1*m2/f)) + " m\n");
                                    input.next();
                                }
                                else if(fg==3)
                                {
                                    System.out.print("\nExpression being used: m = F_g*r^2/(m1*G) ~ mass of body\n");
                                    input.next();
                                    System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                    double G = 6.67428*1/Math.pow(10,11);
                                    System.out.print("Mass of Particle 1(kg): ");
                                    String m1p1 = input.next();
                                    double m1 = exp(m1p1);
                                    System.out.print("Magnitude of Gravitational Force(N): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Distance Between Masses(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe mass of the body is " + (Math.pow(r,2)*f/(m1*G)) + " kg or " + (Math.pow(r,2)*f/(m1*G)) + " lbs\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1l==2)
                            {
                                System.out.print("\nExpression being used: w = G*m_E*m/r_E^2 ~ weight of mass at eath's surface\n");
                                input.next();
                                System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                double G = 6.67428*1/Math.pow(10,11);
                                System.out.print("Radius of Earth(m): 6.38*10^6\n");
                                double re = 6.38*Math.pow(10,6);
                                System.out.print("\nMass of Earth(kg): 5.98*10^24\n");
                                double me = 5.974*Math.pow(10,24);
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe weight of the object on earth is " + (G*me*m/Math.pow(re,2)) + " kg or " + (G*me*m/Math.pow(re,2))*2.20462 + " lbs\n");
                                input.next();
                            }
                            else if(response1l==3)
                            {
                                System.out.print("\nExpression being used: g = G*m/r^2 ~ gravitational acceleration at object surface\n");
                                input.next();
                                System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                double G = 6.67428*1/Math.pow(10,11);
                                System.out.print("Radius of Object(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe acceleration due to gravity at the object's surface is " + (G*m/Math.pow(r,2)) + " m/s^2\n");
                                input.next();
                            }
                            else if(response1l==4)
                            {
                                System.out.print("\nExpression being used: U = -G*m_E*m/r ~ gravitational potential energy of mass\n");
                                input.next();
                                System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                double G = 6.67428*1/Math.pow(10,11);
                                System.out.print("Mass of Earth(kg): 5.98*10^24\n");
                                double me = 5.974*Math.pow(10,24);
                                System.out.print("Distance of Object From Earth's Center(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe gravtiational potential energy of the mass is " + (-G*me*m/r) + " J\n");
                                input.next();
                            }
                            else if(response1l==5)
                            {
                                System.out.print("\nExpression being used: v = sqrt(G*m_E/r) ~ velocity in circular orbit\n");
                                input.next();
                                System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                double G = 6.67428*1/Math.pow(10,11);
                                System.out.print("Mass of Earth(kg): 5.98*10^24\n");
                                double me = 5.974*Math.pow(10,24);
                                System.out.print("Object Distance From Center of Earth(m): ");
                                String rp1 = input.next();
                                double r = exp(rp1);
                                System.out.print("\nThe velocity of the object in orbit is " + (Math.sqrt(G*me/r)) + " m/s or " + (Math.sqrt(G*me/r))*2.23694 + " mph\n");
                                input.next();
                            }
                            else if(response1l==6)
                            {
                                System.out.print("\nWould you like to find the Circular Orbit Period in terms of:\nVelocity and Distance from Earth(1)\nDistance from Earth(2)\nInput:");
                                int re = input.nextInt();
                                if(re==1)
                                {
                                    System.out.print("\nExpression being used: T = 2*PI*r/v ~ period of object in circular orbit\n");
                                    input.next();
                                    System.out.print("\nDistance of Object from Center of Earth(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("Velocity of Object in Orbit(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe period of the object's orbit is " + (2*Math.PI*r/v) + " s\n");
                                    input.next();
                                }
                                else if(re==2)
                                {
                                    System.out.print("\nExpression being used: T = 2*PI*r^(3/2)/sqrt(G*m_E) ~ period of object in circular orbit\n");
                                    input.next();
                                    System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                    double G = 6.67428*1/Math.pow(10,11);
                                    System.out.print("Mass of Earth(kg): 5.98*10^24\n");
                                    double me = 5.974*Math.pow(10,24);
                                    System.out.print("Distance of Object from Center of Earth(m): ");
                                    String rp1 = input.next();
                                    double r = exp(rp1);
                                    System.out.print("\nThe period of the object's orbit is " + (2*Math.PI*Math.pow(r,1.5)/Math.sqrt(G*me)) + " s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1l==7)
                            {
                                System.out.print("\nExpression being used: R_s = 2*G*M/c^2 ~ schwarzschild radius\n");
                                input.next();
                                System.out.print("\nGravitational Constant(N*m^2/kg^2): 6.67*10^-11\n");
                                double G = 6.67428*1/Math.pow(10,11);
                                System.out.print("Speed of light(m/s): 2.99*10^8\n");
                                double c = 2.99*Math.pow(10,8);
                                System.out.print("\nMass of Body(kg): ");
                                String Mp1 = input.next();
                                double M = exp(Mp1);
                                System.out.print("\nThe schwarzschild radius is " + (2*G*M/Math.pow(c,2)) + " m\n");
                                input.next();
                            }
                            else if(response1l==8)
                                go1l = false;
                        }
                    }
                    else if(response1==13)//go1m
                    {
                        boolean go1m = true;
                        while(go1m)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Use Relationship between Frequency and Period\n2.Find Angular Frequency\n3.Find Restoring Force exerted by Ideal Spring\n4.Find Acceleration of Body in Simple Harmonic Motion(SHM)\n5.Find Angular Frequency in SHM\n6.Find Frequency in SHM\n7.Find Period in SHM\n8.Find Displacement in SHM\n9.Find Total Mechanical Energy in SHM\n10.Find Frequency or Angular Frequency for Moment of Inertia\n11.Find Angluar Frequency for Simple Pendulum\n12.Find Frequency for Simple Pendulum\n13.Find Period for simple Pendulum\n14.Find Angular Frequency for Physical Pendulum\n15.Find Period for Physical Pendulum\n16.Find Position of Oscillator with Little Damping\n17.Find Angular Frequency of Oscillator with Little Damping\n18.Find Amplitude of Driven Oscillator\n19.Back\n");
                            System.out.print("Input:");
                            int response1m = input.nextInt();
                            if(response1m==1)
                            {
                                System.out.print("\nWould you like to find:\nFrequency(1)\nPeriod(1)\nInput:");
                                int fp = input.nextInt();
                                if(fp==1)
                                {
                                    System.out.print("\nExpression being used: f = 1/T ~ frequency\n");
                                    input.next();
                                    System.out.print("\nPeriod(s): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("\nThe frequency is " + (1/T) + " Hz\n");
                                    input.next();
                                }
                                else if(fp==2)
                                {
                                    System.out.print("\nExpression being used: T = 1/f ~ period\n");
                                    input.next();
                                    System.out.print("\nFrequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe period is " + (1/f) + " s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==2)
                            {
                                System.out.print("\nWould you like to find the angular frequency in terms of:\nFrequency(1)\nPeriod(1)\nInput:");
                                int fp = input.nextInt();
                                if(fp==1)
                                {
                                    System.out.print("\nExpression being used: omega = 2*PI*f ~ angular frequency\n");
                                    input.next();
                                    System.out.print("\nFrequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe angular frequency is " + (2*Math.PI*f) + " rad/s\n");
                                    input.next();
                                }
                                else if(fp==2)
                                {
                                    System.out.print("\nExpression being used: omega = 2*PI/T ~ angular frequency\n");
                                    input.next();
                                    System.out.print("\nPeriod(s): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("\nThe angular frequency is " + (2*Math.PI/T) + " rad/s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==3)
                            {
                                System.out.print("\nWould you like to find:\nRestoring Force on Object(1)\nRestoring Force Constant(2)\nPosition of Object(3)\nInput:");
                                int rf = input.nextInt();
                                if(rf==1)
                                {
                                    System.out.print("\nExpression being used: F_x = -kx ~ restoring force on object\n");
                                    input.next();
                                    System.out.print("\nRestoring Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Position of Object(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("\nThe restoring force on the object is " + (-k*x) + " N\n");
                                    input.next();
                                }
                                else if(rf==2)
                                {
                                    System.out.print("\nExpression being used: k = -F_x/x ~ restoring force constant\n");
                                    input.next();
                                    System.out.print("\nRestoring Force(N): ");
                                    String fxp1 = input.next();
                                    double fx = exp(fxp1);
                                    System.out.print("Position of Object(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("\nThe restoring force constant is " + (-fx/x) + " N/m\n");
                                    input.next();
                                }
                                else if(rf==3)
                                {
                                    System.out.print("\nExpression being used: x = -F_x/k ~ position of object\n");
                                    input.next();
                                    System.out.print("\nRestoring Force(N): ");
                                    String fxp1 = input.next();
                                    double fx = exp(fxp1);
                                    System.out.print("Restoring Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("\nThe position of the object is " + (-fx/k) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==4)
                            {
                                System.out.print("\nWould you like to find:\nAcceleration of Body in SHM(1)\nForce Constant(2)\nMass of Object(3)\nPosition of Object(4)\nInput:");
                                int as = input.nextInt();
                                if(as==1)
                                {
                                    System.out.print("\nExpression being used: a_x = -k*x/m ~ acceleration of body in simple harmonic motion\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Mass of Object(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Position of Object(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("\nThe acceleration of the body is " + (-k*x/m) + " m/s^2\n");
                                    input.next();
                                }
                                else if(as==2)
                                {
                                    System.out.print("\nExpression being used: k = a_x*m/x ~ force constant\n");
                                    input.next();
                                    System.out.print("\nAcceleration of Body(m/s^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("Mass of Object(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Position of Object(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("\nThe force constant is " + (-a*m/x) + " N/m\n");
                                    input.next();
                                }
                                else if(as==3)
                                {
                                    System.out.print("\nExpression being used: m = -k*x/a_x ~ mass of body\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Position of Object(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Acceleration of Body(m/s^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("\nThe mass of the object is " + (-k*x/a) + " kg or " + (-k*x/a)*2.20462 + " lbs\n");
                                    input.next();
                                }
                                else if(as==4)
                                {
                                    System.out.print("\nExpression being used: x = -a_x*m/k ~ position of object \n");
                                    input.next();
                                    System.out.print("\nAcceleration of Body(m/s^2): ");
                                    String ap1 = input.next();
                                    double a = exp(ap1);
                                    System.out.print("Mass of Body(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("\nThe position of the object is " + (-a*m/k) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==5)
                            {
                                System.out.print("\nExpression being used: omega = sqrt(k/m) ~ angular frequency of mass in simple harmonic motion\n");
                                input.next();
                                System.out.print("\nForce Constant(N/m): ");
                                String kp1 = input.next();
                                double k = exp(kp1);
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("\nThe angular frequency of the mass is " + (Math.sqrt(k/m)) + " rad/s\n");
                                input.next();
                            }
                            else if(response1m==6)
                            {
                                System.out.print("\nWould you like to find the frequency in terms of:\nAngular Frequency(1)\nForce Constant and Mass(2)\nInput:");
                                int sf = input.nextInt();
                                if(sf==1)
                                {
                                    System.out.print("\nExpression being used: f = omega/2*PI ~ frequency in simple harmonic motion\n");
                                    input.next();
                                    System.out.print("Angular Frequency(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("\nThe frequency of the object is " + (o/(2*Math.PI)) + " Hz\n");
                                    input.next();
                                }
                                else if(sf==2)
                                {
                                    System.out.print("\nExpression being used: f = 1/2*PI*sqrt(k/m) ~ frequency in simple harmonic motion\n");
                                    input.next();
                                    System.out.print("Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Mass of Object(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe frequency of the object is " + (1/(Math.PI)*Math.sqrt(k/m)) + " Hz\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==7)
                            {
                                System.out.print("\nWould you like to find the period in terms of:\nFrequency(1)\nAngular Frequency(2)\nMass and Force Constant(3)\nInput:");
                                int sp = input.nextInt();
                                if(sp==1)
                                {
                                    System.out.print("\nExpression being used: T = 1/f ~ period in simple harmonic motion\n");
                                    input.next();
                                    System.out.print("\nFrequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe period is " + (1/f) + " s\n");
                                    input.next();
                                }
                                else if(sp==2)
                                {
                                    System.out.print("\nExpression being used: T = 2*PI/omega ~ period in simple harmonic motion\n");
                                    input.next();
                                    System.out.print("Angular Frequency(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("\nThe period is " + (2*Math.PI/o) + " s\n");
                                    input.next();
                                }
                                else if(sp==3)
                                {
                                    System.out.print("\nExpression being used: T = 2*PI*sqrt(m/k) ~ period in simple harmonic motion\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Mass of Object(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe period is " + (2*Math.PI*Math.sqrt(m/k)) + " s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==8)
                            {
                                System.out.print("\nWould like to find the Displacement in terms of:\nAngular Frequency(1)\nForce Constant and Mass(2)\nInput:");
                                int df = input.nextInt();
                                if(df==1)
                                {
                                    System.out.print("\nExpression being used: A*cos(omega*t + phi) ~ displacement in SHM\n");
                                    input.next();
                                    System.out.print("\nAmplitude of Motion(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Angular Frequency(Hz): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("Angle with x-axis(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe displacement is " + (A*Math.cos(o*t + (th/57))) + " m\n");
                                    input.next();
                                }
                                else if(df==2)
                                {
                                    System.out.print("\nExpression being used: A*cos(sqrt(k/m)*t + phi) ~ displacement in SHM\n");
                                    input.next();
                                    System.out.print("\nAmplitude of Motion(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Mass of Body(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("Angle with x-axis(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("\nThe displacement is " + (A*Math.cos(Math.sqrt(k/m)*t + (th/57))) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==9)
                            {
                                System.out.print("\nWould you like to find the Total Mechanical Energy in terms of:\nMass of Object, Velocty of Object, Force Constant, and Object Position(1)\nForce Constant, Amplitude(2)\nInput:");
                                int tm = input.nextInt();
                                if(tm==1)
                                {
                                    System.out.print("\nExpression being used: 1/2*k*x^2 + 1/2*k*x^2 ~  total mechanical energy\n");
                                    input.next();
                                    System.out.print("Mass of Body(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("Velocity of Body(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Force Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("\nPosition of Object(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("\nThe total mechanical energy is " + (.5*m*Math.pow(v,2)+ .5*k*Math.pow(x,2)) + " J\n");
                                    input.next();
                                }
                                else if(tm==2)
                                {
                                    System.out.print("\nExpression being used: E = 1/2*k*A^2 ~ totol mechanical energy\n");
                                    input.nextDouble();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("\nAmplitude(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe total mechanical energy is " + (.5*k*Math.pow(A,2)) + " J\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==10)
                            {
                                System.out.print("\nWould you like to find:\nFrequency(1)\nAnglular Frequency(2)\nInput:");
                                int fa = input.nextInt();
                                if(fa==1)
                                {
                                    System.out.print("\nExpression being used: f = 1/(2*PI)*sqrt(k/I) ~ frequency of moment of inertia\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Moment of Inertia(kg*m^2): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("The frequency is " + (1/(2*Math.PI)*Math.sqrt(k/I)) + " Hz\n");
                                    input.next();
                                }
                                else if(fa==2)
                                {
                                    System.out.print("\nExpression being used: omega = sqrt(k/I) ~ angular frequency of moment of inertia\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Moment of Inertia(kg*m^2): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("The frequency is " + (Math.sqrt(k/I)) + " rad/s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==11)
                            {
                                System.out.print("\nWould you like to find the angular frequency in terms of:\nForce Constant and Mass(1)\nRadius of Circle(2)\nInput:");
                                int af = input.nextInt();
                                if(af==1)
                                {
                                    System.out.print("\nExpression being used: omega = sqrt(k/m) ~ angular frequency  in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nForce Constant(N/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Mass of Object(kg): ");
                                    String mp1 = input.next();
                                    double m = exp(mp1);
                                    System.out.print("\nThe angular frequency is " + (Math.sqrt(k/m)) + " rad/s\n");
                                    input.next();
                                }
                                else if(af==2)
                                {
                                    System.out.print("\nExpression being used: omega = sqrt(g/L) ~ angular frequency in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nGravitational Acceleration(m/s^2) 9.8\n");
                                    double g = 9.8;
                                    System.out.print("Radius of Circle(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe angular frequency is " + (Math.sqrt(g/L)) + " rad/s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==12)
                            {
                                System.out.print("\nWould you like to find the frequency in terms of:\nAngular Frequency(1)\nRadius of Circle(2)\nInput:");
                                int af = input.nextInt();
                                if(af==1)
                                {
                                    System.out.print("\nExpression being used: f = omega/2*PI ~ frequency in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nAngular Frequency(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("\nThe frequency is " + (o/(2*Math.PI)) + " Hz\n");
                                    input.next();
                                }
                                else if(af==2)
                                {
                                    System.out.print("\nExpression being used: f = 1/(2*PI)*sqrt(g/L) ~ frequency in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nGravitational Acceleration(m/s^2) 9.8\n");
                                    double g = 9.8;
                                    System.out.print("Radius of Circle(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe frequency is " + (1/(2*Math.PI)*Math.sqrt(g/L)) + " Hz\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==13)
                            {
                                System.out.print("\nWould you like to find the Period in terms of:\nAngular Frequency(1)\nFrequency(2)\nRadius of Circle(3)\nInput:");
                                int p = input.nextInt();
                                if(p==1)
                                {
                                    System.out.print("\nExpression being used: 2*PI/omega ~ period in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nAngular Frequency(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("\nThe period is " + (2*Math.PI/o) + " s\n");
                                    input.next();
                                }
                                else if(p==2)
                                {
                                    System.out.print("\nExpression being used: T = 1/f ~ period in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nFrequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe period is " + (1/f) + " s\n");
                                    input.next();
                                }
                                else if(p==3)
                                {
                                    System.out.print("\nExpression being used: T = 2*PI*sqrt(L/g) ~ period in simple pendulum\n");
                                    input.next();
                                    System.out.print("\nGravitational Acceleration(m/s^2) 9.8\n");
                                    double g = 9.8;
                                    System.out.print("Radius of Circle(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe period is " + (2*Math.PI*Math.sqrt(L/g)) + " s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1m==14)
                            {
                                System.out.print("\nExpression being used: omega = sqrt(m*g*d/I) ~ angular frequency in physical pendulum\n");
                                input.next();
                                System.out.print("\nGravitational Acceleration(m/s^2) 9.8\n");
                                double g = 9.8;
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Distance of Pivot from Center of Gravity(m): ");
                                String dp1 = input.next();
                                double d = exp(dp1);
                                System.out.print("Moment of Inertia(kg*m^2): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("\nThe angular frequency is " + (Math.sqrt(m*g*d/I)) + " rad/s\n");
                                input.next();
                            }
                            else if(response1m==15)
                            {
                                System.out.print("\nExpression being used: T = 2*PI*sqrt(I/m*g*d) ~ period in physical pendulum\n");
                                input.next();
                                System.out.print("\nGravitational Acceleration(m/s^2) 9.8\n");
                                double g = 9.8;
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Distance of Pivot from Center of Gravity(m): ");
                                String dp1 = input.next();
                                double d = exp(dp1);
                                System.out.print("Moment of Inertia(kg*m^2): ");
                                String Ip1 = input.next();
                                double I = exp(Ip1);
                                System.out.print("\nThe period is " + (2*Math.PI*Math.sqrt(I/(m*g*d))) + " s\n");
                                input.next();
                            }
                            else if(response1m==16)
                            {
                                System.out.print("\nExpression being used: x = A*e^(-(b/2*m)*t)*cos(omega'8t + phi) ~ oscillator  with little damping\n");
                                input.next();
                                System.out.print("\nAmplitude(m): ");
                                String Ap1 = input.next();
                                double A = exp(Ap1);
                                System.out.print("Strength of Damping Force(N): ");
                                String bp1 = input.next();
                                double b = exp(bp1);
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Time(s): ");
                                String tp1 = input.next();
                                double t = exp(tp1);
                                System.out.print("Force Constant(N/m): ");
                                String kp1 = input.next();
                                double k = exp(kp1);
                                System.out.print("Angle Phi(degrees): ");
                                String phip1 = input.next();
                                double phi = exp(phip1);
                                System.out.print("\nThe position of the oscillator is " + (A*Math.exp(-(b/(2*m)*t)*Math.cos((Math.sqrt(k/m - Math.pow(b,2)/(4*Math.pow(m,2))))*t+ phi/57))) + " m\n");
                                input.next();
                                
                            }
                            else if(response1m==17)
                            {
                                System.out.print("\nExpression being used: omega' = sqrt() ~ angular frequency of oscillator with little damping\n");
                                input.next();
                                System.out.print("\nForce Constant(N/m): ");
                                String kp1 = input.next();
                                double k = exp(kp1);
                                System.out.print("Mass of object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Strength of Damping Force(N): ");
                                String bp1 = input.next();
                                double b = exp(bp1);
                                System.out.print("\nThe angular frequency of the oscillator is " + (Math.sqrt((k/m) - (Math.pow(b,2)/(4*Math.pow(m,2))))) + " rad/s\n");
                                input.next();
                            }
                            else if(response1m==18)
                            {
                                System.out.print("\nExpression being used: A = F_max/(sqrt((k-m*omega_d^2)^2+b^2*omega_d^2)) ~ amplitude of driven oscillator\n");
                                input.next();
                                System.out.print("\nDriving Angular Frequency(rad/s): ");
                                String op1 = input.next();
                                double o = exp(op1);
                                System.out.print("Maximum Driving Force(N): ");
                                String Fp1 = input.next();
                                double F = exp(Fp1);
                                System.out.print("Force Constant(N/m): ");
                                String kp1 = input.next();
                                double k = exp(kp1);
                                System.out.print("Mass of Object(kg): ");
                                String mp1 = input.next();
                                double m = exp(mp1);
                                System.out.print("Strength of Damping Force(N): ");
                                String bp1 = input.next();
                                double b = exp(bp1);
                                System.out.print("The amplitude of the oscillator is " + (F/(Math.sqrt(Math.pow((k-m*Math.pow(o,2  )),2)+(Math.pow(b,2)*Math.pow(o,2))))) + " m\n");
                                input.next();
                            }
                            else if(response1m==19)
                                go1m = false;
                        }
                    }
                    else if(response1==14)//go1n
                        go1 = false;
                }
                
            }
            else if(response==2)
            {
                boolean go2 = true;
                while(go2)
                {
                    System.out.println("Which Topic #?");
                    System.out.println("\n1.Mechanical Waves\n2.Sound and Hearing\n3.Back");
                    System.out.print("Input:");
                    int response2 = input.nextInt();
                    if(response2==1)//go1o
                    {
                        boolean go1o = true;
                        while(go1o)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find Wavelength, Velocity, or Frequency of Periodic Wave\n2.Find Displacement of Wave at Specific Time\n3.Find Speed of Transverse Wave on String\n4.Find Average Power of Wave on String\n5.Use Inverse Square Law for Intensity\n6.Find Wave Function for Standing Wave on String\n7.Find Fundamental Frquency for String fixed at Both Ends\n8.Back\n");
                            System.out.print("Input:");
                            int response1o = input.nextInt();
                            if(response1o==1)
                            {
                                System.out.print("\nWould you like to find:\nVelocity(1)\nFrequency(2)\nWavelength(3)\nInput:");
                                int vf = input.nextInt();
                                if(vf==1)
                                {
                                    System.out.print("\nExpression being used: v = lambda*f ~ velocity of the periodic wave\n");
                                    input.next();
                                    System.out.print("\nWavelength of Wave(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Frequency of Wave(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe velocity of the periodic wave is " + (l*f) + " m/s\n");
                                    input.next();
                                }
                                else if(vf==2)
                                {
                                    System.out.print("\nExpression being used: f = v/lambda ~ frequency of the periodic wave\n");
                                    input.next();
                                    System.out.print("\nWavelength of Wave(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Velocity of Wave(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe frequency of the periodic wave is " + (v/l) + " Hz\n");
                                    input.next();
                                }
                                else if(vf==3)
                                {
                                    System.out.print("\nExpression being used: lambda = v/f ~ wavelength of the periodic wave\n");
                                    input.next();
                                    System.out.print("\nVelocity of Wave(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Frequency of Wave(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe wavelength of the periodic wave is " + (v/f) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nok.");
                            }
                            else if(response1o==2)
                            {
                                System.out.print("\nWould you like to find the Displacement in terms of:\nAngular Frequency, Position, Velocity, and Time(1)\nFrequency, Position, Velocity, Time(2)\nPosition, Period, Wavelength, Time(3)\nWave Number, Position, Angular Frequency, and Time(4)\nInput:");
                                int dw = input.nextInt();
                                if(dw==1)
                                {
                                    System.out.print("\nExpression being used: y(x,t)=A*cos(omega*(x/v - t)) ~ displacement of sinusoidal wave\n");
                                    input.next();
                                    System.out.print("\nAmplitude of Wave(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Angular Frequency of Wave(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Position of Wave(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Velocity of Wave(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe displacement of the wave is " + (A*Math.cos(o*((x/v)-t))) + " m\n");
                                    input.next();
                                }
                                else if(dw==2)
                                {
                                    System.out.print("\nExpression being used: y(x,t)=A*cos(2*PI*f*(x/v - t)) ~ displacement of sinusoidal wave\n");
                                    input.next();
                                    System.out.print("\nAmplitude of Wave(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Frequency of Wave(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Position of Wave(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Velocity of Wave(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe displacement of the wave is " + (A*Math.cos((2*Math.PI*f)*((x/v)-t))) + " m\n");
                                    input.next();
                                }
                                else if(dw==3)
                                {
                                    System.out.print("\nExpression being used: y(x,t)=A*cos(2*PI*(x/lambda - t/T)) ~ displacement of sinusoidal wave\n");
                                    input.next();
                                    System.out.print("\nAmplitude of Wave(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Wavelength Wave(m): ");
                                    String lp1 = input.next();
                                    double l = exp(lp1);
                                    System.out.print("Position of Wave(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Period of Wave(s): ");
                                    String Tp1 = input.next();
                                    double T = exp(Tp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe displacement of the wave is " + (A*Math.cos(2*Math.PI*((x/l)-t/T))) + " m\n");
                                    input.next();
                                }
                                else if(dw==4)
                                {
                                    System.out.print("\nExpression being used: y(x,t)=A*cos(omega*(k*x - o*t)) ~ displacement of sinusoidal wave\n");
                                    input.next();
                                    System.out.print("\nAmplitude of Wave(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("Angular Frequency of Wave(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Wave Number(/m): ");
                                    String kp1 = input.next();
                                    double k = exp(kp1);
                                    System.out.print("Position of Wave(m): ");
                                    String xp1 = input.next();
                                    double x = exp(xp1);
                                    System.out.print("Time(s): ");
                                    String tp1 = input.next();
                                    double t = exp(tp1);
                                    System.out.print("\nThe displacement of the wave is " + (A*Math.cos((k*x)-(o*t))) + " m\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                                
                            }
                            else if(response1o==3)
                            {
                                System.out.print("\nExpression being used: v = sqrt(F/mu) ~ speed of transvers wave\n");
                                input.next();
                                System.out.print("\nTension in String(N): ");
                                String Fp1 = input.next();
                                double F = exp(Fp1);
                                System.out.print("Mass per unit Length(kg/m): ");
                                String mup1 = input.next();
                                double mu = exp(mup1);
                                System.out.print("\nThe wave speed is " + (Math.sqrt(F/mu)) + " m/s\n");
                                input.next();
                            }
                            else if(response1o==4)
                            {
                                System.out.print("\nExpression being used: P_av = 1/2*sqrt(mu*F)*omega^2*A^2 ~ average power of wave on string\n");
                                input.next();
                                System.out.print("\nMass per unit Length(kg/m): ");
                                String mup1 = input.next();
                                double mu = exp(mup1);
                                System.out.print("Tension on String(N): ");
                                String Fp1 = input.next();
                                double F = exp(Fp1);
                                System.out.print("Angular Frequency(rad/s): ");
                                String op1 = input.next();
                                double o = exp(op1);
                                System.out.print("Amplitude of Wave(m): ");
                                String Ap1 = input.next();
                                double A = exp(Ap1);
                                System.out.print("\nThe average power of the wave is " + (.5*Math.sqrt(mu*F)*Math.pow(o,2)*Math.pow(A,2)) + " W/m\n");
                                input.next();
                            }
                            else if(response1o==5)
                            {
                                System.out.print("\nWould you like to find the :\nIntensity of the Wave(1)\nRadius at Specific Intensity(2)\nInput:");
                                int wi = input.nextInt();
                                if(wi==1)
                                {
                                    System.out.print("\nWould you like to find:\nInitial Intensity(1)\nFinal Inensity(2)\nInput: ");
                                    int ri = input.nextInt();
                                    if(ri==1)
                                    {
                                        System.out.print("\nExpression being used: I1 = r2^2*I2/r1^2 ~ initial intensity from source\n");
                                        input.next();
                                        System.out.print("\nInitial Distance from Source(m): ");
                                        String r1p1 = input.next();
                                        double r1 = exp(r1p1);
                                        System.out.print("Intensity at Observed Distance(W/m^2): ");
                                        String I2p1 = input.next();
                                        double I2 = exp(I2p1);
                                        System.out.print("Distance of Intensity Observed from Source(m): ");
                                        String r2p1 = input.next();
                                        double r2 = exp(r2p1);
                                        System.out.print("\nThe intensity at the initial distance is " + (Math.pow(r2,2)*I2/Math.pow(r1,2)) + " W/m^2\n");
                                        input.next();
                                    }
                                    else if(ri==2)
                                    {
                                        System.out.print("\nExpression being used: I2 = I1*r1^2/r2^2 ~ observed intensity from source\n");
                                        input.next();
                                        System.out.print("\nInitial Distance from Source(m): ");
                                        String r1p1 = input.next();
                                        double r1 = exp(r1p1);
                                        System.out.print("Intensity at Initial Distance(W/m^2): ");
                                        String I1p1 = input.next();
                                        double I1 = exp(I1p1);
                                        System.out.print("Distance of Intensity Observed from Source(m): ");
                                        String r2p1 = input.next();
                                        double r2 = exp(r2p1);
                                        System.out.print("\nThe intensity at the observed distance is " + (Math.pow(r1,2)*I1/Math.pow(r2,2)) + " W/m^2\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(wi==2)
                                {
                                    System.out.print("\nWould you like to find:\nDistance of Initial Intenisty(1)\nDistance of Observed Intensity from Initial(2)\nInput: ");
                                    int di = input.nextInt();
                                    if(di==1)
                                    {
                                        System.out.print("\nExpression being used: r1 = sqrt(r2^2*I2/I1) ~ distance of initial intensity\n");
                                        input.next();
                                        System.out.print("\nDistance of Observed Intensity from Initial Intesnity(m): ");
                                        String r2p1 = input.next();
                                        double r2 = exp(r2p1);
                                        System.out.print("Intensity from Observed Distance(W/m^2): ");
                                        String I2p1 = input.next();
                                        double I2 = exp(I2p1);
                                        System.out.print("Intensity at Initial Distance(W/m^2): ");
                                        String I1p1 = input.next();
                                        double I1 = exp(I1p1);
                                        System.out.print("\nThe distance of the initial intensity is " + (Math.sqrt(Math.pow(r2,2)*I2/I1)) + " m\n");
                                        input.next();
                                    }
                                    else if(di==2)
                                    {
                                        System.out.print("\nExpression being used: r2 = sqrt(r1^2*I1/I2) ~ distance of observed intensity from initial intensity\n");
                                        input.next();
                                        System.out.print("\nDistance of Initial Intensity(m): ");
                                        String r1p1 = input.next();
                                        double r1 = exp(r1p1);
                                        System.out.print("Intensity from Observed Distance(W/m^2): ");
                                        String I2p1 = input.next();
                                        double I2 = exp(I2p1);
                                        System.out.print("Intensity at Initial Distance(W/m^2): ");
                                        String I1p1 = input.next();
                                        double I1 = exp(I1p1);
                                        System.out.print("\nThe distance of the initial intensity is " + (Math.sqrt(Math.pow(r1,2)*I1/I2)) + " m\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1o==6)
                            {
                                System.out.print("\nExpression being used: y(x,t):A*sin(k*x)*sin(omega*t) ~ wave function of standing wave\n");
                                input.next();
                                System.out.print("\nAmplitude of Standing Wave(m): ");
                                String Ap1 = input.next();
                                double A = exp(Ap1);
                                System.out.print("Wave Number(rad/m): ");
                                String kp1 = input.next();
                                double k = exp(kp1);
                                System.out.print("Angular Frequency(rad/s): ");
                                String op1 = input.next();
                                double o = exp(op1);
                                System.out.print("\nThe wave function is y(x,t) = " + (A) + "m * sin(" + (k) + "rad/m)*x * sin(" + (o) + "rad/s)*t\n");
                                input.next();
                            }
                            else if(response1o==7)
                            {
                                System.out.print("\nWould you like to find the Fundamental Frequency in terms of:\nLength of String, Wave Speed, and Integer Number(1)\nLength of String, Tension on String, and Mass per unit Length(2)\nInput: ");
                                int ml = input.nextInt();
                                if(ml==1)
                                {
                                    System.out.print("\nExpression being used: f_n = n*(v/(2*L)) ~ fundamental frequency for string fixed at both ends\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Length of String(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Wave Speed(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("\nThe fundamental frequency is " + (n*(v/(2*L))) + " Hz\n");
                                    input.next();
                                }
                                else if(ml==2)
                                {
                                    System.out.print("\nExpression being used: f_n = 1/(2*L)*sqrt(F/mu) ~ fundamental frequency for string fixed at both ends\n");
                                    input.next();
                                    System.out.print("\nTension on String(N): ");
                                    String Fp1 = input.next();
                                    double F = exp(Fp1);
                                    System.out.print("Length of String(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("Mass per unit Length of String(kg/m): ");
                                    String mup1 = input.next();
                                    double mu = exp(mup1);
                                    System.out.print("\nThe fundamental frequency is " + ((1/(2*L))*Math.sqrt(F/mu)) + " Hz\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1o==8)
                                go1o = false;
                        }
                        
                    }
                    else if(response2==2)//go1p
                    {
                        boolean go1p = true;
                        while(go1p)
                        {
                            System.out.print("\nWhich # would you like?\n");
                            System.out.print("1.Find the Pressure Amplitude\n2.Find Speed of Longitudinal Wave in Fluid\n3.Find Speed of Longitudinal Wave in Solid Rod\n4.Find Speed of Sound in Ideal Gas\n5.Find Intensity of Sinusoidal Sound Wave\n6.Use Definition of Sound Intensity Level\n7.Find Fundamental Frequency in Open Pipe\n8.Find Fundamental Frequency in Stopped Pipe\n9.Find Beat Frequency\n10.Use Doppler Effect for Moving Source and Moving Listener\n11.Use Equations to Describe Shock Wave Characteristics\n12.Back\n");
                            System.out.print("Input:");
                            int response1p = input.nextInt();
                            if(response1p==1)
                            {
                                System.out.print("\nWould you like to find the:\nPressure Amplitude(1)\nDisplacement Amplitude(2)\nInput:");
                                int pd = input.nextInt();
                                if(pd==1)
                                {
                                    System.out.print("\nType of Medium:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Air\n10.Other\n");;
                                    System.out.print("Input:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 7.5*10^10 ");
                                        double B = 7.5*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 6*10^10");
                                        double B = 6*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 14*10^10");
                                        double B = 14*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 5*10^10 ");
                                        double B = 5*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                        double B = 16*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 4.1*10^10 ");
                                        double B = 4.1*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 17*10^10");
                                        double B = 17*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                        double B = 16*Math.pow(10,10);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): 1.42*10^5 ");
                                        double B = 1.42*Math.pow(10,5);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                    else if(mt==10)
                                    {
                                        System.out.print("\nExpression being used: p_max = B*k*A ~ pressure amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Displacement Amplitude(m): ");
                                        String Ap1 = input.next();
                                        double A = exp(Ap1);
                                        System.out.print("Bulk Modulus(Pa): ");
                                        String Bp1 = input.next();
                                        double B = exp(Bp1);
                                        System.out.print("\nThe pressure amplitude is " + (B*k*A) + " Pa\n");
                                        input.next();
                                    }
                                }
                                else if(pd==2)
                                {
                                    System.out.print("\nType of Medium:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Air\n10.Other\n");;
                                    System.out.print("Input:");
                                    int mt = input.nextInt();
                                    if(mt==1)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 7.5*10^10 ");
                                        double B = 7.5*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==2)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 6*10^10");
                                        double B = 6*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==3)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 14*10^10");
                                        double B = 14*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==4)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 5*10^10 ");
                                        double B = 5*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==5)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                        double B = 16*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==6)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 4.1*10^10 ");
                                        double B = 4.1*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==7)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 17*10^10");
                                        double B = 17*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==8)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 16*10^10 ");
                                        double B = 16*Math.pow(10,10);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==9)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): 1.42*10^5 ");
                                        double B = 1.42*Math.pow(10,5);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                    else if(mt==10)
                                    {
                                        System.out.print("\nExpression being used: A = p_max/(B*K) ~ displacement amplitude\n");
                                        input.next();
                                        System.out.print("\nWave Number(rad/m): ");
                                        String kp1 = input.next();
                                        double k = exp(kp1);
                                        System.out.print("Pressure Amplitude(Pa): ");
                                        String pp1 = input.next();
                                        double p = exp(pp1);
                                        System.out.print("Bulk Modulus(Pa): ");
                                        String Bp1 = input.next();
                                        double B = exp(Bp1);
                                        System.out.print("\nThe displacement amplitude is " + (p/(B*k)) + " m\n");
                                        input.next();
                                    }
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1p==2)
                            {
                                System.out.print("\nExpression being used: v = sqrt(B/rho) ~ speed of longitudinal wave in fluid\n");
                                input.next();
                                System.out.print("\nBulk Modulus of Fluid(Pa): ");
                                String Bp1 = input.next();
                                double B = exp(Bp1);
                                System.out.print("Density of Fluid(kg/m^3): ");
                                String rhop1 = input.next();
                                double rho = exp(rhop1);
                                System.out.print("\nThe speed of the wave is " + (Math.sqrt(B/rho)) + " m/s or about " + (Math.sqrt(B/rho))*2.2 + " mph\n");
                                input.next();
                            }
                            else if(response1p==3)
                            {
                                System.out.print("\nMaterial of Rod:\n1.Aluminum\n2.Brass\n3.Copper\n4.Crown Glass\n5.Iron\n6.Lead\n7.Nickel\n8.Steel\n9.Other\n");
                                System.out.print("Input:");
                                int mt = input.nextInt();
                                if(mt==1)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 7*10^10\n");
                                    double Y = 7*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==2)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 9*10^10\n");
                                    double Y = 9*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==3)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 11*10^10\n");
                                    double Y = 11*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==4)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 6*10^10\n");
                                    double Y = 6*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==5)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 21*10^10\n");
                                    double Y = 21*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==6)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 1.6*10^10\n");
                                    double Y = 1.6*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==7)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 21*10^10\n");
                                    double Y = 21*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==8)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus(Pa): 20*10^10\n");
                                    double Y = 20*Math.pow(10,10);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                                else if(mt==9)
                                {
                                    System.out.print("\nExpression being used: v = sqrt(Y/rho) ~ speed of longitudinal wave in solid rod\n");
                                    input.next();
                                    System.out.print("\nYoung's Modulus of Rod(Pa): ");
                                    String Yp1 = input.next();
                                    double Y = exp(Yp1);
                                    System.out.print("Density of Rod(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("\nThe speed of the wave is " + (Math.sqrt(Y/rho)) + " m/s or about " + (Math.sqrt(Y/rho))*2.2 + " mph\n");
                                    input.next();
                                }
                            }
                            else if(response1p==4)
                            {
                                System.out.print("\nExpression being used: v = sqrt(gamma*R*T/M) ~ speed of sound in ideal gas\n");
                                input.next();
                                System.out.print("\nGas Constant(J/mol*K): 8.314\n");
                                double R = 8.314;
                                System.out.print("Ratio of Heat Capacities for Ideal Gas: ");
                                String gp1 = input.next();
                                double g = exp(gp1);
                                System.out.print("Absolute Temperature(K): ");
                                String Tp1 = input.next();
                                double T = exp(Tp1);
                                System.out.print("Molar Mass of Ideal Gas(kg/mol): ");
                                String Mp1 = input.next();
                                double M = exp(Mp1);
                                System.out.print("\nThe speed of sound in the ideal gas is " + (Math.sqrt(g*R*T/M)) + " m/s or about " + (Math.sqrt(g*R*T/M))*2.2 + "mph\n");
                                input.next();
                            }
                            else if(response1p==5)
                            {
                                System.out.print("\nWould you like to find the intensity in terms of:\nDensity, Bulk Modulus, Angular Frequency, and Displacement Amplitude(1)\nPressure Amplitude, Density, Velocity of Sound(2)\nPressure Amplitude, Density, and Bulk Modulus(3)\nInput:");
                                int isw = input.nextInt();
                                if(isw==1)
                                {
                                    System.out.print("\nExpression being used: I = 1/2*sqrt(rho*B)*omega^2*A^2 ~ intensity of sound wave\n");
                                    input.next();
                                    System.out.print("\nDensity of Medium(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Bulk Modulus of Medium(Pa): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("Angular Frequency of Wave(rad/s): ");
                                    String op1 = input.next();
                                    double o = exp(op1);
                                    System.out.print("Displacement Amplitude(m): ");
                                    String Ap1 = input.next();
                                    double A = exp(Ap1);
                                    System.out.print("\nThe intensity of the sound wave is " + (.5*Math.sqrt(rho*B)*Math.pow(o,2)*Math.pow(A,2)) + " W/m^2\n");
                                    input.next();
                                }
                                else if(isw==2)
                                {
                                    System.out.print("\nExpression being used: I = p_max^2/(2*rho*v) ~ intensity of sound wave\n");
                                    input.next();
                                    System.out.print("\nDensity of Medium(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Velocity of Sound Wave(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Pressure Amplitude(Pa): ");
                                    String pp1 = input.next();
                                    double p = exp(pp1);
                                    System.out.print("\nThe intensity of the sound wave is " + (.5*Math.pow(p,2)/(rho*v)) + " W/m^2\n");
                                    input.next();
                                }
                                else if(isw==3)
                                {
                                    System.out.print("\nExpression being used: I = p_max^2/(2*sqrt(rho*B)) ~ intensity of sound wave\n");
                                    input.next();
                                    System.out.print("\nDensity of Medium(kg/m^3): ");
                                    String rhop1 = input.next();
                                    double rho = exp(rhop1);
                                    System.out.print("Bulk Modulus of Medium(Pa): ");
                                    String Bp1 = input.next();
                                    double B = exp(Bp1);
                                    System.out.print("Pressure Amplitude(Pa): ");
                                    String pp1 = input.next();
                                    double p = exp(pp1);
                                    System.out.print("\nThe intensity of the sound wave is " + (.5*Math.pow(p,2)/(2*Math.sqrt(rho*B))) + " W/m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1p==6)
                            {
                                System.out.print("\nWould you like to find:\nSound Intensity Level(1)\nIntensity Corresponding to Intensity Level(2)\nInput:");
                                int db = input.nextInt();
                                if(db==1)
                                {
                                    System.out.print("\nExpressiong being used: Beta = (10dB)*log(I/I_0) ~ sound intensity level\n");
                                    input.next();
                                    System.out.print("\nReference Intensity(W/m^2): 10^-12\n");
                                    double Io = 1/Math.pow(10,12);
                                    System.out.print("Intensity of Sound(W/m^2): ");
                                    String Ip1 = input.next();
                                    double I = exp(Ip1);
                                    System.out.print("\nThe sound intensity level is " + (10*Math.log10(I/Io)) + " dB\n");
                                    input.next();
                                }
                                else if(db==2)
                                {
                                    System.out.print("\nExpressiong being used: I = I_0*10^(Beta/(10dB)) ~ intensity of sound\n");
                                    input.next();
                                    System.out.print("\nReference Intensity(W/m^2): 10^-12\n");
                                    double Io = 1/Math.pow(10,12);
                                    System.out.print("Sound Intensity Level(dB): ");
                                    String Betap1 = input.next();
                                    double Beta = exp(Betap1);
                                    System.out.print("\nThe sound intensity is " + (Io*Math.pow(10,Beta/10)) + " W/m^2\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1p==7)
                            {
                                System.out.print("\nWould you like to find:\nFundamental Frequency in Pipe(1)\nLength of Pipe(2)\nVelocity of Sound in Pipe(3)\nInput:");
                                int ff = input.nextInt();
                                if(ff==1)
                                {
                                    System.out.print("\nExpression being used: f_n = n*v/(2*L) ~ fundamental frequency in open pipe\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Velocity of Sound(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Length of Pipe(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe fundamental frequency is " + (n*v/(2*L)) + " Hz\n");
                                    input.next();
                                }
                                else if(ff==2)
                                {
                                    System.out.print("\nExpression being used: L = n*v/(2*f)  ~ length of open pipe\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Velocity of Sound(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Fundamental Frequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe length of the pipe is " + (n*v/(2*f)) + " m\n");
                                    input.next();
                                }
                                else if(ff==3)
                                {
                                    System.out.print("\nExpression being used: v = f_n*2*L/n ~ velocity of sound in open pipe\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("\nFundamental Frequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Length of Pipe(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe velocity of sound is " + (f*2*L/n) + " m/s or about " + (f*2*L/n) + " mph\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1p==8)
                            {
                                System.out.print("\nWould you like to find:\nFundamental Frequency in Pipe(1)\nLength of Pipe(2)\nVelocity of Sound in Pipe(3)\nInput:");
                                int ff = input.nextInt();
                                if(ff==1)
                                {
                                    System.out.print("\nExpression being used: f_n = n*v/(4*L) ~ fundamental frequency in stopped pipe\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Velocity of Sound(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Length of Pipe(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe fundamental frequency is " + (n*v/(4*L)) + " Hz\n");
                                    input.next();
                                }
                                else if(ff==2)
                                {
                                    System.out.print("\nExpression being used: L = n*v/(4*f)  ~ length of stopped pipe\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("Velocity of Sound(m/s): ");
                                    String vp1 = input.next();
                                    double v = exp(vp1);
                                    System.out.print("Fundamental Frequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("\nThe length of the pipe is " + (n*v/(4*f)) + " m\n");
                                    input.next();
                                }
                                else if(ff==3)
                                {
                                    System.out.print("\nExpression being used: v = f_n*4*L/n ~ velocity of sound in stopped pipe\n");
                                    input.next();
                                    System.out.print("\nInteger Number: ");
                                    String np1 = input.next();
                                    double n = exp(np1);
                                    System.out.print("\nFundamental Frequency(Hz): ");
                                    String fp1 = input.next();
                                    double f = exp(fp1);
                                    System.out.print("Length of Pipe(m): ");
                                    String Lp1 = input.next();
                                    double L = exp(Lp1);
                                    System.out.print("\nThe velocity of sound is " + (f*4*L/n) + " m/s or about " + (f*4*L/n) + " mph\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                            }
                            else if(response1p==9)
                            {
                                System.out.print("\nExpression being used: f_beat = fa - fb ~ beat frequency\n");
                                input.next();
                                System.out.print("\nHigher Frequency(Hz): ");
                                String fap1 = input.next();
                                double fa = exp(fap1);
                                System.out.print("Low Frequency(Hz): ");
                                String fbp1 = input.next();
                                double fb = exp(fbp1);
                                System.out.print("\nThe beat frequency is " + (fa-fb) + " Hz\n");
                                input.next();
                            }
                            else if(response1p==10)
                            {
                                System.out.print("\nExpression being used: f_L = ((v+v_L)/(v+v_S))*f_S ~ frequency heard by listener from source\n");
                                input.next();
                                System.out.print("\nSpeed of Sound Wave in Medium(m/s): ");
                                String vp1 = input.next();
                                double v = exp(vp1);
                                System.out.print("Velocity of Source(m/s): ");
                                String vsp1 = input.next();
                                double vs = exp(vsp1);
                                System.out.print("Velocity of Listener(m/s): ");
                                String vlp1 = input.next();
                                double vl = exp(vlp1);
                                System.out.print("Frequency emitted by Source(Hz): ");
                                String fsp1 = input.next();
                                double fs = exp(fsp1);
                                System.out.print("\nThe frequency heard by the listener is " + (((v+vl)/(v+vs))*fs) + " Hz\n");
                                input.next();
                            }
                            else if(response1p==11)
                            {
                                System.out.print("\nWould you like to find the:\nAngle of the Shockwave Cone(1)\nSpeed of Source Creating Shock Wave(2)\nTime before Hearing Shockwave(3)\nInput:\n");
                                int sw = input.nextInt();
                                if(sw==1)
                                {
                                    System.out.print("\nWould you like to find the angle in terms of:\nMach Number(1)\nSpeed of Source and Speed of Sound(2)\nInput:");
                                    int ms = input.nextInt();
                                    if(ms==1)
                                    {
                                        System.out.print("\nExpression being used: theta = asin(1/Mach Number) ~ angle of shock cone\n");
                                        input.next();
                                        System.out.print("\nMach Number: ");
                                        String mnp1 = input.next();
                                        double mn = exp(mnp1);
                                        System.out.print("The angle of the shock cone is " + (Math.asin(1/mn)) + " radians or " + (Math.asin(1/mn))*57 + " degrees\n");
                                        input.next();
                                    }
                                    else if(ms==2)
                                    {
                                        System.out.print("\nExpression being used: theta = asin(1/(vs/v_sound)) ~ angle of shock cone\n");
                                        input.next();
                                        System.out.print("\nSpeed of Source(m/s): ");
                                        String vsp1 = input.next();
                                        double vs = exp(vsp1);
                                        System.out.print("Speed of Sound(m/s): ");
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("The angle of the shock cone is " + (Math.asin(1/(vs/v))) + " radians or " + (Math.asin(1/(vs/v)))*57 + " degrees\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(sw==2)
                                {
                                    System.out.print("\nWould you like to find the Speed of the Source in terms of:\nShock Cone Angle and Speed of Sound(1)\nMach Number and Speed of Sound(2)\nInput:");
                                    int ss = input.nextInt();
                                    if(ss==1)
                                    {
                                        System.out.print("\nExpression being used: v_s = v/sin(theta) ~ speed of source\n");
                                        input.next();
                                        System.out.print("\nAngle of Shock Cone(degrees): ");
                                        String thp1 = input.next();
                                        double th = exp(thp1);
                                        System.out.print("Speed of Sound(m/s): ");
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("\nThe velocity of the source is " + (v/Math.sin(th/57)) + " m/s or about " + (v/Math.sin(th/57))*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else if(ss==2)
                                    {
                                        System.out.print("\nExpression being used: v_s = Mach Number*v_sound ~ speed of source\n");
                                        input.next();
                                        System.out.print("\nMach Number: ");
                                        String Mp1 = input.next();
                                        double M = exp(Mp1);
                                        System.out.print("Speed of Sound(m/s): ");
                                        String vp1 = input.next();
                                        double v = exp(vp1);
                                        System.out.print("\nThe velocity of the source is " + (M*v) + " m/s or about " + (M*v)*2.2 + " mph\n");
                                        input.next();
                                    }
                                    else
                                        System.out.print("\nOk.");
                                }
                                else if(sw==3)
                                {
                                    System.out.print("\nExpression being used: v_s = v/sin(theta) ~ speed of source\n");
                                    input.next();
                                    System.out.print("\nAngle of Shock Cone(degrees): ");
                                    String thp1 = input.next();
                                    double th = exp(thp1);
                                    System.out.print("Speed of Source(m/s): ");
                                    String vsp1 = input.next();
                                    double vs = exp(vsp1);
                                    System.out.print("Altitude of Source(m): ");
                                    String dp1 = input.next();
                                    double d = exp(dp1);
                                    System.out.print("\nThe sonic boom will be heard in " + (d/(vs*Math.tan(th/57))) + " s\n");
                                    input.next();
                                }
                                else
                                    System.out.print("\nOk.");
                                
                            }
                            else if(response1p==12)
                                go1p = false;
                        }
                    }
                    else if(response2==3)
                        go2 = false;
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
