import java.util.*;

//*********************************************************************************************************
// Assignment 3 Elevator        Author: Carlos Fernandez/L30031020
//
// Program to use Elevator with 3 levels: Basement, Floor 1, Floor 2
//*********************************************************************************************************


public class Elevator{

	public static void main(String[] args){

		//variable a indicates the destination floor
		//variable b indicates the source floor
		//variable c indicates the current floor at which the lift is present
		//variable e will store the users choice

        int a;
		int b;
        int c = 0;
        int e;
        Scanner scan = new Scanner(System.in);
        while(true){

        System.out.println("Please make a selection:");
           System.out.println("1.Use Elevator");
           System.out.println("2.Quit");
           if (c == 0)
              System.out.println("The elevetor is at basement");
           else {
              System.out.println("The elevator is at floor " + c );
           }
           System.out.print("Please make a selection:");
           e = Integer.parseInt(scan.nextLine());
      
           if (e == 2){
              break;
           }
           if (e == 1){
              System.out.print("Select your floor (B,1,2):");
              String ch = scan.nextLine();
              if(ch.charAt(0) == 'B')
              b = 0;
              else if(ch.charAt(0) == '1')
              b = 1;
              else

              b = 2;
              System.out.print("Select destination floor:");
              String next = scan.nextLine();
              if(next.charAt(0) == 'B')
              a = 0;
              else if(next.charAt(0) == '1')
              a = 1;
              else
              a = 2;
              if (c == 0) System.out.println("The elevator is at Basement");
              else {
                 System.out.println("The elevator is at floor " + c );
              }
              if (c == b)
              {
              System.out.println("The Elevator (E) is now open 'O'");
              System.out.println("The Elevator (E) is now close 'C'");
              if (a < c)
              {
              if(Math.abs(a-c)==0 || Math.abs(a-c)==1 )
              System.out.println("The Elevator (E) is 'U'");
              else
              System.out.println("The Elevator (E) is '"+Math.abs(a-c)+"U'");
              System.out.println("The Elevator (E) is now at " + a );
              System.out.println("The Elevator (E) is now open 'O'");
              System.out.println("The Elevator (E) is now close 'C'");
              c = a;
              }
              if (a > c)
              {
              if(Math.abs(a-c)==0 || Math.abs(a-c)==1 )
              System.out.println("The Elevator (E) is 'D'");
              else
              System.out.println("The Elevator (E) is '"+Math.abs(a-c)+"D'");
              System.out.println("The Elevator (E) is now at " + a );
              System.out.println("The Elevator (E) is now open 'O'");
              System.out.println("The Elevator (E) is now close 'C'");
              c = a;
              }
              }
              else
              {
              if (b > c)
              {
              if(Math.abs(b-c)==0 || Math.abs(b-c)==1 )
              System.out.println("The Elevator (E) is 'U'");
              else
              System.out.println("The Elevator (E) is '"+Math.abs(b-c)+"U'");
              System.out.println("The Elevator (E) is now at " + b);
              System.out.println("The Elevator (E) is now open 'O'");
              System.out.println("The Elevator (E) is now close 'C'");
              c = b;
              if (a > c)
              {
              if(Math.abs(a-c)==0 || Math.abs(a-c)==1 )
              System.out.println("The Elevator (E) is 'U'");
              else
              System.out.println("The Elevator (E) is '"+Math.abs(a-c)+"U'");
              System.out.println("The Elevator (E) is now at " + a );
              System.out.println("The Elevator (E) is open 'O' ");
              System.out.println("The Elevator (E) is now close 'C'");
              c = a;
              }
              if (a < c)
              {
              if(Math.abs(a-c)==0 || Math.abs(a-c)==1 )
              System.out.println("The Elevator (E) is 'D'");
              else
              System.out.println("The Elevator (E) is '"+Math.abs(a-c)+"D'");
              System.out.println("The Elevator (E) is now at " + a );
              System.out.println("The Elevator (E) is open 'O' ");
              System.out.println("The Elevator (E) is now close 'C'");
              c = a;
              if (b < c)
              {
              if(Math.abs(b-c)==0 || Math.abs(b-c)==1 )
              System.out.println("The Elevator (E) is 'U'");
              else
              System.out.println("The Elevator (E) is '"+Math.abs(b-c)+"U'");
              System.out.println("The Elevator (E) is now at " + a );
              System.out.println("The Elevator (E) is open 'O' ");
              System.out.println("The Elevator (E) is now close 'C'");
              c = b;
              }
              }
              }
              }
              }
              }
              }
              }