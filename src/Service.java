import java.io.*;
class Service
{
    public static int Charge;
    void service() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for Vehicle Wash"); 
        System.out.println("Enter 2 for Vehicle Check Up");Boolean a;int service=0;
        do{
            try{
                a=false;
         service=Integer.parseInt(br.readLine());
        }
         catch(Exception e){System.out.println("Enter either 1 or 2");a=true;
            }
        }
        while(a==true);
         Charge=0;
        switch(service)
        {
            case 1: System.out.println("Enter 1 for for Full Vehicle wash [Body Wash + Internal Vaccum Cleaning]");
            System.out.println("Enter 2 Semi Vehicle wash[Only Body Wash]");int Wash=0;
            do{
                try{
                    a=false;
            Wash=Integer.parseInt(br.readLine());
        }
            catch(Exception e){System.out.println("Enter either 1 or 2!");a=true;
            }
        }
        while(a==true);
            switch(Wash)
            {
                case 1:Charge=750; 
                System.out.println("The Cost for Full Body Wash is = "+Charge);
                break;
                case 2:Charge=400;
                System.out.println("The Cost for Semi Vehicle Wash is = "+Charge);
                break;
            }break;
            case 2:System.out.println("Enter 1 for Full Vehicle Check Up");
            System.out.println("Enter 2 for Tyre Pressure Check");int check=0;
            do{
                try{
                    a=false;
            check=Integer.parseInt(br.readLine());
        }
            catch(Exception e){System.out.println("Enter either 1 or 2!");a=true;
            }
        }
        while(a==true);
            switch(check)
            {
                case 1:Charge=200; 
                System.out.println("The Cost for Full Vehicle Check is = "+Charge);
                break;
                case 2:Charge=50; 
                System.out.println ("The Cost for Tyre Pressure Check is = "+Charge);
                break;}
                }
            }
        }
           
    
        