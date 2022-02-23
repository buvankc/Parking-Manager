import java.io.*;
class Reservation 
{
    void main() throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                              Welcome to the Reservation Page of Intelligent Parking Solution");
        System.out.println("                          For any queries contact our Customer Care@  customercare@cnbsgroup.com");
        Thread.sleep(500);
         System.out.println("Choose Parking Area");Thread.sleep(1000);
        
        
            System.out.println("Enter 1 for Banashankari 3rd Stage");
            Thread.sleep(100);
             System.out.println("Enter 2 for RR Nagar");
            Thread.sleep(100);
             System.out.println("Enter 3 for Kanakpura Main Road");
            Thread.sleep(100);
             System.out.println("Enter 4 for JP Nagar");
           Thread.sleep(100);
            System.out.println("Enter 5 for Jayanagar");Thread.sleep(100);
            System.out.println("Enter 6 for Basavangudi");Thread.sleep(100);
            System.out.println("Enter 7 for Peenya Industrail Area");Thread.sleep(100);
            System.out.println("Enter 8 for Majestic");Thread.sleep(100);
            System.out.println("Enter 9 for Rajajinagar");Thread.sleep(100);
            System.out.println("Enter 10 for Commercial Street");Thread.sleep(100);
            System.out.println("Enter 11 for Brigade Road");Thread.sleep(100);
            System.out.println("Enter 12 for MG Road");Thread.sleep(100);
            System.out.println("Enter 13 for Electronic City");Thread.sleep(100);
            System.out.println("Enter 14 for Kormangala");Thread.sleep(100);
            System.out.println("Enter 15 for Malleshwaram");Thread.sleep(100);int Area=0;Boolean a;
           Area=Integer.parseInt(br.readLine());
            do{
                if(Area>15)
         {
             System.out.println("Enter a number from 1 to 15!");
         Area=Integer.parseInt(br.readLine());
         a=true;
        }
         else {
             a=false;
            }
        }
         while(a==true);
        switch(Area)
        {
            case 1: System.out.println("Banashankari 3rd Stage");
            break;
            case 2: System.out.println("RR Nagar");
            break;
            case 3: System.out.println("Kanakpura Main Road");
            break;
            case 4: System.out.println("JP Nagar");
            break;
            case 5: System.out.println("Jayanagar");
            break;
            case 6: System.out.println("Basvangudi");
            break;
            case 7: System.out.println("Peenya Industrial Area");
            break;
            case 8: System.out.println("Majestic");
            break;
            case 9: System.out.println("Rajajinagar");
            break;
            case 10: System.out.println("Commercial Street");
            break;
            case 11: System.out.println("Brigade Road");
            break;
            case 12: System.out.println("MG Road");
            break;
            case 13: System.out.println("Electronic City");
            break;
            case 14: System.out.println("Kormangala");
            break;
            case 15: System.out.println("Malleshwaram");
            break;
        default: System.out.println("Invalid Entry");break;
    } 
        
        
        
        CustomerDataAcquisition C=new CustomerDataAcquisition();
        C.main();
         
        
        
}
}

        
        
         

            
            
            

        
           
            
        
        
        
        