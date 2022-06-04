package emftproject;

import java.util.Scanner;

public class asm {

	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int choice=0;
		do
       {
	   System.out.println("\t\n *.*.*.*.*.*.*. MOTOR CALCULATOR.*.*.*.*.*.*");
       System.out.println("\t\n...............1.SYNCHRONOUS MOTOR CALCULATOR.............");
       System.out.println("\t\n...............2.INDUCTION MOTOR CALCULATOR..........");
       System.out.print("\t\nENTER YOUR CHOICE  ");
       choice=scn.nextInt();
       if(choice==1)
       {
    	   syn_motor();
       }
       else if(choice==2)
       {
    	   ind_motor();
       }
       else
       {
    	  break;
       }
       }while(choice>=1&&choice<=2);
	}
	public static void syn_motor()
	{
		int choice=0;
		do {
			System.out.print("\nSYNCHRONOUS MOTOR CALCULATOR");
			System.out.print("\n1. 3-Phase Input Power Of Synchronous Motor");
			System.out.print("\n2. Angle Between Voltage And Armature Current Using 3-phase Input Power");
			System.out.print("\n3. Armature resistance Of Synchronous Motor Using 3-phase Mechanical Power");
			System.out.print("\n4. Back EMF Of Synchronous Motor Using Ka");
			System.out.print("\n5. Mechanical Power Of Synchronous Motor");
			System.out.print("\n6. Power Factor Of Synchronous Motor Using 3-phase Input Power");
			System.out.print("\n7. Synchronous Speed Of Synchronous Motor Using Mechanical Power");
			System.out.print("\n8. Load Current Of Synchronous Motor Using 3-phase Input Power");
			System.out.print("\n9. Load Voltage Of Synchronous Motor Using 3-phase Input Power");
			System.out.print("\n10. exit");
			System.out.println("\nENTER YOUR CHOICE ");
			choice=scn.nextInt();
			if(choice==1)
			{
				double lv=0, li=0, th=0,a=0,w=0;
				System.out.print("\nENTER THE VALUE OF Load Voltage [Vl] IN VOLTS : ");
				lv=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Load current [Il]  : ");
				li=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Theta : ");
				th=scn.nextDouble();
				th=Math.toRadians(th);
				a=Math.cos(th);
				w=(lv*li*a)/1.732;
				w=(double)(Math.round(w*1000.0)/1000.0);
				System.out.println("\n CALCULATED 3-Phase Input Power Of Synchronous Motor [Pin] is "+w+" watt");	
			}
			if(choice==2)
			{
			 double p=0,v=0,i=0,x=0,th=0;
			    System.out.print("\nENTER THE VALUE OF  INPUT POWER [Pin] IN WATTS : ");
				p=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Voltage [V] IN VOLTS  : ");
				v=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE : ");
				i=scn.nextDouble();
				x=p/(v*i);
				//x=Math.toRadians(x);
				x=Math.acos(x)*57.2958;
				th=(double)(Math.round(x*1000.0)/1000.0);
				System.out.println("\nCALCULATED  Angle Between Voltage And Armature Current Using 3-phase Input Power is "+th+" Degree");	
			}
			if(choice==3)
			{
				double p=0,mp=0,i=0,x=0;
				System.out.print("\nENTER THE VALUE OF  Input Power [Pin] IN WATTS : ");
				p=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Mechanical Power [Pm] IN WATTS : ");
				mp=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Armature Current [Ia] : ");
				i=scn.nextDouble();
				x=(p-mp)/(i*i*3);
			    x=(double)(Math.round(x*10000000.0)/10000000.0);
				System.out.println("\nCALCULATED K of Armature resistance Of Synchronous Motor Using 3-phase Mechanical Power is "+x);	
			}
			if(choice==4)
			{
				double k=0, m=0, n=0, x=0;
				    System.out.print("\nENTER THE VALUE OF  Constant of the armature winding [Ka] : ");
					k=scn.nextDouble();
					System.out.print("\nENTER THE VALUE OF Magnetic Flux   : ");
					m=scn.nextDouble();
					System.out.print("\nENTER THE VALUE OF Synchronous Speed [Ns] IN MPS : ");
					n=scn.nextDouble();
					x=k*m*n;
					x=(double)(Math.round(x*1000000.0)/1000000.0);
					System.out.println("\nCALCULATED Back EMF Of Synchronous Motor Using Ka is "+x);
			}
			if(choice==5)
			{
				double b=0, i=0, t1=0, t2=0, a=0,x=0;
				System.out.print("\nENTER THE VALUE OF  Back emf [Eb]  : ");
				b=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  ARMATURE CURRENT[Ia] IN AMPERE : ");
				i=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  Theta 1 : ");
				t1=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  Theta 2 : ");
				t2=scn.nextDouble();
				a=Math.toRadians(t1-t2);
				a=Math.cos(a);
				x=b*i*a;
			    x=(double)(Math.round(x*10000000.0)/10000000.0);
				System.out.println("\nCALCULATED Mechanical Power Of Synchronous Motor is "+x+" watts");	
			}
			if(choice==6)
			{
				double p=0, i=0,v=0,x=0;
				System.out.print("\nENTER THE VALUE OF Input Power [Pin] IN WATTS: ");
				p=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Load current [Il] : ");
				i=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Load Voltage [Vl] IN VOTLS : ");
				v=scn.nextDouble();
				x=p/(v*i*1.732);
				x=(double)(Math.round(x*1000.0)/1000.0);
				System.out.println("\n CALCULATED  Power Factor Of Synchronous Motor Using 3-phase Input Power is "+x);	
			}
			if(choice==7)
			{
				double m=0, g=0, t=0;
				System.out.print("\nENTER THE VALUE OF Mechanical Power [Pm] IN WATTS : ");
				m=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Gross Torque [Tg] : ");
				g=scn.nextDouble();
				t=m/g;
				t=(double)(Math.round(t*1000.0)/1000.0);
				System.out.println(("\n CALCULATED Synchronous Speed Of Synchronous Motor Using Mechanical Power "+t+" meter"));
				
			}
			if(choice==8)
			{
			 double p=0,v=0,i=0,x=0,th=0;
			    System.out.print("\nENTER THE VALUE OF  INPUT POWER [Pin] IN WATTS : ");
				p=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Theta [θ]  : ");
				th=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  Load Voltage [Vl] : ");
				v=scn.nextDouble();
				th=Math.toRadians(th);
				x=Math.cos(th);
				
				i=p/(x*1.732*v);
				i=(double)(Math.round(i*1000.0)/1000.0);
				System.out.println("\nCALCULATED  Load Current Of Synchronous Motor Using 3-phase Input Power is "+i+" Ampere");	
			}
			if(choice==9)
			{
			 double p=0,v=0,i=0,x=0,th=0;
			    System.out.print("\nENTER THE VALUE OF  INPUT POWER [Pin] IN WATTS : ");
				p=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Load current [Il]  : ");
				i=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Theta [θ] : ");
				th=scn.nextDouble();
				th=Math.toRadians(th);
				x=Math.cos(th);
				v=(p*1.732)/(i*x);
				v=(double)(Math.round(v*1000.0)/1000.0);
				System.out.println("\nCALCULATED  Load Voltage Of Synchronous Motor Using 3-phase Input Power is "+v+" volts");	
			}
		}while(choice>=1&&choice<=9);
	}
	public static void ind_motor()
	{
		int choice=0;
		do {
			System.out.print("\n\nINDUCTION MOTOR CALCULATOR");
			System.out.print("\n1. Breakdown Slip Of An Induction Motor ");
			System.out.print("\n2. Frequency When The Number of Poles Is Given");
			System.out.print("\n3. Torque In Running Condition");
			System.out.print("\n4. Starting Torque of Inductance Motor ");
			System.out.print("\n5. Rotor Copper Loss  ");
			System.out.print("\n6. Exit");
			System.out.println("\nENTER YOUR CHOICE ");
			choice=scn.nextInt();
			if(choice==1)
			{
				double r=0, x=0,path=0;
				System.out.print("\nENTER THE VALUE OF Resistance [R] ");
				r=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  Reactance [X] ");
				x=scn.nextDouble();
				path=r/x;
				path=(double)(Math.round(path*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Breakdown Slip Of An Induction Motor is "+path);
			}
			if(choice==2)
			{
				double  p=0,n=0,f=0;
				System.out.print("\nENTER THE VALUE OF Number of pole [P] ");
				p=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Synchronous Speed [Ns] ");
				n=scn.nextDouble();
				f=(p*n)/120;
				f=(double)(Math.round(f*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Frequency When The Number of Poles Is Given is "+f);
			}
			if(choice==3)
			{
				double s=0, ef=0, r=0,n=0,x=0,num=0,den=0,t=0;
				System.out.print("\nENTER THE VALUE OF Slip [s] ");
				s=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Electromotive Force [ε] ");
				ef=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  Resistance [R] ");
				r=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Synchronous Speed [Ns] ");
				n=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Reactance [X] ");
				x=scn.nextDouble();
				num=3*s*ef*ef*r;
				den=2*3.14*n*(r*r+x*x*s);
				t=num/den;	
				System.out.print("\nCALCULATED Torque In Running Condition is "+t+" Newton meter");
			}
			if(choice==4)
			{
				double  ef=0, r=0,n=0,x=0,num=0,den=0,t=0;
				System.out.print("\nENTER THE VALUE OF Electromotive Force [ε] ");
				ef=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  Resistance [R] ");
				r=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Synchronous Speed [Ns] ");
				n=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Reactance [X] ");
				x=scn.nextDouble();
				num=3*ef*ef*r;
				den=2*3.14*n*(r*r+x*x);
				t=num/den;	
				System.out.print("\nCALCULATED Starting Torque of Inductance Motor "+t+" Newton meter");
			}
			if(choice==5)
			{
				double s=0,p=0,cu=0;
				System.out.print("\nENTER THE VALUE OF Slip [s] ");
				s=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF Input Power [Pin] ");
				p=scn.nextDouble();
				cu=s*p;
				cu=(double)(Math.round(cu*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Rotor Copper Loss  is "+cu+"watts");
			}
		}while(choice>=1&&choice<=5);
	}


}

