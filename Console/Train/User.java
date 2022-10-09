package console.train;
import java.util.*;
public class User 
{
	 Admin admin=new Admin();
	    
	   ArrayList <Passenger> userList=new ArrayList <> ();
	   
	   User()
	   {
		 userList.add( new Passenger ("ananthi@gmail.com","Ananthi",(byte)21,"ananthi31"));
		 userList.add(new Passenger ("moni@gmail.com","Monisha",(byte)22,"monisha@123"));
		 userList.add(new Passenger ("madhu@gmail.com","Madhu",(byte)22,"madhi*12"));
	 	 userList.add( new Passenger ("preethi@gmail.com","Preethi",(byte)22,"preethi#13"));
	   }
	   
	    public void userList(){
	    	 System.out.println("User MailId:"+"              "+"User Name:");
	 	 for(Passenger passenger : userList )
	          {
	              System.out.println(passenger.getMailid() + " "+passenger.getName());
	          }
	    }
	    Scanner userInput=new Scanner(System.in);
	   
	  
	    public void signUp(){
	           System.out.println("Enter Name :");
	          String name=userInput.next();
	          System.out.println("Enter Age :");
	          byte age=userInput.nextByte();
	          System.out.println("Enter Email :");
	          String mail=userInput.next();
	           System.out.println("Enter Password :");
	          String pass=userInput.next();
	           userList.add(new Passenger(mail,name,age,pass));
	         System.out.println("Data added Successfully!");
	         System.out.println();
	          System.out.println("Welcome!"+name);
	          admin.ticket();
	          
	         
	        
	        
	      }
	    public void login(){
	        boolean checkIf =false;
	        String loginname="";
	     System.out.println("Enter Email :");
	          String mail=userInput.next();
	           System.out.println("Enter Password :");
	         String pass=userInput.next();
	         for(Passenger passenger : userList )
	         {
	         if (passenger.getMailid().equals(mail)&&passenger.getPassword().equals(pass))
	         {
	          loginname=passenger.getName();
	          checkIf=true;
	         }
	                
	         }
	         if(checkIf==true)
	         {
	          System.out.println("Welcome "+loginname);
	          admin.ticket();
	         }
	    
	         else
	         System.out.println("Username or password wrong!");
	    }

}
