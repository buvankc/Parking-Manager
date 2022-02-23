import java.io.*;
import java.util.*;
class Price 
{
    public static int Amount;
    void price() throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Thread.sleep(150); System.out.println("Enter 1 for Bike Parking");Thread.sleep(150);
        System.out.println("Enter 2 for Car Parking");Thread.sleep(150);int choice=0;Boolean a;
        do{
            try{
                a=false;
        choice=Integer.parseInt(br.readLine());
    }
        catch(Exception e){System.out.println("Enter 1 or 2!");
            a=true;
        }
        }
        while(a==true);
        Amount=0; int TotalAmt=0;
        switch(choice)
        {
            case 1: Thread.sleep(150); System.out.println("Enter 1 for Parking for Fixed Time");Thread.sleep(150);
            System.out.println("Enter 2 for Parking for Indefinite Time");int CHOICE=0;
             do{
                 try{
                     a=false;
            CHOICE=Integer.parseInt(br.readLine());
        }
             catch(Exception e){System.out.println("Enter 1 or 2");
                 a=true;
                }
                }
                while(a==true);
            switch(CHOICE)
            {
                case 1: System.out.println("Enter the number number of hours [Note Max time is 5 Hours]");int duration=0;
                do{
                    try{
                        a=false;
                duration=Integer.parseInt(br.readLine());
            }
                catch(Exception e){
                    System.out.println("Enter a number!");a=true;
                }
                }
                while(a==true);
               Thread.sleep(150); if (duration==1){Amount=50;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==2){Amount=75;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==3){Amount=100;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==4){Amount=130;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==5){Amount=160;System.out.println("Total= "+Amount);}
               Thread.sleep(150); if (duration>5){System.out.println("Enter a number from 1 to 5");
                duration=Integer.parseInt(br.readLine());
                do{
                    if(duration>5)
            {
                System.out.println("Enter a number from 1 to 5");
         duration=Integer.parseInt(br.readLine());
         a=true;
        }
         else {
             a=false;
           if (duration==1){Amount=50;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==2){Amount=75;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==3){Amount=100;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==4){Amount=130;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==5){Amount=160;System.out.println("Total= "+Amount);} }
            }
         while(a==true);
        }
                break;
                case 2: Thread.sleep(150);System.out.println("Price will be Based on Check In and Check Out Time");
                
                break;
           default:System.out.println("Invalid Entry");break; 
        }
           break;
            case 2: System.out.println("Enter 1 for Parking for Fixed Time");Thread.sleep(150);
            System.out.println("Enter 2 for Parking for Indefinite Time");int Choice=0;
            do{
                try{
                    a=false;
            Choice=Integer.parseInt(br.readLine());
        }
            catch(Exception e){System.out.println("Enter 1 or 2");a=true;}
        }
        while(a==true);
            switch(Choice)
            {
                case 1: Thread.sleep(150);System.out.println("Enter the number number of hours [Note Max time is 5 Hours]");
                int duration=Integer.parseInt(br.readLine());
               Thread.sleep(150); if (duration==1){Amount=100;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==2){Amount=150;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==3){Amount=200;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==4){Amount=300;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==5){Amount=450;System.out.println("Total= "+Amount);}
               Thread.sleep(150); if (duration>5){System.out.println("Enter a number from 1 to 5");
                duration=Integer.parseInt(br.readLine());
                do{
                    if(duration>5)
            {
                System.out.println("Enter a number from 1 to 5");
         duration=Integer.parseInt(br.readLine());
         a=true;
        }
         else {
             a=false;
           Thread.sleep(150); if (duration==1){Amount=100;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==2){Amount=150;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==3){Amount=200;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==4){Amount=300;System.out.println("Total= "+Amount);}
                Thread.sleep(150);if (duration==5){Amount=450;System.out.println("Total= "+Amount);} }
        }
         while(a==true);
        }
                break;
                case 2: System.out.println("Price will be Based on Check In and Check Out Time");
                Thread.sleep(1500);
               
                break;
            default:System.out.println("Invalid Entry");break;
        }
            Service s= new Service();
            if(choice==2){System.out.println("Enter 1 to View Services");Thread.sleep(150);
                System.out.println("Enter 2 Skip");}int Service=0;
                do{
                    try{
                        a=false;
                Service=Integer.parseInt(br.readLine());}
                catch(Exception e){System.out.println("Enter 1 or 2");a=true;}
            }while(a==true);
                switch(Service)
                { 
                   case 1:Thread.sleep(150); s.service();
                   break;
                   case 2:break;
                   default:System.out.println("Invalid Entry");
                }
            
                
        }
       
          
       
    
}
}


                
                
           
