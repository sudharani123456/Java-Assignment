import java.io.*;
public class CSV
{
  public static void main(String args[])
  {
     String line=null;
     int total_Count=0;
     float total_Salary=0;
     try   
	{  
	  BufferedReader br1 = new BufferedReader(new FileReader("file1.csv"));  
          while ((line = br1.readLine()) != null)   
          {  
	     String[] BillAmount = line.split(",");  //Split based on comma.   
	    total_Salary+=Float.parseFloat(BillAmount[3]);
            total_Count++;

	   }  
	}   
	catch (IOException e)   
	{  
		e.printStackTrace();  
	}  
	System.out.println("Total Number of Records: "+total_Count);
        System.out.println("Total Salary paid to all the Employees: "+total_Salary);
  }
}