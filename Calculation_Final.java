import javax.swing.JFrame;
import java.util.Scanner;
import java.lang.Math;



public class Calculation
{
		public static int x1 = 0;
		public static int y1 = 0;
		public static int x0 = 0;
		public static int y0 = 0;
		public static int x3 = 0;
		public static int y3 = 0 ;
		public static double z1 = 0.0;
		public static double z2 = 0.0;
		public static double z3= 0.0;
		public static double plane_angle = 0.0 ;
		
		//public Calculation()
		//{
			
			//public VOR_GUI vargui;
		
		public static double get_angle()
		{
			
			x1 = VOR_GUI.mouseX;
			y1 = VOR_GUI.mouseY;
			
			x0 = 130;
			y0 = 203;
			
			x3 = x1;
			y3 = y0;
			
			//z1 = Math.sqrt(Math.pow((Math.abs(x0 - x1)), 2.0) + Math.pow((Math.abs(y0 - y1)), 2.0));
	        
	        //z2 = Math.sqrt(Math.pow((Math.abs(x3 - x0)), 2.0) + Math.pow((Math.abs(y3 - y0)), 2.0));
	        
	        //z3 = Math.sqrt(Math.pow((Math.abs(x1 - x3)), 2.0) + Math.pow((Math.abs(y1 - y3)), 2.0));
			
			z1 = Math.abs(y1 - y3);
			z2 = Math.abs(x3 - x0);
			
						
	        double plane_angle = Math.atan(z1/z2)*180/Math.PI;
	        
	        System.out.println("x1 :" + x1);
	        System.out.println("y1 :" + y1);
	        System.out.println("x0 :" + x0);
	        System.out.println("y0 :" + y0);
	        System.out.println("x3 :" + x3);
	        System.out.println("y3 :" + y3);
	        
	        if(x1 >= 130 && y1 > 203)						//2nd quadrant
	        {
	            plane_angle = 90 + plane_angle;
	        }
	        
	        if(x1 > 130 && y1 <= 203)						//1st quadrant
	        {
	        	plane_angle =90-plane_angle;
	        }
	        
	        if(x1 < 130 && y1 >= 203)						//3rd quadrant
	        {
	        	if (plane_angle == 0.0)
	        	{
	        		System.out.println("In third quad" + plane_angle);
	        		plane_angle = 270;
	        	}
	        	else
	        	plane_angle = 270 - plane_angle;
	        }
	        
	        if(x1 <= 130 && y1 < 202)                        //4th quadrant
	        {
	        	plane_angle = 270 + plane_angle;
	        }
	        
	        System.out.println("The angle:" + plane_angle);
	       // plane_angle = Math.toDegrees(sine);
	       return plane_angle;
	       
	       
	       
	       
		}
		//}
		public static String get_deflection(int plane_x1, int plane_y1, String vor_angle)
		{
			String deflection;
			Double vor_angle_converted;
			
			x1 = plane_x1;
			y1 = plane_y1;
			
			x0 = 130;
			y0 = 203;
			
			x3 = x1;
			y3 = y0;
			
			z1 = Math.abs(y1 - y3);
			z2 = Math.abs(x3 - x0);
			
						
	        double plane_angle = Math.atan(z1/z2)*180/Math.PI;
			
	        if(x1 >= 130 && y1 > 203)						//2nd quadrant
	        {
	            plane_angle = 90 + plane_angle;
	        }
	        
	        if(x1 > 130 && y1 <= 203)						//1st quadrant
	        {
	        	plane_angle =90-plane_angle;
	        }
	        
	        if(x1 < 130 && y1 >= 203)						//3rd quadrant
	        {
	        	if (plane_angle == 0.0)
	        	{
	        		System.out.println("In third quad" + plane_angle);
	        		plane_angle = 270;
	        	}
	        	else
	        	plane_angle = 270 - plane_angle;
	        }
	        
	        if(x1 <= 130 && y1 < 202)                        //4th quadrant
	        {
	        	plane_angle = 270 + plane_angle;
	        }
	        
	       // System.out.println("The angle:" + plane_angle);
	       // plane_angle = Math.toDegrees(sine);
	    //   return plane_angle;
	        
	        vor_angle_converted = Double.parseDouble(vor_angle);
	        
	        if(plane_angle < vor_angle_converted)
	        {
	        	deflection = "Right";
	        }
	        
	        else if(plane_angle > vor_angle_converted)
	        {
	        	deflection = "left";
	        }
	        
	        else
	        	deflection = "no deflection";
	       
	        return deflection;
	        
			//return null;
			
			
			
		}	
	
}