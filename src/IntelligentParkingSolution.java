import java.io.*;
class IntelligentParkingSolution
{
    void main(int choice) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        switch(choice)
        {
            case 1: Thread.sleep(200);
            Reservation o=new Reservation();
                    o.main();Thread.sleep(4000);
                     System.out.println("\u000C");
                   ParkingFacilityCheckIN IN=new ParkingFacilityCheckIN ();
                   IN.main();break;
        
            case 2: Thread.sleep(200); 
            ParkingFacilityCheckIN In=new ParkingFacilityCheckIN();
        In.main();
        CustomerDataAcquisition CDA=new  CustomerDataAcquisition();
        
        break;
        case 3:Thread.sleep(200);
        ParkingFacilityCheckOut OUT=new ParkingFacilityCheckOut();
        OUT.main();
        break;
        case 4:break;
        default:System.out.println("Invalid");break;
        
       
    }
}
}
