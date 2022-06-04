package emftproject;
import java.util.*;
import java.io.*;
public class emft {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;  
       do
       {
    	 
    	 System.out.println("\n\n\t\t*_*_*_*_*_*_*_*_*_*_*_MAIN MENU_*_*_*_*_*_*_*_*_*_*_*_*\n");
    	 System.out.println("\t\t*     1.CARTESIAN TO CYLINDRICAL COORDINATES          *\n");
    	 System.out.println("\t\t*     2.CARTESIAN TO SPHERICAL COORDINATES            *\n");
    	 System.out.println("\t\t*     3.CYLINDRICAL TO CARTESIAN COORDINATES          *\n");
    	 System.out.println("\t\t*     4.CYLINDRICAL TO SPHERICAL COORDINATES          *\n");
    	 System.out.println("\t\t*     5.SPHERICAL TO CARTESIAN COORDINATES            *\n");
    	 System.out.println("\t\t*     6.SPHERICAL TO CYLINDRICAL COORDINATES          *\n");
    	 System.out.println("\t\t*     7.CARTESIAN VECTOR TO CYLINDRICAL AT A POINT    *\n");
    	 System.out.println("\t\t*     8.CARTESIAN VECTOR TO SPHERICAL AT A POINT      *\n");
    	 System.out.println("\t\t*     9.CYLINDRICAL VECTOR TO CARTESIAN AT A POINT    *\n");
    	 System.out.println("\t\t*     10. SPHERICAL VECTOR TO CARTESIAN AT A POINT    *\n");
    	 System.out.println("\t\t*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
    	 System.out.print("\n     ENTER YOUR CHOICE :: ");
    	 choice=scn.nextInt();
    	 if(choice==1)
    	 {
    		 car_to_cyl();
    	 }
    	 else if(choice==2)
    	 {
    		 car_to_sph();
    	 }
    	 else if(choice==3)
    	 {
    		 cyl_to_car();
    	 }
    	 else if(choice==4)
    	 {
    		 cyl_to_sph();
    	 }
    	 else if(choice==5)
    	 {
    		 sph_to_car();
    	 }
    	 else if(choice==6)
    	 {
    		 sph_to_cyl();
    	 }
    	 else if(choice==7)
    	 {
    		 carv_to_cylv();
    	 }
    	 else if(choice==8) 
    	 {
    		carv_to_sphv(); 
    	 }
    	 else if(choice==9)
    	 {
    		 cylv_to_carv();
    	 }
    	 else if(choice==10)
    	 {
    		 sphv_to_carv();
    	 }
    	 System.out.print("\t\t\n   IF YOU WANT TO CONTINUE PRESS 1 OR PRESS 0 FOR EXIT ");
    	 int a=scn.nextInt();
    	 if(a==0)
    	 {
    		 choice=20;
    	 }
       }while(choice>=1&&choice<=10);
	}
   public static void car_to_cyl()
   {
	   System.out.print("\n     ENTER THE VALUE OF x : ");
	   double x=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF y : ");
	   double y=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF z : ");
	   double z=scn.nextDouble();
	   double rho=0.0,phi=0.0;
	   rho=Math.sqrt(x*x+y*y);
	   phi=Math.atan(y/x)*57.2958;
	   if(x<0&&y>0||x<0&&y<0)
	   {
		   phi=phi+180;
	   }
	   if(x==0&&y<0)
	   {
		   phi+=360;
	   }
	   if(x>0&&y<0)
	   {
		   phi+=360;
	   }
	   rho=(double)(Math.round(rho*1000.0)/1000.0);
	   phi=(double)(Math.round(phi*1000.0)/1000.0);
	   z=(double)(Math.round(z*1000.0)/1000.0);
	   System.out.println("\n\t******* CONVERTED COORDINATES ARE ******* ");
	   System.out.println("\n     rho --> "+rho);
	   System.out.println("\n     phi --> "+phi);
	   System.out.println("\n     z --> "+z);
	  	   
   }
   public static void car_to_sph()
   {
	   System.out.print("\n     ENTER THE VALUE OF x : ");
	   double x=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF y : ");
	   double y=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF z : ");
	   double z=scn.nextDouble();
	   double r=0.0,theta=0.0,phi=0.0;
	   r=Math.sqrt(x*x+y*y+z*z);
	   phi=Math.atan(y/x)*57.2958;
	   if(x<0&&y>0||x<0&&y<0)
	   {
		   phi=phi+180;
	   }
	   if(x==0&&y<0)
	   {
		   phi+=360;
	   }
	   if(x>0&&y<0)
	   {
		   phi+=360;
	   }
	   
	   double d=Math.sqrt(x*x+y*y);
	   theta=Math.atan(d/z)*57.2958;
	   if(theta<0)
	   {
		   theta+=180;
	   }
	   r=(double)(Math.round(r*1000.0)/1000.0);
	   theta=(double)(Math.round(theta*1000.0)/1000.0);
	   phi=(double)(Math.round(phi*1000.0)/1000.0);
	   System.out.println("\n****** CONVERTED COORDINATES ARE *******");
	   System.out.println("\n     r --> "+r);
	   System.out.println("\n     theta --> "+theta);
	   System.out.println("\n    phi --> "+phi);
	  	   
   }
   public static void cyl_to_car()
   {
	   System.out.print("ENTER THE VALUE OF rho : ");
	   double rho=scn.nextDouble();
	   System.out.print("ENTER THE VALUE OF phi : ");
	   double phi=scn.nextDouble();
	   System.out.print("ENTER THE VALUE OF z : ");
	   double z=scn.nextDouble();
	   double x=0.0,y=0.0;
	   phi=Math.toRadians(phi);
	   rho=Math.toRadians(rho);
	   x=rho*Math.cos(phi)*57.2958;
	   y=rho*Math.sin(phi)*57.2958;
	   System.out.println("\n******** CONVERTED COORDINATES ARE *******");
	   System.out.println("\n     x --> "+x);
	   System.out.println("\n     y --> "+y);
	   System.out.println("\n     z --> "+z);
	  	     
   }
   public static void cyl_to_sph()
   {
	   System.out.print("\n     ENTER THE VALUE OF rho : ");
	   double rho=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF phi : ");
	   double ph=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF z : ");
	   double z=scn.nextDouble();
	   double r=0.0,phi=0.0;
	   r=Math.sqrt(rho*rho+z*z);
	   phi=Math.atan(rho/z)*57.2958;
	   if(phi<0)
	   {
		   phi+=180;
	   }
	   r=(double)(Math.round(r*1000.0)/1000.0);
	   phi=(double)(Math.round(phi*1000.0)/1000.0);
	   ph=(double)(Math.round(ph*1000.0)/1000.0);
	   System.out.println("\n******** CONVERTED COORDINATES ARE ********");
	   System.out.println("\n     r --> "+r);
	   System.out.println("\n     theta --> "+phi);
	   System.out.println("\n    phi --> "+ph);
	  	       
   }
   public static void sph_to_car()
   {
	   System.out.print("\n      ENTER THE VALUE OF r : ");
	   double r=scn.nextDouble();
	   System.out.print("\n      ENTER THE VALUE OF theta : ");
	   double theta=scn.nextDouble();
	   System.out.print("\n      ENTER THE VALUE OF phi : ");
	   double phi=scn.nextDouble();  
	   double x=0.0,y=0.0,z=0.0;
	   double p1=Math.sin(Math.toRadians(phi));
	   double p2=Math.cos(Math.toRadians(theta));
	   double p3=Math.sin(Math.toRadians(theta));
	   double p4=Math.cos(Math.toRadians(phi));
	   x=r*p1*p2;
	   y=r*p1*p3;
	   z=r*p4;
	   x=(double)(Math.round(x*1000.0)/1000.0);
	   y=(double)(Math.round(y*1000.0)/1000.0);
	   z=(double)(Math.round(z*1000.0)/1000.0);
	   System.out.println("\n******** CONVERTED COORDINATES ARE ********");
	   System.out.println("\n     x --> :"+x);
	   System.out.println("\n     y --> :"+y);
	   System.out.println("\n     z --> :"+z);
	      
   }
   public static void sph_to_cyl()
   {
	   System.out.print("\n     ENTER THE VALUE OF r :");
	   double r=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF theta :");
	   double theta=scn.nextDouble();
	   System.out.print("\n     ENTER THE VALUE OF phi :");
	   double phi=scn.nextDouble();  
	   double rho=0.0,z=0.0;
	   double p1=Math.sin(Math.toRadians(theta));
	   double p4=Math.cos(Math.toRadians(theta));
	   rho=r*p1; 
	   z=r*p4;
	   rho=(double)(Math.round(rho*1000.0)/1000.0);
	   z=(double)(Math.round(z*1000.0)/1000.0);
	   phi=(double)(Math.round(phi*1000.0)/1000.0);
	   System.out.println("\n******* CONVERTED COORDINATES ARE *********");
	   System.out.println("\n     rho --> :"+rho);
	   System.out.println("\n     phi --> :"+phi);
	   System.out.println("\n     z --> :"+z);
	      
   }
   public static void carv_to_cylv()
   {
	
			   System.out.print("\n     ENTER THE x COMPONENT OF VECTOR : ");
			   double x=scn.nextDouble();
			   System.out.print("\n     ENTER THE y COMPONENT OF VECTOR : ");
			   double y=scn.nextDouble();
			   System.out.print("\n     ENTER THE z COMPONENT OF VECTOR : ");
			   double z=scn.nextDouble();
			   System.out.println("\n     ENTER THE POINT : ");
			   double x1=scn.nextDouble();
			   double y1=scn.nextDouble();
			   double z1=scn.nextDouble();
			   double phi=Math.atan(y1/x1)*57.2958;
			   if(x1<0&&y1>0||x1<0&&y1<0)
			   {
				   phi=phi+180;
			   }
			   if(x1>0&&y1<0)
			   {
				   phi=360+phi;
			   }
			   double a=Math.sin(Math.toRadians(phi));
			   double b=Math.cos(Math.toRadians(phi));
			   double arh=(x*b+y*a);
			   double arho=(double)(Math.round(arh*1000.0)/1000.0);
			   double aphi=(y*b-a*x);
			   aphi=(double)(Math.round(aphi*1000.0)/1000.0);
			   System.out.println("\n****CYLINDRICAL VECTOR :  ("+arho+")arho + ("+aphi+")"+"aphi + ("+z+")az");
			   System.out.println("\n     rho COORDINATE OF VECTOR :"+arho);
			   System.out.println("\n     phi COORDINATE OF VECTOR :"+aphi);
			   System.out.println("\n     z COORDINATE OF VECTOR :"+z);
			   
   }
   public static void carv_to_sphv()
   {
	   System.out.print("\n     ENTER THE x COMPONENT OF VECTOR : ");
	   double x=scn.nextDouble();
	   System.out.print("\n   ENTER THE y COMPONENT OF VECTOR : ");
	   double y=scn.nextDouble();
	   System.out.print("\n   ENTER THE z COMPONENT OF VECTOR : ");
	   double z=scn.nextDouble();
	   System.out.print("\n   ENTER THE POINT : ");
	   double x1=scn.nextDouble();
	   double y1=scn.nextDouble();
	   double z1=scn.nextDouble();
	   double phi=Math.atan(y1/x1)*57.2958;
	   if(x1<0&&y1>0||x1<0&&y1<0)
	   {
		   phi=phi+180;
	   }
	   
	   if(x1>0&&y1<0)
	   {
		   phi=360+phi;
	   }
	   double e=Math.sqrt(x1*x1+y1*y1);
	   double theta=Math.atan(e/z1)*57.2958;
	   double a=Math.sin(Math.toRadians(phi));
	   double b=Math.cos(Math.toRadians(phi));
	   double c=Math.sin(Math.toRadians(theta));
	   double d=Math.cos(Math.toRadians(theta));
	   double arh=x*c*b+y*a*c+z*d;
	   double arho=(double)(Math.round(arh*1000.0)/1000.0);
	   double atheta=x*b*d+y*d*a-z*c;
	   atheta=(double)(Math.round(atheta*1000.0)/1000.0);
	   double aphi=-x*a+y*b;
	   aphi=(double)(Math.round(aphi*1000.0)/1000.0);
	  
	   System.out.println("\n*****SPHERICAL VECTOR :  ("+arho+")ar+ ("+atheta+")"+"atheta+ ("+aphi+")aphi");
	   System.out.println("\nr    COORDINATE OF VECTOR :"+arho);
	   System.out.println("\n     theta COORDINATE OF VECTOR :"+atheta);
	   System.out.println("\n     phi COORDINATE OF VECTOR :"+aphi); 
   }
   public static void cylv_to_carv()
   {
	   System.out.print("\n     ENTER THE rho COMPONENT OF VECTOR : ");
	   double rho=scn.nextDouble();
	   System.out.print("\n   ENTER THE phi COMPONENT OF VECTOR : ");
	   double phi=scn.nextDouble();
	   System.out.print("\n   ENTER THE z COMPONENT OF VECTOR : ");
	   double z=scn.nextDouble();
	   System.out.print("\n   ENTER THE POINT :");
	   double rho1=scn.nextDouble();
	   double phi1=scn.nextDouble();
	   double z1=scn.nextDouble();
	   double a=Math.sin(Math.toRadians(phi1));
	   double b=Math.cos(Math.toRadians(phi1));
	   double ax=(rho*b-phi*a);
	   ax=(double)(Math.round(ax*1000.0)/1000.0);
	   double ay=(rho*a+phi*b);
	   ay=(double)(Math.round(ay*1000.0)/1000.0);
	   System.out.println("\n****CARTESIAN VECTOR :  ("+ax+")ax + ("+ay+")"+"ay + ("+z+")az");
	   System.out.println("\n      x COORDINATE OF VECTOR :"+ax);
	   System.out.println("\n      y COORDINATE OF VECTOR :"+ay);
	   System.out.println("\n      z COORDINATE OF VECTOR :"+z);  
   }
   public static void sphv_to_carv()
   {
	   System.out.print("\n     ENTER THE r COMPONENT OF VECTOR : ");
	   double r=scn.nextDouble();
	   System.out.print("\n     ENTER THE theta COMPONENT OF VECTOR : ");
	   double theta=scn.nextDouble();
	   System.out.print("\n     ENTER THE phi COMPONENT OF VECTOR : ");
	   double phi=scn.nextDouble();
	   System.out.print("\n     ENTER THE POINT : ");
	   double r1=scn.nextDouble();
	   double theta1=scn.nextDouble();
	   double phi1=scn.nextDouble();
	   double a=Math.sin(Math.toRadians(phi1));
	   double b=Math.cos(Math.toRadians(phi1));
	   double c=Math.sin(Math.toRadians(theta1));
	   double d=Math.cos(Math.toRadians(theta1));
	   double ax=c*b*r+theta*d*b-phi*a;
	   ax=(double)(Math.round(ax*1000.0)/1000.0);
	   double ay=r*a*c+theta*d*a+phi*b;
	   ay=(double)(Math.round(ay*1000.0)/1000.0);
	   double az=r*d+theta*c;
	   az=(double)(Math.round(az*1000.0)/1000.0);
	   System.out.println("\n****CARTESIAN VECTOR :  ("+ax+")ax+ ("+ay+")"+"ay+ ("+az+")az");
	   System.out.println("\n     x COORDINATE OF VECTOR :"+ax);
	   System.out.println("\n     y COORDINATE OF VECTOR :"+ay);
	   System.out.println("\n     z COORDINATE OF VECTOR :"+az);    
   }
   
}
