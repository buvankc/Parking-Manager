import java.io.*;
class CustomerDataAcquisition
{
 public void main() throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String Data[][]=new String[8][3]; 
      
   System.out.println("Enter Vehicle Regestration Number[Last 4 digits]");int RegNo=0;Boolean a;
   do{
       try{
           a=false;
         RegNo=Integer.parseInt(br.readLine()); 
        }
        catch(Exception e){System.out.println("Please enter a number!!");
            a=true;
        }
        }while(a==true);
        Thread.sleep(500);String REGNO=Integer.toString(RegNo);
        System.out.println("Enter the Vehicle Name");String CarN=" ";
        do{
            try{
                a=false;
         CarN=br.readLine();
        }
         catch(Exception e){System.out.println("Please enter a Car Name in String!");
             a=true;
            }
            }
            while(a==true);
        Thread.sleep(1000);
        System.out.println("Enter 1 for Petrol");Thread.sleep(100);
        System.out.println("Enter 2 for Diesel");Thread.sleep(100);
        System.out.println("Enter 3 for Hybrid");Thread.sleep(100);
        System.out.println("Enter 4 for AutoGas");int Fuel=0;
        do{
            try{
                a=false;
        Fuel=Integer.parseInt(br.readLine());
    }
        catch(Exception e){System.out.println("Enter from 1 to 4!");
        a=true;
    }
}
while(a==true);
        String fuel="";
        switch(Fuel)
        {
            case 1: System.out.println("Petrol");
           fuel="Petrol"; break;
            case 2: System.out.println("Diesel");
           fuel="Diesel";break;
            case 3:System.out.println("Hybrid");
            System.out.println("Thank You for contributing in reducing the Carbon Foot Print on our Planet");
             fuel="Hybrid";Thread.sleep(500);
            System.out.println("A special discount of 30% will applicable to your Total Amount");
            break;
            case 4:System.out.println("AutoGas");
            System.out.println("Thank You for contributing in reducing the Carbon Foot Print on our Planet");
            fuel="AutoGas";Thread.sleep(500);
            System.out.println("A special discount of 30% will applicable to your Total Amount");
            break;
        default:System.out.println("Invalid entry");break;
    } Thread.sleep(1000);
            
        System.out.println("Enter your name");String name=" ";
         do{
             try{
                 a=false;
        name=br.readLine();
    }
         catch(Exception e){System.out.println("Please enter a Name in String!");
             a=true;
            }
            }
            while(a==true);
         Thread.sleep(500);
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
            Thread.sleep(500);
        System.out.println("Enter contact number");long num=0;
         do{
             try{
                 a=false;
        num=Long.parseLong(br.readLine());
    }
        catch(Exception e){System.out.println("Please enter a Number!");
             a=true;}
            }
            while(a==true);
        String Num=Long.toString(num); Thread.sleep(500);
        System.out.println("Your Checkin Time is");
        Time t=new Time();
                t.time();
        
         Price p=new Price();
        p.price();
        
        Price g=new Price();
    int k=g.Amount;
    Service b=new Service();
    int j=b.Charge;
    
    
    
    double Total_Amount=0;double TOTALAMT=0;
    Total_Amount=k+j;
    if(Fuel==3){double Discount=Total_Amount*0.3;
        Total_Amount=Total_Amount-Discount;
        System.out.println("Your Total "+Total_Amount);
        }
        if(Fuel==4){double Discount=Total_Amount*0.3;
        Total_Amount=Total_Amount-Discount;
            System.out.println("Your Total "+Total_Amount);
        }
            if(Fuel==2){System.out.println("Your Total is: "+Total_Amount);
            }
            if(Fuel==1){System.out.println("Your Total is: "+Total_Amount);
            }
            Thread.sleep(4000);
  String total=Double.toString(Total_Amount);
  String TOTAL=Double.toString(TOTALAMT);
Data[0][0]="Customer Name:";
Data[0][1]=name;
Data[1][0]="Contact Number:";
Data[1][1]=Num;
Data[7][0]="Email";
Data[7][1]=EM;
Data[2][0]="Vehicle Number:";
Data[2][1]=REGNO;
Data[3][0]="Vehicle Name:";
Data[3][1]=CarN;
Data[4][0]="Fuel Type:";
Data[4][1]=fuel;
Data[5][0]="Total Amount:";
Data[5][1]=total;
String DATA[][]=new String[7][3];
display(Data);
 }
 void display(String Data[][])
{ 
    System.out.println("\u000C");
    System.out.println("Intelligent Parking Solution[By CNBS Group]");
    System.out.println("Customer Info\n");
{
    for(int i=0;i<=5;i++)
    {
        for(int j=0;j<=1;j++){System.out.print(" "+Data[i][j]);
    }
    System.out.println();

}


System.out.println("\n\nTotal Amount for Indefinite Parking will be 0,will get updated after CheckingOut of the Parking Facility\n");}

}
}

    