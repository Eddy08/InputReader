

import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputStream ins = System.in;
		InputReader inr =new InputReader(ins);
		int X=inr.nextInt();
		int Y=inr.nextInt();
		
	}
static	class InputReader{
	    BufferedReader buffer=null;
	    StringTokenizer token=null;
	    InputStreamReader ins=null;
	    InputReader(InputStream is){
	         buffer=new BufferedReader(new InputStreamReader(is));
	        token=null;
	    }
	    public String next() throws Exception{
	        while(token==null || !token.hasMoreTokens()){
              // Tokens like , or any other thing passed in the string
	          token = new StringTokenizer(buffer.readLine(),","); 
	           
	        }
	        return token.nextToken();
	    }
	    public int nextInt() throws Exception{
	        return Integer.parseInt(next());  
	    }
	}
}
