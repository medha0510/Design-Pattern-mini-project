import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
class test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	Paratha paratha=null;
        int n,m;
	DelhiParathaStall delhi=new DelhiParathaStall();
        System.out.println("Hello there!!\nWelcome To Delhi Paratha stall\nPlease place your order\nEnter 1 for Aloo Partha\n \t OR   \nEnter 2 for our special Momos Paratha");
        
        try{
		n=sc.nextInt();
		System.out.println("----------------------------------------");
        	if(n==1)
           		paratha=delhi.createParatha("Aloo Paratha");
        	else if(n==2)
           		paratha=delhi.createParatha("Momos Paratha");
        }
        catch(InputMismatchException e)
        {
            System.out.println("you entered the wrong value");
        }
        	
        System.out.println("***********************************************");
        
	PunjabiParathaStall punjabi=new PunjabiParathaStall();
        System.out.println("Hello there!!\nWelcome To Punjabi Paratha stall\nPlease place your order\nEnter 1 for Aloo Partha\n \t OR   \nEnter 2 for our special Momos Paratha");
	
        try{
            m=sc.nextInt();
	    System.out.println("----------------------------------------");
            if(m==1)
           	paratha=punjabi.createParatha("Aloo Paratha");
            else if(m==2)
           	paratha=punjabi.createParatha("Momos Paratha");
            //paratha=punjabi.createParatha("Momos Paratha");
           }
        catch(InputMismatchException e)
        {
            System.out.println("You entered the wrong value");
        }
        
    }
}