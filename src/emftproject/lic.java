package emftproject;
import java.util.*;
import java.lang.Math;
public class lic {
    public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int choice=0;  
	       do
	       {
	    	 
	    	 System.out.println("\n\n\t\t*_*_*_*_*_*_*_*_OPERATIONAL AMPLIFIER CALCULATOR_*_*_*_*_*_*_*\n");
	    	 System.out.println("\t\t*   1.CLOSE LOOP GAIN OF NON-INVERTING AMPLIFIER             *\n");
	    	 System.out.println("\t\t*   2.CLOSE LOOP GAIN OF INVERTING AMPLIFIER                 *\n");
	    	 System.out.println("\t\t*   3.COMMON MODE REJECTION RATIO OF DIFFERENCE AMPLIFIER    *\n");
	    	 System.out.println("\t\t*   4.INTEGRATOR FREQENCY                                    *\n");
	    	 System.out.println("\t\t*   5.MAGNITUDE OF INTEGRATOR TRANSFER FUNCTION              *\n");
	    	 System.out.println("\t\t*   6.DIFFERENTIATOR FREQENCY                                *\n");
	    	 System.out.println("\t\t*   7.DIFFERENTAIL VOLTAGE GAIN OF INSTRUMENTATION AMPLIFIER *\n");
	    	 System.out.println("\t\t*   8.OUTPUT VOLTAGE OF LOG AMPLIFIER                        *\n");
	    	 System.out.println("\t\t*   9.OUTPUT VOLTAGE OF ANTILOG AMPLIFIER                    *\n");
	    	 System.out.println("\t\t*   10.HYSTERISIS WIDTH OF INVERTING SCHMITT TRIGGER         *\n");
	    	 System.out.println("\t\t*   11.CURRENT IN FINITE OPEN LOOP GAIN OF OP AMP            *\n");
	    	 System.out.println("\t\t*   12.TIME PEROID OF ASTABLE MULTIVIBRATOR                  *\n");
	    	 System.out.println("\t\t*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.\n");
	    	 System.out.print("\n     ENTER YOUR CHOICE :: ");
	    	 choice=scn.nextInt();
	    	 if(choice==1)
	    	 {
	    		 cgain_nin();
	    	 }
	    	 else if(choice==2)
	    	 {
	    		 cgain_in();
	    	 }
	    	 else if(choice==3)
	    	 {
	    		 cmrr();
	    	 }
	    	 else if(choice==4)
	    	 {
	    		 int_fq();
	    	 }
	    	 else if(choice==5)
	    	 {
	    		 mg_int();
	    	 }
	    	 else if(choice==6)
	    	 {
	    		 diff_fq();
	    	 }
	    	 else if(choice==7)
	    	 {
	    		 gain_ins();
	    	 }
	    	 else if(choice==8) 
	    	 {
	    		v_log(); 
	    	 }
	    	 else if(choice==9)
	    	 {
	    		 v_alog();
	    	 }
	    	 else if(choice==10)
	    	 {
	    		 hy_wd();
	    	 }
	    	 else if(choice==11)
	    	 {
	    		 i_opamp();
	    	 }
	    	 else if(choice==12)
	    	 {
	    		 t_amv();
	    	 }
	    	 System.out.print("\t\n\n\n   IF YOU WANT TO CONTINUE PRESS 1 OR PRESS 0 FOR EXIT ");
	    	 int a=scn.nextInt();
	    	 if(a==0)
	    	 {
	    		 choice=20;
	    	 }
	       }while(choice>=1&&choice<=12);
	}
	public static void cgain_nin()
	{
		double r1=0,r2=0,av=0;
		System.out.print("\n Enter Resistance of Secondary winding in primary [R2] in ohms :");
        r2=scn.nextDouble();
        System.out.print("\n Enter Resistance of Primary winding in primary [R1] in ohms :");
        r1=scn.nextDouble();
        System.out.print("\n Enter Output voltage gain [Avo] :");
        av=scn.nextDouble();
        double x=1+r2/r1;
        double y=1+x/av;
        System.out.print("\n Closed loop gain of non inverting amplifier circuit [Gv] :"+x/y);
       			
	}
	public static void cgain_in()
	{
		double r1=0,r2=0,av=0;
		System.out.print("\n Enter Resistance of Secondary winding in primary [R2] in ohms :");
        r2=scn.nextDouble();
        System.out.print("\n Enter Resistance of Primary winding in primary [R1] in ohms :");
        r1=scn.nextDouble();
        System.out.print("\n Enter Output voltage gain [Avo] :");
        av=scn.nextDouble();
        double x=1+r2/r1;
        double y=1+x/av;
        System.out.print("\n Closed loop gain of non inverting amplifier circuit [Gv] :"+-(r2/r1)/y);  			
	}
	public static void cmrr()
	{
		double a1=0,a2=0;
		System.out.print("\n Enter Differential mode gain [Ad] in decibel :");
        a1=scn.nextDouble();
        System.out.print("\n Enter Common Mode Gain [Acm] in decibel :");
        a2=scn.nextDouble();
        double cmr=20*Math.log10(10);
        System.out.print("\n Common-mode rejection ratio of the difference amplifier :"+cmr);  			
	}
	public static void int_fq()
	{
		double r=0,c=0;
		System.out.print("\n Enter Resisitance in ohms :");
        r=scn.nextDouble();
        System.out.print("\n Enter Capacitance in farad :");
        c=scn.nextDouble();
        double fq=1/(r*c);
        System.out.print("\n INTEGERATOR FREQENCY : "+fq);
	}
	public static void mg_int()
	{
		double r=0,c=0,w=0;
		System.out.print("\n Enter Angular frequency in radian per second :");
        w=scn.nextDouble();
		System.out.print("\n Enter Resisitance in ohms :");
        r=scn.nextDouble();
        System.out.print("\n Enter Capacitance in farad :");
        c=scn.nextDouble();
        double fq=1/(r*c*w);
        System.out.print("\n Magnitude of integrator transfer function in decibles:"+fq);
	}
	public static void diff_fq()
	{
		double r=0,c=0;
		System.out.print("\n Enter Resisitance in ohms :");
        r=scn.nextDouble();
        System.out.print("\n Enter Capacitance in farad :");
        c=scn.nextDouble();
        double fq=1/(2*3.14*r*c);
        System.out.print("\n DIFFERENTIATOR FREQENCY : "+fq);
	}
	public static void gain_ins()
	{
		double r1=0,r2=0,r3=0,r4=0;
		System.out.print("\n Enter Resistance of Secondary winding op amp A1 [R2] in ohms :");
        r2=scn.nextDouble();
        System.out.print("\n Enter Resistance of primary winding op amp A1 [R1] in ohms :");
        r1=scn.nextDouble();
        System.out.print("\n Enter Resistance of Secondary winding op amp A3 [R4] in ohms :");
        r4=scn.nextDouble();
        System.out.print("\n Enter Resistance of primary winding op amp A3 [R3] in ohms :");
        r3=scn.nextDouble();
        double gn=(r4*r1+r4*r2)/(r3*r1);
        System.out.print("\n Closed loop gain of non inverting amplifier circuit [Gv] :"+gn);  			
	}
	public static void v_log()
	{
		double n=0,vt=0,vi=0,ri=0,r=0;
		System.out.print("\n Enter value of constant :");
        n=scn.nextDouble();
        System.out.print("\n Enter value of Thermal voltage in volts :");
        vt=scn.nextDouble();
        System.out.print("\n Enter value of Input voltage in volts :");
        vi=scn.nextDouble();
        System.out.print("\n Enter the value of Reverse Saturation Current in ampere :");
        ri=scn.nextDouble();
        System.out.print("\n Enter the value of Resistance in ohms :");
        r=scn.nextDouble();
        double x=n*vt;
        double y=1+vi/(ri*r);
        double vo=-x*Math.log(y);
        System.out.print("\n Output Voltage :"+vo);  			
	}
	public static void v_alog()
	{
		double n=0,vt=0,vi=0,ri=0,r=0;
		System.out.print("\n Enter value of constant :");
        n=scn.nextDouble();
        System.out.print("\n Enter value of Thermal voltage in volts :");
        vt=scn.nextDouble();
        System.out.print("\n Enter value of Input voltage in volts :");
        vi=scn.nextDouble();
        System.out.print("\n Enter the value of Reverse Saturation Current in ampere :");
        ri=scn.nextDouble();
        System.out.print("\n Enter the value of Resistance in ohms :");
        r=scn.nextDouble();
        double x=r*ri;
        double y=vi/(n*vt);
        double vo=-x*(Math.exp(y)-1);
        System.out.print("\n Output Voltage :"+vo);  			
	}
	public static void hy_wd()
	{
		double r1=0,r2=0,vs=0;
		System.out.print("\n Enter Feedback Resisitance[R1] in ohms :");
        r1=scn.nextDouble();
        System.out.print("\n Enter Resisitance[R2] in ohms :");
        r2=scn.nextDouble();
        System.out.print("\n Enter Saturated Voltage in volts :");
        vs=scn.nextDouble();
        double hw=(2*r2/(r1+r2))*vs;
        System.out.print("\n HYSTERISIS WIDTH : "+hw);
	}
	public static void i_opamp()
	{
		double vi=0,vo=0,a=0,r=0;
		System.out.print("\n Enter Input voltage in volts :");
        vi=scn.nextDouble();
        System.out.print("\n Enter Output voltage in volts :");
        vo=scn.nextDouble();
        System.out.print("\n Enter Open Loop Gain :");
        a=scn.nextDouble();
        System.out.print("\n Enter Resistance in ohms :");
        r=scn.nextDouble();
        double i=((vi+vo)/a);
        System.out.print("\n Current in ampere : "+i/r);
	}
	public static void t_amv()
	{
		double r=0,c=0,r1=0,r2=0;
		System.out.print("\n Enter value of Resistance in ohms :");
        r=scn.nextDouble();
        System.out.print("\n Enter value of Capacitance in farad :");
        c=scn.nextDouble();
        System.out.print("\n Enter value of Feedback Resistance[R1] in ohms :");
        r1=scn.nextDouble();
        System.out.print("\n Enter the value of Resistance[R2] in ohms :");
        r2=scn.nextDouble();
        double x=2*r*c;
        double y=1+2*r2/r1;
        double t=x*Math.log(y);
        System.out.print("\n Timeperiod :"+t);
	}
	
	

}
