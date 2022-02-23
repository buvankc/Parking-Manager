import java.io.*;
class ParkingFacilityCheckOut
{
    void main() throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("                                  CHECK OUT");
        System.out.println("Enter Vehicle Regestration Number[Last 4 digits]");int RegNo=0;Boolean a;
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
        System.out.println("Please wait till your Invoive is generated");
        System.out.println(); Thread.sleep(3000);
        CustomerDataAcquisition CDA=new CustomerDataAcquisition();
        
        System.out.println("Yore're CheckOut Time is ");
        Time t=new Time();
        t.time();
        System.out.println("A link to your detailed Invoice with tax break up will be sent to your contact number");
        Thread.sleep(500);
        System.out.println("Enter 1 if you have already paid your Amount");
        System.out.println("Enter 2 if you have have not paid your Amount");int CheckOut=0;
        do{
            try{
                a=false;
        CheckOut=Integer.parseInt(br.readLine());
    }
        catch(Exception e){System.out.println("Please enter 1 or 2!!");
            a=true;
        }
        }
        while(a==true);
        switch(CheckOut)
        {
            case 1:System.out.println("\u000C");
            System.out.println("                    Thank You for entrusting your vehicle with IPS. We hope you are satisfied with our service. "); 
                    
                    System.out.println("                    For any queries feel free to reach out to our Customer Care: customercare@cnbsgroup.com");
                   break;
                   case 2:System.out.println("Enter contact number");long num=0;
         do{
             try{
                 a=false;
        num=Long.parseLong(br.readLine());
    }
        catch(Exception e){System.out.println("Please enter a Number!");
             a=true;}
            }
            while(a==true); 
            Thread.sleep(200);;
            System.out.println("Enter Email ID");String EM=" ";
         do{
             try{
                 a=false;
                 EM=br.readLine();
                }
                catch(Exception e){System.out.println("Please enter an email id in STRING");
                    a=true;
                }
            }
            while(a==true);
            Thread.sleep(3000);
                    System.out.println("                             A payment link has been sent to your given Contact Number and Email");
                    System.out.println("                           Please pay the required amount within 12 hours from the link being sent");
                    Thread.sleep(2500);
                    System.out.println("                    Thank You for entrusting your vehicle with IPS. We hope you are satisfied with our service. "); 
                    
                    System.out.println("                    For any queries feel free to reach out to our Customer Care: customercare@cnbsgroup.com");
                    break;
              default:System.out.println("Invalid Entry");break;  
            }
        }
    }
                        
        
        
        
    
