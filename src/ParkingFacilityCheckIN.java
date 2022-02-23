
import java.io.*;
class ParkingFacilityCheckIN
{
    void main() throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("                                                      Welcome to IPS Parking Facility");
     System.out.println("                                                             BY CNBS GROUP");
     System.out.println("                                                Bengaluru's first Unmanned Parking Facility.");
     System.out.println("                                  Our Facility is fully Automatic, for any Queries Please write to CRM@cnbsgroup.com");
     System.out.println(); Thread.sleep(2000);
     System.out.println("Enter 1 if you have  Reserved a Parking Slot for you Vehicle");Thread.sleep(150);
     System.out.println("Enter 2 if you have not Reserved a Parking Slot for you Vehicle");Thread.sleep(150);
     int option=Integer.parseInt(br.readLine());
     switch(option)
     {
         case 1: 
         { System.out.println("Enter Vehicle Regestration Number[Last 4 digits]");int RegNo=0;Boolean a;
   do{
       try{
           a=false;
         RegNo=Integer.parseInt(br.readLine()); 
        }
        catch(Exception e){System.out.println("Please enter a number!!");
            a=true;
        }
        }
        while(a==true);
     System.out.println("Your Check In time is ");
          Time t=new Time();
                t.time();break;
          }   
        case 2: System.out.println("\u000C");
        CustomerDataAcquisition CDA=new CustomerDataAcquisition();
        CDA.main();
        
        
    break;
}
    System.out.println("Enter 1 to Check-Out of the Parking Facility");Thread.sleep(150);
    System.out.println("Enter 2 to exit the Parking Facility");Thread.sleep(150);
    int exit=Integer.parseInt(br.readLine());
    switch(exit)
    {
        case 1: System.out.println("\u000C");
     ParkingFacilityCheckOut out=new ParkingFacilityCheckOut();
     out.main();
     break;
     case 2: break;
    }
     
     
    }
}



     
     
        
    
