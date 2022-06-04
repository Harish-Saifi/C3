package emftproject;
import java.io.*;
import java.util.*;
public class eect {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int choice=0;
		do
       {
	   System.out.println("\t\n *.*.*.*.*.*.*.DC MOTOR CALCULATOR.*.*.*.*.*.*");
       System.out.println("\t\n...............1.SERIES DC MOTOR.............");
       System.out.println("\t\n...............2.SERIES SHUNT MOTOR..........");
       System.out.println("\t\n...............3.EFFICIENCY CALCULATOR.......");
       System.out.print("\t\nENTER YOUR CHOICE  ");
       choice=scn.nextInt();
       if(choice==1)
       {
    	   dc_motor();
       }
       else if(choice==2)
       {
    	   shunt_motor();
       }
       else if(choice==3)
       {
    	   efficiency();
       }
       else
       {
    	  break;
       }
       }while(choice>=1&&choice<=3);
	}
	public static void dc_motor()
	{
		int choice=0;
		do {
			System.out.print("\nSERIES DC MOTOR CALCULATOR");
			System.out.print("\n1. Angular Speed Of Series DC Motor Using Kf");
			System.out.print("\n2. Armature Resistance Of Series DC Motor Using Voltage");
			System.out.print("\n3. K of Series DC Motor Using Speed");
			System.out.print("\n4. Kf of Series DC Motor Using Armature Induced Voltage");
			System.out.print("\n5. Magnetic Flux Of Series DC Motor Using Speed");
			System.out.print("\n6. Series Field Resistance Of Series DC Motor Using Voltage");
			System.out.print("\n7. Torque Of Series DC Motor Using Output Power");
			System.out.print("\n8. exit");
			System.out.println("\nENTER YOUR CHOICE ");
			choice=scn.nextInt();
			if(choice==1)
			{
				double ea=0, kf=0, ia=0, fx=0, w=0;
				System.out.print("\nENTER THE VALUE OF INDUCED VOLTAGE IN VOLTS : ");
				ea=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF CONSTANT BASED ON THE MACHINE CONSTRUCTION Kf  : ");
				kf=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE : ");
				ia=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF FLUX IN WEBER : ");
				fx=scn.nextDouble();
				w=ea/(kf*ia*fx);
				w=(double)(Math.round(w*1000.0)/1000.0);
				System.out.println("\n CALCULATED Angular Speed is "+w+" rps");	
			}
			if(choice==2)
			{
			 double v=0, ev=0, ac=0, sfr=0, ar=0;
			    System.out.print("\nENTER THE VALUE OF  VOLTAGE IN VOLTS : ");
				v=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF INDUCED VOLTAGE IN VOLTS  : ");
				ev=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE : ");
				ac=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF SERIES FIELD RESISTANCE : ");
				sfr=scn.nextDouble();
				ar=(v-ev)/ac-sfr;
				ar=(double)(Math.round(ar*1000.0)/1000.0);
				System.out.println("\nCALCULATED  Armature Resistance Of Series DC Motor Using Voltage is "+ar+" ohm");	
			}
			if(choice==3)
			{
				double v=0, ia=0, ar=0, rsh=0, fm=0, n=0, k=0;
				System.out.print("\nENTER THE VALUE OF  VOLTAGE IN VOLTS : ");
				v=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  ARMATURE CURRENT IN AMPERE : ");
				ia=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE RESISTANCE IN OHM : ");
				ar=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF SHUNT FIELD RESISTANCE IN OHM : ");
				rsh=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF MAGNETIC FLUX IN WEBER : ");
				fm=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF MOTOR SPEED IN METER PER SECOND : ");
				n=scn.nextDouble();
				k=(v-(ia*(ar-rsh)))/(fm*n);
			    k=(double)(Math.round(k*10000000.0)/10000000.0);
				System.out.println("\nCALCULATED K of Series DC Motor Using Speed is "+k);	
			}
			if(choice==4)
			{
				double ea=0, fm=0, w=0, ia=0, kf=0;
				    System.out.print("\nENTER THE VALUE OF  INDUCED VOLTAGE IN VOLTS : ");
					ea=scn.nextDouble();
					System.out.print("\nENTER THE VALUE OF FLUX IN WEBER  : ");
					fm=scn.nextDouble();
					System.out.print("\nENTER THE VALUE OF ANGULAR SPEED IN RPS : ");
					w=scn.nextDouble();
					System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE : ");
					ia=scn.nextDouble();
					kf=ea/(fm*w*ia*6.284);
					kf=(double)(Math.round(kf*1000000.0)/1000000.0);
					System.out.println("\nCALCULATED Kf of Series DC Motor Using Armature Induced Voltage is "+kf);
			}
			if(choice==5)
			{
				double v=0, ia=0, ar=0, rsh=0, fm=0, n=0, k=0;
				System.out.print("\nENTER THE VALUE OF  VOLTAGE IN VOLTS : ");
				v=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF  ARMATURE CURRENT IN AMPERE : ");
				ia=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE RESISTANCE IN OHM : ");
				ar=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF SHUNT FIELD RESISTANCE IN OHM : ");
				rsh=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF MOTOR SPEED IN METER PER SECOND : ");
				n=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF DC MOTOR CONSTANT K : ");
				k=scn.nextDouble();
				fm=(v-(ia*(ar-rsh)))/(k*n);
			    fm=(double)(Math.round(fm*10000000.0)/10000000.0);
				System.out.println("\nCALCULATED K of Series DC Motor Using Speed is "+fm+" weber");	
			}
			if(choice==6)
			{
				double ea=0, ia=0, ra=0, v=0, rse=0;
				System.out.print("\nENTER THE VALUE OF VOLTAGE IN VOLTS: ");
				v=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF INDUCED VOLTAGE IN VOLTS : ");
				ea=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE : ");
				ia=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE RESISTANCE IN AMPERE : ");
				ra=scn.nextDouble();
				rse=(v-ea)/ia-ra;
				rse=(double)(Math.round(rse*1000.0)/1000.0);
				System.out.println("\n CALCULATED  Series Field Resistance Of Series DC Motor is "+rse+" ohm");	
			}
			if(choice==7)
			{
				double po=0, w=0, t=0;
				System.out.print("\nENTER THE VALUE OF OUTPUT POWER IN WATTS : ");
				po=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ANGULAR SPEED IN RPS : ");
				w=scn.nextDouble();
				t=po/(w*6.284);
				t=(double)(Math.round(t*1000.0)/1000.0);
				System.out.println(("\n CALCULATED Torque Of Series DC Motor "+t+"newton meter"));
				
			}
		}while(choice>=1&&choice<=7);
	}
	public static void shunt_motor()
	{
		int choice=0;
		do {
			System.out.print("\n\nSHUNT DC MOTOR CALCULATOR");
			System.out.print("\n1. Armature Parallel Path Of Shunt DC Motor Using K ");
			System.out.print("\n2. Armature Conductors Of DC Shunt Motor Using K");
			System.out.print("\n3. Back Emf Of Shunt DC Motor Using Motor Speed");
			System.out.print("\n4. Induced Back EMF Shunt DC Motor Using Voltage ");
			System.out.print("\n5. Magnetic flux Of DC Shunt Motor Using Torque ");
			System.out.print("\n6. Exit");
			System.out.println("\nENTER YOUR CHOICE ");
			choice=scn.nextInt();
			if(choice==1)
			{
				double k=0, z=0, p=0, path=0;
				System.out.print("\nENTER THE VALUE OF CONSTANT BASED ON THE MACHINE CONSTRUCTION K ");
				k=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF NUMBER OF CONDUCTORS ");
				z=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF NUMBER OF POLES ");
				p=scn.nextDouble();
				path=(k*p*z)/60;
				path=(double)(Math.round(path*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Armature Parallel Path Of Shunt DC Motor is "+path);
			}
			if(choice==2)
			{
				double k=0, z=0, p=0, path=0;
				System.out.print("\nENTER THE VALUE OF NUMBER OF PARALLEL PATHS ");
				path=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF CONSTANT BASED ON THE MACHINE CONSTRUCTION K ");
				k=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF NUMBER OF POLES ");
				p=scn.nextDouble();
				z=(path*60)/(k*p);
				z=(double)(Math.round(z*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Armature Conductors Of DC Shunt Motor is "+z);
			}
			if(choice==3)
			{
				double n=0, mf=0, k=0, eb=0;
				System.out.print("\nENTER THE VALUE OF MOTOR SPEED IN METER PER SECOND ");
				n=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF MAGNETIC FLUX IN WEBER ");
				mf=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF CONSTANT BASED ON THE MACHINE CONSTRUCTION K ");
				k=scn.nextDouble();
				eb=(n*mf)/k;
				eb=(double)(Math.round(eb*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Back Emf Of Shunt DC Motor is "+eb+" volt");
			}
			if(choice==4)
			{
				double v=0, ia=0, ra=0, eb=0;
				System.out.print("\nENTER THE VALUE OF VOLTAGE IN VOLTS ");
				v=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE ");
				ia=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE RESISTANCE IN OHM ");
				ra=scn.nextDouble();
				eb=v/(ia*ra);
				eb=(double)(Math.round(eb*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Back Emf Of Shunt DC Motor is "+eb+" volt");
			}
			if(choice==5)
			{
				double t=0, kf=0, ia=0, fm=0;
				System.out.print("\nENTER THE VALUE OF TORQUE IN NEWTON METER ");
				t=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF CONSTANT BASED ON THE MACHINE CONSTRUCTION K ");
				kf=scn.nextDouble();
				System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT IN AMPERE ");
				ia=scn.nextDouble();
				fm=t/(kf*ia);
				fm=(double)(Math.round(fm*1000.0)/1000.0);	
				System.out.print("\nCALCULATED Magnetic flux Of DC Shunt Motor is "+fm+" weber");
			}
		}while(choice>=1&&choice<=5);
	}
public static void efficiency()
{
	int choice=0;
	do {
		System.out.print("\n\nEFFICIENCY CALCULATOR");
		System.out.print("\n1. Armature Copper Loss Using Overall Efficiency Of Dc Motor ");
		System.out.print("\n2. Core Loss Using Overall Efficiency Of Dc Motor");
		System.out.print("\n3. Current Using Overall Efficiency Of Dc Motor");
		System.out.print("\n4. Electrical Efficiency Of Dc Motor ");
		System.out.print("\n5. Mechanical Efficiency Of Dc Motor ");
		System.out.print("\n6. Overall Efficiency Of Dc Motor ");
		System.out.print("\n7. Exit");
		System.out.println("\nENTER YOUR CHOICE ");
		choice=scn.nextInt();
		if(choice==1)
		{
			double pin=0, x=0, pm=0, cl=0, cf=0, pa=0;
			System.out.print("\nENTER THE VALUE OF INPUT POWER IN WATTS ");
			pin=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF OVERALL EFFICIENCY ");
			x=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF MECHANICAL POWER ");
			pm=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF CORE LOSS IN WATTS");
			cl=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF FIELD COPPER LOSS IN WATTS ");
			cf=scn.nextDouble();
			pa=pin-(x*pin)-pm-cl-cf;
			pa=(double)(Math.round(pa*1000.0)/1000.0);	
			System.out.print("\nCALCULATED Armature Copper Loss is "+pa+" watt");
		}
		if(choice==2)
		{
			double pl=0, ml=0, c=0;
			System.out.print("\nENTER THE VALUE OF POWER LOSS IN WATTS ");
			pl=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF MECHANICAL LOSS IN WATTS ");
			ml=scn.nextDouble();
			c=pl-ml;
			System.out.println("\nCALCULATED Core Loss is "+c+" watt");
			
		}
		if(choice==3)
		{
			double ish=0, ra=0, ml=0, cl=0, v=0, x=0, i=0;
			System.out.print("\nENTER THE VALUE OF SHUNT FIELD CURRENT IN AMPERE ");
			ish=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF ARMATURE REISITANCE IN OHM ");
			ra=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF MECHANICAL LOSS IN WATTS ");
			ml=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF CORE LOSS IN WATTS");
			cl=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF VOLTAGE IN VOLTS ");
			v=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF OVERALL EFFICIENCY ");
			x=scn.nextDouble();
			i=(((Math.pow(ish,2))*ra)+ml+cl)/(v*(1-x));
			i=(double)(Math.round(i*1000.0)/1000.0);	
			System.out.print("\nCALCULATED current is "+i+" ampere");	
		}
		if(choice==4)
		{
			double t=0, w=0, v=0, ar=0, ne=0;
			System.out.print("\nENTER THE VALUE OF ARMATURE TORQUE IN NEWTON METER ");
			t=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF ANGULAR SPEED IN RPS ");
			w=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF VOLTAGE IN VOLTS ");
			v=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF ARMATURE CURRENT");
			ar=scn.nextDouble();
			ne=(t*w*6.28)/(v*ar);
			ne=(double)(Math.round(ne*1000.0)/1000.0);	
			System.out.print("\nCALCULATED Electrical Efficiency is "+ne);
		}
		if(choice==5)
		{
			double ta=0, t=0, me=0;
			System.out.print("\nENTER THE VALUE OF ARMATURE TORQUE IN NEWTON METER ");
			ta=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF TORQUE IN NEWTON METER ");
			t=scn.nextDouble();
			me=ta/t;
			me=(double)(Math.round(me*1000.0)/1000.0);	
			System.out.print("\nCALCULATED Mechanical Efficiency is "+me);
			
		}
		if(choice==6)
		{
			double mp=0, ip=0, e=0;
			System.out.print("\nENTER THE VALUE OF MECHANICAL POWER IN WATTS ");
			mp=scn.nextDouble();
			System.out.print("\nENTER THE VALUE OF INPUT POWER IN WATTS ");
			ip=scn.nextDouble();
			e=mp/ip;
			e=(double)(Math.round(e*1000.0)/1000.0);	
			System.out.print("\nCALCULATED Overall Efficiency is "+e);
		}
	}while(choice>=1&&choice<=6);
}

}
