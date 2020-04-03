import java.net.*;
import java.io.*;

public class CincoTresProtocol 
{
	int type = 0;

    public String processInput(String theInput)
    {
    	String theOutput = "";
    	int len = theInput.length();
    	
    	if(len > 0)
    	{
   			char command = theInput.charAt(0);
   			
   			if(command == '&')		// & is the prefix for client-server first exchange;
   			{
   				theOutput = "Welcome to C3 Media Manager. This is the output console for the server.";
    		}
    	
    		if(command == '*')		// * is the prefix for username and password pairs; seperated by #. Ex: *username#password
    		{    		
   				if(theInput.equals("*jeb#pass"))
   				{
   					theOutput = "verified";
   				}	
   				else
    			{
    				theOutput = "Invalid Password or Username";
    			}
   			}
    		
    	}
    	
    	else
    	{
   			theOutput = "";
    	}
    	return theOutput; 	
    }
}