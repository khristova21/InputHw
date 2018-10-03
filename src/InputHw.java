/**
 * 
 * @author Krisi Hristova
 * Input Homework
 *
 */
	import java.util.Scanner;

public class InputHw 
{
	public static void main(String[] args)
	{	
		//create a scanner
		Scanner in = new Scanner(System.in);
		
		//prompt
		System.out.print("Please enter the width of a rectangle: ");
		double width = in.nextDouble();
		in.nextLine();
		
		System.out.print("Please enter the length of the rectangle: ");
		double length = in.nextDouble();
		in.nextLine();
		
		double area = length * width;
		double perimeter = 2*length + 2*width;
		double diagonal = Math.sqrt((Math.pow(length,2) + Math.pow(width,2)));
		
		//area, perimeter, diagonal length
		System.out.printf("Area: %11.2f", area );
		
		System.out.printf("\nPerimeter:  %5.2f",  perimeter);
		
		System.out.printf("\nDiagonal: %7.2f", diagonal);
		
		
	}
	
}
